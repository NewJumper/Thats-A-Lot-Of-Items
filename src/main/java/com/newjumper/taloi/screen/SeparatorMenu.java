package com.newjumper.taloi.screen;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.screen.slot.ModFuelSlot;
import com.newjumper.taloi.screen.slot.ModResultSlot;
import com.newjumper.taloi.screen.slot.SeparatorOreSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;

public class SeparatorMenu extends AbstractContainerMenu {
    private static final int VANILLA_SLOT_COUNT = 36;
    private static final int BLOCK_SLOT_COUNT = 4;
    private static final int BLOCK_FIRST_SLOT_INDEX = VANILLA_SLOT_COUNT;
    private final BlockEntity blockEntity;
    private final ContainerData containerData;
    private final Level level;

    public SeparatorMenu(int pContainerId, Inventory inventory, FriendlyByteBuf buffer) {
        this(pContainerId, inventory, inventory.player.level.getBlockEntity(buffer.readBlockPos()), new SimpleContainerData(4));
    }

    public SeparatorMenu(int pContainerId, Inventory inventory, BlockEntity blockEntity, ContainerData containerData) {
        super(ModMenuTypes.SEPARATOR_MENU.get(), pContainerId);
        this.blockEntity = blockEntity;
        this.level = inventory.player.level;
        this.containerData = containerData;

        checkContainerSize(inventory, 4);
        addPlayerInventory(inventory);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new ModFuelSlot(handler, 0, 30, 41));
            this.addSlot(new SeparatorOreSlot(handler, 1, 51, 41));
            this.addSlot(new ModResultSlot(handler, 2, 102, 37));
            this.addSlot(new ModResultSlot(handler, 3, 128, 37));
        });

        addDataSlots(containerData);
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

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.ALPHA_SEPARATOR.get()) ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.BETA_SEPARATOR.get()) ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.UNSTABLE_SEPARATOR.get());
    }

    public boolean isOn() {
        return containerData.get(2) > 0;
    }

    public int getScaledProgress() {
        int currentProgress = this.containerData.get(2);
        int maxProgress = this.containerData.get(3);
        int progressBarLength = 22;

        return maxProgress != 0 && currentProgress != 0 ? currentProgress * progressBarLength / maxProgress : 0;
    }
}