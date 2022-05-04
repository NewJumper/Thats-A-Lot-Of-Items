package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ConstructingRecipe;
import com.newjumper.taloi.screen.ConstructorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class ConstructorBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private int litTime;
    private int maxLitTime;
    private int currentProgress;
    private int maxProgress;
    private final RecipeType<? extends ConstructingRecipe> recipeType;
    protected final ContainerData data = new ContainerData() {
        public int get(int index) {
            switch (index) {
                case 0:
                    return ConstructorBlockEntity.this.litTime;
                case 1:
                    return ConstructorBlockEntity.this.maxLitTime;
                case 2:
                    return ConstructorBlockEntity.this.currentProgress;
                case 3:
                    return ConstructorBlockEntity.this.maxProgress;
                default:
                    return 0;
            }
        }

        public void set(int index, int value) {
            switch(index) {
                case 0:
                    ConstructorBlockEntity.this.litTime = value;
                    break;
                case 1:
                    ConstructorBlockEntity.this.maxLitTime = value;
                    break;
                case 2:
                    ConstructorBlockEntity.this.currentProgress = value;
                    break;
                case 3:
                    ConstructorBlockEntity.this.maxProgress = value;
                    break;
            }
        }

        public int getCount() {
            return 4;
        }
    };

    public ConstructorBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends ConstructingRecipe> pRecipeType) {
        super(pType, pWorldPosition, pBlockState);
        this.recipeType = pRecipeType;
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Constructor");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ConstructorMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag pTag) {
        super.saveAdditional(pTag);
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("constructor.litTime", this.litTime);
        pTag.putInt("constructor.maxLitTime", this.maxLitTime);
        pTag.putInt("constructor.currentProgress", this.currentProgress);
        pTag.putInt("constructor.maxProgress", this.maxProgress);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        this.litTime = nbt.getInt("constructor.litTime");
        this.maxLitTime = nbt.getInt("constructor.maxLitTime");
        this.currentProgress = nbt.getInt("constructor.currentProgress");
        this.maxProgress = nbt.getInt("constructor.maxProgress");
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @javax.annotation.Nullable Direction facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(capability, facing);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, ConstructorBlockEntity blockEntity) {
        if(hasRecipe(blockEntity)) {
            blockEntity.currentProgress++;
            setChanged(pLevel, pPos, pState);

            if(blockEntity.currentProgress >= blockEntity.maxProgress) {
                Level level = blockEntity.level;
                SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
                for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
                    inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
                }

                Optional<ConstructingRecipe> match = level.getRecipeManager().getRecipeFor(ConstructingRecipe.Type.INSTANCE, inventory, level);
                if(match.isPresent()) {
                    blockEntity.itemHandler.extractItem(0,1, false);
                    blockEntity.itemHandler.extractItem(1,1, false);
                    blockEntity.itemHandler.extractItem(2,1, false);
                    blockEntity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getResultItem().getItem(), blockEntity.itemHandler.getStackInSlot(3).getCount() + 1));

                    blockEntity.currentProgress = 0;
                }
            }
        } else {
            blockEntity.currentProgress = 0;
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(ConstructorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<ConstructingRecipe> match = level.getRecipeManager().getRecipeFor(ConstructingRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canConstruct(inventory, match.get().getResultItem()) && hasFuel(blockEntity);
    }

    private static boolean canConstruct(SimpleContainer container, ItemStack result) {
        return (container.getItem(3).getItem() == result.getItem() || container.getItem(3).isEmpty()) &&
               (container.getItem(3).getCount() < container.getItem(3).getMaxStackSize());
    }

    private static boolean hasFuel(ConstructorBlockEntity blockEntity) {
        return AbstractFurnaceBlockEntity.isFuel(blockEntity.itemHandler.getStackInSlot(0));
    }

    private int getBurnDuration(ItemStack pFuel) {
        if (pFuel.isEmpty()) return 0;
        else return ForgeHooks.getBurnTime(pFuel, this.recipeType);
    }
}
