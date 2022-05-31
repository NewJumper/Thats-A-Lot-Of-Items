package com.newjumper.taloi.integration;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.recipe.*;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
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
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        String key = "container.taloi.";

        registration.addRecipeCategories(
                new ConstructingCategory(guiHelper, ModBlocks.ALPHA_CONSTRUCTOR.get(), key + "ac", 200),
                new UnstableConstructingCategory(guiHelper, ModBlocks.UNSTABLE_CONSTRUCTOR.get(), key + "uc", 100),
                new ProcessingCategory(guiHelper, ModBlocks.ALPHA_PROCESSOR.get(), key + "ap", 200),
                new SeparatingCategory(guiHelper, ModBlocks.ALPHA_SEPARATOR.get(), key + "ase", 200)
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ConstructingRecipe> constructingRecipes = rm.getAllRecipesFor(ConstructingRecipe.Type.INSTANCE);
        List<UnstableConstructingRecipe> unstableConstructingRecipes = rm.getAllRecipesFor(UnstableConstructingRecipe.Type.INSTANCE);
        List<ProcessingRecipe> processingRecipes = rm.getAllRecipesFor(ProcessingRecipe.Type.INSTANCE);
        List<SeparatingRecipe> separatingRecipes = rm.getAllRecipesFor(SeparatingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ConstructingCategory.UID, ConstructingRecipe.class), constructingRecipes);
        registration.addRecipes(new RecipeType<>(UnstableConstructingCategory.UID, UnstableConstructingRecipe.class), unstableConstructingRecipes);
        registration.addRecipes(new RecipeType<>(ProcessingCategory.UID, ProcessingRecipe.class), processingRecipes);
        registration.addRecipes(new RecipeType<>(SeparatingCategory.UID, SeparatingRecipe.class), separatingRecipes);
    }
}
