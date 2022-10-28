package com.newjumper.taloi.integration;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.recipe.ProcessingRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ProcessingCategory implements IRecipeCategory<ProcessingRecipe> {
    public final static ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/taloi_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final LoadingCache<Integer, IDrawableAnimated> progress;
    private final int time;

    public ProcessingCategory(IGuiHelper guiHelper, int progress) {
        this.background = guiHelper.createDrawable(TEXTURE, 167, 0, 67, 56);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TaloiBlocks.ALPHA_PROCESSOR.get()));

        this.progress = CacheBuilder.newBuilder().maximumSize(19).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 234, 0, 22, 18).buildAnimated(time, IDrawableAnimated.StartDirection.TOP, false);
            }
        });
        this.time = progress;
    }

    @Override
    public RecipeType<ProcessingRecipe> getRecipeType() {
        return RecipeType.create(ThatsALotOfItems.MOD_ID, "processing", ProcessingRecipe.class);
    }

    @Override
    public Component getTitle() {
        return Component.translatable("container." + ThatsALotOfItems.MOD_ID + ".ap");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ProcessingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 1).addIngredients(recipe.getBase());
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 39).addIngredients(recipe.getIngot());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 46, 20).addItemStack(recipe.getResultItem());
    }

    @Override
    public void draw(ProcessingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        this.progress.getUnchecked((time - 8) / 3).draw(stack, 0, 19);

        Font fontRenderer = Minecraft.getInstance().font;
        int stringWidth = fontRenderer.width(time / 20 + "s");
        fontRenderer.draw(stack, time / 20 + "s", background.getWidth() - stringWidth, background.getHeight() - 9, 0xff808080);
    }
}
