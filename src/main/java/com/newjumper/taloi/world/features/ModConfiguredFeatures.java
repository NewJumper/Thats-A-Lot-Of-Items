package com.newjumper.taloi.world.features;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> EVERGREEN = register("evergreen", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
        new SimpleStateProvider(ModBlocks.EVERGREEN_LOG.get().defaultBlockState()),
        new StraightTrunkPlacer(10, 3, 5),
        new SimpleStateProvider(ModBlocks.EVERGREEN_LEAVES.get().defaultBlockState()),
        new SimpleStateProvider(ModBlocks.EVERGREEN_SAPLING.get().defaultBlockState()),
        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
        new TwoLayersFeatureSize(1, 0, 1)).build()));

    public static final ConfiguredFeature<?, ?> WILLOW = register("willow", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(ModBlocks.WILLOW_LOG.get().defaultBlockState()),
            new StraightTrunkPlacer(5, 3, 4),
            new SimpleStateProvider(ModBlocks.WILLOW_LEAVES.get().defaultBlockState()),
            new SimpleStateProvider(ModBlocks.WILLOW_SAPLING.get().defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).build()));

    private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }
}
