package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.world.features.TaloiPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID)
public class TaloiTreeGeneration {
    @SubscribeEvent
    public static void generateTrees(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        if(event.getName().equals(Biomes.SNOWY_PLAINS.location())) base.add(TaloiPlacedFeatures.EVERGREEN_PLACED);
        if(event.getName().equals(Biomes.MEADOW.location())) base.add(TaloiPlacedFeatures.WILLOW_PLACED);
    }
}
