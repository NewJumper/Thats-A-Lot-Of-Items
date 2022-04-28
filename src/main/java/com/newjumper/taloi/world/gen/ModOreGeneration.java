package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.world.features.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.PEAK) || types.contains(BiomeDictionary.Type.MOUNTAIN) || types.contains(BiomeDictionary.Type.WASTELAND)) {
            base.add(ModPlacedFeatures.ORE_LEAD_LARGE);
            base.add(ModPlacedFeatures.ORE_TUNGSTEN_LARGE);
            base.add(ModPlacedFeatures.ORE_URANIUM);
        }

        if(types.contains(BiomeDictionary.Type.MESA)) {
            base.add(ModPlacedFeatures.ORE_LEAD_LARGE);
            base.add(ModPlacedFeatures.ORE_ALUMINUM_LARGE);
        }

        base.add(ModPlacedFeatures.ORE_ALUMINUM);
        base.add(ModPlacedFeatures.ORE_IRIDIUM);
        base.add(ModPlacedFeatures.ORE_LEAD);
        base.add(ModPlacedFeatures.ORE_MAGNESIUM);
        base.add(ModPlacedFeatures.ORE_OSMIUM);
        base.add(ModPlacedFeatures.ORE_OSMIUM_BURIED);
        base.add(ModPlacedFeatures.ORE_PLATINUM);
        base.add(ModPlacedFeatures.ORE_SILICON);
        base.add(ModPlacedFeatures.ORE_TIN);
        base.add(ModPlacedFeatures.ORE_TUNGSTEN);
        base.add(ModPlacedFeatures.ORE_URANIUM_SMALL);
        base.add(ModPlacedFeatures.ORE_ZINC);
    }
}
