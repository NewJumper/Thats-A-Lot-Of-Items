package com.newjumper.taloi.painting;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<Motive> SPACE = PAINTING_MOTIVES.register("space", () -> new Motive(32, 32));
    public static final RegistryObject<Motive> THE_PROCESS = PAINTING_MOTIVES.register("the_process", () -> new Motive(48, 48));
    public static final RegistryObject<Motive> TOMATO = PAINTING_MOTIVES.register("tomato", () -> new Motive(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
