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

public class SeparatingRecipeBuilder implements RecipeBuilder {
    private final Ingredient ore;
    private final Item resultOre;
    private final Item resultRaw;
    private final int count;
    private final float experience;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public SeparatingRecipeBuilder(Ingredient pOre, ItemLike pResultOre, ItemLike pResultRaw, int pCount, float pExperience) {
        this.ore = pOre;
        this.resultOre = pResultOre.asItem();
        this.resultRaw = pResultRaw.asItem();
        this.count = pCount;
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
        return resultRaw;
    }
    public Item getResultOre() {
        return resultOre;
    }

    @Override
    public void save(Consumer<FinishedRecipe> consumer, ResourceLocation pRecipeId) {
        this.advancement.parent(new ResourceLocation("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId)).rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);
        consumer.accept(new SeparatingRecipeBuilder.Result(pRecipeId, this.ore, this.resultOre, this.resultRaw, this.count, this.experience, this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + this.resultRaw.getItemCategory().getRecipeFolderName() + "/" + pRecipeId.getPath())));
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Ingredient ore;
        private final Item resultOre;
        private final Item resultRaw;
        private final int count;
        private final float experience;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Ingredient pOre, Item pResultOre, Item pResultRaw, int pCount, float pExperience, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
            this.id = pId;
            this.ore = pOre;
            this.resultOre = pResultOre;
            this.resultRaw = pResultRaw;
            this.count = pCount;
            this.experience = pExperience;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            pJson.add("ore", this.ore.toJson());

            JsonObject jsonResultOre = new JsonObject();
            jsonResultOre.addProperty("item", String.valueOf(ForgeRegistries.ITEMS.getKey(resultOre)));
            JsonObject jsonResultRaw = new JsonObject();
            jsonResultRaw.addProperty("item", String.valueOf(ForgeRegistries.ITEMS.getKey(resultRaw)));
            /*if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }*/

            pJson.add("resultore", jsonResultOre);
            pJson.add("resultraw", jsonResultRaw);
            pJson.addProperty("experience", this.experience);
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return TaloiRecipes.SEPARATING.get();
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
