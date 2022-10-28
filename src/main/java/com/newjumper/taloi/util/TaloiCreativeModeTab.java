package com.newjumper.taloi.util;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TaloiCreativeModeTab {
    public static final CreativeModeTab TALOI_BLOCKS = new CreativeModeTab("taloi_blocks") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiBlocks.TUNGSTEN_BLOCK.get());
        }
    };

    public static final CreativeModeTab TALOI_MACHINES = new CreativeModeTab("taloi_machines") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiBlocks.BETA_CONSTRUCTOR.get());
        }
    };

    public static final CreativeModeTab TALOI_ITEMS = new CreativeModeTab("taloi_items") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.FUTURITE.get());
        }
    };

    public static final CreativeModeTab TALOI_TOOLS = new CreativeModeTab("taloi_tools") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.FUTURITE_PICKAXE.get());
        }
    };

    public static final CreativeModeTab TALOI_COMBAT = new CreativeModeTab("taloi_combat") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.SERMIUM_CHESTPLATE.get());
        }
    };
}
