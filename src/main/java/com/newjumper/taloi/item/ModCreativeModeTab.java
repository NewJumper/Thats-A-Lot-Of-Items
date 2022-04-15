package com.newjumper.taloi.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.newjumper.taloi.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab TALOI_BLOCK_TAB = new CreativeModeTab("taloi_block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TUNGSTEN_BLOCK.get());
        }
    };

    public static final CreativeModeTab TALOI_MACHINERY_TAB = new CreativeModeTab("taloi_machinery_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TUNGSTEN_BLOCK.get());
        }
    };

    public static final CreativeModeTab TALOI_ITEM_TAB = new CreativeModeTab("taloi_item_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FUTURITE.get());
        }
    };

    public static final CreativeModeTab TALOI_TOOL_TAB = new CreativeModeTab("taloi_tool_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FUTURITE_PICKAXE.get());
        }
    };

    public static final CreativeModeTab TALOI_COMBAT_TAB = new CreativeModeTab("taloi_combat_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SERMIUM_CHESTPLATE.get());
        }
    };
}
