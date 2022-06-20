package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.world.features.TaloiPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
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

        if(biomeCheck(event.getName(), Biomes.SNOWY_PLAINS)) base.add(TaloiPlacedFeatures.EVERGREEN_PLACED);
        if(biomeCheck(event.getName(), Biomes.MEADOW)) base.add(TaloiPlacedFeatures.WILLOW_PLACED);
    }
    public static boolean biomeCheck(ResourceLocation location, ResourceKey<Biome> key){
        return location.getPath().matches(key.location().getPath());
    }
}
