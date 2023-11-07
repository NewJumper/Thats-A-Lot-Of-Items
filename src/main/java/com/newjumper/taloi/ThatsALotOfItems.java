package com.newjumper.taloi;

import com.newjumper.taloi.content.TaloiBlocks;
import com.newjumper.taloi.content.TaloiPaintings;
import com.newjumper.taloi.datagen.assets.ENLanguageProvider;
import com.newjumper.taloi.datagen.assets.TaloiBlockStateProvider;
import com.newjumper.taloi.datagen.assets.TaloiItemModelProvider;
import com.newjumper.taloi.datagen.data.TaloiBlockTagsProvider;
import com.newjumper.taloi.datagen.data.TaloiItemTagsProvider;
import com.newjumper.taloi.datagen.data.TaloiLootTableProvider;
import com.newjumper.taloi.datagen.data.TaloiRecipesProvider;
import com.newjumper.taloi.util.TaloiCreativeTab;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ThatsALotOfItems.MOD_ID)
public class ThatsALotOfItems {
    public static final String MOD_ID = "taloi";

    public ThatsALotOfItems() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TaloiCreativeTab.CREATIVE_MODE_TABS.register(eventBus);
        TaloiBlocks.BLOCKS.register(eventBus);
        TaloiBlocks.ITEMS.register(eventBus);
        TaloiPaintings.PAINTINGS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(TaloiCreativeTab::buildCreativeTab);
        eventBus.addListener(this::generateData);
    }

    private void generateData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // assets
        generator.addProvider(event.includeClient(), new ENLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new TaloiBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new TaloiItemModelProvider(packOutput, fileHelper));

        // data
        TaloiBlockTagsProvider blockTags = new TaloiBlockTagsProvider(packOutput, event.getLookupProvider(), fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new TaloiItemTagsProvider(packOutput, event.getLookupProvider(), blockTags, fileHelper));

        generator.addProvider(event.includeServer(), new TaloiLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new TaloiRecipesProvider(packOutput));
    }
}
