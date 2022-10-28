package com.newjumper.taloi.painting;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<PaintingVariant> SPACE = PAINTINGS.register("space", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> THE_PROCESS = PAINTINGS.register("the_process", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> TOMATO = PAINTINGS.register("tomato", () -> new PaintingVariant(32, 32));
}
