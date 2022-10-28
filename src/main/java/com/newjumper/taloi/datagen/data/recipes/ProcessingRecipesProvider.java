package com.newjumper.taloi.datagen.data.recipes;

import com.newjumper.taloi.datagen.data.recipes.custom.ProcessingRecipeBuilder;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ProcessingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ProcessingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        new ProcessingRecipeBuilder(Ingredient.of(Items.COAL), Ingredient.of(Tags.Items.RAW_MATERIALS_IRON), TaloiItems.COAL_INFUSED_IRON_INGOT.get(), 0f)
                .unlockedBy("has_material", has(Tags.Items.RAW_MATERIALS_IRON)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.COAL), Ingredient.of(TaloiTags.Items.RAW_LEAD), TaloiItems.COAL_INFUSED_LEAD_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_LEAD)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(TaloiTags.Items.INGOTS_STEEL), TaloiItems.DIAMOND_INFUSED_STEEL_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_STEEL)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(TaloiTags.Items.RAW_TIN), TaloiItems.DIAMOND_INFUSED_TIN_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_TIN)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(TaloiTags.Items.RAW_URANIUM), TaloiItems.DIAMOND_INFUSED_URANIUM.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_URANIUM)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(TaloiTags.Items.RAW_OSMIUM), TaloiItems.EMERALD_INFUSED_OSMIUM_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_OSMIUM)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(TaloiTags.Items.RAW_TUNGSTEN), TaloiItems.EMERALD_INFUSED_TUNGSTEN_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_TUNGSTEN)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(TaloiTags.Items.RAW_ZINC), TaloiItems.EMERALD_INFUSED_ZINC_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiTags.Items.RAW_ZINC)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(TaloiItems.FUTURITE_PLATE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiItems.FUTURITE_PLATE.get())).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(TaloiItems.SERMIUM_PLATE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get(), 0f)
                .unlockedBy("has_material", has(TaloiItems.SERMIUM_PLATE.get())).save(consumer);
    }

    @Override
    public String getName() {
        return "Processing Recipes";
    }
}
