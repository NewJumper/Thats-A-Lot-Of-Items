package com.newjumper.taloi.screen;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.screen.slot.ModFuelSlot;
import com.newjumper.taloi.screen.slot.ModResultSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class HydraulicPressMenu extends AbstractContainerMenu {
    private static final int VANILLA_SLOT_COUNT = 36;
    private static final int BLOCK_SLOT_COUNT = 4;
    private static final int BLOCK_FIRST_SLOT_INDEX = VANILLA_SLOT_COUNT;
    private final BlockEntity blockEntity;
    private final ContainerData containerData;
    private final Level level;

    public HydraulicPressMenu(int pContainerId, Inventory pInventory, FriendlyByteBuf pBuffer) {
        this(pContainerId, pInventory, pInventory.player.level.getBlockEntity(pBuffer.readBlockPos()), new SimpleContainerData(4));
    }

    public HydraulicPressMenu(int pContainerId, Inventory pInventory, BlockEntity pBlockEntity, ContainerData pContainerData) {
        super(ModMenuTypes.HYDRAULIC_PRESS_MENU.get(), pContainerId);
        this.blockEntity = pBlockEntity;
        this.level = pInventory.player.level;
        this.containerData = pContainerData;

        checkContainerSize(pInventory, 4);
        addInventorySlots(pInventory);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new ModFuelSlot(handler, 0, 31, 49));
            this.addSlot(new SlotItemHandler(handler, 1, 66, 37));
            this.addSlot(new SlotItemHandler(handler, 2, 86, 37));
            this.addSlot(new ModResultSlot(handler, 3, 125, 37));
        });

        addDataSlots(pContainerData);
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);

        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;

        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (index < VANILLA_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, BLOCK_FIRST_SLOT_INDEX, BLOCK_FIRST_SLOT_INDEX + BLOCK_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < BLOCK_FIRST_SLOT_INDEX + BLOCK_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, 0, VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0) sourceSlot.set(ItemStack.EMPTY);
        else sourceSlot.setChanged();

        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.ALPHA_HYDRAULIC_PRESS.get()) ||
               stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.BETA_HYDRAULIC_PRESS.get());
    }

    private void addInventorySlots(Inventory pInventory) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(pInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(pInventory, i, 8 + i * 18, 142));
        }
    }

    public boolean isLit() {
        return containerData.get(0) > 0;
    }
    public boolean hasIngredients() {
        return containerData.get(2) > 0;
    }
    public int getProgress() {
        int currentProgress = this.containerData.get(2);
        int maxProgress = this.containerData.get(3);
        int progressBarLength = 17;

        return maxProgress != 0 && currentProgress != 0 ? currentProgress * progressBarLength / maxProgress : 0;
    }
    public int getFuelProgress() {
        int litTime = this.containerData.get(0);
        int litDuration = this.containerData.get(1);

        return litDuration != 0 && litTime != 0 ? (-13 * (litTime - litDuration)) / litDuration : 0;
    }
}
