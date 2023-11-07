package com.newjumper.taloi.util;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TaloiCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThatsALotOfItems.MOD_ID);
    public static final RegistryObject<CreativeModeTab> DEEPER_DARKER = CREATIVE_MODE_TABS.register("deeper_darker", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + ThatsALotOfItems.MOD_ID)).icon(() -> new ItemStack(TaloiBlocks.OAK_WOOD_STAIRS.get())).build());

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == DEEPER_DARKER.get()) {
            TaloiBlocks.BLOCKS.getEntries().forEach(event::accept);
        }
    }
}
