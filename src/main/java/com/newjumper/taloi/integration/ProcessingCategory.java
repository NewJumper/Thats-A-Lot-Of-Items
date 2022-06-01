package com.newjumper.taloi.integration;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.recipe.ProcessingRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ProcessingCategory implements IRecipeCategory<ProcessingRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ThatsALotOfItems.MOD_ID, "processing");
    public final static ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/taloi_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final String key;
    private final int progressTime;
    private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;

    public ProcessingCategory(IGuiHelper guiHelper, Block icon, String translationKey, int progress) {
        this.background = guiHelper.createDrawable(TEXTURE, 167, 0, 67, 56);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(icon));
        this.key = translationKey;
        this.progressTime = progress;

        this.cachedArrows = CacheBuilder.newBuilder().maximumSize(19).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 234, 0, 22, 18).buildAnimated(time, IDrawableAnimated.StartDirection.TOP, false);
            }
        });
    }

    @Override
    public void draw(ProcessingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        getArrow().draw(stack, 0, 19);
        drawCookTime(stack);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ProcessingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 1).addIngredients(recipe.getBase());
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 39).addIngredients(recipe.getIngot());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 46, 20).addItemStack(recipe.getResultItem());
    }

    private IDrawableAnimated getArrow() {
        return this.cachedArrows.getUnchecked(progressTime / 2);
    }
    private void drawCookTime(PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        int stringWidth = fontRenderer.width((progressTime / 20) + "s");
        fontRenderer.draw(poseStack, (progressTime / 20) + "s", background.getWidth() - stringWidth, 47, 0xFF808080);
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
    public Component getTitle() {
        return new TranslatableComponent(key);
    }

    @SuppressWarnings("removal")
    @Override
    public Class<? extends ProcessingRecipe> getRecipeClass() {
        return ProcessingRecipe.class;
    }
    @SuppressWarnings("removal")
    @Override
    public ResourceLocation getUid() {
        return UID;
    }
}
