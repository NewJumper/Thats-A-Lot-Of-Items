package com.newjumper.taloi.world.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    // TREES
    public static final Holder<PlacedFeature> EVERGREEN_PLACED = PlacementUtils.register("evergreen_placed", ModConfiguredFeatures.EVERGREEN_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));
    public static final Holder<PlacedFeature> WILLOW_PLACED = PlacementUtils.register("willow_placed", ModConfiguredFeatures.WILLOW_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));

    // NATURAL
    public static final Holder<PlacedFeature> ORE_LIMESTONE = PlacementUtils.register("ore_limestone", ModConfiguredFeatures.LIMESTONE, ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62))));
    public static final Holder<PlacedFeature> ORE_MARBLE = PlacementUtils.register("ore_marble", ModConfiguredFeatures.MARBLE, ModOrePlacement.commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(62))));
    public static final Holder<PlacedFeature> ORE_SLATE = PlacementUtils.register("ore_slate", ModConfiguredFeatures.SLATE, ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))));

    // ORES
    public static final Holder<PlacedFeature> ORE_ALUMINUM = PlacementUtils.register("ore_aluminum", ModConfiguredFeatures.ORE_ALUMINUM, ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(164), VerticalAnchor.aboveBottom(320))));
    public static final Holder<PlacedFeature> ORE_ALUMINUM_LARGE = PlacementUtils.register("ore_aluminum_large", ModConfiguredFeatures.ORE_ALUMINUM_LARGE, ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(192))));
    public static final Holder<PlacedFeature> ORE_IRIDIUM = PlacementUtils.register("ore_iridium", ModConfiguredFeatures.ORE_IRIDIUM, ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-96), VerticalAnchor.aboveBottom(96))));
    public static final Holder<PlacedFeature> ORE_LEAD = PlacementUtils.register("ore_lead", ModConfiguredFeatures.ORE_LEAD, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(100), VerticalAnchor.aboveBottom(320))));
    public static final Holder<PlacedFeature> ORE_LEAD_LARGE = PlacementUtils.register("ore_lead_large", ModConfiguredFeatures.ORE_LEAD_LARGE, ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(48), VerticalAnchor.aboveBottom(104))));
    public static final Holder<PlacedFeature> ORE_MAGNESIUM = PlacementUtils.register("ore_magnesium", ModConfiguredFeatures.ORE_MAGNESIUM, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(48), VerticalAnchor.aboveBottom(320))));
    public static final Holder<PlacedFeature> ORE_OSMIUM = PlacementUtils.register("ore_osmium", ModConfiguredFeatures.ORE_OSMIUM, ModOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-96), VerticalAnchor.aboveBottom(96))));
    public static final Holder<PlacedFeature> ORE_OSMIUM_BURIED = PlacementUtils.register("ore_osmium_buried", ModConfiguredFeatures.ORE_OSMIUM_BURIED, ModOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64))));
    public static final Holder<PlacedFeature> ORE_PLATINUM = PlacementUtils.register("ore_platinum", ModConfiguredFeatures.ORE_PLATINUM, ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(4), VerticalAnchor.aboveBottom(96))));
    public static final Holder<PlacedFeature> ORE_SILICON = PlacementUtils.register("ore_silicon", ModConfiguredFeatures.ORE_SILICON, ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(64))));
    public static final Holder<PlacedFeature> ORE_TIN = PlacementUtils.register("ore_tin", ModConfiguredFeatures.ORE_TIN, ModOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(34), VerticalAnchor.aboveBottom(164))));
    public static final Holder<PlacedFeature> ORE_TUNGSTEN = PlacementUtils.register("ore_tungsten", ModConfiguredFeatures.ORE_TUNGSTEN, ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-74), VerticalAnchor.aboveBottom(74))));
    public static final Holder<PlacedFeature> ORE_TUNGSTEN_LARGE = PlacementUtils.register("ore_tungsten_large", ModConfiguredFeatures.ORE_TUNGSTEN_LARGE, ModOrePlacement.rareOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32))));
    public static final Holder<PlacedFeature> ORE_URANIUM = PlacementUtils.register("ore_uranium", ModConfiguredFeatures.ORE_URANIUM, ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(30))));
    public static final Holder<PlacedFeature> ORE_URANIUM_SMALL = PlacementUtils.register("ore_uranium_small", ModConfiguredFeatures.ORE_URANIUM_SMALL, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64))));
    public static final Holder<PlacedFeature> ORE_ZINC = PlacementUtils.register("ore_zinc", ModConfiguredFeatures.ORE_ZINC, ModOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(128))));
}
