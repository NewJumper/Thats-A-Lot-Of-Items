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
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ConstructingRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final NonNullList<Ingredient> ingredients;
    private final ItemStack result;

    public ConstructingRecipe(ResourceLocation pId, NonNullList<Ingredient> ingredients, ItemStack pResult) {
        this.id = pId;
        this.ingredients = ingredients;
        this.result = pResult;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return (ingredients.get(0).test(pContainer.getItem(1)) && ingredients.get(1).test(pContainer.getItem(2))) ||
                (ingredients.get(1).test(pContainer.getItem(1)) && ingredients.get(0).test(pContainer.getItem(2))); // me being lazy lllollololllol
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return result;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return result.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.CONSTRUCTING.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ConstructingRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "constructing";
    }

    public static class Serializer implements RecipeSerializer<ConstructingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ThatsALotOfItems.MOD_ID,"constructing");

        @Override
        public ConstructingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            JsonArray input = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            NonNullList<Ingredient> ingredients = NonNullList.withSize(2, Ingredient.EMPTY);
            for (int i = 0; i < ingredients.size(); i++) {
                ingredients.set(i, Ingredient.fromJson(input.get(i)));
            }

            ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "result"));

            return new ConstructingRecipe(pRecipeId, ingredients, result);
        }

        @Override
        public ConstructingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> ingredients = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);
            for (int i = 0; i < ingredients.size(); i++) {
                ingredients.set(i, Ingredient.fromNetwork(pBuffer));
            }

            ItemStack result = pBuffer.readItem();

            return new ConstructingRecipe(pRecipeId, ingredients, result);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, ConstructingRecipe pRecipe) {
            pBuffer.writeInt(pRecipe.getIngredients().size());
            for (Ingredient ingredient : pRecipe.getIngredients()) {
                ingredient.toNetwork(pBuffer);
            }

            pBuffer.writeItemStack(pRecipe.getResultItem(), false);
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked")
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>) cls;
        }
    }
}
