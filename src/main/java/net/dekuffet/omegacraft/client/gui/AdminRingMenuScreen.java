package net.dekuffet.omegacraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.dekuffet.omegacraft.world.inventory.AdminRingMenuMenu;
import net.dekuffet.omegacraft.network.AdminRingMenuButtonMessage;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdminRingMenuScreen extends AbstractContainerScreen<AdminRingMenuMenu> {
	private final static HashMap<String, Object> guistate = AdminRingMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_creative;
	Button button_survival;
	Button button_adventure;
	Button button_spectator;
	Button button_peaceful;
	Button button_easy;
	Button button_normal;
	Button button_hard;
	Button button_next_page;
	Button button_clear;
	Button button_rain;
	Button button_thunder;

	public AdminRingMenuScreen(AdminRingMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 206;
		this.imageHeight = 181;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("omegacraft:textures/screens/admin_ring_menu.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/cai.png"));
		this.blit(ms, this.leftPos + -110, this.topPos + -29, 0, 0, 1280, 720, 1280, 720);

		RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/cai.png"));
		this.blit(ms, this.leftPos + -963, this.topPos + -509, 0, 0, 1280, 720, 1280, 720);

		RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/cai.png"));
		this.blit(ms, this.leftPos + -963, this.topPos + -29, 0, 0, 1280, 720, 1280, 720);

		RenderSystem.setShaderTexture(0, new ResourceLocation("omegacraft:textures/screens/cai.png"));
		this.blit(ms, this.leftPos + -110, this.topPos + -509, 0, 0, 1280, 720, 1280, 720);

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
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_ring_menu.label_admin_ring_menu"), 77, 5, -6750055);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_ring_menu.label_gamemode"), 32, 17, -3407821);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_ring_menu.label_difficulty"), 126, 17, -26368);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_ring_menu.label_page_12"), 90, 164, -16777012);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_ring_menu.label_weather"), 88, 122, -6711040);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_creative = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_creative"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(0, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 19, this.topPos + 30, 67, 20).build();
		guistate.put("button:button_creative", button_creative);
		this.addRenderableWidget(button_creative);
		button_survival = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_survival"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(1, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 19, this.topPos + 103, 67, 20).build();
		guistate.put("button:button_survival", button_survival);
		this.addRenderableWidget(button_survival);
		button_adventure = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_adventure"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(2, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 17, this.topPos + 54, 72, 20).build();
		guistate.put("button:button_adventure", button_adventure);
		this.addRenderableWidget(button_adventure);
		button_spectator = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_spectator"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(3, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 17, this.topPos + 79, 72, 20).build();
		guistate.put("button:button_spectator", button_spectator);
		this.addRenderableWidget(button_spectator);
		button_peaceful = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_peaceful"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(4, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 30, 67, 20).build();
		guistate.put("button:button_peaceful", button_peaceful);
		this.addRenderableWidget(button_peaceful);
		button_easy = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_easy"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(5, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 54, 46, 20).build();
		guistate.put("button:button_easy", button_easy);
		this.addRenderableWidget(button_easy);
		button_normal = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_normal"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(6, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 124, this.topPos + 79, 56, 20).build();
		guistate.put("button:button_normal", button_normal);
		this.addRenderableWidget(button_normal);
		button_hard = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_hard"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(7, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 103, 46, 20).build();
		guistate.put("button:button_hard", button_hard);
		this.addRenderableWidget(button_hard);
		button_next_page = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_next_page"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(8, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 156, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
		button_clear = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_clear"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(9, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 133, 51, 20).build();
		guistate.put("button:button_clear", button_clear);
		this.addRenderableWidget(button_clear);
		button_rain = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_rain"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(10, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 75, this.topPos + 133, 46, 20).build();
		guistate.put("button:button_rain", button_rain);
		this.addRenderableWidget(button_rain);
		button_thunder = Button.builder(Component.translatable("gui.omegacraft.admin_ring_menu.button_thunder"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminRingMenuButtonMessage(11, x, y, z));
				AdminRingMenuButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 133, 61, 20).build();
		guistate.put("button:button_thunder", button_thunder);
		this.addRenderableWidget(button_thunder);
	}
}
