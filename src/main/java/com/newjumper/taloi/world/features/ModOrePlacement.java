package com.newjumper.taloi.world.features;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier range) {
        return List.of(modifier, InSquarePlacement.spread(), range, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int attempts, PlacementModifier range) {
        return orePlacement(CountPlacement.of(attempts), range);
    }

    public static List<PlacementModifier> rareOrePlacement(int attempts, PlacementModifier range) {
        return orePlacement(RarityFilter.onAverageOnceEvery(attempts), range);
    }
}
