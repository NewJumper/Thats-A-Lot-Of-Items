package com.newjumper.taloi.util;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TALOI_BLOCKS = new CreativeModeTab("taloi_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TUNGSTEN_BLOCK.get());
        }
    };

    public static final CreativeModeTab TALOI_MACHINES = new CreativeModeTab("taloi_machines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BETA_CONSTRUCTOR.get());
        }
    };

    public static final CreativeModeTab TALOI_ITEMS = new CreativeModeTab("taloi_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FUTURITE.get());
        }
    };

    public static final CreativeModeTab TALOI_TOOLS = new CreativeModeTab("taloi_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FUTURITE_PICKAXE.get());
        }
    };

    public static final CreativeModeTab TALOI_COMBAT = new CreativeModeTab("taloi_combat") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SERMIUM_CHESTPLATE.get());
        }
    };
}
