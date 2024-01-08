package net.dekuffet.omegacraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.dekuffet.omegacraft.world.inventory.OrecMenu;
import net.dekuffet.omegacraft.procedures.XianshiProcedure;
import net.dekuffet.omegacraft.procedures.XiansProcedure;
import net.dekuffet.omegacraft.procedures.Xians6Procedure;
import net.dekuffet.omegacraft.procedures.Xians5Procedure;
import net.dekuffet.omegacraft.procedures.Xians4Procedure;
import net.dekuffet.omegacraft.procedures.Xians3Procedure;
import net.dekuffet.omegacraft.procedures.Xians2Procedure;
import net.dekuffet.omegacraft.procedures.Xians1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class OrecScreen extends AbstractContainerScreen<OrecMenu> {
	private final static HashMap<String, Object> guistate = OrecMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public OrecScreen(OrecMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 154;
	}

	private static final ResourceLocation texture = new ResourceLocation("omegacraft:textures/screens/orec.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui0.png"));
		this.blit(ms, this.leftPos + 72, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		if (XianshiProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui1.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 2, 4, 2);
		}
		if (Xians1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui2.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 4, 4, 4);
		}
		if (Xians2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui3.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 6, 4, 6);
		}
		if (Xians3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui4.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 8, 4, 8);
		}
		if (Xians4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui5.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 10, 4, 10);
		}
		if (Xians5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui6.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 31, 0, 0, 4, 12, 4, 12);
		}
		if (Xians6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui7.png"));
			this.blit(ms, this.leftPos + 72, this.topPos + 31, 0, 0, 16, 14, 16, 14);
		}
		if (XiansProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/ore__crushergui.png"));
			this.blit(ms, this.leftPos + 72, this.topPos + 31, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.orec.label_ore_crusher"), 63, 3, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
