package com.newjumper.taloi.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.newjumper.taloi.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab TALOI_ITEM_TAB = new CreativeModeTab("taloiItemTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALUMINUM_INGOT.get());
        }
    };
    public static final CreativeModeTab TALOI_BLOCK_TAB = new CreativeModeTab("taloiBlockTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ALUMINUM_BLOCK.get());
        }
    };
}
