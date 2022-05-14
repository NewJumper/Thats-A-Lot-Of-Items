package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.datagen.custom.PressingRecipeBuilder;
import com.newjumper.taloi.datagen.custom.UnstablePressingRecipeBuilder;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class PressingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public PressingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        new PressingRecipeBuilder(ModItems.ALLOY_PLATE.get(), 1)
                .requires(ModItems.ALLOY_X.get())
                .requires(ModItems.ALLOY_Z.get())
                .unlockedBy("has_alloy_x", has(ModItems.ALLOY_X.get()))
                .unlockedBy("has_alloy_z", has(ModItems.ALLOY_Z.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.BRONZE_PLATE.get(), 1)
                .requires(ModTags.Items.INGOTS_BRONZE, 2)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_BRONZE)).save(consumer);

        new PressingRecipeBuilder(ModItems.CARBON_PLATE.get(), 1)
                .requires(ModItems.CARBONITE.get(), 2)
                .unlockedBy("has_material", has(ModItems.CARBONITE.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.COPPER_PLATE.get(), 1)
                .requires(Tags.Items.INGOTS_COPPER, 2)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_COPPER)).save(consumer);

        new PressingRecipeBuilder(ModItems.DIAMOND_PLATE.get(), 1)
                .requires(Tags.Items.GEMS_DIAMOND, 2)
                .unlockedBy("has_material", has(Tags.Items.GEMS_DIAMOND)).save(consumer);

        new UnstablePressingRecipeBuilder(ModItems.FORGE_PLATE.get(), 1)
                .requires(ModItems.FERRONIOBIUM_INGOT.get())
                .requires(ModItems.SERMIUM_PLATE.get())
                .requires(ModItems.STEEL_PLATE.get())
                .unlockedBy("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer);

        new UnstablePressingRecipeBuilder(ModItems.FUTURITE_PLATE.get(), 1)
                .requires(ModItems.ALLOY_PLATE.get())
                .requires(ModItems.FORGE_PLATE.get())
                .requires(ModItems.FUTURITE.get())
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.GOLD_DISK.get(), 1)
                .requires(ModTags.Items.INGOTS_SILICON)
                .requires(Tags.Items.INGOTS_GOLD)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_GOLD)).save(consumer);

        new UnstablePressingRecipeBuilder(ModItems.INDUCTION_PLATE.get(), 1)
                .requires(ModItems.ALLOY_PLATE.get())
                .requires(ModItems.REINFORCED_COPPER_PLATE.get())
                .requires(ModItems.SEMICONDUCTOR_PLATE.get())
                .unlockedBy("has_material", has(ModItems.SEMICONDUCTOR_PLATE.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.MAGNESIUM_PLATE.get(), 1)
                .requires(ModTags.Items.INGOTS_MAGNESIUM, 2)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_MAGNESIUM)).save(consumer);

        new PressingRecipeBuilder(ModItems.REINFORCED_COPPER_PLATE.get(), 1)
                .requires(ModItems.BRONZE_PLATE.get())
                .requires(ModItems.COPPER_PLATE.get())
                .unlockedBy("has_bronze", has(ModItems.BRONZE_PLATE.get()))
                .unlockedBy("has_copper", has(ModItems.COPPER_PLATE.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.SEMICONDUCTOR_PLATE.get(), 1)
                .requires(ModItems.GOLD_DISK.get(), 2)
                .requires(ModItems.MAGNESIUM_PLATE.get(), 2)
                .unlockedBy("has_material", has(ModItems.GOLD_DISK.get())).save(consumer);

        new UnstablePressingRecipeBuilder(ModItems.SERMIUM_PLATE.get(), 1)
                .requires(ModItems.SERMIUM.get(), 2)
                .requires(ModItems.SILICON_PLATE.get())
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);

        new PressingRecipeBuilder(ModItems.SILICON_PLATE.get(), 1)
                .requires(ModTags.Items.INGOTS_SILICON, 2)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_SILICON)).save(consumer);

        new PressingRecipeBuilder(ModItems.STEEL_PLATE.get(), 1)
                .requires(ModTags.Items.INGOTS_STEEL, 2)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_STEEL)).save(consumer);

        new PressingRecipeBuilder(ModItems.TUNGSTEN_PLATE.get(), 1)
                .requires(ModTags.Items.INGOTS_TUNGSTEN, 2)
                .unlockedBy("has_material", has(ModTags.Items.INGOTS_TUNGSTEN)).save(consumer);
    }

    @Override
    public String getName() {
        return "Pressing Recipes";
    }
}
