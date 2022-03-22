/*
package com.newjumper.taloi.world.features;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> EVERGREEN = register("evergreen", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
        BlockStateProvider.simple(ModBlocks.EVERGREEN_LOG.get()),
        new StraightTrunkPlacer(10, 3, 5),
        BlockStateProvider.simple(ModBlocks.EVERGREEN_LEAVES.get().defaultBlockState()),
        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
        new TwoLayersFeatureSize(1, 0, 1)).build()));

    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> EVERGREEN_TREE_CHECKED =
            FeatureUtils.register("evergreen_feature", Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EVERGREEN.filteredByBlockSurvival(ModBlocks.EVERGREEN_SAPLING.get()), 0.1f)), EVERGREEN.filteredByBlockSurvival(ModBlocks.EVERGREEN_SAPLING.get()))));

    public static final ConfiguredFeature<?, ?> WILLOW = register("willow", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
            new StraightTrunkPlacer(5, 3, 4),
            BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get().defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).build()));

    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> WILLOW_TREE_CHECKED =
            FeatureUtils.register("willow_feature", Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(WILLOW.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()), 0.1f)), WILLOW.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()))));

    private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }
}
*/
