package com.newjumper.taloi.screen.slot;

import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
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
        return stack.is(ModTags.Items.PROCESSOR_BASE);
    }
}
