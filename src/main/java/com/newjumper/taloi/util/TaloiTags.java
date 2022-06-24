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

        public static final TagKey<Block> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Block> ORES_IRIDIUM = forgeTag("ores/iridium");
        public static final TagKey<Block> ORES_LEAD = forgeTag("ores/lead");
        public static final TagKey<Block> ORES_MAGNESIUM = forgeTag("ores/magnesium");
        public static final TagKey<Block> ORES_OSMIUM = forgeTag("ores/osmium");
        public static final TagKey<Block> ORES_PLATINUM = forgeTag("ores/platinum");
        public static final TagKey<Block> ORES_SILICON = forgeTag("ores/silicon");
        public static final TagKey<Block> ORES_TIN = forgeTag("ores/tin");
        public static final TagKey<Block> ORES_TUNGSTEN = forgeTag("ores/tungsten");
        public static final TagKey<Block> ORES_URANIUM = forgeTag("ores/uranium");
        public static final TagKey<Block> ORES_ZINC = forgeTag("ores/zinc");
        public static final TagKey<Block> TALOI_ORES = taloiTag("taloi_ores");

        public static final TagKey<Block> STORAGE_ALUMINUM = forgeTag("storage_blocks/aluminum");
        public static final TagKey<Block> RAW_STORAGE_ALUMINUM = forgeTag("storage_blocks/raw_aluminum");
        public static final TagKey<Block> STORAGE_IRIDIUM = forgeTag("storage_blocks/iridium");
        public static final TagKey<Block> RAW_STORAGE_IRIDIUM = forgeTag("storage_blocks/raw_iridium");
        public static final TagKey<Block> STORAGE_LEAD = forgeTag("storage_blocks/lead");
        public static final TagKey<Block> RAW_STORAGE_LEAD = forgeTag("storage_blocks/raw_lead");
        public static final TagKey<Block> STORAGE_MAGNESIUM = forgeTag("storage_blocks/magnesium");
        public static final TagKey<Block> RAW_STORAGE_MAGNESIUM = forgeTag("storage_blocks/raw_magnesium");
        public static final TagKey<Block> STORAGE_OSMIUM = forgeTag("storage_blocks/osmium");
        public static final TagKey<Block> RAW_STORAGE_OSMIUM = forgeTag("storage_blocks/raw_osmium");
        public static final TagKey<Block> STORAGE_PLATINUM = forgeTag("storage_blocks/platinum");
        public static final TagKey<Block> RAW_STORAGE_PLATINUM = forgeTag("storage_blocks/raw_platinum");
        public static final TagKey<Block> STORAGE_SILICON = forgeTag("storage_blocks/silicon");
        public static final TagKey<Block> RAW_STORAGE_SILICON = forgeTag("storage_blocks/raw_silicon");
        public static final TagKey<Block> STORAGE_TIN = forgeTag("storage_blocks/tin");
        public static final TagKey<Block> RAW_STORAGE_TIN = forgeTag("storage_blocks/raw_tin");
        public static final TagKey<Block> STORAGE_TUNGSTEN = forgeTag("storage_blocks/tungsten");
        public static final TagKey<Block> RAW_STORAGE_TUNGSTEN = forgeTag("storage_blocks/raw_tungsten");
        public static final TagKey<Block> STORAGE_URANIUM = forgeTag("storage_blocks/uranium");
        public static final TagKey<Block> RAW_STORAGE_URANIUM = forgeTag("storage_blocks/raw_uranium");
        public static final TagKey<Block> STORAGE_ZINC = forgeTag("storage_blocks/zinc");
        public static final TagKey<Block> RAW_STORAGE_ZINC = forgeTag("storage_blocks/raw_zinc");
        public static final TagKey<Block> STORAGE_BRONZE = forgeTag("storage_blocks/bronze");
        public static final TagKey<Block> STORAGE_STEEL = forgeTag("storage_blocks/steel");
        public static final TagKey<Block> TALOI_STORAGE_BLOCKS = taloiTag("taloi_storage_blocks");

        public static final TagKey<Block> MACHINES = taloiTag("machines");

        public static final TagKey<Block> TERRACOTTA_STAIRS = taloiTag("terracotta_stairs");
        public static final TagKey<Block> TERRACOTTA_SLABS = taloiTag("terracotta_slabs");
        public static final TagKey<Block> CONCRETE_STAIRS = taloiTag("concrete_stairs");
        public static final TagKey<Block> CONCRETE_SLABS = taloiTag("concrete_slabs");

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Block> taloiTag(String name) {
            return BlockTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> EVERGREEN_LOGS = taloiTag("evergreen_logs");
        public static final TagKey<Item> WILLOW_LOGS = taloiTag("willow_logs");

        public static final TagKey<Item> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Item> ORES_IRIDIUM = forgeTag("ores/iridium");
        public static final TagKey<Item> ORES_LEAD = forgeTag("ores/lead");
        public static final TagKey<Item> ORES_MAGNESIUM = forgeTag("ores/magnesium");
        public static final TagKey<Item> ORES_OSMIUM = forgeTag("ores/osmium");
        public static final TagKey<Item> ORES_PLATINUM = forgeTag("ores/platinum");
        public static final TagKey<Item> ORES_SILICON = forgeTag("ores/silicon");
        public static final TagKey<Item> ORES_TIN = forgeTag("ores/tin");
        public static final TagKey<Item> ORES_TUNGSTEN = forgeTag("ores/tungsten");
        public static final TagKey<Item> ORES_URANIUM = forgeTag("ores/uranium");
        public static final TagKey<Item> ORES_ZINC = forgeTag("ores/zinc");
        public static final TagKey<Item> TALOI_ORES = taloiTag("taloi_ores");

        public static final TagKey<Item> STORAGE_ALUMINUM = forgeTag("storage_blocks/aluminum");
        public static final TagKey<Item> RAW_STORAGE_ALUMINUM = forgeTag("storage_blocks/raw_aluminum");
        public static final TagKey<Item> STORAGE_IRIDIUM = forgeTag("storage_blocks/iridium");
        public static final TagKey<Item> RAW_STORAGE_IRIDIUM = forgeTag("storage_blocks/raw_iridium");
        public static final TagKey<Item> STORAGE_LEAD = forgeTag("storage_blocks/lead");
        public static final TagKey<Item> RAW_STORAGE_LEAD = forgeTag("storage_blocks/raw_lead");
        public static final TagKey<Item> STORAGE_MAGNESIUM = forgeTag("storage_blocks/magnesium");
        public static final TagKey<Item> RAW_STORAGE_MAGNESIUM = forgeTag("storage_blocks/raw_magnesium");
        public static final TagKey<Item> STORAGE_OSMIUM = forgeTag("storage_blocks/osmium");
        public static final TagKey<Item> RAW_STORAGE_OSMIUM = forgeTag("storage_blocks/raw_osmium");
        public static final TagKey<Item> STORAGE_PLATINUM = forgeTag("storage_blocks/platinum");
        public static final TagKey<Item> RAW_STORAGE_PLATINUM = forgeTag("storage_blocks/raw_platinum");
        public static final TagKey<Item> STORAGE_SILICON = forgeTag("storage_blocks/silicon");
        public static final TagKey<Item> RAW_STORAGE_SILICON = forgeTag("storage_blocks/raw_silicon");
        public static final TagKey<Item> STORAGE_TIN = forgeTag("storage_blocks/tin");
        public static final TagKey<Item> RAW_STORAGE_TIN = forgeTag("storage_blocks/raw_tin");
        public static final TagKey<Item> STORAGE_TUNGSTEN = forgeTag("storage_blocks/tungsten");
        public static final TagKey<Item> RAW_STORAGE_TUNGSTEN = forgeTag("storage_blocks/raw_tungsten");
        public static final TagKey<Item> STORAGE_URANIUM = forgeTag("storage_blocks/uranium");
        public static final TagKey<Item> RAW_STORAGE_URANIUM = forgeTag("storage_blocks/raw_uranium");
        public static final TagKey<Item> STORAGE_ZINC = forgeTag("storage_blocks/zinc");
        public static final TagKey<Item> RAW_STORAGE_ZINC = forgeTag("storage_blocks/raw_zinc");
        public static final TagKey<Item> STORAGE_BRONZE = forgeTag("storage_blocks/bronze");
        public static final TagKey<Item> STORAGE_STEEL = forgeTag("storage_blocks/steel");
        public static final TagKey<Item> TALOI_STORAGE_BLOCKS = taloiTag("taloi_storage_blocks");

        // INGOTS
        public static final TagKey<Item> INGOTS_ALUMINUM = forgeTag("ingots/aluminum");
        public static final TagKey<Item> INGOTS_IRIDIUM = forgeTag("ingots/iridium");
        public static final TagKey<Item> INGOTS_LEAD = forgeTag("ingots/lead");
        public static final TagKey<Item> INGOTS_MAGNESIUM = forgeTag("ingots/magnesium");
        public static final TagKey<Item> INGOTS_OSMIUM = forgeTag("ingots/osmium");
        public static final TagKey<Item> INGOTS_PLATINUM = forgeTag("ingots/platinum");
        public static final TagKey<Item> INGOTS_SILICON = forgeTag("ingots/silicon");
        public static final TagKey<Item> INGOTS_TIN = forgeTag("ingots/tin");
        public static final TagKey<Item> INGOTS_TUNGSTEN = forgeTag("ingots/tungsten");
        public static final TagKey<Item> INGOTS_URANIUM = forgeTag("ingots/uranium");
        public static final TagKey<Item> INGOTS_ZINC = forgeTag("ingots/zinc");
        public static final TagKey<Item> INGOTS_BRONZE = forgeTag("ingots/bronze");
        public static final TagKey<Item> INGOTS_STEEL = forgeTag("ingots/steel");
        public static final TagKey<Item> TALOI_INGOTS = taloiTag("taloi_ingots");

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
        public static final TagKey<Item> TALOI_RAW_MATERIALS = taloiTag("taloi_raw_materials");

        // NUGGETS
        public static final TagKey<Item> NUGGETS_ALUMINUM = forgeTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGETS_IRIDIUM = forgeTag("nuggets/iridium");
        public static final TagKey<Item> NUGGETS_LEAD = forgeTag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_MAGNESIUM = forgeTag("nuggets/magnesium");
        public static final TagKey<Item> NUGGETS_OSMIUM = forgeTag("nuggets/osmium");
        public static final TagKey<Item> NUGGETS_PLATINUM = forgeTag("nuggets/platinum");
        public static final TagKey<Item> NUGGETS_TIN = forgeTag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_TUNGSTEN = forgeTag("nuggets/tungsten");
        public static final TagKey<Item> NUGGETS_URANIUM = forgeTag("nuggets/uranium");
        public static final TagKey<Item> NUGGETS_ZINC = forgeTag("nuggets/zinc");
        public static final TagKey<Item> TALOI_NUGGETS = taloiTag("taloi_nuggets");

        // MACHINERY
        public static final TagKey<Item> PROCESSOR_BASE = taloiTag("machinery/processor_base");
        public static final TagKey<Item> PROCESSOR_RAW = taloiTag("machinery/processor_raw");
        public static final TagKey<Item> SEPARATOR_ORES = taloiTag("machinery/separator_ores");

        public static final TagKey<Item> TERRACOTTA_STAIRS = taloiTag("terracotta_stairs");
        public static final TagKey<Item> TERRACOTTA_SLABS = taloiTag("terracotta_slabs");
        public static final TagKey<Item> CONCRETE_STAIRS = taloiTag("concrete_stairs");
        public static final TagKey<Item> CONCRETE_SLABS = taloiTag("concrete_slabs");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Item> taloiTag(String name) {
            return ItemTags.create(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }
}
