package com.newjumper.taloi.world.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> EVERGREEN_PLACED = PlacementUtils.register("evergreen_placed", ModConfiguredFeatures.EVERGREEN_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));
    public static final Holder<PlacedFeature> WILLOW_PLACED = PlacementUtils.register("willow_placed", ModConfiguredFeatures.WILLOW_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1)));
}
