package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.world.features.TaloiPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID)
public class TaloiOreGeneration {
    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(TaloiPlacedFeatures.ORE_LIMESTONE);
        base.add(TaloiPlacedFeatures.ORE_MARBLE);
        base.add(TaloiPlacedFeatures.ORE_SLATE);

        base.add(TaloiPlacedFeatures.ORE_ALUMINUM);
        base.add(TaloiPlacedFeatures.ORE_ALUMINUM_LARGE);
        base.add(TaloiPlacedFeatures.ORE_IRIDIUM);
        base.add(TaloiPlacedFeatures.ORE_LEAD);
        base.add(TaloiPlacedFeatures.ORE_LEAD_LARGE);
        base.add(TaloiPlacedFeatures.ORE_MAGNESIUM);
        base.add(TaloiPlacedFeatures.ORE_OSMIUM);
        base.add(TaloiPlacedFeatures.ORE_OSMIUM_BURIED);
        base.add(TaloiPlacedFeatures.ORE_PLATINUM);
        base.add(TaloiPlacedFeatures.ORE_SILICON);
        base.add(TaloiPlacedFeatures.ORE_TIN);
        base.add(TaloiPlacedFeatures.ORE_TUNGSTEN);
        base.add(TaloiPlacedFeatures.ORE_TUNGSTEN_LARGE);
        base.add(TaloiPlacedFeatures.ORE_URANIUM);
        base.add(TaloiPlacedFeatures.ORE_URANIUM_SMALL);
        base.add(TaloiPlacedFeatures.ORE_ZINC);
    }
}
