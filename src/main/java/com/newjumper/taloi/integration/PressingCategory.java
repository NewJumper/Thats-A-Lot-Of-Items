package com.newjumper.taloi.integration;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.recipe.PressingRecipe;
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

public class PressingCategory implements IRecipeCategory<PressingRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ThatsALotOfItems.MOD_ID, "pressing");
    public final static ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/taloi_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final String key;
    private final int progressTime;
    private final LoadingCache<Integer, IDrawableAnimated> pressUpper;
    private final LoadingCache<Integer, IDrawableAnimated> pressLower;

    public PressingCategory(IGuiHelper guiHelper, Block icon, String translationKey, int progress) {
        this.background = guiHelper.createDrawable(TEXTURE, 0, 108, 88, 55);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(icon));
        this.key = translationKey;
        this.progressTime = progress;

        this.pressUpper = CacheBuilder.newBuilder().maximumSize(18).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 88, 108, 52, 17).buildAnimated(time, IDrawableAnimated.StartDirection.TOP, false);
            }
        });
        this.pressLower = CacheBuilder.newBuilder().maximumSize(18).build(new CacheLoader<>() {
            @Override
            public IDrawableAnimated load(Integer time) {
                return guiHelper.drawableBuilder(TEXTURE, 88, 125, 52, 17).buildAnimated(time, IDrawableAnimated.StartDirection.BOTTOM, false);
            }
        });
    }

    @Override
    public void draw(PressingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        getUpperPress().draw(stack, 0, 0);
        getLowerPress().draw(stack, 0, 38);
        drawCookTime(stack);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, PressingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 8, 20).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 28, 20).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 67, 20).addItemStack(recipe.getResultItem());
    }

    private IDrawableAnimated getUpperPress() {
        return this.pressUpper.getUnchecked(progressTime / 2);
    }
    private IDrawableAnimated getLowerPress() {
        return this.pressLower.getUnchecked(progressTime / 2);
    }
    private void drawCookTime(PoseStack poseStack) {
        Minecraft minecraft = Minecraft.getInstance();
        Font fontRenderer = minecraft.font;
        int stringWidth = fontRenderer.width((progressTime / 20) + "s");
        fontRenderer.draw(poseStack, (progressTime / 20) + "s", background.getWidth() - stringWidth, 46, 0xFF808080);
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
    public Class<? extends PressingRecipe> getRecipeClass() {
        return PressingRecipe.class;
    }
    @SuppressWarnings("removal")
    @Override
    public ResourceLocation getUid() {
        return UID;
    }
}
