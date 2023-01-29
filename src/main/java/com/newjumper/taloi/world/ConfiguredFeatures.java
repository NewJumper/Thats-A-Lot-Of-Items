package com.newjumper.taloi.world;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.core.Registry;
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.NATURAL_STONE;

public class ConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> EVERGREEN = CONFIGURED_FEATURES.register("evergreen", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LOG.get()), new StraightTrunkPlacer(6, 2, 1), BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LEAVES.get()), new SpruceFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(1), UniformInt.of(1, 2)), new TwoLayersFeatureSize(1, 0, 1)).build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> WILLOW = CONFIGURED_FEATURES.register("willow", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(TaloiBlocks.WILLOW_LOG.get()), new FancyTrunkPlacer(3, 11, 0), BlockStateProvider.simple(TaloiBlocks.WILLOW_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(1, 0, 1)).build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> EVERGREEN_SPAWN = CONFIGURED_FEATURES.register("evergreen_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PlacedFeatures.EVERGREEN_PLANT.getHolder().get(), 0.1f)), PlacedFeatures.EVERGREEN_PLANT.getHolder().get())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> WILLOW_SPAWN = CONFIGURED_FEATURES.register("willow_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PlacedFeatures.WILLOW_PLANT.getHolder().get(), 0.1f)), PlacedFeatures.WILLOW_PLANT.getHolder().get())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIMESTONE = CONFIGURED_FEATURES.register("limestone", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.LIMESTONE.get().defaultBlockState(), 24)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> MARBLE = CONFIGURED_FEATURES.register("marble", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.MARBLE.get().defaultBlockState(), 13)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SLATE = CONFIGURED_FEATURES.register("slate", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.SLATE.get().defaultBlockState(), 24)));
}
