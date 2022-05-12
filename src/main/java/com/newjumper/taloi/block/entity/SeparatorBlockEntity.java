package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.SeparatingRecipe;
import com.newjumper.taloi.screen.SeparatorMenu;
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

public class SeparatorBlockEntity extends BlockEntity implements MenuProvider {
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final ItemStackHandler itemHandler;
    private int litTime;
    private int maxLitTime;
    private int currentProgress;
    private int maxProgress;
    private final RecipeType<? extends SeparatingRecipe> recipeType;
    protected final ContainerData data = new ContainerData() {
        public int get(int index) {
            return switch (index) {
                case 0 -> SeparatorBlockEntity.this.litTime;
                case 1 -> SeparatorBlockEntity.this.maxLitTime;
                case 2 -> SeparatorBlockEntity.this.currentProgress;
                case 3 -> SeparatorBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        public void set(int index, int value) {
            switch (index) {
                case 0 -> SeparatorBlockEntity.this.litTime = value;
                case 1 -> SeparatorBlockEntity.this.maxLitTime = value;
                case 2 -> SeparatorBlockEntity.this.currentProgress = value;
                case 3 -> SeparatorBlockEntity.this.maxProgress = value;
            }
        }

        public int getCount() {
            return 4;
        }
    };

    public SeparatorBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends SeparatingRecipe> pRecipeType) {
        super(pType, pWorldPosition, pBlockState);

        this.recipeType = pRecipeType;
        this.itemHandler = new ItemStackHandler(4) {
            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.separator");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new SeparatorMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("separator.litTime", this.litTime);
        nbt.putInt("separator.maxLitTime", this.maxLitTime);
        nbt.putInt("separator.currentProgress", this.currentProgress);
        nbt.putInt("separator.maxProgress", this.maxProgress);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        this.litTime = nbt.getInt("separator.litTime");
        this.maxLitTime = nbt.getInt("separator.maxLitTime");
        this.currentProgress = nbt.getInt("separator.currentProgress");
        this.maxProgress = nbt.getInt("separator.maxProgress");
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

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, SeparatorBlockEntity blockEntity) {
        if(hasRecipe(blockEntity)) {
            blockEntity.currentProgress++;
            setChanged(pLevel, pPos, pState);
            if(blockEntity.currentProgress >= blockEntity.maxProgress) {
                Level level = blockEntity.level;
                SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
                for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
                    inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
                }

                Optional<SeparatingRecipe> match = level.getRecipeManager().getRecipeFor(SeparatingRecipe.Type.INSTANCE, inventory, level);

                if(match.isPresent()) {
                    blockEntity.itemHandler.extractItem(0,1, false);
                    blockEntity.itemHandler.extractItem(1,1, false);
                    blockEntity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getResultItem().getItem(), blockEntity.itemHandler.getStackInSlot(2).getCount() + 1));
                    blockEntity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getResultRaw().getItem(), blockEntity.itemHandler.getStackInSlot(3).getCount() + 2));

                    blockEntity.currentProgress = 0;
                }
            }
        } else {
            blockEntity.currentProgress = 0;
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(SeparatorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<SeparatingRecipe> match = level.getRecipeManager().getRecipeFor(SeparatingRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canSeparate(inventory, match.get().getResultItem(), match.get().getResultRaw()) && hasFuel(blockEntity);
    }

    private static boolean canSeparate(SimpleContainer container, ItemStack resultOre, ItemStack resultRaw) {
        return ((container.getItem(2).getItem() == resultOre.getItem() || container.getItem(2).isEmpty()) && (container.getItem(3).getItem() == resultRaw.getItem() || container.getItem(3).isEmpty())) &&
               ((container.getItem(2).getCount() < container.getItem(2).getMaxStackSize()) && (container.getItem(3).getCount() < container.getItem(3).getMaxStackSize()));
    }

    private static boolean hasFuel(SeparatorBlockEntity blockEntity) {
        return AbstractFurnaceBlockEntity.isFuel(blockEntity.itemHandler.getStackInSlot(0));
    }

    private int getBurnDuration(ItemStack pFuel) {
        if (pFuel.isEmpty()) return 0;
        else return ForgeHooks.getBurnTime(pFuel, this.recipeType);
    }
}
