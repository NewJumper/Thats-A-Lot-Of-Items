package com.newjumper.taloi.datagen.models;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // EVERGREEN
        simpleBlock(TaloiBlocks.EVERGREEN_PLANKS.get());
        simpleBlock(TaloiBlocks.EVERGREEN_SAPLING.get(), models().cross("evergreen_sapling", modLoc("evergreen_sapling")));
        axisBlock(TaloiBlocks.EVERGREEN_LOG.get(), modLoc("evergreen_log"), modLoc("evergreen_log_top"));
        axisBlock(TaloiBlocks.STRIPPED_EVERGREEN_LOG.get(), modLoc("stripped_evergreen_log"), modLoc("stripped_evergreen_log_top"));
        simpleBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get(), models().cubeAll("stripped_evergreen_wood", modLoc("stripped_evergreen_log")));
        simpleBlock(TaloiBlocks.EVERGREEN_WOOD.get(), models().cubeAll("evergreen_wood", modLoc("evergreen_log")));
        simpleBlock(TaloiBlocks.EVERGREEN_LEAVES.get());
        slabBlock(TaloiBlocks.EVERGREEN_SLAB.get(), modLoc("evergreen_planks"), modLoc("evergreen_planks"));
        fenceBlock(TaloiBlocks.EVERGREEN_FENCE.get(), modLoc("evergreen_planks"));
        stairsBlock(TaloiBlocks.EVERGREEN_STAIRS.get(), modLoc("evergreen_planks"));
        buttonBlock(TaloiBlocks.EVERGREEN_BUTTON.get(), modLoc("evergreen_planks"));
        pressurePlateBlock(TaloiBlocks.EVERGREEN_PRESSURE_PLATE.get(), modLoc("evergreen_planks"));
        doorBlock(TaloiBlocks.EVERGREEN_DOOR.get(), modLoc("evergreen_door_bottom"), modLoc("evergreen_door_top"));
        trapdoorBlock(TaloiBlocks.EVERGREEN_TRAPDOOR.get(), modLoc("evergreen_trapdoor"), true);
        fenceGateBlock(TaloiBlocks.EVERGREEN_FENCE_GATE.get(), modLoc("evergreen_planks"));
        slabBlock(TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), modLoc("evergreen_wood"), modLoc("evergreen_log"));
        stairsBlock(TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), modLoc("evergreen_log"));
        slabBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), modLoc("stripped_evergreen_wood"), modLoc("stripped_evergreen_log"));
        stairsBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), modLoc("stripped_evergreen_log"));

        // WILLOW
        simpleBlock(TaloiBlocks.WILLOW_PLANKS.get());
        simpleBlock(TaloiBlocks.WILLOW_SAPLING.get(), models().cross("willow_sapling", modLoc("willow_sapling")));
        axisBlock(TaloiBlocks.WILLOW_LOG.get(), modLoc("willow_log"), modLoc("willow_log_top"));
        axisBlock(TaloiBlocks.STRIPPED_WILLOW_LOG.get(), modLoc("stripped_willow_log"), modLoc("stripped_willow_log_top"));
        simpleBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD.get(), models().cubeAll("stripped_willow_wood", modLoc("stripped_willow_log")));
        simpleBlock(TaloiBlocks.WILLOW_WOOD.get(), models().cubeAll("willow_wood", modLoc("willow_log")));
        simpleBlock(TaloiBlocks.WILLOW_LEAVES.get());
        slabBlock(TaloiBlocks.WILLOW_SLAB.get(), modLoc("willow_planks"), modLoc("willow_planks"));
        fenceBlock(TaloiBlocks.WILLOW_FENCE.get(), modLoc("willow_planks"));
        stairsBlock(TaloiBlocks.WILLOW_STAIRS.get(), modLoc("willow_planks"));
        buttonBlock(TaloiBlocks.WILLOW_BUTTON.get(), modLoc("willow_planks"));
        pressurePlateBlock(TaloiBlocks.WILLOW_PRESSURE_PLATE.get(), modLoc("willow_planks"));
        doorBlock(TaloiBlocks.WILLOW_DOOR.get(), modLoc("willow_door_bottom"), modLoc("willow_door_top"));
        trapdoorBlock(TaloiBlocks.WILLOW_TRAPDOOR.get(), modLoc("willow_trapdoor"), true);
        fenceGateBlock(TaloiBlocks.WILLOW_FENCE_GATE.get(), modLoc("willow_planks"));
        slabBlock(TaloiBlocks.WILLOW_WOOD_SLAB.get(), modLoc("willow_wood"), modLoc("willow_log"));
        stairsBlock(TaloiBlocks.WILLOW_WOOD_STAIRS.get(), modLoc("willow_log"));
        slabBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), modLoc("stripped_willow_wood"), modLoc("stripped_willow_log"));
        stairsBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), modLoc("stripped_willow_log"));

        // NATURAL & DECORATION
        simpleBlock(TaloiBlocks.ASPHALT.get());
        simpleBlock(TaloiBlocks.LIMESTONE.get());
        simpleBlock(TaloiBlocks.LIMESTONE_BRICKS.get());
        simpleBlock(TaloiBlocks.MARBLE.get());
        simpleBlock(TaloiBlocks.SLATE.get());
        simpleBlock(TaloiBlocks.SLATE_BRICKS.get());
        simpleBlock(TaloiBlocks.POLISHED_TUFF.get());

        slabBlock(TaloiBlocks.LIMESTONE_SLAB.get(), modLoc("limestone"), modLoc("limestone"));
        slabBlock(TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), modLoc("limestone_bricks"), modLoc("limestone_bricks"));
        slabBlock(TaloiBlocks.MARBLE_SLAB.get(), modLoc("marble"), modLoc("marble"));
        slabBlock(TaloiBlocks.SLATE_SLAB.get(), modLoc("slate"), modLoc("slate"));
        slabBlock(TaloiBlocks.SLATE_BRICK_SLAB.get(), modLoc("slate_bricks"), modLoc("slate_bricks"));

        stairsBlock(TaloiBlocks.LIMESTONE_STAIRS.get(), modLoc("limestone"));
        stairsBlock(TaloiBlocks.LIMESTONE_BRICK_STAIRS.get(), modLoc("limestone_bricks"));
        stairsBlock(TaloiBlocks.MARBLE_STAIRS.get(), modLoc("marble"));
        stairsBlock(TaloiBlocks.SLATE_STAIRS.get(), modLoc("slate"));
        stairsBlock(TaloiBlocks.SLATE_BRICK_STAIRS.get(), modLoc("slate_bricks"));

        wallBlock(TaloiBlocks.LIMESTONE_WALL.get(), modLoc("limestone"));
        wallBlock(TaloiBlocks.LIMESTONE_BRICK_WALL.get(), modLoc("limestone_bricks"));
        wallBlock(TaloiBlocks.MARBLE_WALL.get(), modLoc("marble"));
        wallBlock(TaloiBlocks.SLATE_WALL.get(), modLoc("slate"));
        wallBlock(TaloiBlocks.SLATE_BRICK_WALL.get(), modLoc("slate_bricks"));

        simpleBlock(TaloiBlocks.CHISELED_ANDESITE.get());
        simpleBlock(TaloiBlocks.CHISELED_DIORITE.get());
        simpleBlock(TaloiBlocks.CHISELED_DRIPSTONE_BLOCK.get());
        simpleBlock(TaloiBlocks.CHISELED_GRANITE.get());
        simpleBlock(TaloiBlocks.CHISELED_LIMESTONE_BRICKS.get());
        simpleBlock(TaloiBlocks.CHISELED_MARBLE.get());
        simpleBlock(TaloiBlocks.CHISELED_SLATE.get());
        simpleBlock(TaloiBlocks.CHISELED_TUFF.get());

        simpleBlock(TaloiBlocks.NETHERRACK_BRICKS.get());

        simpleBlock(TaloiBlocks.REINFORCED_IRON_BLOCK.get());
        simpleBlock(TaloiBlocks.RUSTED_REINFORCED_IRON_BLOCK.get());

        axisBlock(TaloiBlocks.BUNDLED_BAMBOO.get(), modLoc("bundled_bamboo_side"), modLoc("bundled_bamboo_top"));
        simpleBlock(TaloiBlocks.BAMBOO_PLANKS.get());

        simpleBlock(TaloiBlocks.SNOWY_ICE.get(), models().cubeBottomTop("snowy_ice", modLoc("snowy_ice_side"), modLoc("snowy_ice_bottom"), modLoc("snowy_ice_top")));

        simpleBlock(TaloiBlocks.MALACHITE_BLOCK.get());
        simpleBlock(TaloiBlocks.TANZANITE_BLOCK.get());
        simpleBlock(TaloiBlocks.TOPAZ_BLOCK.get());

        simpleBlock(TaloiBlocks.WOODEN_CRATE.get());
        simpleBlock(TaloiBlocks.IRON_CRATE.get());

        // METALS
        simpleBlock(TaloiBlocks.ALUMINUM_BLOCK.get());
        simpleBlock(TaloiBlocks.ALUMINUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_ALUMINUM_BLOCK.get());

        simpleBlock(TaloiBlocks.IRIDIUM_BLOCK.get());
        simpleBlock(TaloiBlocks.IRIDIUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_IRIDIUM_BLOCK.get());

        simpleBlock(TaloiBlocks.LEAD_BLOCK.get());
        simpleBlock(TaloiBlocks.LEAD_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_LEAD_ORE.get());
        simpleBlock(TaloiBlocks.RAW_LEAD_BLOCK.get());

        simpleBlock(TaloiBlocks.MAGNESIUM_BLOCK.get());
        simpleBlock(TaloiBlocks.MAGNESIUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_MAGNESIUM_BLOCK.get());

        simpleBlock(TaloiBlocks.OSMIUM_BLOCK.get());
        simpleBlock(TaloiBlocks.OSMIUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_OSMIUM_BLOCK.get());

        simpleBlock(TaloiBlocks.PLATINUM_BLOCK.get());
        simpleBlock(TaloiBlocks.PLATINUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_PLATINUM_BLOCK.get());

        simpleBlock(TaloiBlocks.SILICON_BLOCK.get());
        simpleBlock(TaloiBlocks.SILICON_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_SILICON_ORE.get());
        simpleBlock(TaloiBlocks.RAW_SILICON_BLOCK.get());

        simpleBlock(TaloiBlocks.TIN_BLOCK.get());
        simpleBlock(TaloiBlocks.TIN_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_TIN_ORE.get());
        simpleBlock(TaloiBlocks.RAW_TIN_BLOCK.get());

        simpleBlock(TaloiBlocks.TUNGSTEN_BLOCK.get());
        simpleBlock(TaloiBlocks.TUNGSTEN_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
        simpleBlock(TaloiBlocks.RAW_TUNGSTEN_BLOCK.get());

        simpleBlock(TaloiBlocks.URANIUM_BLOCK.get());
        simpleBlock(TaloiBlocks.URANIUM_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_URANIUM_ORE.get());
        simpleBlock(TaloiBlocks.RAW_URANIUM_BLOCK.get());

        simpleBlock(TaloiBlocks.ZINC_BLOCK.get());
        simpleBlock(TaloiBlocks.ZINC_ORE.get());
        simpleBlock(TaloiBlocks.DEEPSLATE_ZINC_ORE.get());
        simpleBlock(TaloiBlocks.RAW_ZINC_BLOCK.get());

        simpleBlock(TaloiBlocks.BRONZE_BLOCK.get());
        simpleBlock(TaloiBlocks.STEEL_BLOCK.get());

        // MACHINERY
        horizontalBlock(TaloiBlocks.ALPHA_CONSTRUCTOR.get(), models().cube("alpha_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("alpha_constructor_front"), modLoc("alpha_machine_back"), modLoc("alpha_constructor_right"), modLoc("alpha_constructor_left")).texture("particle", modLoc("constructor_top")));

        horizontalBlock(TaloiBlocks.BETA_CONSTRUCTOR.get(), models().cube("beta_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("beta_constructor_front"), modLoc("beta_machine_back"), modLoc("beta_constructor_right"), modLoc("beta_constructor_left")).texture("particle", modLoc("constructor_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_CONSTRUCTOR.get(), models().cube("unstable_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("unstable_constructor_front"), modLoc("unstable_machine_back"), modLoc("unstable_constructor_right"), modLoc("unstable_constructor_left")).texture("particle", modLoc("constructor_top")));

        horizontalBlock(TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get(), models().cube("alpha_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("alpha_press_front"), modLoc("alpha_machine_back"), modLoc("alpha_press_right"), modLoc("alpha_press_left")).texture("particle", modLoc("press_top")));
        horizontalBlock(TaloiBlocks.BETA_HYDRAULIC_PRESS.get(), models().cube("beta_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("beta_press_front"), modLoc("beta_machine_back"), modLoc("beta_press_right"), modLoc("beta_press_left")).texture("particle", modLoc("press_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get(), models().cube("unstable_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("unstable_press_front"), modLoc("unstable_machine_back"), modLoc("unstable_press_right"), modLoc("unstable_press_left")).texture("particle", modLoc("press_top")));

        horizontalBlock(TaloiBlocks.ALPHA_PROCESSOR.get(), models().cube("alpha_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("alpha_processor_front"), modLoc("alpha_machine_back"), modLoc("alpha_processor_right"), modLoc("alpha_processor_left")).texture("particle", modLoc("processor_top")));
        horizontalBlock(TaloiBlocks.BETA_PROCESSOR.get(), models().cube("beta_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("beta_processor_front"), modLoc("beta_machine_back"), modLoc("beta_processor_right"), modLoc("beta_processor_left")).texture("particle", modLoc("processor_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_PROCESSOR.get(), models().cube("unstable_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("unstable_processor_front"), modLoc("unstable_machine_back"), modLoc("unstable_processor_right"), modLoc("unstable_processor_left")).texture("particle", modLoc("processor_top")));

        horizontalBlock(TaloiBlocks.ALPHA_SEPARATOR.get(), models().cube("alpha_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("alpha_separator_front"), modLoc("alpha_machine_back"), modLoc("alpha_separator_right"), modLoc("alpha_separator_left")).texture("particle", modLoc("separator_top")));
        horizontalBlock(TaloiBlocks.BETA_SEPARATOR.get(), models().cube("beta_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("beta_separator_front"), modLoc("beta_machine_back"), modLoc("beta_separator_right"), modLoc("beta_separator_left")).texture("particle", modLoc("separator_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_SEPARATOR.get(), models().cube("unstable_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("unstable_separator_front"), modLoc("unstable_machine_back"), modLoc("unstable_separator_right"), modLoc("unstable_separator_left")).texture("particle", modLoc("separator_top")));

        // VANILLA
        stairsBlock(TaloiBlocks.OAK_WOOD_STAIRS.get(), mcLoc("block/oak_log"));
        slabBlock(TaloiBlocks.OAK_WOOD_SLAB.get(), mcLoc("block/oak_wood"), mcLoc("block/oak_log"));
        stairsBlock(TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), mcLoc("block/spruce_log"));
        slabBlock(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), mcLoc("block/spruce_wood"), mcLoc("block/spruce_log"));
        stairsBlock(TaloiBlocks.BIRCH_WOOD_STAIRS.get(), mcLoc("block/birch_log"));
        slabBlock(TaloiBlocks.BIRCH_WOOD_SLAB.get(), mcLoc("block/birch_wood"), mcLoc("block/birch_log"));
        stairsBlock(TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), mcLoc("block/jungle_log"));
        slabBlock(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), mcLoc("block/jungle_wood"), mcLoc("block/jungle_log"));
        stairsBlock(TaloiBlocks.ACACIA_WOOD_STAIRS.get(), mcLoc("block/acacia_log"));
        slabBlock(TaloiBlocks.ACACIA_WOOD_SLAB.get(), mcLoc("block/acacia_wood"), mcLoc("block/acacia_log"));
        stairsBlock(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), mcLoc("block/dark_oak_log"));
        slabBlock(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), mcLoc("block/dark_oak_wood"), mcLoc("block/dark_oak_log"));
        stairsBlock(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), mcLoc("block/crimson_stem"));
        slabBlock(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), mcLoc("block/crimson_hyphae"), mcLoc("block/crimson_stem"));
        stairsBlock(TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), mcLoc("block/warped_stem"));
        slabBlock(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), mcLoc("block/warped_hyphae"), mcLoc("block/warped_stem"));

        stairsBlock(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), mcLoc("block/stripped_oak_log"));
        slabBlock(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), mcLoc("block/stripped_oak_wood"), mcLoc("block/stripped_oak_log"));
        stairsBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), mcLoc("block/stripped_spruce_log"));
        slabBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), mcLoc("block/stripped_spruce_wood"), mcLoc("block/stripped_spruce_log"));
        stairsBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), mcLoc("block/stripped_birch_log"));
        slabBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), mcLoc("block/stripped_birch_wood"), mcLoc("block/stripped_birch_log"));
        stairsBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), mcLoc("block/stripped_jungle_log"));
        slabBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), mcLoc("block/stripped_jungle_wood"), mcLoc("block/stripped_jungle_log"));
        stairsBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), mcLoc("block/stripped_acacia_log"));
        slabBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), mcLoc("block/stripped_acacia_wood"), mcLoc("block/stripped_acacia_log"));
        stairsBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), mcLoc("block/stripped_dark_oak_log"));
        slabBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), mcLoc("block/stripped_dark_oak_wood"), mcLoc("block/stripped_dark_oak_log"));
        stairsBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), mcLoc("block/stripped_crimson_stem"));
        slabBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), mcLoc("block/stripped_crimson_hyphae"), mcLoc("block/stripped_crimson_stem"));
        stairsBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), mcLoc("block/stripped_warped_stem"));
        slabBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), mcLoc("block/stripped_warped_hyphae"), mcLoc("block/stripped_warped_stem"));

        slabBlock(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), mcLoc("block/white_terracotta"), mcLoc("block/white_terracotta"));
        stairsBlock(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), mcLoc("block/white_terracotta"));
        slabBlock(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), mcLoc("block/orange_terracotta"), mcLoc("block/orange_terracotta"));
        stairsBlock(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), mcLoc("block/orange_terracotta"));
        slabBlock(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), mcLoc("block/magenta_terracotta"), mcLoc("block/magenta_terracotta"));
        stairsBlock(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), mcLoc("block/magenta_terracotta"));
        slabBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), mcLoc("block/light_blue_terracotta"), mcLoc("block/light_blue_terracotta"));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), mcLoc("block/light_blue_terracotta"));
        slabBlock(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), mcLoc("block/yellow_terracotta"), mcLoc("block/yellow_terracotta"));
        stairsBlock(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), mcLoc("block/yellow_terracotta"));
        slabBlock(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), mcLoc("block/lime_terracotta"), mcLoc("block/lime_terracotta"));
        stairsBlock(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), mcLoc("block/lime_terracotta"));
        slabBlock(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), mcLoc("block/pink_terracotta"), mcLoc("block/pink_terracotta"));
        stairsBlock(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), mcLoc("block/pink_terracotta"));
        slabBlock(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), mcLoc("block/gray_terracotta"), mcLoc("block/gray_terracotta"));
        stairsBlock(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), mcLoc("block/gray_terracotta"));
        slabBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), mcLoc("block/light_gray_terracotta"), mcLoc("block/light_gray_terracotta"));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), mcLoc("block/light_gray_terracotta"));
        slabBlock(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), mcLoc("block/cyan_terracotta"), mcLoc("block/cyan_terracotta"));
        stairsBlock(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), mcLoc("block/cyan_terracotta"));
        slabBlock(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), mcLoc("block/purple_terracotta"), mcLoc("block/purple_terracotta"));
        stairsBlock(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), mcLoc("block/purple_terracotta"));
        slabBlock(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), mcLoc("block/blue_terracotta"), mcLoc("block/blue_terracotta"));
        stairsBlock(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), mcLoc("block/blue_terracotta"));
        slabBlock(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), mcLoc("block/brown_terracotta"), mcLoc("block/brown_terracotta"));
        stairsBlock(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), mcLoc("block/brown_terracotta"));
        slabBlock(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), mcLoc("block/green_terracotta"), mcLoc("block/green_terracotta"));
        stairsBlock(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), mcLoc("block/green_terracotta"));
        slabBlock(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), mcLoc("block/red_terracotta"), mcLoc("block/red_terracotta"));
        stairsBlock(TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), mcLoc("block/red_terracotta"));
        slabBlock(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), mcLoc("block/black_terracotta"), mcLoc("block/black_terracotta"));
        stairsBlock(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get(), mcLoc("block/black_terracotta"));
        
        slabBlock(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), mcLoc("block/white_concrete"), mcLoc("block/white_concrete"));
        stairsBlock(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), mcLoc("block/white_concrete"));
        slabBlock(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), mcLoc("block/orange_concrete"), mcLoc("block/orange_concrete"));
        stairsBlock(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), mcLoc("block/orange_concrete"));
        slabBlock(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), mcLoc("block/magenta_concrete"), mcLoc("block/magenta_concrete"));
        stairsBlock(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), mcLoc("block/magenta_concrete"));
        slabBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), mcLoc("block/light_blue_concrete"), mcLoc("block/light_blue_concrete"));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), mcLoc("block/light_blue_concrete"));
        slabBlock(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), mcLoc("block/yellow_concrete"), mcLoc("block/yellow_concrete"));
        stairsBlock(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), mcLoc("block/yellow_concrete"));
        slabBlock(TaloiBlocks.LIME_CONCRETE_SLAB.get(), mcLoc("block/lime_concrete"), mcLoc("block/lime_concrete"));
        stairsBlock(TaloiBlocks.LIME_CONCRETE_STAIRS.get(), mcLoc("block/lime_concrete"));
        slabBlock(TaloiBlocks.PINK_CONCRETE_SLAB.get(), mcLoc("block/pink_concrete"), mcLoc("block/pink_concrete"));
        stairsBlock(TaloiBlocks.PINK_CONCRETE_STAIRS.get(), mcLoc("block/pink_concrete"));
        slabBlock(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), mcLoc("block/gray_concrete"), mcLoc("block/gray_concrete"));
        stairsBlock(TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), mcLoc("block/gray_concrete"));
        slabBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), mcLoc("block/light_gray_concrete"), mcLoc("block/light_gray_concrete"));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), mcLoc("block/light_gray_concrete"));
        slabBlock(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), mcLoc("block/cyan_concrete"), mcLoc("block/cyan_concrete"));
        stairsBlock(TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), mcLoc("block/cyan_concrete"));
        slabBlock(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), mcLoc("block/purple_concrete"), mcLoc("block/purple_concrete"));
        stairsBlock(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), mcLoc("block/purple_concrete"));
        slabBlock(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), mcLoc("block/blue_concrete"), mcLoc("block/blue_concrete"));
        stairsBlock(TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), mcLoc("block/blue_concrete"));
        slabBlock(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), mcLoc("block/brown_concrete"), mcLoc("block/brown_concrete"));
        stairsBlock(TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), mcLoc("block/brown_concrete"));
        slabBlock(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), mcLoc("block/green_concrete"), mcLoc("block/green_concrete"));
        stairsBlock(TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), mcLoc("block/green_concrete"));
        slabBlock(TaloiBlocks.RED_CONCRETE_SLAB.get(), mcLoc("block/red_concrete"), mcLoc("block/red_concrete"));
        stairsBlock(TaloiBlocks.RED_CONCRETE_STAIRS.get(), mcLoc("block/red_concrete"));
        slabBlock(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), mcLoc("block/black_concrete"), mcLoc("block/black_concrete"));
        stairsBlock(TaloiBlocks.BLACK_CONCRETE_STAIRS.get(), mcLoc("block/black_concrete"));

        // MISCELLANEOUS
        simpleBlock(TaloiBlocks.BOUNCY_BLOCK.get());
        simpleBlock(TaloiBlocks.FEATHERY_BLOCK.get());
        simpleBlock(TaloiBlocks.GRAVITY_BLOCK.get());
        simpleBlock(TaloiBlocks.SPEEDY_BLOCK.get());
    }

    @Override
    public void fenceBlock(FenceBlock block, ResourceLocation texture) {
        super.fenceBlock(block, texture);
        models().fenceInventory(block.getRegistryName().toString() + "_inventory", texture);
    }

    @Override
    public void buttonBlock(ButtonBlock block, ResourceLocation texture) {
        super.buttonBlock(block, texture);
        models().buttonInventory(block.getRegistryName().toString() + "_inventory", texture);
    }

    @Override
    public void wallBlock(WallBlock block, ResourceLocation texture) {
        super.wallBlock(block, texture);
        models().wallInventory(block.getRegistryName().toString() + "_inventory", texture);
    }

    @Override
    public ResourceLocation modLoc(String name) {
        return super.modLoc("block/" + name);
    }
}
