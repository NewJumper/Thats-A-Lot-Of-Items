package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ConstructingRecipe;
import com.newjumper.taloi.screen.ConstructorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
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

import javax.annotation.Nonnull;
import java.util.Optional;

public class ConstructorBlockEntity extends BlockEntity implements MenuProvider {
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final ItemStackHandler itemHandler;
    private int litTime;
    private int maxLitTime;
    private int currentProgress;
    private int maxProgress;
    private final RecipeType<? extends ConstructingRecipe> recipeType;
    protected final ContainerData data = new ContainerData() {
        public int get(int index) {
            return switch (index) {
                case 0 -> ConstructorBlockEntity.this.litTime;
                case 1 -> ConstructorBlockEntity.this.maxLitTime;
                case 2 -> ConstructorBlockEntity.this.currentProgress;
                case 3 -> ConstructorBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        public void set(int index, int value) {
            switch (index) {
                case 0 -> ConstructorBlockEntity.this.litTime = value;
                case 1 -> ConstructorBlockEntity.this.maxLitTime = value;
                case 2 -> ConstructorBlockEntity.this.currentProgress = value;
                case 3 -> ConstructorBlockEntity.this.maxProgress = value;
            }
        }

        public int getCount() {
            return 4;
        }
    };
    private static int lastSlotIndex;

    public ConstructorBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends ConstructingRecipe> pRecipeType, int slots) {
        super(pType, pWorldPosition, pBlockState);

        this.recipeType = pRecipeType;
        this.itemHandler = new ItemStackHandler(slots) {
            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }
        };

        lastSlotIndex = slots - 1;
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.constructor");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ConstructorMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("constructor.litTime", this.litTime);
        nbt.putInt("constructor.maxLitTime", this.maxLitTime);
        nbt.putInt("constructor.currentProgress", this.currentProgress);
        nbt.putInt("constructor.maxProgress", this.maxProgress);
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

                Optional<? extends ConstructingRecipe> match = level.getRecipeManager().getRecipeFor(blockEntity.recipeType, inventory, level);
                if(match.isPresent()) {
                    for(int i = 0; i < lastSlotIndex; i++) {
                        blockEntity.itemHandler.extractItem(i, 1, false);
                    }
                    blockEntity.itemHandler.setStackInSlot(lastSlotIndex, new ItemStack(match.get().getResultItem().getItem(), blockEntity.itemHandler.getStackInSlot(lastSlotIndex).getCount() + 1));

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

        Optional<? extends ConstructingRecipe> match = level.getRecipeManager().getRecipeFor(blockEntity.recipeType, inventory, level);

        return match.isPresent() && canConstruct(inventory, match.get().getResultItem()) && hasFuel(blockEntity);
    }

    private static boolean canConstruct(SimpleContainer container, ItemStack result) {
        return (container.getItem(lastSlotIndex).getItem() == result.getItem() || container.getItem(lastSlotIndex).isEmpty()) &&
               (container.getItem(lastSlotIndex).getCount() < container.getItem(lastSlotIndex).getMaxStackSize());
    }

    private static boolean hasFuel(ConstructorBlockEntity blockEntity) {
        return AbstractFurnaceBlockEntity.isFuel(blockEntity.itemHandler.getStackInSlot(0));
    }

    private int getBurnDuration(ItemStack pFuel) {
        if (pFuel.isEmpty()) return 0;
        else return ForgeHooks.getBurnTime(pFuel, this.recipeType);
    }
}