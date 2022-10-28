package com.newjumper.taloi.recipe;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class ProcessingRecipe implements Recipe<SimpleContainer> {
    protected final ResourceLocation id;
    protected final Ingredient base;
    protected final Ingredient ingot;
    protected final ItemStack result;
    protected final float experience;

    public ProcessingRecipe(ResourceLocation pId, Ingredient base, Ingredient ingot, ItemStack pResult, float pExperience) {
        this.id = pId;
        this.base = base;
        this.ingot = ingot;
        this.result = pResult;
        this.experience = pExperience;
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
    public ResourceLocation getId() {
        return id;
    }

    public Ingredient getBase() {
        return base;
    }
    public Ingredient getIngot() {
        return ingot;
    }

    @Override
    public ItemStack getResultItem() {
        return result.copy();
    }

    public float getExperience() {
        return experience;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return TaloiRecipes.PROCESSING.get();
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

        @Override
        public ProcessingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            Ingredient base = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "base"));
            Ingredient ingot = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "ingot"));
            ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "result"));
            float experience = GsonHelper.getAsFloat(pSerializedRecipe, "experience", 0);

            return new ProcessingRecipe(pRecipeId, base, ingot, result, experience);
        }

        @Override
        public ProcessingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            Ingredient base = Ingredient.fromNetwork(pBuffer);
            Ingredient ingot = Ingredient.fromNetwork(pBuffer);
            ItemStack result = pBuffer.readItem();
            float experience = pBuffer.readFloat();

            return new ProcessingRecipe(pRecipeId, base, ingot, result, experience);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, ProcessingRecipe pRecipe) {
            pRecipe.base.toNetwork(pBuffer);
            pRecipe.ingot.toNetwork(pBuffer);
            pBuffer.writeItemStack(pRecipe.getResultItem(), false);
            pBuffer.writeFloat(pRecipe.getExperience());
        }
    }
}
