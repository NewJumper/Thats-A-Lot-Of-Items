package com.newjumper.taloi.world;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<PlacedFeature> EVERGREEN_PLANT = PLACED_FEATURES.register("evergreen_plant", () -> new PlacedFeature(ConfiguredFeatures.EVERGREEN.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(TaloiBlocks.EVERGREEN_SAPLING.get()))));
    public static final RegistryObject<PlacedFeature> WILLOW_PLANT = PLACED_FEATURES.register("willow_plant", () -> new PlacedFeature(ConfiguredFeatures.WILLOW.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(TaloiBlocks.WILLOW_SAPLING.get()))));
    public static final RegistryObject<PlacedFeature> TREE_EVERGREEN = PLACED_FEATURES.register("tree_evergreen", () -> new PlacedFeature(ConfiguredFeatures.EVERGREEN_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1))));
    public static final RegistryObject<PlacedFeature> TREE_WILLOW = PLACED_FEATURES.register("tree_willow", () -> new PlacedFeature(ConfiguredFeatures.WILLOW_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1))));

    public static final RegistryObject<PlacedFeature> ORE_LIMESTONE = PLACED_FEATURES.register("ore_limestone", () -> new PlacedFeature(ConfiguredFeatures.LIMESTONE.getHolder().get(), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62)))));
    public static final RegistryObject<PlacedFeature> ORE_MARBLE = PLACED_FEATURES.register("ore_marble", () -> new PlacedFeature(ConfiguredFeatures.MARBLE.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62)))));
    public static final RegistryObject<PlacedFeature> ORE_SLATE = PLACED_FEATURES.register("ore_slate", () -> new PlacedFeature(ConfiguredFeatures.SLATE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier range) {
        return List.of(modifier, InSquarePlacement.spread(), range, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int attempts, PlacementModifier range) {
        return orePlacement(CountPlacement.of(attempts), range);
    }
}
