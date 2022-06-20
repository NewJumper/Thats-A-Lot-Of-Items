package com.newjumper.taloi.event;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.screen.*;
import com.newjumper.taloi.util.ModItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaloiClientEvents {
    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(TaloiBlocks.EVERGREEN_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TaloiBlocks.EVERGREEN_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TaloiBlocks.WILLOW_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TaloiBlocks.WILLOW_LEAVES.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.CONSTRUCTOR_MENU.get(), ConstructorScreen::new);
        MenuScreens.register(ModMenuTypes.UNSTABLE_CONSTRUCTOR_MENU.get(), UnstableConstructorScreen::new);
        MenuScreens.register(ModMenuTypes.HYDRAULIC_PRESS_MENU.get(), HydraulicPressScreen::new);
        MenuScreens.register(ModMenuTypes.UNSTABLE_HYDRAULIC_PRESS_MENU.get(), UnstableHydraulicPressScreen::new);
        MenuScreens.register(ModMenuTypes.PROCESSOR_MENU.get(), ProcessorScreen::new);
        MenuScreens.register(ModMenuTypes.SEPARATOR_MENU.get(), SeparatorScreen::new);

        ModItemProperties.addItemProperties();
    }
}
