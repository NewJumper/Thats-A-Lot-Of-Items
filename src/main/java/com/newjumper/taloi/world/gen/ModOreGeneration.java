package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.world.features.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.ORE_LIMESTONE);
        base.add(ModPlacedFeatures.ORE_MARBLE);
        base.add(ModPlacedFeatures.ORE_SLATE);

        base.add(ModPlacedFeatures.ORE_ALUMINUM);
        base.add(ModPlacedFeatures.ORE_ALUMINUM_LARGE);
        base.add(ModPlacedFeatures.ORE_IRIDIUM);
        base.add(ModPlacedFeatures.ORE_LEAD);
        base.add(ModPlacedFeatures.ORE_LEAD_LARGE);
        base.add(ModPlacedFeatures.ORE_MAGNESIUM);
        base.add(ModPlacedFeatures.ORE_OSMIUM);
        base.add(ModPlacedFeatures.ORE_OSMIUM_BURIED);
        base.add(ModPlacedFeatures.ORE_PLATINUM);
        base.add(ModPlacedFeatures.ORE_SILICON);
        base.add(ModPlacedFeatures.ORE_TIN);
        base.add(ModPlacedFeatures.ORE_TUNGSTEN);
        base.add(ModPlacedFeatures.ORE_TUNGSTEN_LARGE);
        base.add(ModPlacedFeatures.ORE_URANIUM);
        base.add(ModPlacedFeatures.ORE_URANIUM_SMALL);
        base.add(ModPlacedFeatures.ORE_ZINC);
    }
}
