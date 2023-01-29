package com.newjumper.taloi.sound;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThatsALotOfItems.MOD_ID);

    public static RegistryObject<SoundEvent> THE_CAVES = registerSoundEvent();

    private static RegistryObject<SoundEvent> registerSoundEvent() {
        return SOUND_EVENTS.register("the_caves", () -> new SoundEvent(new ResourceLocation(ThatsALotOfItems.MOD_ID, "the_caves")));
    }
}
