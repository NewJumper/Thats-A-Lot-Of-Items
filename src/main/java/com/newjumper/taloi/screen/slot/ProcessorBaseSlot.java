package com.newjumper.taloi.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ProcessorBaseSlot extends SlotItemHandler {
    public ProcessorBaseSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return stack.getItem() == Items.COAL || stack.getItem() == Items.DIAMOND || stack.getItem() == Items.EMERALD;
    }
}
