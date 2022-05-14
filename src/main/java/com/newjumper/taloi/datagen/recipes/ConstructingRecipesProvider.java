package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.datagen.custom.ConstructingRecipeBuilder;
import com.newjumper.taloi.datagen.custom.UnstableConstructingRecipeBuilder;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
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
        new ConstructingRecipeBuilder(ModItems.BRONZE_INGOT.get(), 1)
                .requires(Tags.Items.INGOTS_COPPER)
                .requires(ModTags.Items.INGOT_TIN)
                .unlockedBy("has_copper", has(Tags.Items.INGOTS_COPPER))
                .unlockedBy("has_tin", has(ModTags.Items.INGOT_TIN))
                .save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "bronze_ingot_from_constructing"));

        new ConstructingRecipeBuilder(ModItems.CARBONITE.get(), 1)
                .requires(Items.BLAZE_POWDER)
                .requires(ModItems.COAL_INFUSED_IRON_INGOT.get())
                .unlockedBy("has_material", has(ModItems.COAL_INFUSED_IRON_INGOT.get())).save(consumer);

        new UnstableConstructingRecipeBuilder(ModItems.FERRONIOBIUM_INGOT.get(), 1)
                .requires(ModItems.ALLOY_PLATE.get())
                .requires(ModItems.MAGNESIUM_INGOT.get())
                .requires(ModItems.STEEL_PLATE.get())
                .unlockedBy("has_material", has(ModItems.ALLOY_PLATE.get())).save(consumer);

        new UnstableConstructingRecipeBuilder(ModItems.FUTURITE.get(), 1)
                .requires(ModItems.ALLOY_PLATE.get())
                .requires(ModItems.FORGE_PLATE.get())
                .requires(ModItems.TUNGSTEN_PLATE.get())
                .unlockedBy("has_material", has(ModItems.FORGE_PLATE.get())).save(consumer);

        new ConstructingRecipeBuilder(ModItems.HARDENED_CARBONITE.get(), 1)
                .requires(ModItems.CARBON_PLATE.get())
                .requires(ModItems.SILICON_PLATE.get())
                .unlockedBy("has_carbon", has(ModItems.CARBON_PLATE.get()))
                .unlockedBy("has_silicon", has(ModItems.SILICON_PLATE.get()))
                .save(consumer);

        new UnstableConstructingRecipeBuilder(ModItems.SERMIUM.get(), 1)
                .requires(ModItems.HARDENED_CARBONITE.get())
                .requires(ModItems.REFINED_URANIUM.get())
                .requires(ModItems.FERRONIOBIUM_INGOT.get())
                .unlockedBy("has_material", has(ModItems.FERRONIOBIUM_INGOT.get())).save(consumer);

        new ConstructingRecipeBuilder(ModItems.STEEL_INGOT.get(), 1)
                .requires(Items.COAL)
                .requires(Tags.Items.INGOTS_IRON)
                .unlockedBy("has_material", has(Tags.Items.INGOTS_IRON)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "steel_ingot_from_constructing"));

        new ConstructingRecipeBuilder(ModItems.ALLOY_X.get(), 1)
                .requires(ModTags.Items.INGOT_OSMIUM)
                .requires(ModTags.Items.INGOT_ZINC)
                .unlockedBy("has_osmium", has(ModTags.Items.INGOT_OSMIUM))
                .unlockedBy("has_zinc", has(ModTags.Items.INGOT_ZINC))
                .save(consumer);

        new ConstructingRecipeBuilder(ModItems.ALLOY_Z.get(), 1)
                .requires(ModTags.Items.INGOT_IRIDIUM)
                .requires(ModTags.Items.INGOT_SILICON)
                .unlockedBy("has_iridium", has(ModTags.Items.INGOT_IRIDIUM))
                .unlockedBy("has_silicon", has(ModTags.Items.INGOT_SILICON))
                .save(consumer);
    }
}
