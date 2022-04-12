package com.newjumper.taloi.event;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.event.loot.TheCavesAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(new TheCavesAdditionModifier.Serializer().setRegistryName(new ResourceLocation(ThatsALotOfItems.MOD_ID,"music_disc_the_caves_from_dungeon")));
    }
}
