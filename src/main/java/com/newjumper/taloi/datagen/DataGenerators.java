package com.newjumper.taloi.datagen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.datagen.assets.ENLanguageProvider;
import com.newjumper.taloi.datagen.assets.ModBlockStateProvider;
import com.newjumper.taloi.datagen.assets.ModItemModelProvider;
import com.newjumper.taloi.datagen.assets.ModSoundsProvider;
import com.newjumper.taloi.datagen.data.ModAdvancementsProvider;
import com.newjumper.taloi.datagen.data.ModBlockTagsProvider;
import com.newjumper.taloi.datagen.data.ModItemTagsProvider;
import com.newjumper.taloi.datagen.data.ModLootTableProvider;
import com.newjumper.taloi.datagen.data.recipes.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // assets
        generator.addProvider(event.includeClient(), new ENLanguageProvider(generator));

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, fileHelper));

        generator.addProvider(event.includeClient(), new ModSoundsProvider(generator, fileHelper));

        // data
        generator.addProvider(event.includeServer(), new CraftingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new SmeltingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new SmithingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new StonecuttingRecipesProvider(generator));

        generator.addProvider(event.includeServer(), new ConstructingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new PressingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new ProcessingRecipesProvider(generator));
        generator.addProvider(event.includeServer(), new SeparatingRecipesProvider(generator));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, blockTags, fileHelper));

        generator.addProvider(event.includeServer(), new ModAdvancementsProvider(generator, fileHelper));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
    }
}
