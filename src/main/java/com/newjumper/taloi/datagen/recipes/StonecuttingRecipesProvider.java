package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class StonecuttingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public StonecuttingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.CHISELED_LIMESTONE_BRICKS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_limestone_bricks_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_slab_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_stairs_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_wall_from_limestone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.CHISELED_MARBLE.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_marble_from_marble_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_slab_from_marble_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_stairs_from_marble_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_wall_from_marble_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_BRICKS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_bricks_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.CHISELED_LIMESTONE_BRICKS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_limestone_bricks_from_limestone_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_brick_slab_from_limestone_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_brick_stairs_from_limestone_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()), ModBlocks.LIMESTONE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_brick_wall_from_limestone_bricks_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE.get()), ModBlocks.CHISELED_SLATE.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_slate_from_slate_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE.get()), ModBlocks.SLATE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_slab_from_slate_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE.get()), ModBlocks.SLATE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_stairs_from_slate_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE.get()), ModBlocks.SLATE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_wall_from_slate_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE.get()), ModBlocks.SLATE_BRICKS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_bricks_from_slate_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE_BRICKS.get()), ModBlocks.SLATE_BRICK_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_brick_slab_from_slate_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE_BRICKS.get()), ModBlocks.SLATE_BRICK_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_brick_stairs_from_slate_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SLATE_BRICKS.get()), ModBlocks.SLATE_BRICK_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.SLATE_BRICKS.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "slate_brick_wall_from_slate_bricks_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE), ModBlocks.CHISELED_ANDESITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.ANDESITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_andesite_from_andesite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.CHISELED_ANDESITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.POLISHED_ANDESITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_andesite_from_polished_andesite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE), ModBlocks.CHISELED_DIORITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.DIORITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_diorite_from_diorite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.CHISELED_DIORITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.POLISHED_DIORITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_diorite_from_polished_diorite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), ModBlocks.CHISELED_DRIPSTONE_BLOCK.get(), 1)
                .unlockedBy("has_material", has(Blocks.DRIPSTONE_BLOCK)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_dripstone_block_from_dripstone_block_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), ModBlocks.CHISELED_GRANITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.GRANITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_granite_from_granite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.CHISELED_GRANITE.get(), 1)
                .unlockedBy("has_material", has(Blocks.POLISHED_GRANITE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_granite_from_polished_granite_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TUFF), ModBlocks.POLISHED_TUFF.get(), 1)
                .unlockedBy("has_material", has(Blocks.TUFF)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "polished_tuff_from_tuff_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TUFF), ModBlocks.CHISELED_TUFF.get(), 1)
                .unlockedBy("has_material", has(Blocks.TUFF)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_tuff_from_tuff_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.POLISHED_TUFF.get()), ModBlocks.CHISELED_TUFF.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.POLISHED_TUFF.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "chiseled_tuff_from_polished_tuff_stonecutting"));
    }

    @Override
    public String getName() {
        return "Stonecutting Recipes";
    }
}
