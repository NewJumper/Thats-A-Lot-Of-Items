package com.newjumper.taloi.util;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TaloiCreativeModeTab {
    public static final CreativeModeTab TALOI_BLOCKS = new CreativeModeTab("taloi_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiBlocks.TUNGSTEN_BLOCK.get());
        }
    };

    public static final CreativeModeTab TALOI_MACHINES = new CreativeModeTab("taloi_machines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiBlocks.BETA_CONSTRUCTOR.get());
        }
    };

    public static final CreativeModeTab TALOI_ITEMS = new CreativeModeTab("taloi_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.FUTURITE.get());
        }
    };

    public static final CreativeModeTab TALOI_TOOLS = new CreativeModeTab("taloi_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.FUTURITE_PICKAXE.get());
        }
    };

    public static final CreativeModeTab TALOI_COMBAT = new CreativeModeTab("taloi_combat") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.SERMIUM_CHESTPLATE.get());
        }
    };
}
