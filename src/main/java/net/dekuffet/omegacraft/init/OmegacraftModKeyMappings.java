
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.dekuffet.omegacraft.network.AdminMenuKeybindMessage;
import net.dekuffet.omegacraft.OmegacraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OmegacraftModKeyMappings {
	public static final KeyMapping ADMIN_MENU_KEYBIND = new KeyMapping("key.omegacraft.admin_menu_keybind", GLFW.GLFW_KEY_M, "key.categories.minecraftplus") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				OmegacraftMod.PACKET_HANDLER.sendToServer(new AdminMenuKeybindMessage(0, 0));
				AdminMenuKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ADMIN_MENU_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ADMIN_MENU_KEYBIND.consumeClick();
			}
		}
	}
}
