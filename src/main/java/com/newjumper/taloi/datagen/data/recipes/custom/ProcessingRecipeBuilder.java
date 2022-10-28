package com.newjumper.taloi.datagen.data.recipes.custom;

import com.google.gson.JsonObject;
import com.newjumper.taloi.recipe.TaloiRecipes;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ProcessingRecipeBuilder implements RecipeBuilder {
    private final Ingredient base;
    private final Ingredient ingot;
    private final Item result;
    private final float experience;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public ProcessingRecipeBuilder(Ingredient pBase, Ingredient pIngot, ItemLike pResult, float pExperience) {
        this.base = pBase;
        this.ingot = pIngot;
        this.result = pResult.asItem();
        this.experience = pExperience;
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
        consumer.accept(new ProcessingRecipeBuilder.Result(pRecipeId, this.base, this.ingot, this.result, this.experience, this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + this.result.getItemCategory().getRecipeFolderName() + "/" + pRecipeId.getPath())));
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Ingredient base;
        private final Ingredient ingot;
        private final Item result;
        private final float experience;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Ingredient pBase, Ingredient pIngot, Item pResult, float pExperience, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
            this.id = pId;
            this.base = pBase;
            this.ingot = pIngot;
            this.result = pResult;
            this.experience = pExperience;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            pJson.add("base", this.base.toJson());
            pJson.add("ingot", this.ingot.toJson());

            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", String.valueOf(ForgeRegistries.ITEMS.getKey(result)));

            pJson.add("result", jsonobject);
            pJson.addProperty("experience", this.experience);
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return TaloiRecipes.PROCESSING.get();
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
