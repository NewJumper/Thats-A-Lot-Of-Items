package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.datagen.recipes.custom.ProcessingRecipeBuilder;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
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
        new ProcessingRecipeBuilder(Ingredient.of(Items.COAL), Ingredient.of(Tags.Items.RAW_MATERIALS_IRON), ModItems.COAL_INFUSED_IRON_INGOT.get(), 0f)
                .unlockedBy("has_material", has(Tags.Items.RAW_MATERIALS_IRON)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.COAL), Ingredient.of(ModTags.Items.RAW_LEAD), ModItems.COAL_INFUSED_LEAD_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_LEAD)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(ModTags.Items.INGOTS_STEEL), ModItems.DIAMOND_INFUSED_STEEL_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_STEEL)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(ModTags.Items.RAW_TIN), ModItems.DIAMOND_INFUSED_TIN_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_TIN)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.DIAMOND), Ingredient.of(ModTags.Items.RAW_URANIUM), ModItems.DIAMOND_INFUSED_URANIUM.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_URANIUM)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(ModTags.Items.RAW_OSMIUM), ModItems.EMERALD_INFUSED_OSMIUM_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_OSMIUM)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(ModTags.Items.RAW_TUNGSTEN), ModItems.EMERALD_INFUSED_TUNGSTEN_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_TUNGSTEN)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(Items.EMERALD), Ingredient.of(ModTags.Items.RAW_ZINC), ModItems.EMERALD_INFUSED_ZINC_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModTags.Items.RAW_ZINC)).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(ModItems.FUTURITE_PLATE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), ModItems.FUTURITE_INFUSED_NETHERITE_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer);

        new ProcessingRecipeBuilder(Ingredient.of(ModItems.SERMIUM_PLATE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), ModItems.SERMIUM_INFUSED_NETHERITE_INGOT.get(), 0f)
                .unlockedBy("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer);
    }

    @Override
    public String getName() {
        return "Processing Recipes";
    }
}
