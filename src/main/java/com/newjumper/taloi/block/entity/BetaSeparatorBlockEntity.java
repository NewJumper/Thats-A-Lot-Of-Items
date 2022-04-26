package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.SeparatingRecipe;
import com.newjumper.taloi.screen.SeparatorMenu;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class BetaSeparatorBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    protected final ContainerData data;
    private int currentProgress = 0;
    private int maxProgress = 100;

    public BetaSeparatorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.BETA_SEPARATOR.get(), pWorldPosition, pBlockState);

        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0: return BetaSeparatorBlockEntity.this.currentProgress;
                    case 1: return BetaSeparatorBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: BetaSeparatorBlockEntity.this.currentProgress = value; break;
                    case 1: BetaSeparatorBlockEntity.this.maxProgress = value; break;
                }
            }

            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Separator");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new SeparatorMenu(pContainerId, pInventory, this, this.data);
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
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("beta_separator.currentProgress", currentProgress);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        currentProgress = nbt.getInt("beta_separator.currentProgress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, BetaSeparatorBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.currentProgress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.currentProgress >= pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(BetaSeparatorBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<SeparatingRecipe> match = level.getRecipeManager().getRecipeFor(SeparatingRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canCraftResult(inventory, match.get().getResultItem(), match.get().getResultRaw()) && hasFuelInFirstSlot(blockEntity);
    }

    private static boolean hasFuelInFirstSlot(BetaSeparatorBlockEntity blockEntity) {
        return AbstractFurnaceBlockEntity.isFuel(blockEntity.itemHandler.getStackInSlot(0));
    }

    private static void craftItem(BetaSeparatorBlockEntity blockEntity) {
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

            blockEntity.resetProgress();
        }
    }

    private void resetProgress() {
        this.currentProgress = 0;
    }

    private static boolean canCraftResult(SimpleContainer container, ItemStack resultOre, ItemStack resultRaw) {
        return ((container.getItem(2).getItem() == resultOre.getItem() || container.getItem(2).isEmpty()) && (container.getItem(3).getItem() == resultRaw.getItem() || container.getItem(3).isEmpty())) &&
                ((container.getItem(2).getCount() < container.getItem(2).getMaxStackSize()) && (container.getItem(3).getCount() < container.getItem(3).getMaxStackSize()));
    }
}
