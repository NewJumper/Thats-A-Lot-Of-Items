package com.newjumper.taloi.recipe;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ConstructingRecipe>> CONSTRUCTING = RECIPE_SERIALIZERS.register("constructing", ConstructingRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<UnstableConstructingRecipe>> UNSTABLE_CONSTRUCTING = RECIPE_SERIALIZERS.register("unstable_constructing", UnstableConstructingRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<PressingRecipe>> PRESSING = RECIPE_SERIALIZERS.register("pressing", PressingRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<UnstablePressingRecipe>> UNSTABLE_PRESSING = RECIPE_SERIALIZERS.register("unstable_pressing", UnstablePressingRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<ProcessingRecipe>> PROCESSING = RECIPE_SERIALIZERS.register("processing", ProcessingRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<SeparatingRecipe>> SEPARATING = RECIPE_SERIALIZERS.register("separating", SeparatingRecipe.Serializer::new);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
