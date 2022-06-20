package com.newjumper.taloi.integration;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
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

        registration.addRecipeCategories(
                new ConstructingCategory(guiHelper, TaloiBlocks.ALPHA_CONSTRUCTOR.get(), "container.taloi.ac", 200),
                new UnstableConstructingCategory(guiHelper, TaloiBlocks.UNSTABLE_CONSTRUCTOR.get(), "container.taloi.uc", 100),
                new PressingCategory(guiHelper, TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get(), "container.taloi.ahp", 200),
                new UnstablePressingCategory(guiHelper, TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get(), "container.taloi.uhp", 100),
                new ProcessingCategory(guiHelper, TaloiBlocks.ALPHA_PROCESSOR.get(), "container.taloi.ap", 200),
                new SeparatingCategory(guiHelper, TaloiBlocks.ALPHA_SEPARATOR.get(), "container.taloi.ase", 200)
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ConstructingRecipe> constructingRecipes = rm.getAllRecipesFor(ConstructingRecipe.Type.INSTANCE);
        List<UnstableConstructingRecipe> unstableConstructingRecipes = rm.getAllRecipesFor(UnstableConstructingRecipe.Type.INSTANCE);
        List<PressingRecipe> pressingRecipes = rm.getAllRecipesFor(PressingRecipe.Type.INSTANCE);
        List<UnstablePressingRecipe> unstablePressingRecipes = rm.getAllRecipesFor(UnstablePressingRecipe.Type.INSTANCE);
        List<ProcessingRecipe> processingRecipes = rm.getAllRecipesFor(ProcessingRecipe.Type.INSTANCE);
        List<SeparatingRecipe> separatingRecipes = rm.getAllRecipesFor(SeparatingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ConstructingCategory.UID, ConstructingRecipe.class), constructingRecipes);
        registration.addRecipes(new RecipeType<>(UnstableConstructingCategory.UID, UnstableConstructingRecipe.class), unstableConstructingRecipes);
        registration.addRecipes(new RecipeType<>(PressingCategory.UID, PressingRecipe.class), pressingRecipes);
        registration.addRecipes(new RecipeType<>(UnstablePressingCategory.UID, UnstablePressingRecipe.class), unstablePressingRecipes);
        registration.addRecipes(new RecipeType<>(ProcessingCategory.UID, ProcessingRecipe.class), processingRecipes);
        registration.addRecipes(new RecipeType<>(SeparatingCategory.UID, SeparatingRecipe.class), separatingRecipes);
    }
}
