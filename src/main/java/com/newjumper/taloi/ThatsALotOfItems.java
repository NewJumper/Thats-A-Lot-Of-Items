package com.newjumper.taloi;

import com.mojang.logging.LogUtils;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.painting.TaloiPaintings;
import com.newjumper.taloi.recipe.ModRecipes;
import com.newjumper.taloi.screen.*;
import com.newjumper.taloi.sound.ModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ThatsALotOfItems.MOD_ID)
public class ThatsALotOfItems {
    public static final String MOD_ID = "taloi";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ThatsALotOfItems() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TaloiBlocks.register(eventBus);
        TaloiItems.register(eventBus);
        TaloiBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        TaloiPaintings.register(eventBus);
        ModRecipes.register(eventBus);
        ModSounds.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
