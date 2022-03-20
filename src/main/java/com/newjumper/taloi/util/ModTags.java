package com.newjumper.taloi.util;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> ALUMINUM = forgeTag("storage_blocks/aluminum");
        public static final Tags.IOptionalNamedTag<Block> TALOI_ORES = taloiTag("taloi_ores");

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

        private static Tags.IOptionalNamedTag<Block> taloiTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }

    public static class Items {
        // INGOTS
        public static final Tags.IOptionalNamedTag<Item> ALUMINUM = forgeTag("ingots/aluminum");
        public static final Tags.IOptionalNamedTag<Item> IRIDIUM = forgeTag("ingots/iridium");
        public static final Tags.IOptionalNamedTag<Item> LEAD = forgeTag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> MAGNESIUM = forgeTag("ingots/magnesium");
        public static final Tags.IOptionalNamedTag<Item> OSMIUM = forgeTag("ingots/osmium");
        public static final Tags.IOptionalNamedTag<Item> PLATINUM = forgeTag("ingots/platinum");
        public static final Tags.IOptionalNamedTag<Item> SILICON = forgeTag("ingots/silicon");
        public static final Tags.IOptionalNamedTag<Item> TIN = forgeTag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> TUNGSTEN = forgeTag("ingots/tungsten");
        public static final Tags.IOptionalNamedTag<Item> URANIUM = forgeTag("ingots/uranium");
        public static final Tags.IOptionalNamedTag<Item> ZINC = forgeTag("ingots/zinc");
        public static final Tags.IOptionalNamedTag<Item> BRONZE = forgeTag("ingots/bronze");
        public static final Tags.IOptionalNamedTag<Item> STEEL = forgeTag("ingots/steel");

        // RAW MATERIALS
        public static final Tags.IOptionalNamedTag<Item> RAW_ALUMINUM = forgeTag("raw_materials/aluminum");
        public static final Tags.IOptionalNamedTag<Item> RAW_IRIDIUM = forgeTag("raw_materials/iridium");
        public static final Tags.IOptionalNamedTag<Item> RAW_LEAD = forgeTag("raw_materials/lead");
        public static final Tags.IOptionalNamedTag<Item> RAW_MAGNESIUM = forgeTag("raw_materials/magnesium");
        public static final Tags.IOptionalNamedTag<Item> RAW_OSMIUM = forgeTag("raw_materials/osmium");
        public static final Tags.IOptionalNamedTag<Item> RAW_PLATINUM = forgeTag("raw_materials/platinum");
        public static final Tags.IOptionalNamedTag<Item> RAW_SILICON = forgeTag("raw_materials/silicon");
        public static final Tags.IOptionalNamedTag<Item> RAW_TIN = forgeTag("raw_materials/tin");
        public static final Tags.IOptionalNamedTag<Item> RAW_TUNGSTEN = forgeTag("raw_materials/tungsten");
        public static final Tags.IOptionalNamedTag<Item> RAW_URANIUM = forgeTag("raw_materials/uranium");
        public static final Tags.IOptionalNamedTag<Item> RAW_ZINC = forgeTag("raw_materials/zinc");

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

        private static Tags.IOptionalNamedTag<Item> taloiTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(ThatsALotOfItems.MOD_ID, name));
        }
    }
}
