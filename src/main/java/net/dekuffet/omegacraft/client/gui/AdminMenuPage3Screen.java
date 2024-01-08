package net.dekuffet.omegacraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.dekuffet.omegacraft.world.inventory.AdminMenuPage3Menu;
import net.dekuffet.omegacraft.procedures.RunCommandButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.LimitedCratingFalseButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.LimitedCraftingTrueButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.LavaSourceConversionTrueButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.LavaSourceConversionFalseButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.KeepInventoryTrueButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.KeepInventoryFalseButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.ImmediateRespawnTrueButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.ImmediateRespawnFalseButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.FireSpreadsTrueButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.procedures.FireSpreadsFalseButtonDisplayConditionProcedure;
import net.dekuffet.omegacraft.network.AdminMenuPage3ButtonMessage;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdminMenuPage3Screen extends AbstractContainerScreen<AdminMenuPage3Menu> {
	private final static HashMap<String, Object> guistate = AdminMenuPage3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox CommandInput;
	Button button_previous_page;
	Button button_true;
	Button button_false;
	Button button_true1;
	Button button_false1;
	Button button_true2;
	Button button_true3;
	Button button_true4;
	Button button_false2;
	Button button_false3;
	Button button_false4;
	Button button_run;

	public AdminMenuPage3Screen(AdminMenuPage3Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("omegacraft:textures/screens/admin_menu_page_3.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		CommandInput.render(ms, mouseX, mouseY, partialTicks);
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
		if (CommandInput.isFocused())
			return CommandInput.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		CommandInput.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_admin_menu"), 71, 5, -6750055);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_pg_3"), 87, 163, -16777012);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_run_command"), 2, 141, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_keep_inventory"), 3, 32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_gamerules"), 17, 20, -16738048);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_fire_spreads"), 6, 93, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_immediate_respawn"), 3, 73, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_limited_crafting"), 3, 53, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_lava_source_block_conversion"), 3, 113, -12829636);
		if (KeepInventoryTrueButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently_false"), 55, 43, -65536);
		if (FireSpreadsTrueButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently_false1"), 53, 104, -65536);
		if (ImmediateRespawnTrueButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently_false2"), 56, 82, -65536);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently"), 3, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently1"), 2, 63, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently2"), 3, 83, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently3"), 2, 104, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_currently4"), 11, 123, -12829636);
		if (LavaSourceConversionTrueButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_false"), 64, 124, -65536);
		if (LimitedCraftingTrueButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_false1"), 55, 63, -65536);
		if (LavaSourceConversionFalseButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_true"), 63, 124, -16751104);
		if (LimitedCratingFalseButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_true1"), 55, 63, -16751104);
		if (ImmediateRespawnFalseButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_true2"), 57, 82, -16751104);
		if (FireSpreadsFalseButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_true3"), 54, 104, -16751104);
		if (KeepInventoryFalseButtonDisplayConditionProcedure.execute(world))
			this.font.draw(poseStack, Component.translatable("gui.omegacraft.admin_menu_page_3.label_true4"), 55, 43, -16751104);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		CommandInput = new EditBox(this.font, this.leftPos + 54, this.topPos + 136, 120, 20, Component.translatable("gui.omegacraft.admin_menu_page_3.CommandInput"));
		CommandInput.setMaxLength(32767);
		guistate.put("text:CommandInput", CommandInput);
		this.addWidget(this.CommandInput);
		button_previous_page = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_previous_page"), e -> {
			if (true) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(0, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 156, 81, 20).build();
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
		button_true = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_true"), e -> {
			if (KeepInventoryTrueButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(1, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 27, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (KeepInventoryTrueButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_true", button_true);
		this.addRenderableWidget(button_true);
		button_false = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_false"), e -> {
			if (KeepInventoryFalseButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(2, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 82, this.topPos + 27, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (KeepInventoryFalseButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_false", button_false);
		this.addRenderableWidget(button_false);
		button_true1 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_true1"), e -> {
			if (LimitedCraftingTrueButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(3, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 122, this.topPos + 48, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (LimitedCraftingTrueButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_true1", button_true1);
		this.addRenderableWidget(button_true1);
		button_false1 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_false1"), e -> {
			if (LimitedCratingFalseButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(4, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 48, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (LimitedCratingFalseButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_false1", button_false1);
		this.addRenderableWidget(button_false1);
		button_true2 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_true2"), e -> {
			if (ImmediateRespawnTrueButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(5, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + 69, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ImmediateRespawnTrueButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_true2", button_true2);
		this.addRenderableWidget(button_true2);
		button_true3 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_true3"), e -> {
			if (FireSpreadsTrueButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(6, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 90, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (FireSpreadsTrueButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_true3", button_true3);
		this.addRenderableWidget(button_true3);
		button_true4 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_true4"), e -> {
			if (LavaSourceConversionTrueButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(7, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 114, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (LavaSourceConversionTrueButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_true4", button_true4);
		this.addRenderableWidget(button_true4);
		button_false2 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_false2"), e -> {
			if (FireSpreadsFalseButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(8, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 90, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (FireSpreadsFalseButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_false2", button_false2);
		this.addRenderableWidget(button_false2);
		button_false3 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_false3"), e -> {
			if (ImmediateRespawnFalseButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(9, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 97, this.topPos + 69, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ImmediateRespawnFalseButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_false3", button_false3);
		this.addRenderableWidget(button_false3);
		button_false4 = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_false4"), e -> {
			if (LavaSourceConversionFalseButtonDisplayConditionProcedure.execute(world)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(10, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 94, 31, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (LavaSourceConversionFalseButtonDisplayConditionProcedure.execute(world))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_false4", button_false4);
		this.addRenderableWidget(button_false4);
		button_run = Button.builder(Component.translatable("gui.omegacraft.admin_menu_page_3.button_run"), e -> {
			if (RunCommandButtonDisplayConditionProcedure.execute(guistate)) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuPage3ButtonMessage(11, x, y, z));
				AdminMenuPage3ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 174, this.topPos + 136, 27, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (RunCommandButtonDisplayConditionProcedure.execute(guistate))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_run", button_run);
		this.addRenderableWidget(button_run);
	}
}
