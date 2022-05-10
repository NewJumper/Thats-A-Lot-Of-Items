package com.newjumper.taloi.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.data.custom.ConstructingRecipeBuilder;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ConstructingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ConstructingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        new ConstructingRecipeBuilder(ModItems.STEEL_INGOT.get(), 1)
                .requires(Items.COAL)
                .requires(Items.IRON_INGOT)
                .unlockedBy("has_material", has(Items.IRON_INGOT)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "constructing"));

        /*new ConstructingRecipeBuilder(ModItems.BRONZE_INGOT.get(), 1)
                .requires(Items.COPPER_INGOT)
                .requires(ModItems.TIN_INGOT.get())
                .unlockedBy("has_material", has(Items.COPPER_INGOT)).save(consumer);*/
    }
}
