package com.newjumper.taloi;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.block.entity.ModBlockEntities;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.painting.ModPaintings;
import com.newjumper.taloi.recipe.ModRecipes;
import com.newjumper.taloi.screen.*;
import com.newjumper.taloi.sound.ModSounds;
import com.newjumper.taloi.util.ModItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ThatsALotOfItems.MOD_ID)
public class ThatsALotOfItems {
    public static final String MOD_ID = "taloi";
    private static final Logger LOGGER = LogManager.getLogger();

    public ThatsALotOfItems() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModPaintings.register(eventBus);
        ModRecipes.register(eventBus);
        ModSounds.register(eventBus);

        eventBus.addListener(this::setupClient);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EVERGREEN_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EVERGREEN_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_LEAVES.get(), RenderType.cutout());

        ModItemProperties.addModItemProperties();

        MenuScreens.register(ModMenuTypes.CONSTRUCTOR_MENU.get(), ConstructorScreen::new);
        MenuScreens.register(ModMenuTypes.UNSTABLE_CONSTRUCTOR_MENU.get(), UnstableConstructorScreen::new);
        MenuScreens.register(ModMenuTypes.HYDRAULIC_PRESS_MENU.get(), HydraulicPressScreen::new);
        MenuScreens.register(ModMenuTypes.UNSTABLE_HYDRAULIC_PRESS_MENU.get(), UnstableHydraulicPressScreen::new);
        MenuScreens.register(ModMenuTypes.PROCESSOR_MENU.get(), ProcessorScreen::new);
    }
}
