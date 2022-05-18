package com.newjumper.taloi.integration;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.recipe.*;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class TALOIPluginJEI implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ThatsALotOfItems.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ConstructingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ConstructingRecipe> constructingRecipes = rm.getAllRecipesFor(ConstructingRecipe.Type.INSTANCE);
        List<PressingRecipe> pressingRecipes = rm.getAllRecipesFor(PressingRecipe.Type.INSTANCE);
        List<ProcessingRecipe> processingRecipes = rm.getAllRecipesFor(ProcessingRecipe.Type.INSTANCE);
        List<SeparatingRecipe> separatingRecipes = rm.getAllRecipesFor(SeparatingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ConstructingRecipeCategory.UID, ConstructingRecipe.class), constructingRecipes);
//        registration.addRecipes(new RecipeType<>(UnstableConstructingRecipeCategory.UID, UnstableConstructingRecipe.class), constructingRecipes);
        registration.addRecipes(new RecipeType<>(PressingRecipeCategory.UID, PressingRecipe.class), pressingRecipes);
//        registration.addRecipes(new RecipeType<>(UnstablePressingRecipeCategory.UID, UnstablePressingRecipe.class), pressingRecipes);
        registration.addRecipes(new RecipeType<>(ProcessingRecipeCategory.UID, ProcessingRecipe.class), processingRecipes);
        registration.addRecipes(new RecipeType<>(SeparatingRecipeCategory.UID, SeparatingRecipe.class), separatingRecipes);
    }
}
