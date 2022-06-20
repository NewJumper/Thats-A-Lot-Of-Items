package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.datagen.recipes.custom.PressingRecipeBuilder;
import com.newjumper.taloi.datagen.recipes.custom.UnstablePressingRecipeBuilder;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class PressingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public PressingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        new PressingRecipeBuilder(TaloiItems.ALLOY_PLATE.get(), 1, 0f)
                .requires(TaloiItems.ALLOY_X.get())
                .requires(TaloiItems.ALLOY_Z.get())
                .unlockedBy("has_alloy_x", has(TaloiItems.ALLOY_X.get()))
                .unlockedBy("has_alloy_z", has(TaloiItems.ALLOY_Z.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.BRONZE_PLATE.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_BRONZE, 2)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_BRONZE)).save(consumer);

        new PressingRecipeBuilder(TaloiItems.CARBON_PLATE.get(), 1, 0f)
                .requires(TaloiItems.CARBONITE.get(), 2)
                .unlockedBy("has_material", has(TaloiItems.CARBONITE.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.COPPER_PLATE.get(), 1, 0f)
                .requires(Tags.Items.INGOTS_COPPER, 2)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_COPPER)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "copper_plate_from_pressing"));

        new PressingRecipeBuilder(TaloiItems.DIAMOND_PLATE.get(), 1, 0f)
                .requires(Tags.Items.GEMS_DIAMOND, 2)
                .unlockedBy("has_material", has(Tags.Items.GEMS_DIAMOND)).save(consumer);

        new UnstablePressingRecipeBuilder(TaloiItems.FORGE_PLATE.get(), 1, 0f)
                .requires(TaloiItems.FERRONIOBIUM_INGOT.get())
                .requires(TaloiItems.SERMIUM_PLATE.get())
                .requires(TaloiItems.STEEL_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.SERMIUM_PLATE.get())).save(consumer);

        new UnstablePressingRecipeBuilder(TaloiItems.FUTURITE_PLATE.get(), 1, 0f)
                .requires(TaloiItems.ALLOY_PLATE.get())
                .requires(TaloiItems.FORGE_PLATE.get())
                .requires(TaloiItems.FUTURITE.get())
                .unlockedBy("has_material", has(TaloiItems.FUTURITE.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.GOLD_DISK.get(), 1, 0f)
                .requires(Tags.Items.INGOTS_GOLD)
                .requires(TaloiTags.Items.INGOTS_SILICON)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_GOLD)).save(consumer);

        new UnstablePressingRecipeBuilder(TaloiItems.INDUCTION_PLATE.get(), 1, 0f)
                .requires(TaloiItems.ALLOY_PLATE.get())
                .requires(TaloiItems.REINFORCED_COPPER_PLATE.get())
                .requires(TaloiItems.SEMICONDUCTOR_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.SEMICONDUCTOR_PLATE.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.MAGNESIUM_PLATE.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_MAGNESIUM, 2)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_MAGNESIUM)).save(consumer);

        new PressingRecipeBuilder(TaloiItems.REINFORCED_COPPER_PLATE.get(), 1, 0f)
                .requires(TaloiItems.BRONZE_PLATE.get())
                .requires(TaloiItems.COPPER_PLATE.get())
                .unlockedBy("has_bronze", has(TaloiItems.BRONZE_PLATE.get()))
                .unlockedBy("has_copper", has(TaloiItems.COPPER_PLATE.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.SEMICONDUCTOR_PLATE.get(), 1, 0f)
                .requires(TaloiItems.GOLD_DISK.get())
                .requires(TaloiItems.MAGNESIUM_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.GOLD_DISK.get())).save(consumer);

        new UnstablePressingRecipeBuilder(TaloiItems.SERMIUM_PLATE.get(), 1, 0f)
                .requires(TaloiItems.SERMIUM.get(), 2)
                .requires(TaloiItems.SILICON_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.SERMIUM.get())).save(consumer);

        new PressingRecipeBuilder(TaloiItems.SILICON_PLATE.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_SILICON, 2)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_SILICON)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "silicon_plate_from_pressing"));

        new PressingRecipeBuilder(TaloiItems.STEEL_PLATE.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_STEEL, 2)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_STEEL)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "steel_plate_from_pressing"));

        new PressingRecipeBuilder(TaloiItems.TUNGSTEN_PLATE.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_TUNGSTEN, 2)
                .unlockedBy("has_material", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
    }

    @Override
    public String getName() {
        return "Pressing Recipes";
    }
}
