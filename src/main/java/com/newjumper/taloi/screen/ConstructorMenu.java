package com.newjumper.taloi.screen;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.screen.slot.FuelSlot;
import com.newjumper.taloi.screen.slot.ResultSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ConstructorMenu extends AbstractContainerMenu {
    private static final int INV_SLOTS = 36;
    private static final int MENU_SLOTS = 4;
    private final BlockEntity blockEntity;
    private final ContainerData data;
    private final Level level;

    public ConstructorMenu(int pContainerId, Inventory pInventory, FriendlyByteBuf pBuffer) {
        this(pContainerId, pInventory, pInventory.player.level.getBlockEntity(pBuffer.readBlockPos()), new SimpleContainerData(4));
    }

    public ConstructorMenu(int pContainerId, Inventory pInventory, BlockEntity pBlockEntity, ContainerData pContainerData) {
        super(TaloiMenuTypes.CONSTRUCTOR_MENU.get(), pContainerId);
        this.blockEntity = pBlockEntity;
        this.level = pInventory.player.level;
        this.data = pContainerData;

        checkContainerSize(pInventory, MENU_SLOTS);
        addInventorySlots(pInventory);
        addDataSlots(pContainerData);

        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            this.addSlot(new FuelSlot(handler, 0, 31, 49));
            this.addSlot(new SlotItemHandler(handler, 1, 69, 19));
            this.addSlot(new SlotItemHandler(handler, 2, 69, 55));
            this.addSlot(new ResultSlot(handler, 3, 125, 37));
        });
    }

    private void addInventorySlots(Inventory inventory) {
        for(int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 142));
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    @NotNull
    @Override
    public ItemStack quickMoveStack(@NotNull Player pPlayer, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if(!sourceSlot.hasItem()) return ItemStack.EMPTY;

        ItemStack sourceItem = sourceSlot.getItem();
        if(pIndex < INV_SLOTS) {
            if(!moveItemStackTo(sourceItem, INV_SLOTS, INV_SLOTS + MENU_SLOTS, false)) return ItemStack.EMPTY;
        } else if(pIndex < INV_SLOTS + MENU_SLOTS) {
            if(!moveItemStackTo(sourceItem, 0, INV_SLOTS, false)) return ItemStack.EMPTY;
        } else return ItemStack.EMPTY;

        if(sourceItem.getCount() == 0) sourceSlot.set(ItemStack.EMPTY);
        else sourceSlot.setChanged();

        sourceSlot.onTake(pPlayer, sourceItem);
        return sourceItem;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, TaloiBlocks.ALPHA_CONSTRUCTOR.get()) ||
               stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, TaloiBlocks.BETA_CONSTRUCTOR.get());
    }

    public int drawFuel() {
        int fuel = this.data.get(0);
        int max = this.data.get(1);

        return fuel == 0 ? -1 : Math.max((-14 * (fuel - max)) / max, 0);
    }

    public int drawProgress() {
        double progress = this.data.get(2);
        int max = this.data.get(3);

        return progress == 0 ? 0 : (int) (progress / max * 27);
    }
}
