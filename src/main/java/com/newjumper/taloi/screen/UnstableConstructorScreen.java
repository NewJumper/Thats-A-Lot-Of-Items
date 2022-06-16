package com.newjumper.taloi.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class UnstableConstructorScreen extends AbstractContainerScreen<UnstableConstructorMenu> {
    public static final ResourceLocation GUI = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/container/unstable_constructor.png");

    public UnstableConstructorScreen(UnstableConstructorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI);
        int x = this.leftPos;
        int y = this.topPos;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
        if(menu.isLit()) blit(pPoseStack, x + 31, y + 32 + menu.getFuelProgress(), 176, menu.getFuelProgress(), 14, 14 - menu.getFuelProgress());
        if(menu.hasIngredients()) blit(pPoseStack, x + 89, y + 25, 176, 14, menu.getProgress(), 40);
    }
}
