package com.newjumper.taloi.datagen.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class SmithingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public SmithingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.BOW), Ingredient.of(Items.NETHERITE_INGOT), TaloiItems.NETHERITE_BOW.get()).unlocks("has_material", has(Items.NETHERITE_INGOT)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "netherite_bow_smithing"));
    }

    @Override
    public @NotNull String getName() {
        return "Smithing Recipes";
    }
}
