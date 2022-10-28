package com.newjumper.taloi.integration;

import com.newjumper.taloi.ThatsALotOfItems;
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
public class TaloiJEI implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ThatsALotOfItems.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();

        registration.addRecipeCategories(new ConstructingCategory(guiHelper, 200), new UnstableConstructingCategory(guiHelper, 100), new PressingCategory(guiHelper, 200), new UnstablePressingCategory(guiHelper, 100), new ProcessingCategory(guiHelper, 200), new SeparatingCategory(guiHelper,200));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ConstructingRecipe> constructing = rm.getAllRecipesFor(ConstructingRecipe.Type.INSTANCE);
        List<UnstableConstructingRecipe> unstableConstructing = rm.getAllRecipesFor(UnstableConstructingRecipe.Type.INSTANCE);
        List<PressingRecipe> pressing = rm.getAllRecipesFor(PressingRecipe.Type.INSTANCE);
        List<UnstablePressingRecipe> unstablePressing = rm.getAllRecipesFor(UnstablePressingRecipe.Type.INSTANCE);
        List<ProcessingRecipe> processing = rm.getAllRecipesFor(ProcessingRecipe.Type.INSTANCE);
        List<SeparatingRecipe> separating = rm.getAllRecipesFor(SeparatingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "constructing"), ConstructingRecipe.class), constructing);
        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "unstable_constructing"), UnstableConstructingRecipe.class), unstableConstructing);
        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "pressing"), PressingRecipe.class), pressing);
        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "unstable_pressing"), UnstablePressingRecipe.class), unstablePressing);
        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "processing"), ProcessingRecipe.class), processing);
        registration.addRecipes(new RecipeType<>(new ResourceLocation(ThatsALotOfItems.MOD_ID, "separating"), SeparatingRecipe.class), separating);
    }
}
