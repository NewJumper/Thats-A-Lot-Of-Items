package com.newjumper.taloi.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

public class UnstableConstructingRecipe extends ConstructingRecipe {
    public UnstableConstructingRecipe(ResourceLocation pId, NonNullList<Ingredient> ingredients, ItemStack pResult, float pExperience) {
        super(pId, ingredients, pResult, pExperience);
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return (ingredients.get(0).test(pContainer.getItem(1)) && ingredients.get(1).test(pContainer.getItem(2)) && ingredients.get(2).test(pContainer.getItem(3))) ||
               (ingredients.get(0).test(pContainer.getItem(1)) && ingredients.get(2).test(pContainer.getItem(2)) && ingredients.get(1).test(pContainer.getItem(3))) ||
               (ingredients.get(1).test(pContainer.getItem(1)) && ingredients.get(0).test(pContainer.getItem(2)) && ingredients.get(2).test(pContainer.getItem(3))) ||
               (ingredients.get(1).test(pContainer.getItem(1)) && ingredients.get(2).test(pContainer.getItem(2)) && ingredients.get(0).test(pContainer.getItem(3))) ||
               (ingredients.get(2).test(pContainer.getItem(1)) && ingredients.get(0).test(pContainer.getItem(2)) && ingredients.get(1).test(pContainer.getItem(3))) ||
               (ingredients.get(2).test(pContainer.getItem(1)) && ingredients.get(1).test(pContainer.getItem(2)) && ingredients.get(0).test(pContainer.getItem(3)));
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return TaloiRecipes.UNSTABLE_CONSTRUCTING.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<UnstableConstructingRecipe> {
        private Type() {}
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer implements RecipeSerializer<UnstableConstructingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ThatsALotOfItems.MOD_ID,"unstable_constructing");

        @Override
        public UnstableConstructingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            JsonArray input = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            NonNullList<Ingredient> ingredients = NonNullList.withSize(3, Ingredient.EMPTY);
            for (int i = 0; i < ingredients.size(); i++) {
                ingredients.set(i, Ingredient.fromJson(input.get(i)));
            }
            ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "result"));
            float experience = GsonHelper.getAsFloat(pSerializedRecipe, "experience", 0);

            return new UnstableConstructingRecipe(pRecipeId, ingredients, result, experience);
        }

        @Override
        public UnstableConstructingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> ingredients = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);
            ingredients.replaceAll(ignored -> Ingredient.fromNetwork(pBuffer));
            ItemStack result = pBuffer.readItem();
            float experience = pBuffer.readFloat();

            return new UnstableConstructingRecipe(pRecipeId, ingredients, result, experience);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, UnstableConstructingRecipe pRecipe) {
            pBuffer.writeInt(pRecipe.getIngredients().size());
            for (Ingredient ingredient : pRecipe.getIngredients()) {
                ingredient.toNetwork(pBuffer);
            }
            pBuffer.writeItemStack(pRecipe.getResultItem(), false);
            pBuffer.writeFloat(pRecipe.getExperience());
        }
    }
}
