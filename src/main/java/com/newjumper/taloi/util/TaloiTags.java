package com.newjumper.taloi.util;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TaloiTags {
    public static class Blocks {
        public static final TagKey<Block> TERRACOTTA_STAIRS = tag("terracotta_stairs");
        public static final TagKey<Block> TERRACOTTA_SLABS = tag("terracotta_slabs");
        public static final TagKey<Block> CONCRETE_STAIRS = tag("concrete_stairs");
        public static final TagKey<Block> CONCRETE_SLABS = tag("concrete_slabs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TERRACOTTA_STAIRS = tag("terracotta_stairs");
        public static final TagKey<Item> TERRACOTTA_SLABS = tag("terracotta_slabs");
        public static final TagKey<Item> CONCRETE_STAIRS = tag("concrete_stairs");
        public static final TagKey<Item> CONCRETE_SLABS = tag("concrete_slabs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }
}
