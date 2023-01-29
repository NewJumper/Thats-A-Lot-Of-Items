package com.newjumper.taloi.util;

import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class TaloiCreativeModeTab {
    public static final CreativeModeTab TALOI_BLOCKS = new CreativeModeTab("taloi_blocks") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.DIAMOND_BLOCK);
        }
    };

    public static final CreativeModeTab TALOI_ITEMS = new CreativeModeTab("taloi_items") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.DIAMOND_APPLE.get());
        }
    };

    public static final CreativeModeTab TALOI_COMBAT = new CreativeModeTab("taloi_combat") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TaloiItems.EMERALD_CHESTPLATE.get());
        }
    };
}
