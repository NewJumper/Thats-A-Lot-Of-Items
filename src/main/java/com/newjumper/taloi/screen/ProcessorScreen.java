package com.newjumper.taloi.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class ProcessorScreen extends AbstractContainerScreen<ProcessorMenu> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/container/processor.png");

    public ProcessorScreen(ProcessorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if(!menu.getRawSlot().hasItem()) blit(pPoseStack, x + 76, y + 54, 198, 0, 16, 16);

        if(menu.isLit()) blit(pPoseStack, x + 41, y + 26 + menu.getFuelProgress(), 176, menu.getFuelProgress(), 14, 14 - menu.getFuelProgress());
        if(menu.hasIngredients()) blit(pPoseStack, x + 73, y + 34, 176, 14, 22, menu.getProgress());
    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
    }
}
