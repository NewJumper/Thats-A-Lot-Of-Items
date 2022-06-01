package com.newjumper.taloi.integration;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.recipe.UnstableConstructingRecipe;
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

public class UnstableConstructingCategory implements IRecipeCategory<UnstableConstructingRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ThatsALotOfItems.MOD_ID, "unstable_constructing");
    public final static ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/taloi_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final String key;
    private final int progressTime;
    private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;

    public UnstableConstructingCategory(IGuiHelper guiHelper, Block icon, String translationKey, int progress) {
        this.background = guiHelper.createDrawable(TEXTURE, 0, 54, 78, 54);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(icon));
        this.key = translationKey;
        this.progressTime = progress;

        this.cachedArrows = CacheBuilder.newBuilder().maximumSize(28).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 78, 54, 27, 40).buildAnimated(time, IDrawableAnimated.StartDirection.LEFT, false);
            }
        });
    }

    @Override
    public void draw(UnstableConstructingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        getArrow().draw(stack, 21, 7);
        drawCookTime(stack);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, UnstableConstructingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 19).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 37).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 57, 19).addItemStack(recipe.getResultItem());
    }

    private IDrawableAnimated getArrow() {
        return this.cachedArrows.getUnchecked(progressTime / 2);
    }
    private void drawCookTime(PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        int stringWidth = fontRenderer.width((progressTime / 20) + "s");
        fontRenderer.draw(poseStack, (progressTime / 20) + "s", background.getWidth() - stringWidth, 45, 0xFF808080);
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
    public Class<? extends UnstableConstructingRecipe> getRecipeClass() {
        return UnstableConstructingRecipe.class;
    }
    @SuppressWarnings("removal")
    @Override
    public ResourceLocation getUid() {
        return UID;
    }
}
