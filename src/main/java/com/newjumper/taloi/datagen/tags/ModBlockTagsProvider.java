package com.newjumper.taloi.datagen.tags;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.util.ModTags;
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
        tag(BlockTags.MINEABLE_WITH_HOE).add(ModBlocks.EVERGREEN_LEAVES.get(), ModBlocks.WILLOW_LEAVES.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.LIMESTONE.get(), ModBlocks.MARBLE.get())
                .addTag(ModTags.Blocks.TALOI_ORES).addTag(ModTags.Blocks.TALOI_STORAGE_BLOCKS).addTag(ModTags.Blocks.MACHINES);
        tag(BlockTags.AXOLOTLS_SPAWNABLE_ON).add(ModBlocks.MARBLE.get());
        tag(BlockTags.BEACON_BASE_BLOCKS).add(ModBlocks.IRIDIUM_BLOCK.get(), ModBlocks.MAGNESIUM_BLOCK.get(), ModBlocks.OSMIUM_BLOCK.get(), ModBlocks.PLATINUM_BLOCK.get(), ModBlocks.TUNGSTEN_BLOCK.get(), ModBlocks.BRONZE_BLOCK.get(), ModBlocks.STEEL_BLOCK.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.EVERGREEN_FENCE_GATE.get(), ModBlocks.WILLOW_FENCE_GATE.get());
        tag(BlockTags.LEAVES).add(ModBlocks.EVERGREEN_LEAVES.get(), ModBlocks.WILLOW_LEAVES.get());
        tag(BlockTags.LOGS_THAT_BURN).addTag(ModTags.Blocks.EVERGREEN_LOGS).addTag(ModTags.Blocks.WILLOW_LOGS);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModBlocks.PLATINUM_BLOCK.get(), ModBlocks.PLATINUM_ORE.get(), ModBlocks.RAW_PLATINUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModBlocks.TUNGSTEN_BLOCK.get(), ModBlocks.TUNGSTEN_ORE.get(), ModBlocks.RAW_TUNGSTEN_BLOCK.get(),
                ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModBlocks.URANIUM_BLOCK.get(), ModBlocks.URANIUM_ORE.get(), ModBlocks.RAW_URANIUM_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), ModBlocks.IRIDIUM_BLOCK.get(), ModBlocks.IRIDIUM_ORE.get(), ModBlocks.RAW_IRIDIUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModBlocks.LEAD_BLOCK.get(), ModBlocks.LEAD_ORE.get(), ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModBlocks.MAGNESIUM_BLOCK.get(), ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.RAW_MAGNESIUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModBlocks.OSMIUM_BLOCK.get(), ModBlocks.OSMIUM_ORE.get(), ModBlocks.RAW_OSMIUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModBlocks.SILICON_BLOCK.get(), ModBlocks.SILICON_ORE.get(), ModBlocks.RAW_SILICON_BLOCK.get(),
                ModBlocks.BRONZE_BLOCK.get(), ModBlocks.STEEL_BLOCK.get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.LIMESTONE.get(), ModBlocks.MARBLE.get(),
                ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModBlocks.ALUMINUM_BLOCK.get(), ModBlocks.ALUMINUM_ORE.get(), ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(), ModBlocks.TIN_BLOCK.get(), ModBlocks.TIN_ORE.get(), ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModBlocks.ZINC_BLOCK.get(), ModBlocks.ZINC_ORE.get(), ModBlocks.RAW_ZINC_BLOCK.get())
                .addTag(ModTags.Blocks.MACHINES);
        tag(BlockTags.PLANKS).add(ModBlocks.EVERGREEN_PLANKS.get(), ModBlocks.WILLOW_PLANKS.get());
        tag(BlockTags.SAPLINGS).add(ModBlocks.EVERGREEN_SAPLING.get(), ModBlocks.WILLOW_SAPLING.get());
        tag(BlockTags.SLABS).add(ModBlocks.LIMESTONE_SLAB.get(), ModBlocks.MARBLE_SLAB.get(),
                ModBlocks.WHITE_CONCRETE_SLAB.get(), ModBlocks.ORANGE_CONCRETE_SLAB.get(), ModBlocks.MAGENTA_CONCRETE_SLAB.get(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), ModBlocks.YELLOW_CONCRETE_SLAB.get(), ModBlocks.LIME_CONCRETE_SLAB.get(), ModBlocks.PINK_CONCRETE_SLAB.get(), ModBlocks.GRAY_CONCRETE_SLAB.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), ModBlocks.CYAN_CONCRETE_SLAB.get(), ModBlocks.PURPLE_CONCRETE_SLAB.get(), ModBlocks.BLUE_CONCRETE_SLAB.get(), ModBlocks.BROWN_CONCRETE_SLAB.get(), ModBlocks.GREEN_CONCRETE_SLAB.get(), ModBlocks.RED_CONCRETE_SLAB.get(), ModBlocks.BLACK_CONCRETE_SLAB.get());
        tag(BlockTags.STAIRS).add(ModBlocks.LIMESTONE_STAIRS.get(), ModBlocks.MARBLE_STAIRS.get(),
                ModBlocks.WHITE_CONCRETE_STAIRS.get(), ModBlocks.ORANGE_CONCRETE_STAIRS.get(), ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), ModBlocks.YELLOW_CONCRETE_STAIRS.get(), ModBlocks.LIME_CONCRETE_STAIRS.get(), ModBlocks.PINK_CONCRETE_STAIRS.get(), ModBlocks.GRAY_CONCRETE_STAIRS.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), ModBlocks.CYAN_CONCRETE_STAIRS.get(), ModBlocks.PURPLE_CONCRETE_STAIRS.get(), ModBlocks.BLUE_CONCRETE_STAIRS.get(), ModBlocks.BROWN_CONCRETE_STAIRS.get(), ModBlocks.GREEN_CONCRETE_STAIRS.get(), ModBlocks.RED_CONCRETE_STAIRS.get(), ModBlocks.BLACK_CONCRETE_STAIRS.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_WALL.get(), ModBlocks.MARBLE_WALL.get());
        tag(BlockTags.WOODEN_BUTTONS).add(ModBlocks.EVERGREEN_BUTTON.get(), ModBlocks.WILLOW_BUTTON.get());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.EVERGREEN_FENCE.get(), ModBlocks.WILLOW_FENCE.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.EVERGREEN_PRESSURE_PLATE.get(), ModBlocks.WILLOW_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_SLABS).add(ModBlocks.EVERGREEN_SLAB.get(), ModBlocks.WILLOW_SLAB.get());
        tag(BlockTags.WOODEN_STAIRS).add(ModBlocks.EVERGREEN_STAIRS.get(), ModBlocks.WILLOW_STAIRS.get());

        tag(ModTags.Blocks.EVERGREEN_LOGS).add(ModBlocks.EVERGREEN_LOG.get(), ModBlocks.EVERGREEN_WOOD.get(), ModBlocks.STRIPPED_EVERGREEN_LOG.get(), ModBlocks.STRIPPED_EVERGREEN_WOOD.get());
        tag(ModTags.Blocks.WILLOW_LOGS).add(ModBlocks.WILLOW_LOG.get(), ModBlocks.WILLOW_WOOD.get(), ModBlocks.STRIPPED_WILLOW_LOG.get(), ModBlocks.STRIPPED_WILLOW_WOOD.get());

        tag(ModTags.Blocks.ORES_ALUMINUM).add(ModBlocks.ALUMINUM_ORE.get(), ModBlocks.DEEPSLATE_ALUMINUM_ORE.get());
        tag(ModTags.Blocks.ORES_IRIDIUM).add(ModBlocks.IRIDIUM_ORE.get(), ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        tag(ModTags.Blocks.ORES_LEAD).add(ModBlocks.LEAD_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get());
        tag(ModTags.Blocks.ORES_MAGNESIUM).add(ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
        tag(ModTags.Blocks.ORES_OSMIUM).add(ModBlocks.OSMIUM_ORE.get(), ModBlocks.DEEPSLATE_OSMIUM_ORE.get());
        tag(ModTags.Blocks.ORES_PLATINUM).add(ModBlocks.PLATINUM_ORE.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
        tag(ModTags.Blocks.ORES_SILICON).add(ModBlocks.SILICON_ORE.get(), ModBlocks.DEEPSLATE_SILICON_ORE.get());
        tag(ModTags.Blocks.ORES_TIN).add(ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get());
        tag(ModTags.Blocks.ORES_TUNGSTEN).add(ModBlocks.TUNGSTEN_ORE.get(), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
        tag(ModTags.Blocks.ORES_URANIUM).add(ModBlocks.URANIUM_ORE.get(), ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(ModTags.Blocks.ORES_ZINC).add(ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get());
        tag(ModTags.Blocks.TALOI_ORES).add(ModBlocks.ALUMINUM_ORE.get(), ModBlocks.IRIDIUM_ORE.get(), ModBlocks.LEAD_ORE.get(), ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.OSMIUM_ORE.get(), ModBlocks.PLATINUM_ORE.get(), ModBlocks.SILICON_ORE.get(), ModBlocks.TIN_ORE.get(), ModBlocks.TUNGSTEN_ORE.get(), ModBlocks.URANIUM_ORE.get(), ModBlocks.ZINC_ORE.get(),
                ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get(), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get());

        tag(ModTags.Blocks.STORAGE_ALUMINUM).add(ModBlocks.ALUMINUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_ALUMINUM).add(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_IRIDIUM).add(ModBlocks.IRIDIUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_IRIDIUM).add(ModBlocks.RAW_IRIDIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_LEAD).add(ModBlocks.LEAD_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_LEAD).add(ModBlocks.RAW_LEAD_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_MAGNESIUM).add(ModBlocks.MAGNESIUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_MAGNESIUM).add(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_OSMIUM).add(ModBlocks.OSMIUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_OSMIUM).add(ModBlocks.RAW_OSMIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_PLATINUM).add(ModBlocks.PLATINUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_PLATINUM).add(ModBlocks.RAW_PLATINUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_SILICON).add(ModBlocks.SILICON_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_SILICON).add(ModBlocks.RAW_SILICON_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_TIN).add(ModBlocks.TIN_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_TIN).add(ModBlocks.RAW_TIN_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_TUNGSTEN).add(ModBlocks.TUNGSTEN_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_TUNGSTEN).add(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_URANIUM).add(ModBlocks.URANIUM_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_URANIUM).add(ModBlocks.RAW_URANIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_ZINC).add(ModBlocks.ZINC_BLOCK.get());
        tag(ModTags.Blocks.RAW_STORAGE_ZINC).add(ModBlocks.RAW_ZINC_BLOCK.get());
        tag(ModTags.Blocks.TALOI_STORAGE_BLOCKS).add(ModBlocks.ALUMINUM_BLOCK.get(), ModBlocks.IRIDIUM_BLOCK.get(), ModBlocks.LEAD_BLOCK.get(), ModBlocks.MAGNESIUM_BLOCK.get(), ModBlocks.OSMIUM_BLOCK.get(), ModBlocks.PLATINUM_BLOCK.get(), ModBlocks.SILICON_BLOCK.get(), ModBlocks.TIN_BLOCK.get(), ModBlocks.TUNGSTEN_BLOCK.get(), ModBlocks.URANIUM_BLOCK.get(), ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.RAW_ALUMINUM_BLOCK.get(), ModBlocks.RAW_IRIDIUM_BLOCK.get(), ModBlocks.RAW_LEAD_BLOCK.get(), ModBlocks.RAW_MAGNESIUM_BLOCK.get(), ModBlocks.RAW_OSMIUM_BLOCK.get(), ModBlocks.RAW_PLATINUM_BLOCK.get(), ModBlocks.RAW_SILICON_BLOCK.get(), ModBlocks.RAW_TIN_BLOCK.get(), ModBlocks.RAW_TUNGSTEN_BLOCK.get(), ModBlocks.RAW_URANIUM_BLOCK.get(), ModBlocks.RAW_ZINC_BLOCK.get());

        tag(ModTags.Blocks.MACHINES).add(ModBlocks.ALPHA_CONSTRUCTOR.get(), ModBlocks.BETA_CONSTRUCTOR.get(), ModBlocks.UNSTABLE_CONSTRUCTOR.get(),
                ModBlocks.ALPHA_HYDRAULIC_PRESS.get(), ModBlocks.BETA_HYDRAULIC_PRESS.get(), ModBlocks.UNSTABLE_HYDRAULIC_PRESS.get(),
                ModBlocks.ALPHA_PROCESSOR.get(), ModBlocks.BETA_PROCESSOR.get(), ModBlocks.UNSTABLE_PROCESSOR.get(),
                ModBlocks.ALPHA_SEPARATOR.get(), ModBlocks.BETA_SEPARATOR.get(), ModBlocks.UNSTABLE_SEPARATOR.get(),
                ModBlocks.ALPHA_SMELTERY.get(), ModBlocks.BETA_SMELTERY.get(), ModBlocks.UNSTABLE_SMELTERY.get());
    }
}