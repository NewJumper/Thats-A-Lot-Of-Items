package com.newjumper.taloi.world.features;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    // EVERGREEN
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EVERGREEN_TREE = FeatureUtils.register("evergreen", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.EVERGREEN_LOG.get()),
            new StraightTrunkPlacer(10, 3, 5),
            BlockStateProvider.simple(ModBlocks.EVERGREEN_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final Holder<PlacedFeature> EVERGREEN_CHECKED = PlacementUtils.register("evergreen_checked", EVERGREEN_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.EVERGREEN_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EVERGREEN_SPAWN = FeatureUtils.register("evergreen_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EVERGREEN_CHECKED, 0.1f)), EVERGREEN_CHECKED));

    // WILLOW
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WILLOW_TREE = FeatureUtils.register("willow", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
            new StraightTrunkPlacer(5, 3, 4),
            BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final Holder<PlacedFeature> WILLOW_CHECKED = PlacementUtils.register("willow_checked", WILLOW_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> WILLOW_SPAWN = FeatureUtils.register("willow_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(WILLOW_CHECKED, 0.1f)), WILLOW_CHECKED));
}
