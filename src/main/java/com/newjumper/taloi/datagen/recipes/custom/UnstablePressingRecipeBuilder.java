package com.newjumper.taloi.datagen.recipes.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.newjumper.taloi.recipe.ModRecipes;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.apache.commons.compress.utils.Lists;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class UnstablePressingRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public UnstablePressingRecipeBuilder(ItemLike pResult, int pCount) {
        this.result = pResult.asItem();
        this.count = pCount;
    }

    public UnstablePressingRecipeBuilder requires(TagKey<Item> pTag) {
        return this.requires(pTag, 1);
    }

    public UnstablePressingRecipeBuilder requires(TagKey<Item> pTag, int pQuantity) {
        for(int i = 0; i < pQuantity; ++i) {
            this.ingredients.add(Ingredient.of(pTag));
        }
        return this;
    }

    public UnstablePressingRecipeBuilder requires(ItemLike pItem) {
        return this.requires(pItem, 1);
    }

    public UnstablePressingRecipeBuilder requires(ItemLike pItem, int pQuantity) {
        for(int i = 0; i < pQuantity; ++i) {
            this.ingredients.add(Ingredient.of(pItem));
        }
        return this;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> consumer, ResourceLocation pRecipeId) {
        this.advancement.parent(new ResourceLocation("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId)).rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);
        consumer.accept(new UnstablePressingRecipeBuilder.Result(pRecipeId, this.result, this.count, this.ingredients, this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + this.result.getItemCategory().getRecipeFolderName() + "/" + pRecipeId.getPath())));
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final List<Ingredient> ingredients;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Item pResult, int pCount, List<Ingredient> pIngredients, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
            this.id = pId;
            this.result = pResult;
            this.count = pCount;
            this.ingredients = pIngredients;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonarray = new JsonArray();
            for(Ingredient ingredient : this.ingredients) {
                jsonarray.add(ingredient.toJson());
            }

            pJson.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", this.result.getRegistryName().toString());
            if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }

            pJson.add("result", jsonobject);
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return ModRecipes.UNSTABLE_PRESSING.get();
        }

        @Nullable
        @Override
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}
