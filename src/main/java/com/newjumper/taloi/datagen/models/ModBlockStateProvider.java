package com.newjumper.taloi.datagen.models;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // EVERGREEN
        simpleBlock(ModBlocks.EVERGREEN_PLANKS.get());
        simpleBlock(ModBlocks.EVERGREEN_SAPLING.get(), models().cross("evergreen_sapling", modLoc("evergreen_sapling")));
        axisBlock(ModBlocks.EVERGREEN_LOG.get(), modLoc("evergreen_log"), modLoc("evergreen_log_top"));
        axisBlock(ModBlocks.STRIPPED_EVERGREEN_LOG.get(), modLoc("stripped_evergreen_log"), modLoc("stripped_evergreen_log_top"));
        simpleBlock(ModBlocks.STRIPPED_EVERGREEN_WOOD.get(), models().cubeAll("stripped_evergreen_wood", modLoc("stripped_evergreen_log")));
        simpleBlock(ModBlocks.EVERGREEN_WOOD.get(), models().cubeAll("evergreen_wood", modLoc("evergreen_log")));
        simpleBlock(ModBlocks.EVERGREEN_LEAVES.get());
        slabBlock(ModBlocks.EVERGREEN_SLAB.get(), modLoc("evergreen_planks"), modLoc("evergreen_planks"));
        fenceBlock(ModBlocks.EVERGREEN_FENCE.get(), modLoc("evergreen_planks"));
        stairsBlock(ModBlocks.EVERGREEN_STAIRS.get(), modLoc("evergreen_planks"));
        buttonBlock(ModBlocks.EVERGREEN_BUTTON.get(), modLoc("evergreen_planks"));
        pressurePlateBlock(ModBlocks.EVERGREEN_PRESSURE_PLATE.get(), modLoc("evergreen_planks"));
        fenceGateBlock(ModBlocks.EVERGREEN_FENCE_GATE.get(), modLoc("evergreen_planks"));
        slabBlock(ModBlocks.EVERGREEN_WOOD_SLAB.get(), modLoc("evergreen_wood"), modLoc("evergreen_log"));
        stairsBlock(ModBlocks.EVERGREEN_WOOD_STAIRS.get(), modLoc("evergreen_log"));
        slabBlock(ModBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), modLoc("stripped_evergreen_wood"), modLoc("stripped_evergreen_log"));
        stairsBlock(ModBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), modLoc("stripped_evergreen_log"));

        // WILLOW
        simpleBlock(ModBlocks.WILLOW_PLANKS.get());
        simpleBlock(ModBlocks.WILLOW_SAPLING.get(), models().cross("willow_sapling", modLoc("willow_sapling")));
        axisBlock(ModBlocks.WILLOW_LOG.get(), modLoc("willow_log"), modLoc("willow_log_top"));
        axisBlock(ModBlocks.STRIPPED_WILLOW_LOG.get(), modLoc("stripped_willow_log"), modLoc("stripped_willow_log_top"));
        simpleBlock(ModBlocks.STRIPPED_WILLOW_WOOD.get(), models().cubeAll("stripped_willow_wood", modLoc("stripped_willow_log")));
        simpleBlock(ModBlocks.WILLOW_WOOD.get(), models().cubeAll("willow_wood", modLoc("willow_log")));
        simpleBlock(ModBlocks.WILLOW_LEAVES.get());
        slabBlock(ModBlocks.WILLOW_SLAB.get(), modLoc("willow_planks"), modLoc("willow_planks"));
        fenceBlock(ModBlocks.WILLOW_FENCE.get(), modLoc("willow_planks"));
        stairsBlock(ModBlocks.WILLOW_STAIRS.get(), modLoc("willow_planks"));
        buttonBlock(ModBlocks.WILLOW_BUTTON.get(), modLoc("willow_planks"));
        pressurePlateBlock(ModBlocks.WILLOW_PRESSURE_PLATE.get(), modLoc("willow_planks"));
        fenceGateBlock(ModBlocks.WILLOW_FENCE_GATE.get(), modLoc("willow_planks"));
        slabBlock(ModBlocks.WILLOW_WOOD_SLAB.get(), modLoc("willow_wood"), modLoc("willow_log"));
        stairsBlock(ModBlocks.WILLOW_WOOD_STAIRS.get(), modLoc("willow_log"));
        slabBlock(ModBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), modLoc("stripped_willow_wood"), modLoc("stripped_willow_log"));
        stairsBlock(ModBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), modLoc("stripped_willow_log"));

        // NATURAL & DECORATION
        simpleBlock(ModBlocks.ASPHALT.get());
        simpleBlock(ModBlocks.LIMESTONE.get());
        simpleBlock(ModBlocks.LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.MARBLE.get());
        simpleBlock(ModBlocks.SLATE.get());
        simpleBlock(ModBlocks.SLATE_BRICKS.get());
        simpleBlock(ModBlocks.POLISHED_TUFF.get());

        slabBlock(ModBlocks.LIMESTONE_SLAB.get(), modLoc("limestone"), modLoc("limestone"));
        slabBlock(ModBlocks.LIMESTONE_BRICK_SLAB.get(), modLoc("limestone_bricks"), modLoc("limestone_bricks"));
        slabBlock(ModBlocks.MARBLE_SLAB.get(), modLoc("marble"), modLoc("marble"));
        slabBlock(ModBlocks.SLATE_SLAB.get(), modLoc("slate"), modLoc("slate"));
        slabBlock(ModBlocks.SLATE_BRICK_SLAB.get(), modLoc("slate_bricks"), modLoc("slate_bricks"));

        stairsBlock(ModBlocks.LIMESTONE_STAIRS.get(), modLoc("limestone"));
        stairsBlock(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), modLoc("limestone_bricks"));
        stairsBlock(ModBlocks.MARBLE_STAIRS.get(), modLoc("marble"));
        stairsBlock(ModBlocks.SLATE_STAIRS.get(), modLoc("slate"));
        stairsBlock(ModBlocks.SLATE_BRICK_STAIRS.get(), modLoc("slate_bricks"));

        wallBlock(ModBlocks.LIMESTONE_WALL.get(), modLoc("limestone"));
        wallBlock(ModBlocks.LIMESTONE_BRICK_WALL.get(), modLoc("limestone_bricks"));
        wallBlock(ModBlocks.MARBLE_WALL.get(), modLoc("marble"));
        wallBlock(ModBlocks.SLATE_WALL.get(), modLoc("slate"));
        wallBlock(ModBlocks.SLATE_BRICK_WALL.get(), modLoc("slate_bricks"));

        simpleBlock(ModBlocks.CHISELED_ANDESITE.get());
        simpleBlock(ModBlocks.CHISELED_DIORITE.get());
        simpleBlock(ModBlocks.CHISELED_DRIPSTONE_BLOCK.get());
        simpleBlock(ModBlocks.CHISELED_GRANITE.get());
        simpleBlock(ModBlocks.CHISELED_LIMESTONE_BRICKS.get());
        simpleBlock(ModBlocks.CHISELED_MARBLE.get());
        simpleBlock(ModBlocks.CHISELED_SLATE.get());
        simpleBlock(ModBlocks.CHISELED_TUFF.get());

        simpleBlock(ModBlocks.NETHERRACK_BRICKS.get());

        simpleBlock(ModBlocks.REINFORCED_IRON_BLOCK.get());
        simpleBlock(ModBlocks.RUSTED_REINFORCED_IRON_BLOCK.get());

        axisBlock(ModBlocks.BUNDLED_BAMBOO.get(), modLoc("bundled_bamboo_side"), modLoc("bundled_bamboo_top"));
        simpleBlock(ModBlocks.BAMBOO_PLANKS.get());

        simpleBlock(ModBlocks.SNOWY_ICE.get(), models().cubeBottomTop("snowy_ice", modLoc("snowy_ice_side"), modLoc("snowy_ice_bottom"), modLoc("snowy_ice_top")));

        simpleBlock(ModBlocks.MALACHITE_BLOCK.get());
        simpleBlock(ModBlocks.TANZANITE_BLOCK.get());
        simpleBlock(ModBlocks.TOPAZ_BLOCK.get());

        simpleBlock(ModBlocks.WOODEN_CRATE.get());
        simpleBlock(ModBlocks.IRON_CRATE.get());

        // METALS
        simpleBlock(ModBlocks.ALUMINUM_BLOCK.get());
        simpleBlock(ModBlocks.ALUMINUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlock(ModBlocks.RAW_ALUMINUM_BLOCK.get());

        simpleBlock(ModBlocks.IRIDIUM_BLOCK.get());
        simpleBlock(ModBlocks.IRIDIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_IRIDIUM_BLOCK.get());

        simpleBlock(ModBlocks.LEAD_BLOCK.get());
        simpleBlock(ModBlocks.LEAD_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_LEAD_ORE.get());
        simpleBlock(ModBlocks.RAW_LEAD_BLOCK.get());

        simpleBlock(ModBlocks.MAGNESIUM_BLOCK.get());
        simpleBlock(ModBlocks.MAGNESIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_MAGNESIUM_BLOCK.get());

        simpleBlock(ModBlocks.OSMIUM_BLOCK.get());
        simpleBlock(ModBlocks.OSMIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_OSMIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_OSMIUM_BLOCK.get());

        simpleBlock(ModBlocks.PLATINUM_BLOCK.get());
        simpleBlock(ModBlocks.PLATINUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
        simpleBlock(ModBlocks.RAW_PLATINUM_BLOCK.get());

        simpleBlock(ModBlocks.SILICON_BLOCK.get());
        simpleBlock(ModBlocks.SILICON_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SILICON_ORE.get());
        simpleBlock(ModBlocks.RAW_SILICON_BLOCK.get());

        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TIN_ORE.get());
        simpleBlock(ModBlocks.RAW_TIN_BLOCK.get());

        simpleBlock(ModBlocks.TUNGSTEN_BLOCK.get());
        simpleBlock(ModBlocks.TUNGSTEN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
        simpleBlock(ModBlocks.RAW_TUNGSTEN_BLOCK.get());

        simpleBlock(ModBlocks.URANIUM_BLOCK.get());
        simpleBlock(ModBlocks.URANIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_URANIUM_BLOCK.get());

        simpleBlock(ModBlocks.ZINC_BLOCK.get());
        simpleBlock(ModBlocks.ZINC_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ZINC_ORE.get());
        simpleBlock(ModBlocks.RAW_ZINC_BLOCK.get());

        simpleBlock(ModBlocks.BRONZE_BLOCK.get());
        simpleBlock(ModBlocks.STEEL_BLOCK.get());

        // MACHINERY
        horizontalBlock(ModBlocks.ALPHA_CONSTRUCTOR.get(), models().cube("alpha_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("alpha_constructor_front"), modLoc("alpha_machine_back"), modLoc("alpha_constructor_right"), modLoc("alpha_constructor_left")).texture("particle", modLoc("constructor_top")));
        horizontalBlock(ModBlocks.BETA_CONSTRUCTOR.get(), models().cube("beta_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("beta_constructor_front"), modLoc("beta_machine_back"), modLoc("beta_constructor_right"), modLoc("beta_constructor_left")).texture("particle", modLoc("constructor_top")));
        horizontalBlock(ModBlocks.UNSTABLE_CONSTRUCTOR.get(), models().cube("unstable_constructor", modLoc("machine_bottom"), modLoc("constructor_top"), modLoc("unstable_constructor_front"), modLoc("unstable_machine_back"), modLoc("unstable_constructor_right"), modLoc("unstable_constructor_left")).texture("particle", modLoc("constructor_top")));

        horizontalBlock(ModBlocks.ALPHA_HYDRAULIC_PRESS.get(), models().cube("alpha_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("alpha_press_front"), modLoc("alpha_machine_back"), modLoc("alpha_press_right"), modLoc("alpha_press_left")).texture("particle", modLoc("press_top")));
        horizontalBlock(ModBlocks.BETA_HYDRAULIC_PRESS.get(), models().cube("beta_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("beta_press_front"), modLoc("beta_machine_back"), modLoc("beta_press_right"), modLoc("beta_press_left")).texture("particle", modLoc("press_top")));
        horizontalBlock(ModBlocks.UNSTABLE_HYDRAULIC_PRESS.get(), models().cube("unstable_hydraulic_press", modLoc("machine_bottom"), modLoc("press_top"), modLoc("unstable_press_front"), modLoc("unstable_machine_back"), modLoc("unstable_press_right"), modLoc("unstable_press_left")).texture("particle", modLoc("press_top")));

        horizontalBlock(ModBlocks.ALPHA_PROCESSOR.get(), models().cube("alpha_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("alpha_processor_front"), modLoc("alpha_machine_back"), modLoc("alpha_processor_right"), modLoc("alpha_processor_left")).texture("particle", modLoc("processor_top")));
        horizontalBlock(ModBlocks.BETA_PROCESSOR.get(), models().cube("beta_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("beta_processor_front"), modLoc("beta_machine_back"), modLoc("beta_processor_right"), modLoc("beta_processor_left")).texture("particle", modLoc("processor_top")));
        horizontalBlock(ModBlocks.UNSTABLE_PROCESSOR.get(), models().cube("unstable_processor", modLoc("machine_bottom"), modLoc("processor_top"), modLoc("unstable_processor_front"), modLoc("unstable_machine_back"), modLoc("unstable_processor_right"), modLoc("unstable_processor_left")).texture("particle", modLoc("processor_top")));

        horizontalBlock(ModBlocks.ALPHA_SEPARATOR.get(), models().cube("alpha_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("alpha_separator_front"), modLoc("alpha_machine_back"), modLoc("alpha_separator_right"), modLoc("alpha_separator_left")).texture("particle", modLoc("separator_top")));
        horizontalBlock(ModBlocks.BETA_SEPARATOR.get(), models().cube("beta_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("beta_separator_front"), modLoc("beta_machine_back"), modLoc("beta_separator_right"), modLoc("beta_separator_left")).texture("particle", modLoc("separator_top")));
        horizontalBlock(ModBlocks.UNSTABLE_SEPARATOR.get(), models().cube("unstable_separator", modLoc("machine_bottom"), modLoc("separator_top"), modLoc("unstable_separator_front"), modLoc("unstable_machine_back"), modLoc("unstable_separator_right"), modLoc("unstable_separator_left")).texture("particle", modLoc("separator_top")));

        // VANILLA
        stairsBlock(ModBlocks.OAK_WOOD_STAIRS.get(), mcLoc("block/oak_log"));
        slabBlock(ModBlocks.OAK_WOOD_SLAB.get(), mcLoc("block/oak_wood"), mcLoc("block/oak_log"));
        stairsBlock(ModBlocks.SPRUCE_WOOD_STAIRS.get(), mcLoc("block/spruce_log"));
        slabBlock(ModBlocks.SPRUCE_WOOD_SLAB.get(), mcLoc("block/spruce_wood"), mcLoc("block/spruce_log"));
        stairsBlock(ModBlocks.BIRCH_WOOD_STAIRS.get(), mcLoc("block/birch_log"));
        slabBlock(ModBlocks.BIRCH_WOOD_SLAB.get(), mcLoc("block/birch_wood"), mcLoc("block/birch_log"));
        stairsBlock(ModBlocks.JUNGLE_WOOD_STAIRS.get(), mcLoc("block/jungle_log"));
        slabBlock(ModBlocks.JUNGLE_WOOD_SLAB.get(), mcLoc("block/jungle_wood"), mcLoc("block/jungle_log"));
        stairsBlock(ModBlocks.ACACIA_WOOD_STAIRS.get(), mcLoc("block/acacia_log"));
        slabBlock(ModBlocks.ACACIA_WOOD_SLAB.get(), mcLoc("block/acacia_wood"), mcLoc("block/acacia_log"));
        stairsBlock(ModBlocks.DARK_OAK_WOOD_STAIRS.get(), mcLoc("block/dark_oak_log"));
        slabBlock(ModBlocks.DARK_OAK_WOOD_SLAB.get(), mcLoc("block/dark_oak_wood"), mcLoc("block/dark_oak_log"));

        stairsBlock(ModBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), mcLoc("block/stripped_oak_log"));
        slabBlock(ModBlocks.STRIPPED_OAK_WOOD_SLAB.get(), mcLoc("block/stripped_oak_wood"), mcLoc("block/stripped_oak_log"));
        stairsBlock(ModBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), mcLoc("block/stripped_spruce_log"));
        slabBlock(ModBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), mcLoc("block/stripped_spruce_wood"), mcLoc("block/stripped_spruce_log"));
        stairsBlock(ModBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), mcLoc("block/stripped_birch_log"));
        slabBlock(ModBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), mcLoc("block/stripped_birch_wood"), mcLoc("block/stripped_birch_log"));
        stairsBlock(ModBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), mcLoc("block/stripped_jungle_log"));
        slabBlock(ModBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), mcLoc("block/stripped_jungle_wood"), mcLoc("block/stripped_jungle_log"));
        stairsBlock(ModBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), mcLoc("block/stripped_acacia_log"));
        slabBlock(ModBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), mcLoc("block/stripped_acacia_wood"), mcLoc("block/stripped_acacia_log"));
        stairsBlock(ModBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), mcLoc("block/stripped_dark_oak_log"));
        slabBlock(ModBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), mcLoc("block/stripped_dark_oak_wood"), mcLoc("block/stripped_dark_oak_log"));

        slabBlock(ModBlocks.WHITE_CONCRETE_SLAB.get(), mcLoc("block/white_concrete"), mcLoc("block/white_concrete"));
        stairsBlock(ModBlocks.WHITE_CONCRETE_STAIRS.get(), mcLoc("block/white_concrete"));
        slabBlock(ModBlocks.ORANGE_CONCRETE_SLAB.get(), mcLoc("block/orange_concrete"), mcLoc("block/orange_concrete"));
        stairsBlock(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), mcLoc("block/orange_concrete"));
        slabBlock(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), mcLoc("block/magenta_concrete"), mcLoc("block/magenta_concrete"));
        stairsBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), mcLoc("block/magenta_concrete"));
        slabBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), mcLoc("block/light_blue_concrete"), mcLoc("block/light_blue_concrete"));
        stairsBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), mcLoc("block/light_blue_concrete"));
        slabBlock(ModBlocks.YELLOW_CONCRETE_SLAB.get(), mcLoc("block/yellow_concrete"), mcLoc("block/yellow_concrete"));
        stairsBlock(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), mcLoc("block/yellow_concrete"));
        slabBlock(ModBlocks.LIME_CONCRETE_SLAB.get(), mcLoc("block/lime_concrete"), mcLoc("block/lime_concrete"));
        stairsBlock(ModBlocks.LIME_CONCRETE_STAIRS.get(), mcLoc("block/lime_concrete"));
        slabBlock(ModBlocks.PINK_CONCRETE_SLAB.get(), mcLoc("block/pink_concrete"), mcLoc("block/pink_concrete"));
        stairsBlock(ModBlocks.PINK_CONCRETE_STAIRS.get(), mcLoc("block/pink_concrete"));
        slabBlock(ModBlocks.GRAY_CONCRETE_SLAB.get(), mcLoc("block/gray_concrete"), mcLoc("block/gray_concrete"));
        stairsBlock(ModBlocks.GRAY_CONCRETE_STAIRS.get(), mcLoc("block/gray_concrete"));
        slabBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), mcLoc("block/light_gray_concrete"), mcLoc("block/light_gray_concrete"));
        stairsBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), mcLoc("block/light_gray_concrete"));
        slabBlock(ModBlocks.CYAN_CONCRETE_SLAB.get(), mcLoc("block/cyan_concrete"), mcLoc("block/cyan_concrete"));
        stairsBlock(ModBlocks.CYAN_CONCRETE_STAIRS.get(), mcLoc("block/cyan_concrete"));
        slabBlock(ModBlocks.PURPLE_CONCRETE_SLAB.get(), mcLoc("block/purple_concrete"), mcLoc("block/purple_concrete"));
        stairsBlock(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), mcLoc("block/purple_concrete"));
        slabBlock(ModBlocks.BLUE_CONCRETE_SLAB.get(), mcLoc("block/blue_concrete"), mcLoc("block/blue_concrete"));
        stairsBlock(ModBlocks.BLUE_CONCRETE_STAIRS.get(), mcLoc("block/blue_concrete"));
        slabBlock(ModBlocks.BROWN_CONCRETE_SLAB.get(), mcLoc("block/brown_concrete"), mcLoc("block/brown_concrete"));
        stairsBlock(ModBlocks.BROWN_CONCRETE_STAIRS.get(), mcLoc("block/brown_concrete"));
        slabBlock(ModBlocks.GREEN_CONCRETE_SLAB.get(), mcLoc("block/green_concrete"), mcLoc("block/green_concrete"));
        stairsBlock(ModBlocks.GREEN_CONCRETE_STAIRS.get(), mcLoc("block/green_concrete"));
        slabBlock(ModBlocks.RED_CONCRETE_SLAB.get(), mcLoc("block/red_concrete"), mcLoc("block/red_concrete"));
        stairsBlock(ModBlocks.RED_CONCRETE_STAIRS.get(), mcLoc("block/red_concrete"));
        slabBlock(ModBlocks.BLACK_CONCRETE_SLAB.get(), mcLoc("block/black_concrete"), mcLoc("block/black_concrete"));
        stairsBlock(ModBlocks.BLACK_CONCRETE_STAIRS.get(), mcLoc("block/black_concrete"));

        // MISCELLANEOUS
        simpleBlock(ModBlocks.BOUNCY_BLOCK.get());
        simpleBlock(ModBlocks.FEATHERY_BLOCK.get());
        simpleBlock(ModBlocks.GRAVITY_BLOCK.get());
        simpleBlock(ModBlocks.SPEEDY_BLOCK.get());
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
