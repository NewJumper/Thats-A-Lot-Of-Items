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
        public static final TagKey<Block> EVERGREEN_LOGS = taloiTag("evergreen_logs");
        public static final TagKey<Block> WILLOW_LOGS = taloiTag("willow_logs");

        public static final TagKey<Block> TERRACOTTA_STAIRS = taloiTag("terracotta_stairs");
        public static final TagKey<Block> TERRACOTTA_SLABS = taloiTag("terracotta_slabs");
        public static final TagKey<Block> CONCRETE_STAIRS = taloiTag("concrete_stairs");
        public static final TagKey<Block> CONCRETE_SLABS = taloiTag("concrete_slabs");

        private static TagKey<Block> taloiTag(String name) {
            return BlockTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> EVERGREEN_LOGS = taloiTag("evergreen_logs");
        public static final TagKey<Item> WILLOW_LOGS = taloiTag("willow_logs");

        public static final TagKey<Item> TERRACOTTA_STAIRS = taloiTag("terracotta_stairs");
        public static final TagKey<Item> TERRACOTTA_SLABS = taloiTag("terracotta_slabs");
        public static final TagKey<Item> CONCRETE_STAIRS = taloiTag("concrete_stairs");
        public static final TagKey<Item> CONCRETE_SLABS = taloiTag("concrete_slabs");

        private static TagKey<Item> taloiTag(String name) {
            return ItemTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }
}
