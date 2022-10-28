package com.newjumper.taloi.integration;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.recipe.SeparatingRecipe;
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

public class SeparatingCategory implements IRecipeCategory<SeparatingRecipe> {
    public final static ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/taloi_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final LoadingCache<Integer, IDrawableAnimated> progress;
    private final int time;

    public SeparatingCategory(IGuiHelper guiHelper, int progress) {
        this.background = guiHelper.createDrawable(TEXTURE, 135, 56, 99, 26);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(TaloiBlocks.ALPHA_SEPARATOR.get()));

        this.progress = CacheBuilder.newBuilder().maximumSize(23).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 234, 56, 22, 21).buildAnimated(time, IDrawableAnimated.StartDirection.LEFT, false);
            }
        });
        this.time = progress;
    }

    @Override
    public RecipeType<SeparatingRecipe> getRecipeType() {
        return RecipeType.create(ThatsALotOfItems.MOD_ID, "separating", SeparatingRecipe.class);
    }

    @Override
    public Component getTitle() {
        return Component.translatable("container." + ThatsALotOfItems.MOD_ID + ".ase");
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
    public void setRecipe(IRecipeLayoutBuilder builder, SeparatingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 9).addIngredients(recipe.getOre());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 52, 5).addItemStack(recipe.getResultItem());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 78, 5).addItemStack(recipe.getResultOre());
    }

    @Override
    public void draw(SeparatingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        this.progress.getUnchecked((time - 8) / 3).draw(stack, 21, 5);

        Font fontRenderer = Minecraft.getInstance().font;
        int stringWidth = fontRenderer.width(time / 20 + "s");
        fontRenderer.draw(stack, time / 20 + "s", background.getWidth() - stringWidth, background.getHeight() - 9, 0xff808080);
    }
}
