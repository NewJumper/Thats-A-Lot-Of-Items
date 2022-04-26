package com.newjumper.taloi.util;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
//        public static final TagKey<Block> ALUMINUM = forgeTag("storage_blocks/aluminum");
        public static final TagKey<Block> TALOI_ORES = taloiTag("taloi_ores");

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Block> taloiTag(String name) {
            return BlockTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }

    public static class Items {
        // INGOTS
        public static final TagKey<Item> INGOT_ALUMINUM = forgeTag("ingots/aluminum");
        public static final TagKey<Item> INGOT_IRIDIUM = forgeTag("ingots/iridium");
        public static final TagKey<Item> INGOT_LEAD = forgeTag("ingots/lead");
        public static final TagKey<Item> INGOT_MAGNESIUM = forgeTag("ingots/magnesium");
        public static final TagKey<Item> INGOT_OSMIUM = forgeTag("ingots/osmium");
        public static final TagKey<Item> INGOT_PLATINUM = forgeTag("ingots/platinum");
        public static final TagKey<Item> INGOT_SILICON = forgeTag("ingots/silicon");
        public static final TagKey<Item> INGOT_TIN = forgeTag("ingots/tin");
        public static final TagKey<Item> INGOT_TUNGSTEN = forgeTag("ingots/tungsten");
        public static final TagKey<Item> INGOT_URANIUM = forgeTag("ingots/uranium");
        public static final TagKey<Item> INGOT_ZINC = forgeTag("ingots/zinc");
        public static final TagKey<Item> INGOT_BRONZE = forgeTag("ingots/bronze");
        public static final TagKey<Item> INGOT_STEEL = forgeTag("ingots/steel");

        // RAW MATERIALS
        public static final TagKey<Item> RAW_ALUMINUM = forgeTag("raw_materials/aluminum");
        public static final TagKey<Item> RAW_IRIDIUM = forgeTag("raw_materials/iridium");
        public static final TagKey<Item> RAW_LEAD = forgeTag("raw_materials/lead");
        public static final TagKey<Item> RAW_MAGNESIUM = forgeTag("raw_materials/magnesium");
        public static final TagKey<Item> RAW_OSMIUM = forgeTag("raw_materials/osmium");
        public static final TagKey<Item> RAW_PLATINUM = forgeTag("raw_materials/platinum");
        public static final TagKey<Item> RAW_SILICON = forgeTag("raw_materials/silicon");
        public static final TagKey<Item> RAW_TIN = forgeTag("raw_materials/tin");
        public static final TagKey<Item> RAW_TUNGSTEN = forgeTag("raw_materials/tungsten");
        public static final TagKey<Item> RAW_URANIUM = forgeTag("raw_materials/uranium");
        public static final TagKey<Item> RAW_ZINC = forgeTag("raw_materials/zinc");

        // NUGGETS
        public static final TagKey<Item> NUGGET_ALUMINUM = forgeTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGET_IRIDIUM = forgeTag("nuggets/iridium");
        public static final TagKey<Item> NUGGET_LEAD = forgeTag("nuggets/lead");
        public static final TagKey<Item> NUGGET_MAGNESIUM = forgeTag("nuggets/magnesium");
        public static final TagKey<Item> NUGGET_OSMIUM = forgeTag("nuggets/osmium");
        public static final TagKey<Item> NUGGET_PLATINUM = forgeTag("nuggets/platinum");
        public static final TagKey<Item> NUGGET_TIN = forgeTag("nuggets/tin");
        public static final TagKey<Item> NUGGET_TUNGSTEN = forgeTag("nuggets/tungsten");
        public static final TagKey<Item> NUGGET_URANIUM = forgeTag("nuggets/uranium");
        public static final TagKey<Item> NUGGET_ZINC = forgeTag("nuggets/zinc");

        // MACHINERY
        public static final TagKey<Item> PROCESSOR_BASE = taloiTag("processor_base");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Item> taloiTag(String name) {
            return ItemTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }
}
