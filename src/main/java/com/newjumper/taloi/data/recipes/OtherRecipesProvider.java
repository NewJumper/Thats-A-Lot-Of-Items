package com.newjumper.taloi.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class OtherRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public OtherRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_slab_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_stairs_from_limestone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.LIMESTONE.get()), ModBlocks.LIMESTONE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "limestone_wall_from_limestone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_SLAB.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_slab_from_marble_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_STAIRS.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_stairs_from_marble_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MARBLE.get()), ModBlocks.MARBLE_WALL.get(), 1)
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "marble_wall_from_marble_stonecutting"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_HELMET.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_CHESTPLATE.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_LEGGINGS.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_BOOTS.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_boots_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_HELMET.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_HELMET.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_CHESTPLATE.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_CHESTPLATE.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_LEGGINGS.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_LEGGINGS.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_BOOTS.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_BOOTS.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_boots_smithing"));
    }
}
