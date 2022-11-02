package com.newjumper.taloi.datagen.assets;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // EVERGREEN
        simpleBlock(TaloiBlocks.EVERGREEN_PLANKS.get());
        simpleBlock(TaloiBlocks.EVERGREEN_SAPLING.get(), models().cross("evergreen_sapling", blockLoc(TaloiBlocks.EVERGREEN_SAPLING)).renderType("cutout"));
        axisBlock(TaloiBlocks.EVERGREEN_LOG.get(), blockLoc(TaloiBlocks.EVERGREEN_LOG), blockLoc(TaloiBlocks.EVERGREEN_LOG, "top"));
        axisBlock(TaloiBlocks.STRIPPED_EVERGREEN_LOG.get(), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG, "top"));
        axisBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get(), models().cubeColumn("stripped_evergreen_wood", blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG)), models().cubeColumn(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.getId().getPath(), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG)));
        axisBlock(TaloiBlocks.EVERGREEN_WOOD.get(), models().cubeColumn("evergreen_wood", blockLoc(TaloiBlocks.EVERGREEN_LOG), blockLoc(TaloiBlocks.EVERGREEN_LOG)), models().cubeColumn(TaloiBlocks.EVERGREEN_WOOD.getId().getPath(), blockLoc(TaloiBlocks.EVERGREEN_LOG), blockLoc(TaloiBlocks.EVERGREEN_LOG)));
        simpleBlock(TaloiBlocks.EVERGREEN_LEAVES.get(), models().cubeAll("evergreen_leaves", blockLoc(TaloiBlocks.EVERGREEN_LEAVES)).renderType("cutout"));
        slabBlock(TaloiBlocks.EVERGREEN_SLAB.get(), blockLoc(TaloiBlocks.EVERGREEN_PLANKS), blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        fenceBlock(TaloiBlocks.EVERGREEN_FENCE, blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        stairsBlock(TaloiBlocks.EVERGREEN_STAIRS.get(), blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        buttonBlock(TaloiBlocks.EVERGREEN_BUTTON, blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        pressurePlateBlock(TaloiBlocks.EVERGREEN_PRESSURE_PLATE.get(), blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        doorBlockWithRenderType(TaloiBlocks.EVERGREEN_DOOR.get(), blockLoc(TaloiBlocks.EVERGREEN_DOOR, "bottom"), blockLoc(TaloiBlocks.EVERGREEN_DOOR, "top"), "cutout");
        trapdoorBlockWithRenderType(TaloiBlocks.EVERGREEN_TRAPDOOR.get(), blockLoc(TaloiBlocks.EVERGREEN_TRAPDOOR), true, "cutout");
        fenceGateBlock(TaloiBlocks.EVERGREEN_FENCE_GATE.get(), blockLoc(TaloiBlocks.EVERGREEN_PLANKS));
        slabBlock(TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), blockLoc(TaloiBlocks.EVERGREEN_WOOD), blockLoc(TaloiBlocks.EVERGREEN_LOG));
        stairsBlock(TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), blockLoc(TaloiBlocks.EVERGREEN_LOG));
        slabBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_WOOD), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), blockLoc(TaloiBlocks.STRIPPED_EVERGREEN_LOG));

        // WILLOW
        simpleBlock(TaloiBlocks.WILLOW_PLANKS.get());
        simpleBlock(TaloiBlocks.WILLOW_SAPLING.get(), models().cross("willow_sapling", blockLoc(TaloiBlocks.WILLOW_SAPLING)).renderType("cutout"));
        axisBlock(TaloiBlocks.WILLOW_LOG.get(), blockLoc(TaloiBlocks.WILLOW_LOG), blockLoc(TaloiBlocks.WILLOW_LOG, "top"));
        axisBlock(TaloiBlocks.STRIPPED_WILLOW_LOG.get(), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG, "top"));
        axisBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD.get(), models().cubeColumn("stripped_willow_wood", blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG)), models().cubeColumn(TaloiBlocks.STRIPPED_WILLOW_WOOD.getId().getPath(), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG)));
        axisBlock(TaloiBlocks.WILLOW_WOOD.get(), models().cubeColumn("willow_wood", blockLoc(TaloiBlocks.WILLOW_LOG), blockLoc(TaloiBlocks.WILLOW_LOG)), models().cubeColumn(TaloiBlocks.WILLOW_WOOD.getId().getPath(), blockLoc(TaloiBlocks.WILLOW_LOG), blockLoc(TaloiBlocks.WILLOW_LOG)));
        simpleBlock(TaloiBlocks.WILLOW_LEAVES.get(), models().cubeAll("willow_leaves", blockLoc(TaloiBlocks.WILLOW_LEAVES)).renderType("cutout"));
        slabBlock(TaloiBlocks.WILLOW_SLAB.get(), blockLoc(TaloiBlocks.WILLOW_PLANKS), blockLoc(TaloiBlocks.WILLOW_PLANKS));
        fenceBlock(TaloiBlocks.WILLOW_FENCE, blockLoc(TaloiBlocks.WILLOW_PLANKS));
        stairsBlock(TaloiBlocks.WILLOW_STAIRS.get(), blockLoc(TaloiBlocks.WILLOW_PLANKS));
        buttonBlock(TaloiBlocks.WILLOW_BUTTON, blockLoc(TaloiBlocks.WILLOW_PLANKS));
        pressurePlateBlock(TaloiBlocks.WILLOW_PRESSURE_PLATE.get(), blockLoc(TaloiBlocks.WILLOW_PLANKS));
        doorBlockWithRenderType(TaloiBlocks.WILLOW_DOOR.get(), blockLoc(TaloiBlocks.WILLOW_DOOR, "bottom"), blockLoc(TaloiBlocks.WILLOW_DOOR, "top"), "translucent");
        trapdoorBlockWithRenderType(TaloiBlocks.WILLOW_TRAPDOOR.get(), blockLoc(TaloiBlocks.WILLOW_TRAPDOOR), true, "translucent");
        fenceGateBlock(TaloiBlocks.WILLOW_FENCE_GATE.get(), blockLoc(TaloiBlocks.WILLOW_PLANKS));
        slabBlock(TaloiBlocks.WILLOW_WOOD_SLAB.get(), blockLoc(TaloiBlocks.WILLOW_WOOD), blockLoc(TaloiBlocks.WILLOW_LOG));
        stairsBlock(TaloiBlocks.WILLOW_WOOD_STAIRS.get(), blockLoc(TaloiBlocks.WILLOW_LOG));
        slabBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), blockLoc(TaloiBlocks.STRIPPED_WILLOW_WOOD), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), blockLoc(TaloiBlocks.STRIPPED_WILLOW_LOG));

        // NATURAL & DECORATION
        simpleBlock(TaloiBlocks.ASPHALT.get());
        simpleBlock(TaloiBlocks.LIMESTONE.get());
        simpleBlock(TaloiBlocks.LIMESTONE_BRICKS.get());
        simpleBlock(TaloiBlocks.MARBLE.get());
        simpleBlock(TaloiBlocks.SLATE.get());
        simpleBlock(TaloiBlocks.SLATE_BRICKS.get());
        simpleBlock(TaloiBlocks.POLISHED_TUFF.get());

        slabBlock(TaloiBlocks.LIMESTONE_SLAB.get(), blockLoc(TaloiBlocks.LIMESTONE), blockLoc(TaloiBlocks.LIMESTONE));
        slabBlock(TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), blockLoc(TaloiBlocks.LIMESTONE_BRICKS), blockLoc(TaloiBlocks.LIMESTONE_BRICKS));
        slabBlock(TaloiBlocks.MARBLE_SLAB.get(), blockLoc(TaloiBlocks.MARBLE), blockLoc(TaloiBlocks.MARBLE));
        slabBlock(TaloiBlocks.SLATE_SLAB.get(), blockLoc(TaloiBlocks.SLATE), blockLoc(TaloiBlocks.SLATE));
        slabBlock(TaloiBlocks.SLATE_BRICK_SLAB.get(), blockLoc(TaloiBlocks.SLATE_BRICKS), blockLoc(TaloiBlocks.SLATE_BRICKS));

        stairsBlock(TaloiBlocks.LIMESTONE_STAIRS.get(), blockLoc(TaloiBlocks.LIMESTONE));
        stairsBlock(TaloiBlocks.LIMESTONE_BRICK_STAIRS.get(), blockLoc(TaloiBlocks.LIMESTONE_BRICKS));
        stairsBlock(TaloiBlocks.MARBLE_STAIRS.get(), blockLoc(TaloiBlocks.MARBLE));
        stairsBlock(TaloiBlocks.SLATE_STAIRS.get(), blockLoc(TaloiBlocks.SLATE));
        stairsBlock(TaloiBlocks.SLATE_BRICK_STAIRS.get(), blockLoc(TaloiBlocks.SLATE_BRICKS));

        wallBlock(TaloiBlocks.LIMESTONE_WALL, blockLoc(TaloiBlocks.LIMESTONE));
        wallBlock(TaloiBlocks.LIMESTONE_BRICK_WALL, blockLoc(TaloiBlocks.LIMESTONE_BRICKS));
        wallBlock(TaloiBlocks.MARBLE_WALL, blockLoc(TaloiBlocks.MARBLE));
        wallBlock(TaloiBlocks.SLATE_WALL, blockLoc(TaloiBlocks.SLATE));
        wallBlock(TaloiBlocks.SLATE_BRICK_WALL, blockLoc(TaloiBlocks.SLATE_BRICKS));

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

        axisBlock(TaloiBlocks.BUNDLED_BAMBOO.get(), blockLoc(TaloiBlocks.BUNDLED_BAMBOO, "side"), blockLoc(TaloiBlocks.BUNDLED_BAMBOO, "top"));
        simpleBlock(TaloiBlocks.BAMBOO_PLANKS.get());

        simpleBlock(TaloiBlocks.SNOWY_ICE.get(), models().cubeBottomTop("snowy_ice", blockLoc(TaloiBlocks.SNOWY_ICE, "side"), blockLoc(TaloiBlocks.SNOWY_ICE, "bottom"), blockLoc(TaloiBlocks.SNOWY_ICE, "top")));

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
        horizontalBlock(TaloiBlocks.ALPHA_CONSTRUCTOR.get(), models().cube("alpha_constructor", modLoc("block/machine_bottom"), modLoc("block/constructor_top"), blockLoc(TaloiBlocks.ALPHA_CONSTRUCTOR, "front"), modLoc("block/alpha_machine_back"), blockLoc(TaloiBlocks.ALPHA_CONSTRUCTOR, "right"), blockLoc(TaloiBlocks.ALPHA_CONSTRUCTOR, "left")).texture("particle", modLoc("block/constructor_top")));

        horizontalBlock(TaloiBlocks.BETA_CONSTRUCTOR.get(), models().cube("beta_constructor", modLoc("block/machine_bottom"), modLoc("block/constructor_top"), blockLoc(TaloiBlocks.BETA_CONSTRUCTOR, "front"), modLoc("block/beta_machine_back"), blockLoc(TaloiBlocks.BETA_CONSTRUCTOR, "right"), blockLoc(TaloiBlocks.BETA_CONSTRUCTOR, "left")).texture("particle", modLoc("block/constructor_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_CONSTRUCTOR.get(), models().cube("unstable_constructor", modLoc("block/machine_bottom"), modLoc("block/constructor_top"), blockLoc(TaloiBlocks.UNSTABLE_CONSTRUCTOR, "front"), modLoc("block/unstable_machine_back"), blockLoc(TaloiBlocks.UNSTABLE_CONSTRUCTOR, "right"), blockLoc(TaloiBlocks.UNSTABLE_CONSTRUCTOR, "left")).texture("particle", modLoc("block/constructor_top")));

        horizontalBlock(TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get(), models().cube("alpha_hydraulic_press", modLoc("block/machine_bottom"), modLoc("block/press_top"), modLoc("block/alpha_press_front"), modLoc("block/alpha_machine_back"), modLoc("block/alpha_press_right"), modLoc("block/alpha_press_left")).texture("particle", modLoc("block/press_top")));
        horizontalBlock(TaloiBlocks.BETA_HYDRAULIC_PRESS.get(), models().cube("beta_hydraulic_press", modLoc("block/machine_bottom"), modLoc("block/press_top"), modLoc("block/beta_press_front"), modLoc("block/beta_machine_back"), modLoc("block/beta_press_right"), modLoc("block/beta_press_left")).texture("particle", modLoc("block/press_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get(), models().cube("unstable_hydraulic_press", modLoc("block/machine_bottom"), modLoc("block/press_top"), modLoc("block/unstable_press_front"), modLoc("block/unstable_machine_back"), modLoc("block/unstable_press_right"), modLoc("block/unstable_press_left")).texture("particle", modLoc("block/press_top")));

        horizontalBlock(TaloiBlocks.ALPHA_PROCESSOR.get(), models().cube("alpha_processor", modLoc("block/machine_bottom"), modLoc("block/processor_top"), blockLoc(TaloiBlocks.ALPHA_PROCESSOR, "front"), modLoc("block/alpha_machine_back"), blockLoc(TaloiBlocks.ALPHA_PROCESSOR, "right"), blockLoc(TaloiBlocks.ALPHA_PROCESSOR, "left")).texture("particle", modLoc("block/processor_top")));
        horizontalBlock(TaloiBlocks.BETA_PROCESSOR.get(), models().cube("beta_processor", modLoc("block/machine_bottom"), modLoc("block/processor_top"), blockLoc(TaloiBlocks.BETA_PROCESSOR, "front"), modLoc("block/beta_machine_back"), blockLoc(TaloiBlocks.BETA_PROCESSOR, "right"), blockLoc(TaloiBlocks.BETA_PROCESSOR, "left")).texture("particle", modLoc("block/processor_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_PROCESSOR.get(), models().cube("unstable_processor", modLoc("block/machine_bottom"), modLoc("block/processor_top"), blockLoc(TaloiBlocks.UNSTABLE_PROCESSOR, "front"), modLoc("block/unstable_machine_back"), blockLoc(TaloiBlocks.UNSTABLE_PROCESSOR, "right"), blockLoc(TaloiBlocks.UNSTABLE_PROCESSOR, "left")).texture("particle", modLoc("block/processor_top")));

        horizontalBlock(TaloiBlocks.ALPHA_SEPARATOR.get(), models().cube("alpha_separator", modLoc("block/machine_bottom"), modLoc("block/separator_top"), blockLoc(TaloiBlocks.ALPHA_SEPARATOR, "front"), modLoc("block/alpha_machine_back"), blockLoc(TaloiBlocks.ALPHA_SEPARATOR, "right"), blockLoc(TaloiBlocks.ALPHA_SEPARATOR, "left")).texture("particle", modLoc("block/separator_top")));
        horizontalBlock(TaloiBlocks.BETA_SEPARATOR.get(), models().cube("beta_separator", modLoc("block/machine_bottom"), modLoc("block/separator_top"), blockLoc(TaloiBlocks.BETA_SEPARATOR, "front"), modLoc("block/beta_machine_back"), blockLoc(TaloiBlocks.BETA_SEPARATOR, "right"), blockLoc(TaloiBlocks.BETA_SEPARATOR, "left")).texture("particle", modLoc("block/separator_top")));
        horizontalBlock(TaloiBlocks.UNSTABLE_SEPARATOR.get(), models().cube("unstable_separator", modLoc("block/machine_bottom"), modLoc("block/separator_top"), blockLoc(TaloiBlocks.UNSTABLE_SEPARATOR, "front"), modLoc("block/unstable_machine_back"), blockLoc(TaloiBlocks.UNSTABLE_SEPARATOR, "right"), blockLoc(TaloiBlocks.UNSTABLE_SEPARATOR, "left")).texture("particle", modLoc("block/separator_top")));

        // VANILLA
        stairsBlock(TaloiBlocks.OAK_WOOD_STAIRS.get(), mcLoc(Blocks.OAK_LOG));
        slabBlock(TaloiBlocks.OAK_WOOD_SLAB.get(), mcLoc(Blocks.OAK_WOOD), mcLoc(Blocks.OAK_LOG));
        stairsBlock(TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), mcLoc(Blocks.SPRUCE_LOG));
        slabBlock(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), mcLoc(Blocks.SPRUCE_WOOD), mcLoc(Blocks.SPRUCE_LOG));
        stairsBlock(TaloiBlocks.BIRCH_WOOD_STAIRS.get(), mcLoc(Blocks.BIRCH_LOG));
        slabBlock(TaloiBlocks.BIRCH_WOOD_SLAB.get(), mcLoc(Blocks.BIRCH_WOOD), mcLoc(Blocks.BIRCH_LOG));
        stairsBlock(TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), mcLoc(Blocks.JUNGLE_LOG));
        slabBlock(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), mcLoc(Blocks.JUNGLE_WOOD), mcLoc(Blocks.JUNGLE_LOG));
        stairsBlock(TaloiBlocks.ACACIA_WOOD_STAIRS.get(), mcLoc(Blocks.ACACIA_LOG));
        slabBlock(TaloiBlocks.ACACIA_WOOD_SLAB.get(), mcLoc(Blocks.ACACIA_WOOD), mcLoc(Blocks.ACACIA_LOG));
        stairsBlock(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.DARK_OAK_LOG));
        slabBlock(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), mcLoc(Blocks.DARK_OAK_WOOD), mcLoc(Blocks.DARK_OAK_LOG));
        stairsBlock(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), mcLoc(Blocks.CRIMSON_STEM));
        slabBlock(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), mcLoc(Blocks.CRIMSON_HYPHAE), mcLoc(Blocks.CRIMSON_STEM));
        stairsBlock(TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), mcLoc(Blocks.WARPED_STEM));
        slabBlock(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), mcLoc(Blocks.WARPED_HYPHAE), mcLoc(Blocks.WARPED_STEM));

        stairsBlock(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_OAK_LOG));
        slabBlock(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_OAK_WOOD), mcLoc(Blocks.STRIPPED_OAK_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_SPRUCE_LOG));
        slabBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_SPRUCE_WOOD), mcLoc(Blocks.STRIPPED_SPRUCE_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_BIRCH_LOG));
        slabBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_BIRCH_WOOD), mcLoc(Blocks.STRIPPED_BIRCH_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_JUNGLE_LOG));
        slabBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_JUNGLE_WOOD), mcLoc(Blocks.STRIPPED_JUNGLE_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_ACACIA_LOG));
        slabBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_ACACIA_WOOD), mcLoc(Blocks.STRIPPED_ACACIA_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_DARK_OAK_LOG));
        slabBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_DARK_OAK_WOOD), mcLoc(Blocks.STRIPPED_DARK_OAK_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), mcLoc(Blocks.STRIPPED_CRIMSON_STEM));
        slabBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), mcLoc(Blocks.STRIPPED_CRIMSON_HYPHAE), mcLoc(Blocks.STRIPPED_CRIMSON_STEM));
        stairsBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), mcLoc(Blocks.STRIPPED_WARPED_STEM));
        slabBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), mcLoc(Blocks.STRIPPED_WARPED_HYPHAE), mcLoc(Blocks.STRIPPED_WARPED_STEM));

        slabBlock(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.WHITE_TERRACOTTA), mcLoc(Blocks.WHITE_TERRACOTTA));
        stairsBlock(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.WHITE_TERRACOTTA));
        slabBlock(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.ORANGE_TERRACOTTA), mcLoc(Blocks.ORANGE_TERRACOTTA));
        stairsBlock(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.ORANGE_TERRACOTTA));
        slabBlock(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), mcLoc(Blocks.MAGENTA_TERRACOTTA), mcLoc(Blocks.MAGENTA_TERRACOTTA));
        stairsBlock(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.MAGENTA_TERRACOTTA));
        slabBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), mcLoc(Blocks.YELLOW_TERRACOTTA), mcLoc(Blocks.YELLOW_TERRACOTTA));
        stairsBlock(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.YELLOW_TERRACOTTA));
        slabBlock(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIME_TERRACOTTA), mcLoc(Blocks.LIME_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIME_TERRACOTTA));
        slabBlock(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), mcLoc(Blocks.PINK_TERRACOTTA), mcLoc(Blocks.PINK_TERRACOTTA));
        stairsBlock(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.PINK_TERRACOTTA));
        slabBlock(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), mcLoc(Blocks.GRAY_TERRACOTTA), mcLoc(Blocks.GRAY_TERRACOTTA));
        stairsBlock(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.GRAY_TERRACOTTA));
        slabBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.CYAN_TERRACOTTA), mcLoc(Blocks.CYAN_TERRACOTTA));
        stairsBlock(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.CYAN_TERRACOTTA));
        slabBlock(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.PURPLE_TERRACOTTA), mcLoc(Blocks.PURPLE_TERRACOTTA));
        stairsBlock(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.PURPLE_TERRACOTTA));
        slabBlock(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BLUE_TERRACOTTA), mcLoc(Blocks.BLUE_TERRACOTTA));
        stairsBlock(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BLUE_TERRACOTTA));
        slabBlock(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BROWN_TERRACOTTA), mcLoc(Blocks.BROWN_TERRACOTTA));
        stairsBlock(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BROWN_TERRACOTTA));
        slabBlock(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.GREEN_TERRACOTTA), mcLoc(Blocks.GREEN_TERRACOTTA));
        stairsBlock(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.GREEN_TERRACOTTA));
        slabBlock(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), mcLoc(Blocks.RED_TERRACOTTA), mcLoc(Blocks.RED_TERRACOTTA));
        stairsBlock(TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.RED_TERRACOTTA));
        slabBlock(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BLACK_TERRACOTTA), mcLoc(Blocks.BLACK_TERRACOTTA));
        stairsBlock(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BLACK_TERRACOTTA));
        
        slabBlock(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), mcLoc(Blocks.WHITE_CONCRETE), mcLoc(Blocks.WHITE_CONCRETE));
        stairsBlock(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), mcLoc(Blocks.WHITE_CONCRETE));
        slabBlock(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), mcLoc(Blocks.ORANGE_CONCRETE), mcLoc(Blocks.ORANGE_CONCRETE));
        stairsBlock(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), mcLoc(Blocks.ORANGE_CONCRETE));
        slabBlock(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), mcLoc(Blocks.MAGENTA_CONCRETE), mcLoc(Blocks.MAGENTA_CONCRETE));
        stairsBlock(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), mcLoc(Blocks.MAGENTA_CONCRETE));
        slabBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), mcLoc(Blocks.LIGHT_BLUE_CONCRETE), mcLoc(Blocks.LIGHT_BLUE_CONCRETE));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIGHT_BLUE_CONCRETE));
        slabBlock(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), mcLoc(Blocks.YELLOW_CONCRETE), mcLoc(Blocks.YELLOW_CONCRETE));
        stairsBlock(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), mcLoc(Blocks.YELLOW_CONCRETE));
        slabBlock(TaloiBlocks.LIME_CONCRETE_SLAB.get(), mcLoc(Blocks.LIME_CONCRETE), mcLoc(Blocks.LIME_CONCRETE));
        stairsBlock(TaloiBlocks.LIME_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIME_CONCRETE));
        slabBlock(TaloiBlocks.PINK_CONCRETE_SLAB.get(), mcLoc(Blocks.PINK_CONCRETE), mcLoc(Blocks.PINK_CONCRETE));
        stairsBlock(TaloiBlocks.PINK_CONCRETE_STAIRS.get(), mcLoc(Blocks.PINK_CONCRETE));
        slabBlock(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), mcLoc(Blocks.GRAY_CONCRETE), mcLoc(Blocks.GRAY_CONCRETE));
        stairsBlock(TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), mcLoc(Blocks.GRAY_CONCRETE));
        slabBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), mcLoc(Blocks.LIGHT_GRAY_CONCRETE), mcLoc(Blocks.LIGHT_GRAY_CONCRETE));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIGHT_GRAY_CONCRETE));
        slabBlock(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), mcLoc(Blocks.CYAN_CONCRETE), mcLoc(Blocks.CYAN_CONCRETE));
        stairsBlock(TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), mcLoc(Blocks.CYAN_CONCRETE));
        slabBlock(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), mcLoc(Blocks.PURPLE_CONCRETE), mcLoc(Blocks.PURPLE_CONCRETE));
        stairsBlock(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), mcLoc(Blocks.PURPLE_CONCRETE));
        slabBlock(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), mcLoc(Blocks.BLUE_CONCRETE), mcLoc(Blocks.BLUE_CONCRETE));
        stairsBlock(TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), mcLoc(Blocks.BLUE_CONCRETE));
        slabBlock(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), mcLoc(Blocks.BROWN_CONCRETE), mcLoc(Blocks.BROWN_CONCRETE));
        stairsBlock(TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), mcLoc(Blocks.BROWN_CONCRETE));
        slabBlock(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), mcLoc(Blocks.GREEN_CONCRETE), mcLoc(Blocks.GREEN_CONCRETE));
        stairsBlock(TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), mcLoc(Blocks.GREEN_CONCRETE));
        slabBlock(TaloiBlocks.RED_CONCRETE_SLAB.get(), mcLoc(Blocks.RED_CONCRETE), mcLoc(Blocks.RED_CONCRETE));
        stairsBlock(TaloiBlocks.RED_CONCRETE_STAIRS.get(), mcLoc(Blocks.RED_CONCRETE));
        slabBlock(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), mcLoc(Blocks.BLACK_CONCRETE), mcLoc(Blocks.BLACK_CONCRETE));
        stairsBlock(TaloiBlocks.BLACK_CONCRETE_STAIRS.get(), mcLoc(Blocks.BLACK_CONCRETE));

        // MISCELLANEOUS
        simpleBlock(TaloiBlocks.BOUNCY_BLOCK.get());
        simpleBlock(TaloiBlocks.FEATHERY_BLOCK.get());
        simpleBlock(TaloiBlocks.GRAVITY_BLOCK.get());
        simpleBlock(TaloiBlocks.SPEEDY_BLOCK.get());
    }

    public void fenceBlock(RegistryObject<FenceBlock> block, ResourceLocation texture) {
        super.fenceBlock(block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
    }

    public void buttonBlock(RegistryObject<ButtonBlock> block, ResourceLocation texture) {
        super.buttonBlock(block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
    }

    public void wallBlock(RegistryObject<WallBlock> block, ResourceLocation texture) {
        super.wallBlock(block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
    }

    public ResourceLocation blockLoc(RegistryObject<? extends Block> block) {
        return super.modLoc("block/" + block.getId().getPath());
    }

    public ResourceLocation blockLoc(RegistryObject<? extends Block> block, String suffix) {
        return super.modLoc("block/" + block.getId().getPath() + "_" + suffix);
    }

    public ResourceLocation mcLoc(Block block) {
        return super.mcLoc("block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath());
    }
}
