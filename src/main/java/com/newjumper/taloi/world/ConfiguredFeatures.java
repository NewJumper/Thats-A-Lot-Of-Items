package com.newjumper.taloi.world;

import com.google.common.base.Suppliers;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
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
import java.util.function.Supplier;

import static net.minecraft.data.worldgen.features.OreFeatures.NATURAL_STONE;
import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public class ConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ThatsALotOfItems.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ALUMINUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> IRIDIUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.IRIDIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> LEAD_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> MAGNESIUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.MAGNESIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OSMIUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> PLATINUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> SILICON_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.SILICON_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_SILICON_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> TIN_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> TUNGSTEN_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.TUNGSTEN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> URANIUM_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ZINC_TARGET_LIST = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, TaloiBlocks.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TaloiBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> EVERGREEN = CONFIGURED_FEATURES.register("evergreen", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LOG.get()), new StraightTrunkPlacer(6, 2, 1), BlockStateProvider.simple(TaloiBlocks.EVERGREEN_LEAVES.get()), new SpruceFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(1), UniformInt.of(1, 2)), new TwoLayersFeatureSize(1, 0, 1)).build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> WILLOW = CONFIGURED_FEATURES.register("willow", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(TaloiBlocks.WILLOW_LOG.get()), new FancyTrunkPlacer(3, 11, 0), BlockStateProvider.simple(TaloiBlocks.WILLOW_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(1, 0, 1)).build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> EVERGREEN_SPAWN = CONFIGURED_FEATURES.register("evergreen_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PlacedFeatures.EVERGREEN_PLANT.getHolder().get(), 0.1f)), PlacedFeatures.EVERGREEN_PLANT.getHolder().get())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> WILLOW_SPAWN = CONFIGURED_FEATURES.register("willow_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PlacedFeatures.WILLOW_PLANT.getHolder().get(), 0.1f)), PlacedFeatures.WILLOW_PLANT.getHolder().get())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIMESTONE = CONFIGURED_FEATURES.register("limestone", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.LIMESTONE.get().defaultBlockState(), 24)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> MARBLE = CONFIGURED_FEATURES.register("marble", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.MARBLE.get().defaultBlockState(), 13)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SLATE = CONFIGURED_FEATURES.register("slate", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NATURAL_STONE, TaloiBlocks.SLATE.get().defaultBlockState(), 24)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_ALUMINUM = CONFIGURED_FEATURES.register("aluminum_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ALUMINUM_TARGET_LIST.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_ALUMINUM_LARGE = CONFIGURED_FEATURES.register("aluminum_ore_large", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ALUMINUM_TARGET_LIST.get(), 9, 0.5f)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_IRIDIUM = CONFIGURED_FEATURES.register("iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(IRIDIUM_TARGET_LIST.get(), 5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_LEAD = CONFIGURED_FEATURES.register("lead_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(LEAD_TARGET_LIST.get(), 5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_LEAD_LARGE = CONFIGURED_FEATURES.register("lead_ore_large", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(LEAD_TARGET_LIST.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_MAGNESIUM = CONFIGURED_FEATURES.register("magnesium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(MAGNESIUM_TARGET_LIST.get(), 6)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_OSMIUM = CONFIGURED_FEATURES.register("osmium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OSMIUM_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_OSMIUM_BURIED = CONFIGURED_FEATURES.register("osmium_ore_buried", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OSMIUM_TARGET_LIST.get(), 5, 0.9f)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_PLATINUM = CONFIGURED_FEATURES.register("platinum_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(PLATINUM_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_SILICON = CONFIGURED_FEATURES.register("silicon_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SILICON_TARGET_LIST.get(), 5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_TIN = CONFIGURED_FEATURES.register("tin_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TIN_TARGET_LIST.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_TUNGSTEN = CONFIGURED_FEATURES.register("tungsten_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TUNGSTEN_TARGET_LIST.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_TUNGSTEN_LARGE = CONFIGURED_FEATURES.register("tungsten_ore_large", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TUNGSTEN_TARGET_LIST.get(), 7, 0.8f)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_URANIUM = CONFIGURED_FEATURES.register("uranium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(URANIUM_TARGET_LIST.get(), 5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_URANIUM_SMALL = CONFIGURED_FEATURES.register("uranium_ore_small", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(URANIUM_TARGET_LIST.get(), 2, 0.5f)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_ZINC = CONFIGURED_FEATURES.register("zinc_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ZINC_TARGET_LIST.get(), 7)));
}
