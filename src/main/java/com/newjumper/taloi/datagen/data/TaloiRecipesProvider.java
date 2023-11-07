package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class TaloiRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public TaloiRecipesProvider(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        stairRecipe(TaloiBlocks.OAK_WOOD_STAIRS, Blocks.OAK_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.OAK_WOOD_SLAB.get(), Blocks.OAK_WOOD);
        stairRecipe(TaloiBlocks.SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.SPRUCE_WOOD_SLAB.get(), Blocks.SPRUCE_WOOD);
        stairRecipe(TaloiBlocks.BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BIRCH_WOOD_SLAB.get(), Blocks.BIRCH_WOOD);
        stairRecipe(TaloiBlocks.JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.JUNGLE_WOOD_SLAB.get(), Blocks.JUNGLE_WOOD);
        stairRecipe(TaloiBlocks.ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.ACACIA_WOOD_SLAB.get(), Blocks.ACACIA_WOOD);
        stairRecipe(TaloiBlocks.DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), Blocks.DARK_OAK_WOOD);
        stairRecipe(TaloiBlocks.MANGROVE_WOOD_STAIRS, Blocks.MANGROVE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.MANGROVE_WOOD_SLAB.get(), Blocks.MANGROVE_WOOD);
        stairRecipe(TaloiBlocks.CHERRY_WOOD_STAIRS, Blocks.CHERRY_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.CHERRY_WOOD_SLAB.get(), Blocks.CHERRY_WOOD);
        stairRecipe(TaloiBlocks.CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), Blocks.CRIMSON_HYPHAE);
        stairRecipe(TaloiBlocks.WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.WARPED_HYPHAE_SLAB.get(), Blocks.WARPED_HYPHAE);

        stairRecipe(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS, Blocks.STRIPPED_OAK_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_OAK_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.STRIPPED_SPRUCE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), Blocks.STRIPPED_SPRUCE_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Blocks.STRIPPED_BIRCH_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), Blocks.STRIPPED_BIRCH_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.STRIPPED_JUNGLE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), Blocks.STRIPPED_JUNGLE_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Blocks.STRIPPED_ACACIA_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), Blocks.STRIPPED_ACACIA_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.STRIPPED_DARK_OAK_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_DARK_OAK_WOOD);
        /*stairRecipe(TaloiBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Blocks.STRIPPED_MANGROVE_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), Blocks.STRIPPED_MANGROVE_WOOD);
        stairRecipe(TaloiBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Blocks.STRIPPED_CHERRY_WOOD, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), Blocks.STRIPPED_CHERRY_WOOD);
        */stairRecipe(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.STRIPPED_CRIMSON_HYPHAE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), Blocks.STRIPPED_CRIMSON_HYPHAE);
        stairRecipe(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.STRIPPED_WARPED_HYPHAE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), Blocks.STRIPPED_WARPED_HYPHAE);

        stairRecipe(TaloiBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), Blocks.WHITE_TERRACOTTA);
        stairRecipe(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), Blocks.ORANGE_TERRACOTTA);
        stairRecipe(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Blocks.MAGENTA_TERRACOTTA);
        stairRecipe(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        stairRecipe(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), Blocks.YELLOW_TERRACOTTA);
        stairRecipe(TaloiBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), Blocks.LIME_TERRACOTTA);
        stairRecipe(TaloiBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), Blocks.PINK_TERRACOTTA);
        stairRecipe(TaloiBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), Blocks.GRAY_TERRACOTTA);
        stairRecipe(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        stairRecipe(TaloiBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), Blocks.CYAN_TERRACOTTA);
        stairRecipe(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), Blocks.PURPLE_TERRACOTTA);
        stairRecipe(TaloiBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), Blocks.BLUE_TERRACOTTA);
        stairRecipe(TaloiBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), Blocks.BROWN_TERRACOTTA);
        stairRecipe(TaloiBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), Blocks.GREEN_TERRACOTTA);
        stairRecipe(TaloiBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.RED_TERRACOTTA_SLAB.get(), Blocks.RED_TERRACOTTA);
        stairRecipe(TaloiBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), Blocks.BLACK_TERRACOTTA);

        stairRecipe(TaloiBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        stairRecipe(TaloiBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        stairRecipe(TaloiBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        stairRecipe(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        stairRecipe(TaloiBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        stairRecipe(TaloiBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        stairRecipe(TaloiBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        stairRecipe(TaloiBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        stairRecipe(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        stairRecipe(TaloiBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        stairRecipe(TaloiBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        stairRecipe(TaloiBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        stairRecipe(TaloiBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        stairRecipe(TaloiBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        stairRecipe(TaloiBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        stairRecipe(TaloiBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE, pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, TaloiBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);

        stonecuttingRecipe(pWriter, Blocks.WHITE_TERRACOTTA, TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.WHITE_TERRACOTTA, TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.ORANGE_TERRACOTTA, TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.ORANGE_TERRACOTTA, TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.MAGENTA_TERRACOTTA, TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.MAGENTA_TERRACOTTA, TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.YELLOW_TERRACOTTA, TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.YELLOW_TERRACOTTA, TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIME_TERRACOTTA, TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIME_TERRACOTTA, TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.PINK_TERRACOTTA, TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.PINK_TERRACOTTA, TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.GRAY_TERRACOTTA, TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.GRAY_TERRACOTTA, TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.CYAN_TERRACOTTA, TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.CYAN_TERRACOTTA, TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.PURPLE_TERRACOTTA, TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.PURPLE_TERRACOTTA, TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BLUE_TERRACOTTA, TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BLUE_TERRACOTTA, TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BROWN_TERRACOTTA, TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BROWN_TERRACOTTA, TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.GREEN_TERRACOTTA, TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.GREEN_TERRACOTTA, TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.RED_TERRACOTTA, TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.RED_TERRACOTTA, TaloiBlocks.RED_TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BLACK_TERRACOTTA, TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BLACK_TERRACOTTA, TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), 2);

        stonecuttingRecipe(pWriter, Blocks.WHITE_CONCRETE, TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.WHITE_CONCRETE, TaloiBlocks.WHITE_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.ORANGE_CONCRETE, TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.ORANGE_CONCRETE, TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.MAGENTA_CONCRETE, TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.MAGENTA_CONCRETE, TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_BLUE_CONCRETE, TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_BLUE_CONCRETE, TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.YELLOW_CONCRETE, TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.YELLOW_CONCRETE, TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIME_CONCRETE, TaloiBlocks.LIME_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIME_CONCRETE, TaloiBlocks.LIME_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.PINK_CONCRETE, TaloiBlocks.PINK_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.PINK_CONCRETE, TaloiBlocks.PINK_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.GRAY_CONCRETE, TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.GRAY_CONCRETE, TaloiBlocks.GRAY_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_GRAY_CONCRETE, TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.LIGHT_GRAY_CONCRETE, TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.CYAN_CONCRETE, TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.CYAN_CONCRETE, TaloiBlocks.CYAN_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.PURPLE_CONCRETE, TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.PURPLE_CONCRETE, TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BLUE_CONCRETE, TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BLUE_CONCRETE, TaloiBlocks.BLUE_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BROWN_CONCRETE, TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BROWN_CONCRETE, TaloiBlocks.BROWN_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.GREEN_CONCRETE, TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.GREEN_CONCRETE, TaloiBlocks.GREEN_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.RED_CONCRETE, TaloiBlocks.RED_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.RED_CONCRETE, TaloiBlocks.RED_CONCRETE_SLAB.get(), 2);
        stonecuttingRecipe(pWriter, Blocks.BLACK_CONCRETE, TaloiBlocks.BLACK_CONCRETE_STAIRS.get(), 1);
        stonecuttingRecipe(pWriter, Blocks.BLACK_CONCRETE, TaloiBlocks.BLACK_CONCRETE_SLAB.get(), 2);
    }

    private static void stairRecipe(RegistryObject<StairBlock> stairs, ItemLike ingredient, Consumer<FinishedRecipe> writer) {
        stairBuilder(stairs.get(), Ingredient.of(ingredient)).unlockedBy(getHasName(ingredient), has(ingredient)).save(writer);
    }

    private void stonecuttingRecipe(Consumer<FinishedRecipe> writer, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.BUILDING_BLOCKS, result, count).unlockedBy(getHasName(ingredient), has(ingredient)).save(writer, new ResourceLocation(ThatsALotOfItems.MOD_ID,getConversionRecipeName(result, ingredient) + "_stonecutting"));
    }
}
