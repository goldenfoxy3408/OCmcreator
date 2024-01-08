
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.dekuffet.omegacraft.client.gui.OrecScreen;
import net.dekuffet.omegacraft.client.gui.MassiveChestScreen;
import net.dekuffet.omegacraft.client.gui.AdminRingMenuScreen;
import net.dekuffet.omegacraft.client.gui.AdminMenuPage3Screen;
import net.dekuffet.omegacraft.client.gui.AdminMenuPage2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OmegacraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OmegacraftModMenus.MASSIVE_CHEST.get(), MassiveChestScreen::new);
			MenuScreens.register(OmegacraftModMenus.OREC.get(), OrecScreen::new);
			MenuScreens.register(OmegacraftModMenus.ADMIN_RING_MENU.get(), AdminRingMenuScreen::new);
			MenuScreens.register(OmegacraftModMenus.ADMIN_MENU_PAGE_2.get(), AdminMenuPage2Screen::new);
			MenuScreens.register(OmegacraftModMenus.ADMIN_MENU_PAGE_3.get(), AdminMenuPage3Screen::new);
		});
	}
}
