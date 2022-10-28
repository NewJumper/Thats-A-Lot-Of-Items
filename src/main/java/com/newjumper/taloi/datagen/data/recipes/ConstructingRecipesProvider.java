package com.newjumper.taloi.datagen.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.datagen.data.recipes.custom.ConstructingRecipeBuilder;
import com.newjumper.taloi.datagen.data.recipes.custom.UnstableConstructingRecipeBuilder;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ConstructingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ConstructingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        new ConstructingRecipeBuilder(TaloiItems.BRONZE_INGOT.get(), 1, 0f)
                .requires(Tags.Items.INGOTS_COPPER)
                .requires(TaloiTags.Items.INGOTS_TIN)
                .unlockedBy("has_copper", has(Tags.Items.INGOTS_COPPER))
                .unlockedBy("has_tin", has(TaloiTags.Items.INGOTS_TIN))
                .save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "bronze_ingot_from_constructing"));

        new ConstructingRecipeBuilder(TaloiItems.CARBONITE.get(), 1, 0f)
                .requires(Items.BLAZE_POWDER)
                .requires(TaloiItems.COAL_INFUSED_IRON_INGOT.get())
                .unlockedBy("has_material", has(TaloiItems.COAL_INFUSED_IRON_INGOT.get())).save(consumer);

        new UnstableConstructingRecipeBuilder(TaloiItems.FERRONIOBIUM_INGOT.get(), 1, 0f)
                .requires(TaloiItems.ALLOY_PLATE.get())
                .requires(TaloiItems.MAGNESIUM_INGOT.get())
                .requires(TaloiItems.STEEL_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.ALLOY_PLATE.get())).save(consumer);

        new UnstableConstructingRecipeBuilder(TaloiItems.FUTURITE.get(), 1, 0f)
                .requires(TaloiItems.ALLOY_PLATE.get())
                .requires(TaloiItems.FORGE_PLATE.get())
                .requires(TaloiItems.TUNGSTEN_PLATE.get())
                .unlockedBy("has_material", has(TaloiItems.FORGE_PLATE.get())).save(consumer);

        new ConstructingRecipeBuilder(TaloiItems.HARDENED_CARBONITE.get(), 1, 0f)
                .requires(TaloiItems.CARBON_PLATE.get())
                .requires(TaloiItems.SILICON_PLATE.get())
                .unlockedBy("has_carbon", has(TaloiItems.CARBON_PLATE.get()))
                .unlockedBy("has_silicon", has(TaloiItems.SILICON_PLATE.get()))
                .save(consumer);

        new UnstableConstructingRecipeBuilder(TaloiItems.SERMIUM.get(), 1, 0f)
                .requires(TaloiItems.HARDENED_CARBONITE.get())
                .requires(TaloiTags.Items.INGOTS_URANIUM)
                .requires(TaloiItems.FERRONIOBIUM_INGOT.get())
                .unlockedBy("has_material", has(TaloiItems.FERRONIOBIUM_INGOT.get())).save(consumer);

        new ConstructingRecipeBuilder(TaloiItems.STEEL_INGOT.get(), 1, 0f)
                .requires(Items.COAL)
                .requires(Tags.Items.INGOTS_IRON)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_IRON)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "steel_ingot_from_constructing"));

        new ConstructingRecipeBuilder(TaloiItems.ALLOY_X.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_OSMIUM)
                .requires(TaloiTags.Items.INGOTS_ZINC)
                .unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM))
                .unlockedBy("has_zinc", has(TaloiTags.Items.INGOTS_ZINC))
                .save(consumer);

        new ConstructingRecipeBuilder(TaloiItems.ALLOY_Z.get(), 1, 0f)
                .requires(TaloiTags.Items.INGOTS_IRIDIUM)
                .requires(TaloiTags.Items.INGOTS_SILICON)
                .unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM))
                .unlockedBy("has_silicon", has(TaloiTags.Items.INGOTS_SILICON))
                .save(consumer);
    }

    @Override
    public String getName() {
        return "Constructing Recipes";
    }
}
