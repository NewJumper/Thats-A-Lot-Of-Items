package com.newjumper.taloi.event;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.event.loot.TheCavesAddition;
import com.newjumper.taloi.recipe.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(new TheCavesAddition.Serializer().setRegistryName(new ResourceLocation(ThatsALotOfItems.MOD_ID,"the_caves_from_dungeon")));
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> registryEvent) {
        Registry.register(Registry.RECIPE_TYPE, "constructing", ConstructingRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, "unstable_constructing", UnstableConstructingRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, "pressing", PressingRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, "unstable_pressing", UnstablePressingRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, "processing", ProcessingRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, "separating", SeparatingRecipe.Type.INSTANCE);
    }
}
