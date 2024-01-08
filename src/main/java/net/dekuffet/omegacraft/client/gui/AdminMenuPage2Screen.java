package net.dekuffet.omegacraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.dekuffet.omegacraft.world.inventory.AdminMenuPage2Menu;
import net.dekuffet.omegacraft.network.AdminMenuPage2ButtonMessage;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdminMenuPage2Screen extends AbstractContainerScreen<AdminMenuPage2Menu> {
	private final static HashMap<String, Object> guistate = AdminMenuPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox TpToX;
	EditBox TpToY;
	EditBox TpToZ;
	Button button_previous_page;
	Button button_kill_bosses;
	Button button_kill_players;
	Button button_kill_all;
	Button button_kill_entities;
	Button button_tp_items_to_player;
	Button button_teleport;
	Button button_next_page;
	Button button_kill_self;

	public AdminMenuPage2Screen(AdminMenuPage2Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("omegacraft:textures/screens/admin_menu_page_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		TpToX.render(ms, mouseX, mouseY, partialTicks);
		TpToY.render(ms, mouseX, mouseY, partialTicks);
		TpToZ.render(ms, mouseX, mouseY, partialTicks);
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
		if (TpToX.isFocused())
			return TpToX.keyPressed(key, b, c);
		if (TpToY.isFocused())
			return TpToY.keyPressed(key, b, c);
		if (TpToZ.isFocused())
			return TpToZ.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TpToX.tick();
		TpToY.tick();
		TpToZ.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_admin_menu"), 73, 5, -6750055);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_x"), 19, 128, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_tp_coordinates"), 56, 112, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_y"), 60, 128, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_z"), 101, 128, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_2.label_page"), 99, 161, -16777012);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		TpToX = new EditBox(this.font, this.leftPos + 29, this.topPos + 123, 25, 20, Component.translatable("gui.omegacraft.admin_menu_page_2.TpToX"));
		TpToX.setMaxLength(32767);
		guistate.put("text:TpToX", TpToX);
		this.addWidget(this.TpToX);
		TpToY = new EditBox(this.font, this.leftPos + 70, this.topPos + 123, 25, 20, Component.translatable("gui.omegacraft.admin_menu_page_2.TpToY"));
		TpToY.setMaxLength(32767);
		guistate.put("text:TpToY", TpToY);
		this.addWidget(this.TpToY);
		TpToZ = new EditBox(this.font, this.leftPos + 111, this.topPos + 123, 25, 20, Component.translatable("gui.omegacraft.admin_menu_page_2.TpToZ"));
		TpToZ.setMaxLength(32767);
		guistate.put("text:TpToZ", TpToZ);
		this.addWidget(this.TpToZ);
		button_previous_page = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_previous_page"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(0, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 156, 93, 20).build();
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
		button_kill_bosses = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_kill_bosses"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(1, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 27, 82, 20).build();
		guistate.put("button:button_kill_bosses", button_kill_bosses);
		this.addRenderableWidget(button_kill_bosses);
		button_kill_players = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_kill_players"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(2, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 27, 87, 20).build();
		guistate.put("button:button_kill_players", button_kill_players);
		this.addRenderableWidget(button_kill_players);
		button_kill_all = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_kill_all"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(3, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 117, this.topPos + 54, 66, 20).build();
		guistate.put("button:button_kill_all", button_kill_all);
		this.addRenderableWidget(button_kill_all);
		button_kill_entities = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_kill_entities"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(4, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 13, this.topPos + 54, 93, 20).build();
		guistate.put("button:button_kill_entities", button_kill_entities);
		this.addRenderableWidget(button_kill_entities);
		button_tp_items_to_player = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_tp_items_to_player"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(5, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 80, 118, 20).build();
		guistate.put("button:button_tp_items_to_player", button_tp_items_to_player);
		this.addRenderableWidget(button_tp_items_to_player);
		button_teleport = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_teleport"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(6, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 140, this.topPos + 123, 57, 20).build();
		guistate.put("button:button_teleport", button_teleport);
		this.addRenderableWidget(button_teleport);
		button_next_page = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_next_page"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(7, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + 156, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
		button_kill_self = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_2.button_kill_self"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage2ButtonMessage(8, x, y, z));
				AdminMenuPage2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 126, this.topPos + 80, 72, 20).build();
		guistate.put("button:button_kill_self", button_kill_self);
		this.addRenderableWidget(button_kill_self);
	}
}
