package com.newjumper.taloi.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.data.loottables.LootTablesProvider;
import com.newjumper.taloi.data.models.*;
import com.newjumper.taloi.data.recipes.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        // loot tables
        generator.addProvider(new LootTablesProvider(generator));

        // models
        generator.addProvider(new ModBlockStateProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(new ModItemModelProvider(generator, event.getExistingFileHelper()));

        // recipes
        generator.addProvider(new CraftingRecipesProvider(generator));
        generator.addProvider(new SmeltingRecipesProvider(generator));
        generator.addProvider(new StonecuttingRecipesProvider(generator));
    }
}
