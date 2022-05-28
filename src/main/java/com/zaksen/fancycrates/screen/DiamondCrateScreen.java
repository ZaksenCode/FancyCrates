package com.zaksen.fancycrates.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.zaksen.fancycrates.FancyCrates;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class DiamondCrateScreen extends AbstractContainerScreen<DiamondCrateMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(FancyCrates.MOD_ID, "textures/gui/diamond_crate_gui.png");

    public DiamondCrateScreen(DiamondCrateMenu Menu, Inventory Inv, Component Title) {
        super(Menu, Inv, Title);
    }

    @Override
    protected void renderBg(PoseStack PoseStack, float PartialTick, int MouseX, int MouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        imageWidth = 212;
        imageHeight = 202;
        titleLabelX = -10;
        titleLabelY = -12;
        inventoryLabelX = 8;
        inventoryLabelY = 90;
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(PoseStack, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void render(PoseStack PoseStack, int MouseX, int MouseY, float Delata)
    {
        renderBackground(PoseStack);
        super.render(PoseStack, MouseX, MouseY, Delata);
        renderTooltip(PoseStack, MouseX, MouseY);
    }
}
