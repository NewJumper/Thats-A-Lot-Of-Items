package com.newjumper.taloi.recipe;

import com.google.gson.JsonObject;
import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ProcessingRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final Ingredient base;
    private final Ingredient ingot;
    private final ItemStack result;

    public ProcessingRecipe(ResourceLocation pId, Ingredient base, Ingredient ingot, ItemStack pResult) {
        this.id = pId;
        this.base = base;
        this.ingot = ingot;
        this.result = pResult;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return base.test(pContainer.getItem(1)) && ingot.test(pContainer.getItem(2));
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
        return ModRecipes.PROCESSING.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ProcessingRecipe> {
        private Type() {}
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer implements RecipeSerializer<ProcessingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ThatsALotOfItems.MOD_ID,"processing");

        @Override
        public ProcessingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            Ingredient base = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "base"));
            Ingredient ingot = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "ingot"));
            ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "result"));

            return new ProcessingRecipe(pRecipeId, base, ingot, result);
        }

        @Override
        public ProcessingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            Ingredient base = Ingredient.fromNetwork(pBuffer);
            Ingredient ingot = Ingredient.fromNetwork(pBuffer);
            ItemStack result = pBuffer.readItem();

            return new ProcessingRecipe(pRecipeId, base, ingot, result);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, ProcessingRecipe pRecipe) {
            pRecipe.base.toNetwork(pBuffer);
            pRecipe.ingot.toNetwork(pBuffer);
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
