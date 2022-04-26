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

public class SeparatingRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final Ingredient ore;
    private final ItemStack resultOre;
    private final ItemStack resultRaw;

    public SeparatingRecipe(ResourceLocation pId, Ingredient ore, ItemStack resultOre, ItemStack resultRaw) {
        this.id = pId;
        this.ore = ore;
        this.resultOre = resultOre;
        this.resultRaw = resultRaw;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return ore.test(pContainer.getItem(1));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return resultOre;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return resultOre.copy();
    }

    public ItemStack getResultRaw() {
        return resultRaw.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.SEPARATING.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<SeparatingRecipe> {
        private Type() {}
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer implements RecipeSerializer<SeparatingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ThatsALotOfItems.MOD_ID,"separating");

        @Override
        public SeparatingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            Ingredient ore = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "ore"));
            ItemStack resultOre = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "resultore"));
            ItemStack resultRaw = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "resultraw"));

            return new SeparatingRecipe(pRecipeId, ore, resultOre, resultRaw);
        }

        @Override
        public SeparatingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            Ingredient ore = Ingredient.fromNetwork(pBuffer);
            ItemStack resultOre = pBuffer.readItem();
            ItemStack resultRaw = pBuffer.readItem();

            return new SeparatingRecipe(pRecipeId, ore, resultOre, resultRaw);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, SeparatingRecipe pRecipe) {
            pRecipe.ore.toNetwork(pBuffer);
            pBuffer.writeItemStack(pRecipe.getResultItem(), false);
            pBuffer.writeItemStack(pRecipe.getResultRaw(), false);
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
