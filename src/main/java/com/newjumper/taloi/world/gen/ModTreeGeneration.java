package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.world.features.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID)
public class ModTreeGeneration {
    @SubscribeEvent
    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
        if(types.contains(BiomeDictionary.Type.CONIFEROUS)) base.add(ModPlacedFeatures.EVERGREEN_PLACED);
        if(types.contains(BiomeDictionary.Type.SAVANNA)) base.add(ModPlacedFeatures.WILLOW_PLACED);
    }
}
