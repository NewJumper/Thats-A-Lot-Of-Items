package com.newjumper.taloi.integration;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
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
        registration.addRecipeCategories(new ConstructingRecipeCategory(registration.getJeiHelpers().getGuiHelper(), ModBlocks.ALPHA_CONSTRUCTOR.get(), "container.taloi.ac", 200));
//        registration.addRecipeCategories(new ConstructingRecipeCategory(registration.getJeiHelpers().getGuiHelper(), ModBlocks.BETA_CONSTRUCTOR.get(), "container.taloi.bc", 100));
        registration.addRecipeCategories(new UnstableConstructingRecipeCategory(registration.getJeiHelpers().getGuiHelper(), ModBlocks.UNSTABLE_CONSTRUCTOR.get(), "container.taloi.uc", 100));
        registration.addRecipeCategories(new ProcessingRecipeCategory(registration.getJeiHelpers().getGuiHelper(), ModBlocks.ALPHA_PROCESSOR.get(), "container.taloi.ap", 200));
        registration.addRecipeCategories(new SeparatingRecipeCategory(registration.getJeiHelpers().getGuiHelper(), ModBlocks.ALPHA_SEPARATOR.get(), "container.taloi.ase", 200));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ConstructingRecipe> constructingRecipes = rm.getAllRecipesFor(ConstructingRecipe.Type.INSTANCE);
        List<UnstableConstructingRecipe> unstableConstructingRecipes = rm.getAllRecipesFor(UnstableConstructingRecipe.Type.INSTANCE);
        List<ProcessingRecipe> processingRecipes = rm.getAllRecipesFor(ProcessingRecipe.Type.INSTANCE);
        List<SeparatingRecipe> separatingRecipes = rm.getAllRecipesFor(SeparatingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ConstructingRecipeCategory.UID, ConstructingRecipe.class), constructingRecipes);
        registration.addRecipes(new RecipeType<>(UnstableConstructingRecipeCategory.UID, UnstableConstructingRecipe.class), unstableConstructingRecipes);
        registration.addRecipes(new RecipeType<>(ProcessingRecipeCategory.UID, ProcessingRecipe.class), processingRecipes);
        registration.addRecipes(new RecipeType<>(SeparatingRecipeCategory.UID, SeparatingRecipe.class), separatingRecipes);
    }
}
