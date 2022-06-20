package com.newjumper.taloi.world.features;

import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.NATURAL_STONE;

public class TaloiConfiguredFeatures {
    // EVERGREEN
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EVERGREEN = FeatureUtils.register("evergreen", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LOG.get()),
            new StraightTrunkPlacer(6, 2, 1),
            BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LEAVES.get()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(1), UniformInt.of(1, 2)),
            new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final Holder<PlacedFeature> EVERGREEN_CHECKED = PlacementUtils.register("evergreen_checked", EVERGREEN, PlacementUtils.filteredByBlockSurvival(TaloiBlocks.EVERGREEN_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EVERGREEN_SPAWN = FeatureUtils.register("evergreen_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EVERGREEN_CHECKED, 0.1f)), EVERGREEN_CHECKED));

    // WILLOW
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WILLOW = FeatureUtils.register("willow", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(TaloiBlocks.WILLOW_LOG.get()),
            new FancyTrunkPlacer(3, 11, 0),
            BlockStateProvider.simple(TaloiBlocks.WILLOW_LEAVES.get()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
            new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final Holder<PlacedFeature> WILLOW_CHECKED = PlacementUtils.register("willow_checked", WILLOW, PlacementUtils.filteredByBlockSurvival(TaloiBlocks.WILLOW_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> WILLOW_SPAWN = FeatureUtils.register("willow_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(WILLOW_CHECKED, 0.1f)), WILLOW_CHECKED));

    // NATURAL
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LIMESTONE = FeatureUtils.register("limestone", Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.LIMESTONE.get().defaultBlockState(), 24));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MARBLE = FeatureUtils.register("marble", Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.MARBLE.get().defaultBlockState(), 13));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SLATE = FeatureUtils.register("slate", Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.SLATE.get().defaultBlockState(), 24));

    // ORES
    public static final List<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ALUMINUM = FeatureUtils.register("aluminum_ore", Feature.ORE, new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, 7));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ALUMINUM_LARGE = FeatureUtils.register("aluminum_ore_large", Feature.ORE, new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, 9, 0.5f));

    public static final List<OreConfiguration.TargetBlockState> ORE_IRIDIUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.IRIDIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_IRIDIUM = FeatureUtils.register("iridium_ore", Feature.ORE, new OreConfiguration(ORE_IRIDIUM_TARGET_LIST, 5));

    public static final List<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD = FeatureUtils.register("lead_ore", Feature.ORE, new OreConfiguration(ORE_LEAD_TARGET_LIST, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD_LARGE = FeatureUtils.register("lead_ore_large", Feature.ORE, new OreConfiguration(ORE_LEAD_TARGET_LIST, 7));

    public static final List<OreConfiguration.TargetBlockState> ORE_MAGNESIUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.MAGNESIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_MAGNESIUM = FeatureUtils.register("magnesium_ore", Feature.ORE, new OreConfiguration(ORE_MAGNESIUM_TARGET_LIST, 6));

    public static final List<OreConfiguration.TargetBlockState> ORE_OSMIUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_OSMIUM = FeatureUtils.register("osmium_ore", Feature.ORE, new OreConfiguration(ORE_OSMIUM_TARGET_LIST, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_OSMIUM_BURIED = FeatureUtils.register("osmium_ore_buried", Feature.ORE, new OreConfiguration(ORE_OSMIUM_TARGET_LIST, 5, 0.9f));

    public static final List<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_PLATINUM = FeatureUtils.register("platinum_ore", Feature.ORE, new OreConfiguration(ORE_PLATINUM_TARGET_LIST, 4));

    public static final List<OreConfiguration.TargetBlockState> ORE_SILICON_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.SILICON_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_SILICON_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILICON = FeatureUtils.register("silicon_ore", Feature.ORE, new OreConfiguration(ORE_SILICON_TARGET_LIST, 5));

    public static final List<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TIN = FeatureUtils.register("tin_ore", Feature.ORE, new OreConfiguration(ORE_TIN_TARGET_LIST, 8));

    public static final List<OreConfiguration.TargetBlockState> ORE_TUNGSTEN_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.TUNGSTEN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TUNGSTEN = FeatureUtils.register("tungsten_ore", Feature.ORE, new OreConfiguration(ORE_TUNGSTEN_TARGET_LIST, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TUNGSTEN_LARGE = FeatureUtils.register("tungsten_ore_large", Feature.ORE, new OreConfiguration(ORE_TUNGSTEN_TARGET_LIST, 7, 0.8f));

    public static final List<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM = FeatureUtils.register("uranium_ore", Feature.ORE, new OreConfiguration(ORE_URANIUM_TARGET_LIST, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM_SMALL = FeatureUtils.register("uranium_ore_small", Feature.ORE, new OreConfiguration(ORE_URANIUM_TARGET_LIST, 2, 0.5f));

    public static final List<OreConfiguration.TargetBlockState> ORE_ZINC_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TaloiBlocks.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ZINC = FeatureUtils.register("zinc_ore", Feature.ORE, new OreConfiguration(ORE_ZINC_TARGET_LIST, 7));
}
