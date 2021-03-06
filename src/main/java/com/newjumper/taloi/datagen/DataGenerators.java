package com.newjumper.taloi.datagen;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.datagen.advancements.ModAdvancementsProvider;
import com.newjumper.taloi.datagen.lang.ModLanguageProvider;
import com.newjumper.taloi.datagen.loot.ModLootTableProvider;
import com.newjumper.taloi.datagen.models.*;
import com.newjumper.taloi.datagen.recipes.*;
import com.newjumper.taloi.datagen.sounds.ModSoundsProvider;
import com.newjumper.taloi.datagen.tags.*;
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

        // advancements
        generator.addProvider(new ModAdvancementsProvider(generator, fileHelper));

        // languages
        generator.addProvider(new ModLanguageProvider(generator));

        // loot
        generator.addProvider(new ModLootTableProvider(generator));

        // models
        generator.addProvider(new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(new ModItemModelProvider(generator, fileHelper));

        // recipes
        generator.addProvider(new CraftingRecipesProvider(generator));
        generator.addProvider(new SmeltingRecipesProvider(generator));
        generator.addProvider(new SmithingRecipesProvider(generator));
        generator.addProvider(new StonecuttingRecipesProvider(generator));

        generator.addProvider(new ConstructingRecipesProvider(generator));
        generator.addProvider(new PressingRecipesProvider(generator));
        generator.addProvider(new ProcessingRecipesProvider(generator));
        generator.addProvider(new SeparatingRecipesProvider(generator));

        // sounds
        generator.addProvider(new ModSoundsProvider(generator, fileHelper));

        // tags
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, fileHelper);
        generator.addProvider(blockTags);
        generator.addProvider(new ModItemTagsProvider(generator, blockTags, fileHelper));
    }
}
