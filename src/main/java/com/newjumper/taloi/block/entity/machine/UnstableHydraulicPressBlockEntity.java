package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.PressingRecipe;
import com.newjumper.taloi.recipe.UnstablePressingRecipe;
import com.newjumper.taloi.screen.UnstableHydraulicPressMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.Optional;

public class UnstableHydraulicPressBlockEntity extends BlockEntity implements MenuProvider {
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final ItemStackHandler itemHandler;
    private int litTime;
    private int maxLitTime;
    private int currentProgress;
    private int maxProgress;
    private final RecipeType<? extends PressingRecipe> recipeType;
    protected final ContainerData data = new ContainerData() {
        public int get(int index) {
            return switch (index) {
                case 0 -> UnstableHydraulicPressBlockEntity.this.litTime;
                case 1 -> UnstableHydraulicPressBlockEntity.this.maxLitTime;
                case 2 -> UnstableHydraulicPressBlockEntity.this.currentProgress;
                case 3 -> UnstableHydraulicPressBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        public void set(int index, int value) {
            switch (index) {
                case 0 -> UnstableHydraulicPressBlockEntity.this.litTime = value;
                case 1 -> UnstableHydraulicPressBlockEntity.this.maxLitTime = value;
                case 2 -> UnstableHydraulicPressBlockEntity.this.currentProgress = value;
                case 3 -> UnstableHydraulicPressBlockEntity.this.maxProgress = value;
            }
        }

        public int getCount() {
            return 4;
        }
    };
    private static int lastSlotIndex;

    public UnstableHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.UNSTABLE_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState);

        this.recipeType = UnstablePressingRecipe.Type.INSTANCE;
        this.itemHandler = new ItemStackHandler(5) {
            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }
        };
        
        lastSlotIndex = 4;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.taloi.uhp");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new UnstableHydraulicPressMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("uhp.litTime", this.litTime);
        nbt.putInt("uhp.maxLitTime", this.maxLitTime);
        nbt.putInt("uhp.currentProgress", this.currentProgress);
        nbt.putInt("uhp.maxProgress", this.maxProgress);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        this.litTime = nbt.getInt("uhp.litTime");
        this.maxLitTime = nbt.getInt("uhp.maxLitTime");
        this.currentProgress = nbt.getInt("uhp.currentProgress");
        this.maxProgress = nbt.getInt("uhp.maxProgress");
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @javax.annotation.Nullable Direction facing) {
        if (capability == ForgeCapabilities.ITEM_HANDLER) {
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

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, UnstableHydraulicPressBlockEntity pBlockEntity) {
        if(pBlockEntity.isLit()) pBlockEntity.litTime--;
        if(canPress(pBlockEntity) && !pBlockEntity.isLit()) {
            int constant = pBlockEntity.getBurnDuration(pBlockEntity.itemHandler.getStackInSlot(0)) / 200;
            pBlockEntity.maxLitTime = pBlockEntity.maxProgress * constant;
            pBlockEntity.litTime = pBlockEntity.maxLitTime;
            pBlockEntity.itemHandler.extractItem(0, 1, false);
        }

        if(canPress(pBlockEntity) && pBlockEntity.isLit()) {
            pBlockEntity.currentProgress++;
            setChanged(pLevel, pPos, pState);

            if(pBlockEntity.currentProgress >= pBlockEntity.maxProgress) {
                Level level = pBlockEntity.level;
                SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
                for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
                    inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
                }

                Optional<? extends PressingRecipe> match = level.getRecipeManager().getRecipeFor(pBlockEntity.recipeType, inventory, level);
                if(match.isPresent()) {
                    for(int i = 1; i < lastSlotIndex; i++) {
                        pBlockEntity.itemHandler.extractItem(i, 1, false);
                    }

                    pBlockEntity.itemHandler.setStackInSlot(lastSlotIndex, new ItemStack(match.get().getResultItem().getItem(), pBlockEntity.itemHandler.getStackInSlot(lastSlotIndex).getCount() + 1));
                    pBlockEntity.currentProgress = 0;
                }
            }
        } else {
            pBlockEntity.currentProgress = 0;
            setChanged(pLevel, pPos, pState);
        }
    }

    private boolean isLit() {
        return this.litTime > 0;
    }

    private static boolean canPress(UnstableHydraulicPressBlockEntity pBlockEntity) {
        Level level = pBlockEntity.level;
        SimpleContainer inventory = new SimpleContainer(pBlockEntity.itemHandler.getSlots());
        for (int i = 0; i < pBlockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pBlockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<? extends PressingRecipe> match = level.getRecipeManager().getRecipeFor(pBlockEntity.recipeType, inventory, level);
        return match.isPresent() && hasValidOutput(inventory, match.get().getResultItem());
    }

    private static boolean hasValidOutput(SimpleContainer pContainer, ItemStack pResult) {
        return (pContainer.getItem(lastSlotIndex).getItem() == pResult.getItem() || pContainer.getItem(lastSlotIndex).isEmpty()) &&
                (pContainer.getItem(lastSlotIndex).getCount() < pContainer.getItem(lastSlotIndex).getMaxStackSize());
    }

    private int getBurnDuration(ItemStack pFuel) {
        if (pFuel.isEmpty()) return 0;
        else return ForgeHooks.getBurnTime(pFuel, this.recipeType);
    }
}
