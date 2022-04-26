package com.newjumper.taloi.screen;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.screen.slot.ModFuelSlot;
import com.newjumper.taloi.screen.slot.ModResultSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class UnstableHydraulicPressMenu extends AbstractContainerMenu {
    private static final int VANILLA_SLOT_COUNT = 36;
    private static final int BLOCK_SLOT_COUNT = 5;
    private static final int BLOCK_FIRST_SLOT_INDEX = VANILLA_SLOT_COUNT;
    private final BlockEntity blockEntity;
    private final Level level;

    public UnstableHydraulicPressMenu(int pContainerId, Inventory inventory, FriendlyByteBuf buffer) {
        this(pContainerId, inventory, inventory.player.level.getBlockEntity(buffer.readBlockPos()));
    }

    public UnstableHydraulicPressMenu(int pContainerId, Inventory inventory, BlockEntity blockEntity) {
        super(ModMenuTypes.UNSTABLE_HYDRAULIC_PRESS_MENU.get(), pContainerId);
        this.blockEntity = blockEntity;
        this.level = inventory.player.level;

        checkContainerSize(inventory, 5);
        addPlayerInventory(inventory);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new ModFuelSlot(handler, 0, 24, 47));
            this.addSlot(new SlotItemHandler(handler, 1, 56, 35));
            this.addSlot(new SlotItemHandler(handler, 2, 76, 35));
            this.addSlot(new SlotItemHandler(handler, 3, 96, 35));
            this.addSlot(new ModResultSlot(handler, 4, 132, 35));
        });
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
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.UNSTABLE_HYDRAULIC_PRESS.get());
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
}
