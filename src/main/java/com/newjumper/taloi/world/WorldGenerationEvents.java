package com.newjumper.taloi.world;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.world.gen.ModOreGeneration;
import com.newjumper.taloi.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID)
public class WorldGenerationEvents {
    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }
}
