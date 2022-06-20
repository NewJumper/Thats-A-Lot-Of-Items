package com.newjumper.taloi.datagen.tags;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE).add(TaloiBlocks.BAMBOO_PLANKS.get(), TaloiBlocks.BUNDLED_BAMBOO.get(), TaloiBlocks.WOODEN_CRATE.get(),
                TaloiBlocks.OAK_WOOD_SLAB.get(), TaloiBlocks.SPRUCE_WOOD_SLAB.get(), TaloiBlocks.BIRCH_WOOD_SLAB.get(), TaloiBlocks.JUNGLE_WOOD_SLAB.get(), TaloiBlocks.ACACIA_WOOD_SLAB.get(), TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), TaloiBlocks.WARPED_HYPHAE_SLAB.get(), TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.WILLOW_WOOD_SLAB.get(),
                TaloiBlocks.OAK_WOOD_STAIRS.get(), TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.BIRCH_WOOD_STAIRS.get(), TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.ACACIA_WOOD_STAIRS.get(), TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.WILLOW_WOOD_STAIRS.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_HOE).add(TaloiBlocks.EVERGREEN_LEAVES.get(), TaloiBlocks.WILLOW_LEAVES.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(TaloiBlocks.ASPHALT.get(), TaloiBlocks.LIMESTONE.get(), TaloiBlocks.LIMESTONE_BRICKS.get(), TaloiBlocks.MARBLE.get(), TaloiBlocks.SLATE.get(), TaloiBlocks.SLATE_BRICKS.get(), TaloiBlocks.POLISHED_TUFF.get(),
                TaloiBlocks.CHISELED_ANDESITE.get(), TaloiBlocks.CHISELED_DIORITE.get(), TaloiBlocks.CHISELED_DRIPSTONE_BLOCK.get(), TaloiBlocks.CHISELED_GRANITE.get(), TaloiBlocks.CHISELED_LIMESTONE_BRICKS.get(), TaloiBlocks.CHISELED_MARBLE.get(), TaloiBlocks.CHISELED_SLATE.get(), TaloiBlocks.CHISELED_TUFF.get(),
                TaloiBlocks.LIMESTONE_SLAB.get(), TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), TaloiBlocks.MARBLE_SLAB.get(), TaloiBlocks.SLATE_SLAB.get(), TaloiBlocks.SLATE_BRICK_SLAB.get(),
                TaloiBlocks.LIMESTONE_STAIRS.get(), TaloiBlocks.LIMESTONE_BRICK_STAIRS.get(), TaloiBlocks.MARBLE_STAIRS.get(), TaloiBlocks.SLATE_STAIRS.get(), TaloiBlocks.SLATE_BRICK_STAIRS.get(),
                TaloiBlocks.IRON_CRATE.get(), TaloiBlocks.NETHERRACK_BRICKS.get(), TaloiBlocks.REINFORCED_IRON_BLOCK.get(), TaloiBlocks.RUSTED_REINFORCED_IRON_BLOCK.get())
                .addTag(TaloiTags.Blocks.TALOI_ORES).addTag(TaloiTags.Blocks.TALOI_STORAGE_BLOCKS).addTag(TaloiTags.Blocks.MACHINES).addTag(TaloiTags.Blocks.CONCRETE_SLABS).addTag(TaloiTags.Blocks.CONCRETE_STAIRS).addTag(TaloiTags.Blocks.TERRACOTTA_SLABS).addTag(TaloiTags.Blocks.TERRACOTTA_STAIRS);
        tag(BlockTags.AXOLOTLS_SPAWNABLE_ON).add(TaloiBlocks.MARBLE.get());
        tag(BlockTags.BEACON_BASE_BLOCKS).add(TaloiBlocks.IRIDIUM_BLOCK.get(), TaloiBlocks.MAGNESIUM_BLOCK.get(), TaloiBlocks.OSMIUM_BLOCK.get(), TaloiBlocks.PLATINUM_BLOCK.get(), TaloiBlocks.TUNGSTEN_BLOCK.get(), TaloiBlocks.BRONZE_BLOCK.get(), TaloiBlocks.STEEL_BLOCK.get());
        tag(BlockTags.FENCE_GATES).add(TaloiBlocks.EVERGREEN_FENCE_GATE.get(), TaloiBlocks.WILLOW_FENCE_GATE.get());
        tag(BlockTags.LEAVES).add(TaloiBlocks.EVERGREEN_LEAVES.get(), TaloiBlocks.WILLOW_LEAVES.get());
        tag(BlockTags.LOGS_THAT_BURN).add(TaloiBlocks.OAK_WOOD_SLAB.get(), TaloiBlocks.SPRUCE_WOOD_SLAB.get(), TaloiBlocks.BIRCH_WOOD_SLAB.get(), TaloiBlocks.JUNGLE_WOOD_SLAB.get(), TaloiBlocks.ACACIA_WOOD_SLAB.get(), TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.WILLOW_WOOD_SLAB.get(),
                TaloiBlocks.OAK_WOOD_STAIRS.get(), TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.BIRCH_WOOD_STAIRS.get(), TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.ACACIA_WOOD_STAIRS.get(), TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.WILLOW_WOOD_STAIRS.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get())
                .addTag(TaloiTags.Blocks.EVERGREEN_LOGS).addTag(TaloiTags.Blocks.WILLOW_LOGS);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), TaloiBlocks.PLATINUM_ORE.get(), TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), TaloiBlocks.URANIUM_ORE.get(),
                TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), TaloiBlocks.IRIDIUM_BLOCK.get(), TaloiBlocks.IRIDIUM_ORE.get(), TaloiBlocks.RAW_IRIDIUM_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), TaloiBlocks.OSMIUM_BLOCK.get(), TaloiBlocks.OSMIUM_ORE.get(), TaloiBlocks.RAW_OSMIUM_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), TaloiBlocks.TUNGSTEN_BLOCK.get(), TaloiBlocks.TUNGSTEN_ORE.get(), TaloiBlocks.RAW_TUNGSTEN_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), TaloiBlocks.MAGNESIUM_BLOCK.get(), TaloiBlocks.MAGNESIUM_ORE.get(), TaloiBlocks.RAW_MAGNESIUM_BLOCK.get(),
                TaloiBlocks.PLATINUM_BLOCK.get(), TaloiBlocks.RAW_PLATINUM_BLOCK.get(), TaloiBlocks.URANIUM_BLOCK.get(), TaloiBlocks.RAW_URANIUM_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), TaloiBlocks.SILICON_BLOCK.get(), TaloiBlocks.SILICON_ORE.get(), TaloiBlocks.RAW_SILICON_BLOCK.get(),
                TaloiBlocks.BRONZE_BLOCK.get(), TaloiBlocks.STEEL_BLOCK.get(), TaloiBlocks.REINFORCED_IRON_BLOCK.get(), TaloiBlocks.RUSTED_REINFORCED_IRON_BLOCK.get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(TaloiBlocks.ASPHALT.get(), TaloiBlocks.LIMESTONE.get(), TaloiBlocks.LIMESTONE_BRICKS.get(), TaloiBlocks.MARBLE.get(), TaloiBlocks.SLATE.get(), TaloiBlocks.SLATE_BRICKS.get(),
                TaloiBlocks.CHISELED_LIMESTONE_BRICKS.get(), TaloiBlocks.CHISELED_MARBLE.get(), TaloiBlocks.CHISELED_SLATE.get(),
                TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), TaloiBlocks.ALUMINUM_BLOCK.get(), TaloiBlocks.ALUMINUM_ORE.get(), TaloiBlocks.RAW_ALUMINUM_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), TaloiBlocks.LEAD_BLOCK.get(), TaloiBlocks.LEAD_ORE.get(), TaloiBlocks.RAW_LEAD_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_TIN_ORE.get(), TaloiBlocks.TIN_BLOCK.get(), TaloiBlocks.TIN_ORE.get(), TaloiBlocks.RAW_TIN_BLOCK.get(),
                TaloiBlocks.DEEPSLATE_ZINC_ORE.get(), TaloiBlocks.ZINC_BLOCK.get(), TaloiBlocks.ZINC_ORE.get(), TaloiBlocks.RAW_ZINC_BLOCK.get())
                .addTag(TaloiTags.Blocks.MACHINES);
        tag(BlockTags.PLANKS).add(TaloiBlocks.EVERGREEN_PLANKS.get(), TaloiBlocks.WILLOW_PLANKS.get());
        tag(BlockTags.SAPLINGS).add(TaloiBlocks.EVERGREEN_SAPLING.get(), TaloiBlocks.WILLOW_SAPLING.get());
        tag(BlockTags.SLABS).add(TaloiBlocks.LIMESTONE_SLAB.get(), TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), TaloiBlocks.MARBLE_SLAB.get(), TaloiBlocks.SLATE_SLAB.get(), TaloiBlocks.SLATE_BRICK_SLAB.get())
                .addTag(TaloiTags.Blocks.CONCRETE_SLABS).addTag(TaloiTags.Blocks.TERRACOTTA_SLABS);
        tag(BlockTags.STAIRS).add(TaloiBlocks.LIMESTONE_STAIRS.get(), TaloiBlocks.LIMESTONE_BRICK_STAIRS.get(), TaloiBlocks.MARBLE_STAIRS.get(), TaloiBlocks.SLATE_STAIRS.get(), TaloiBlocks.SLATE_BRICK_STAIRS.get())
                .addTag(TaloiTags.Blocks.CONCRETE_STAIRS).addTag(TaloiTags.Blocks.TERRACOTTA_STAIRS);
        tag(BlockTags.WALLS).add(TaloiBlocks.LIMESTONE_WALL.get(), TaloiBlocks.LIMESTONE_BRICK_WALL.get(), TaloiBlocks.MARBLE_WALL.get(), TaloiBlocks.SLATE_WALL.get(), TaloiBlocks.SLATE_BRICK_WALL.get());
        tag(BlockTags.WOODEN_BUTTONS).add(TaloiBlocks.EVERGREEN_BUTTON.get(), TaloiBlocks.WILLOW_BUTTON.get());
        tag(BlockTags.WOODEN_FENCES).add(TaloiBlocks.EVERGREEN_FENCE.get(), TaloiBlocks.WILLOW_FENCE.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(TaloiBlocks.EVERGREEN_PRESSURE_PLATE.get(), TaloiBlocks.WILLOW_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_SLABS).add(TaloiBlocks.EVERGREEN_SLAB.get(), TaloiBlocks.WILLOW_SLAB.get(),
                TaloiBlocks.OAK_WOOD_SLAB.get(), TaloiBlocks.SPRUCE_WOOD_SLAB.get(), TaloiBlocks.BIRCH_WOOD_SLAB.get(), TaloiBlocks.JUNGLE_WOOD_SLAB.get(), TaloiBlocks.ACACIA_WOOD_SLAB.get(), TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.WILLOW_WOOD_SLAB.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get());
        tag(BlockTags.WOODEN_STAIRS).add(TaloiBlocks.EVERGREEN_STAIRS.get(), TaloiBlocks.WILLOW_STAIRS.get(),
                TaloiBlocks.OAK_WOOD_STAIRS.get(), TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.BIRCH_WOOD_STAIRS.get(), TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.ACACIA_WOOD_STAIRS.get(), TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.WILLOW_WOOD_STAIRS.get(),
                TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get());

        tag(TaloiTags.Blocks.EVERGREEN_LOGS).add(TaloiBlocks.EVERGREEN_LOG.get(), TaloiBlocks.EVERGREEN_WOOD.get(), TaloiBlocks.STRIPPED_EVERGREEN_LOG.get(), TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get());
        tag(TaloiTags.Blocks.WILLOW_LOGS).add(TaloiBlocks.WILLOW_LOG.get(), TaloiBlocks.WILLOW_WOOD.get(), TaloiBlocks.STRIPPED_WILLOW_LOG.get(), TaloiBlocks.STRIPPED_WILLOW_WOOD.get());

        tag(TaloiTags.Blocks.ORES_ALUMINUM).add(TaloiBlocks.ALUMINUM_ORE.get(), TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_IRIDIUM).add(TaloiBlocks.IRIDIUM_ORE.get(), TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_LEAD).add(TaloiBlocks.LEAD_ORE.get(), TaloiBlocks.DEEPSLATE_LEAD_ORE.get());
        tag(TaloiTags.Blocks.ORES_MAGNESIUM).add(TaloiBlocks.MAGNESIUM_ORE.get(), TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_OSMIUM).add(TaloiBlocks.OSMIUM_ORE.get(), TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_PLATINUM).add(TaloiBlocks.PLATINUM_ORE.get(), TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_SILICON).add(TaloiBlocks.SILICON_ORE.get(), TaloiBlocks.DEEPSLATE_SILICON_ORE.get());
        tag(TaloiTags.Blocks.ORES_TIN).add(TaloiBlocks.TIN_ORE.get(), TaloiBlocks.DEEPSLATE_TIN_ORE.get());
        tag(TaloiTags.Blocks.ORES_TUNGSTEN).add(TaloiBlocks.TUNGSTEN_ORE.get(), TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
        tag(TaloiTags.Blocks.ORES_URANIUM).add(TaloiBlocks.URANIUM_ORE.get(), TaloiBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(TaloiTags.Blocks.ORES_ZINC).add(TaloiBlocks.ZINC_ORE.get(), TaloiBlocks.DEEPSLATE_ZINC_ORE.get());
        tag(TaloiTags.Blocks.TALOI_ORES).add(TaloiBlocks.ALUMINUM_ORE.get(), TaloiBlocks.IRIDIUM_ORE.get(), TaloiBlocks.LEAD_ORE.get(), TaloiBlocks.MAGNESIUM_ORE.get(), TaloiBlocks.OSMIUM_ORE.get(), TaloiBlocks.PLATINUM_ORE.get(), TaloiBlocks.SILICON_ORE.get(), TaloiBlocks.TIN_ORE.get(), TaloiBlocks.TUNGSTEN_ORE.get(), TaloiBlocks.URANIUM_ORE.get(), TaloiBlocks.ZINC_ORE.get(),
                TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), TaloiBlocks.DEEPSLATE_TIN_ORE.get(), TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), TaloiBlocks.DEEPSLATE_ZINC_ORE.get());

        tag(TaloiTags.Blocks.STORAGE_ALUMINUM).add(TaloiBlocks.ALUMINUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_ALUMINUM).add(TaloiBlocks.RAW_ALUMINUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_IRIDIUM).add(TaloiBlocks.IRIDIUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_IRIDIUM).add(TaloiBlocks.RAW_IRIDIUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_LEAD).add(TaloiBlocks.LEAD_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_LEAD).add(TaloiBlocks.RAW_LEAD_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_MAGNESIUM).add(TaloiBlocks.MAGNESIUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_MAGNESIUM).add(TaloiBlocks.RAW_MAGNESIUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_OSMIUM).add(TaloiBlocks.OSMIUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_OSMIUM).add(TaloiBlocks.RAW_OSMIUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_PLATINUM).add(TaloiBlocks.PLATINUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_PLATINUM).add(TaloiBlocks.RAW_PLATINUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_SILICON).add(TaloiBlocks.SILICON_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_SILICON).add(TaloiBlocks.RAW_SILICON_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_TIN).add(TaloiBlocks.TIN_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_TIN).add(TaloiBlocks.RAW_TIN_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_TUNGSTEN).add(TaloiBlocks.TUNGSTEN_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_TUNGSTEN).add(TaloiBlocks.RAW_TUNGSTEN_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_URANIUM).add(TaloiBlocks.URANIUM_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_URANIUM).add(TaloiBlocks.RAW_URANIUM_BLOCK.get());
        tag(TaloiTags.Blocks.STORAGE_ZINC).add(TaloiBlocks.ZINC_BLOCK.get());
        tag(TaloiTags.Blocks.RAW_STORAGE_ZINC).add(TaloiBlocks.RAW_ZINC_BLOCK.get());
        tag(TaloiTags.Blocks.TALOI_STORAGE_BLOCKS).add(TaloiBlocks.ALUMINUM_BLOCK.get(), TaloiBlocks.IRIDIUM_BLOCK.get(), TaloiBlocks.LEAD_BLOCK.get(), TaloiBlocks.MAGNESIUM_BLOCK.get(), TaloiBlocks.OSMIUM_BLOCK.get(), TaloiBlocks.PLATINUM_BLOCK.get(), TaloiBlocks.SILICON_BLOCK.get(), TaloiBlocks.TIN_BLOCK.get(), TaloiBlocks.TUNGSTEN_BLOCK.get(), TaloiBlocks.URANIUM_BLOCK.get(), TaloiBlocks.ZINC_BLOCK.get(),
                TaloiBlocks.RAW_ALUMINUM_BLOCK.get(), TaloiBlocks.RAW_IRIDIUM_BLOCK.get(), TaloiBlocks.RAW_LEAD_BLOCK.get(), TaloiBlocks.RAW_MAGNESIUM_BLOCK.get(), TaloiBlocks.RAW_OSMIUM_BLOCK.get(), TaloiBlocks.RAW_PLATINUM_BLOCK.get(), TaloiBlocks.RAW_SILICON_BLOCK.get(), TaloiBlocks.RAW_TIN_BLOCK.get(), TaloiBlocks.RAW_TUNGSTEN_BLOCK.get(), TaloiBlocks.RAW_URANIUM_BLOCK.get(), TaloiBlocks.RAW_ZINC_BLOCK.get());

        tag(TaloiTags.Blocks.MACHINES).add(TaloiBlocks.ALPHA_CONSTRUCTOR.get(), TaloiBlocks.BETA_CONSTRUCTOR.get(), TaloiBlocks.UNSTABLE_CONSTRUCTOR.get(),
                TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get(), TaloiBlocks.BETA_HYDRAULIC_PRESS.get(), TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get(),
                TaloiBlocks.ALPHA_PROCESSOR.get(), TaloiBlocks.BETA_PROCESSOR.get(), TaloiBlocks.UNSTABLE_PROCESSOR.get(),
                TaloiBlocks.ALPHA_SEPARATOR.get(), TaloiBlocks.BETA_SEPARATOR.get(), TaloiBlocks.UNSTABLE_SEPARATOR.get());

        tag(TaloiTags.Blocks.TERRACOTTA_SLABS).add(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(),
                TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), TaloiBlocks.RED_TERRACOTTA_SLAB.get(), TaloiBlocks.BLACK_TERRACOTTA_SLAB.get());
        tag(TaloiTags.Blocks.TERRACOTTA_STAIRS).add(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(),
                TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get());

        tag(TaloiTags.Blocks.CONCRETE_SLABS).add(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), TaloiBlocks.LIME_CONCRETE_SLAB.get(), TaloiBlocks.PINK_CONCRETE_SLAB.get(), TaloiBlocks.GRAY_CONCRETE_SLAB.get(),
                TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), TaloiBlocks.CYAN_CONCRETE_SLAB.get(), TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), TaloiBlocks.BLUE_CONCRETE_SLAB.get(), TaloiBlocks.BROWN_CONCRETE_SLAB.get(), TaloiBlocks.GREEN_CONCRETE_SLAB.get(), TaloiBlocks.RED_CONCRETE_SLAB.get(), TaloiBlocks.BLACK_CONCRETE_SLAB.get());
        tag(TaloiTags.Blocks.CONCRETE_STAIRS).add(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), TaloiBlocks.LIME_CONCRETE_STAIRS.get(), TaloiBlocks.PINK_CONCRETE_STAIRS.get(), TaloiBlocks.GRAY_CONCRETE_STAIRS.get(),
                TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), TaloiBlocks.RED_CONCRETE_STAIRS.get(), TaloiBlocks.BLACK_CONCRETE_STAIRS.get());
    }
}
