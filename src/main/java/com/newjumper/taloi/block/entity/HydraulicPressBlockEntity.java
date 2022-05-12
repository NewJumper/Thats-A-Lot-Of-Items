package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.PressingRecipe;
import com.newjumper.taloi.screen.HydraulicPressMenu;
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

public class HydraulicPressBlockEntity extends BlockEntity implements MenuProvider {
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
                case 0 -> HydraulicPressBlockEntity.this.litTime;
                case 1 -> HydraulicPressBlockEntity.this.maxLitTime;
                case 2 -> HydraulicPressBlockEntity.this.currentProgress;
                case 3 -> HydraulicPressBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        public void set(int index, int value) {
            switch (index) {
                case 0 -> HydraulicPressBlockEntity.this.litTime = value;
                case 1 -> HydraulicPressBlockEntity.this.maxLitTime = value;
                case 2 -> HydraulicPressBlockEntity.this.currentProgress = value;
                case 3 -> HydraulicPressBlockEntity.this.maxProgress = value;
            }
        }

        public int getCount() {
            return 4;
        }
    };
    private static int lastSlotIndex;

    public HydraulicPressBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends PressingRecipe> pRecipeType, int slots) {
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
        return new TranslatableComponent("container.taloi.press");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new HydraulicPressMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("press.litTime", this.litTime);
        nbt.putInt("press.maxLitTime", this.maxLitTime);
        nbt.putInt("press.currentProgress", this.currentProgress);
        nbt.putInt("press.maxProgress", this.maxProgress);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        this.litTime = nbt.getInt("press.litTime");
        this.maxLitTime = nbt.getInt("press.maxLitTime");
        this.currentProgress = nbt.getInt("press.currentProgress");
        this.maxProgress = nbt.getInt("press.maxProgress");
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

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, HydraulicPressBlockEntity blockEntity) {
        if(hasRecipe(blockEntity)) {
            blockEntity.currentProgress++;
            setChanged(pLevel, pPos, pState);

            if(blockEntity.currentProgress >= blockEntity.maxProgress) {
                Level level = blockEntity.level;
                SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
                for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
                    inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
                }

                Optional<? extends PressingRecipe> match = level.getRecipeManager().getRecipeFor(blockEntity.recipeType, inventory, level);
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

    private static boolean hasRecipe(HydraulicPressBlockEntity blockEntity) {
        Level level = blockEntity.level;
        SimpleContainer inventory = new SimpleContainer(blockEntity.itemHandler.getSlots());
        for (int i = 0; i < blockEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemHandler.getStackInSlot(i));
        }

        Optional<? extends PressingRecipe> match = level.getRecipeManager().getRecipeFor(blockEntity.recipeType, inventory, level);

        return match.isPresent() && canPress(inventory, match.get().getResultItem()) && hasFuel(blockEntity);
    }

    private static boolean canPress(SimpleContainer container, ItemStack result) {
        return (container.taloi.getItem(lastSlotIndex).getItem() == result.getItem() || container.taloi.getItem(lastSlotIndex).isEmpty()) &&
                (container.taloi.getItem(lastSlotIndex).getCount() < container.taloi.getItem(lastSlotIndex).getMaxStackSize());
    }

    private static boolean hasFuel(HydraulicPressBlockEntity blockEntity) {
        return AbstractFurnaceBlockEntity.isFuel(blockEntity.itemHandler.getStackInSlot(0));
    }

    private int getBurnDuration(ItemStack pFuel) {
        if (pFuel.isEmpty()) return 0;
        else return ForgeHooks.getBurnTime(pFuel, this.recipeType);
    }
}
