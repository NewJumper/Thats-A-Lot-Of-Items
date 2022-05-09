package com.newjumper.taloi.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.data.loot.ModLootTableProvider;
import com.newjumper.taloi.data.models.*;
import com.newjumper.taloi.data.recipes.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // loot tables
        generator.addProvider(new ModLootTableProvider(generator));

        // models
        generator.addProvider(new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(new ModItemModelProvider(generator, fileHelper));

        // recipes
        generator.addProvider(new CraftingRecipesProvider(generator));
        generator.addProvider(new SmeltingRecipesProvider(generator));
        generator.addProvider(new SmithingRecipesProvider(generator));
        generator.addProvider(new StonecuttingRecipesProvider(generator));
    }
}
