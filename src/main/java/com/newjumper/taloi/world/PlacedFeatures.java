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

    public static final RegistryObject<PlacedFeature> EVERGREEN_PLANT = PlacedFeatures.PLACED_FEATURES.register("evergreen_plant", () -> new PlacedFeature(ConfiguredFeatures.EVERGREEN.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(TaloiBlocks.EVERGREEN_SAPLING.get()))));
    public static final RegistryObject<PlacedFeature> WILLOW_PLANT = PlacedFeatures.PLACED_FEATURES.register("willow_plant", () -> new PlacedFeature(ConfiguredFeatures.WILLOW.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(TaloiBlocks.WILLOW_SAPLING.get()))));
    public static final RegistryObject<PlacedFeature> TREE_EVERGREEN = PLACED_FEATURES.register("tree_evergreen", () -> new PlacedFeature(ConfiguredFeatures.EVERGREEN_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1))));
    public static final RegistryObject<PlacedFeature> TREE_WILLOW = PLACED_FEATURES.register("tree_willow", () -> new PlacedFeature(ConfiguredFeatures.WILLOW_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1))));

    public static final RegistryObject<PlacedFeature> ORE_LIMESTONE = PLACED_FEATURES.register("ore_limestone", () -> new PlacedFeature(ConfiguredFeatures.LIMESTONE.getHolder().get(), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62)))));
    public static final RegistryObject<PlacedFeature> ORE_MARBLE = PLACED_FEATURES.register("ore_marble", () -> new PlacedFeature(ConfiguredFeatures.MARBLE.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62)))));
    public static final RegistryObject<PlacedFeature> ORE_SLATE = PLACED_FEATURES.register("ore_slate", () -> new PlacedFeature(ConfiguredFeatures.SLATE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64)))));

    public static final RegistryObject<PlacedFeature> ORE_ALUMINUM = PLACED_FEATURES.register("ore_aluminum", () -> new PlacedFeature(ConfiguredFeatures.ORE_ALUMINUM.getHolder().get(), commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(164), VerticalAnchor.aboveBottom(320)))));
    public static final RegistryObject<PlacedFeature> ORE_ALUMINUM_LARGE = PLACED_FEATURES.register("ore_aluminum_large", () -> new PlacedFeature(ConfiguredFeatures.ORE_ALUMINUM_LARGE.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(192)))));
    public static final RegistryObject<PlacedFeature> ORE_IRIDIUM = PLACED_FEATURES.register("ore_iridium", () -> new PlacedFeature(ConfiguredFeatures.ORE_IRIDIUM.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-96), VerticalAnchor.aboveBottom(96)))));
    public static final RegistryObject<PlacedFeature> ORE_LEAD = PLACED_FEATURES.register("ore_lead", () -> new PlacedFeature(ConfiguredFeatures.ORE_LEAD.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(100), VerticalAnchor.aboveBottom(320)))));
    public static final RegistryObject<PlacedFeature> ORE_LEAD_LARGE = PLACED_FEATURES.register("ore_lead_large", () -> new PlacedFeature(ConfiguredFeatures.ORE_LEAD_LARGE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(48), VerticalAnchor.aboveBottom(104)))));
    public static final RegistryObject<PlacedFeature> ORE_MAGNESIUM = PLACED_FEATURES.register("ore_magnesium", () -> new PlacedFeature(ConfiguredFeatures.ORE_MAGNESIUM.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(48), VerticalAnchor.aboveBottom(320)))));
    public static final RegistryObject<PlacedFeature> ORE_OSMIUM = PLACED_FEATURES.register("ore_osmium", () -> new PlacedFeature(ConfiguredFeatures.ORE_OSMIUM.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-96), VerticalAnchor.aboveBottom(96)))));
    public static final RegistryObject<PlacedFeature> ORE_OSMIUM_BURIED = PLACED_FEATURES.register("ore_osmium_buried", () -> new PlacedFeature(ConfiguredFeatures.ORE_OSMIUM_BURIED.getHolder().get(), rareOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));
    public static final RegistryObject<PlacedFeature> ORE_PLATINUM = PLACED_FEATURES.register("ore_platinum", () -> new PlacedFeature(ConfiguredFeatures.ORE_PLATINUM.getHolder().get(), commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(4), VerticalAnchor.aboveBottom(96)))));
    public static final RegistryObject<PlacedFeature> ORE_SILICON = PLACED_FEATURES.register("ore_silicon", () -> new PlacedFeature(ConfiguredFeatures.ORE_SILICON.getHolder().get(), commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(64)))));
    public static final RegistryObject<PlacedFeature> ORE_TIN = PLACED_FEATURES.register("ore_tin", () -> new PlacedFeature(ConfiguredFeatures.ORE_TIN.getHolder().get(), commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(34), VerticalAnchor.aboveBottom(164)))));
    public static final RegistryObject<PlacedFeature> ORE_TUNGSTEN = PLACED_FEATURES.register("ore_tungsten", () -> new PlacedFeature(ConfiguredFeatures.ORE_TUNGSTEN.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-74), VerticalAnchor.aboveBottom(74)))));
    public static final RegistryObject<PlacedFeature> ORE_TUNGSTEN_LARGE = PLACED_FEATURES.register("ore_tungsten_large", () -> new PlacedFeature(ConfiguredFeatures.ORE_TUNGSTEN_LARGE.getHolder().get(), rareOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32)))));
    public static final RegistryObject<PlacedFeature> ORE_URANIUM = PLACED_FEATURES.register("ore_uranium", () -> new PlacedFeature(ConfiguredFeatures.ORE_URANIUM.getHolder().get(), commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(30)))));
    public static final RegistryObject<PlacedFeature> ORE_URANIUM_SMALL = PLACED_FEATURES.register("ore_uranium_small", () -> new PlacedFeature(ConfiguredFeatures.ORE_URANIUM_SMALL.getHolder().get(), commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));
    public static final RegistryObject<PlacedFeature> ORE_ZINC = PLACED_FEATURES.register("ore_zinc", () -> new PlacedFeature(ConfiguredFeatures.ORE_ZINC.getHolder().get(), commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(128)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier range) {
        return List.of(modifier, InSquarePlacement.spread(), range, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int attempts, PlacementModifier range) {
        return orePlacement(CountPlacement.of(attempts), range);
    }

    public static List<PlacementModifier> rareOrePlacement(int chances, PlacementModifier range) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chances), range);
    }
}
