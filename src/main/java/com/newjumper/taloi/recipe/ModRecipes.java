package com.newjumper.taloi.recipe;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ConstructingRecipe>> CONSTRUCTING = RECIPE_SERIALIZERS.register("constructing", ConstructingRecipe.Serializer::new);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
