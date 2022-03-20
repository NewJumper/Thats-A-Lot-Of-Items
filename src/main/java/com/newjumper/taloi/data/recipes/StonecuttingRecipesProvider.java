package com.newjumper.taloi.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class StonecuttingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public StonecuttingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, "limestone_slab_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, "limestone_stairs_from_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, "limestone_wall_from_limestone_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, "marble_slab_from_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, "marble_stairs_from_marble_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, "marble_wall_from_marble_stonecutting");
    }
}
