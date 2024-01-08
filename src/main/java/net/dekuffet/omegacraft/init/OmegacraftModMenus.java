
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.dekuffet.omegacraft.world.inventory.OrecMenu;
import net.dekuffet.omegacraft.world.inventory.MassiveChestMenu;
import net.dekuffet.omegacraft.world.inventory.AdminRingMenuMenu;
import net.dekuffet.omegacraft.world.inventory.AdminMenuPage3Menu;
import net.dekuffet.omegacraft.world.inventory.AdminMenuPage2Menu;
import net.dekuffet.omegacraft.OmegacraftMod;

public class OmegacraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OmegacraftMod.MODID);
	public static final RegistryObject<MenuType<MassiveChestMenu>> MASSIVE_CHEST = REGISTRY.register("massive_chest", () -> IForgeMenuType.create(MassiveChestMenu::new));
	public static final RegistryObject<MenuType<OrecMenu>> OREC = REGISTRY.register("orec", () -> IForgeMenuType.create(OrecMenu::new));
	public static final RegistryObject<MenuType<AdminRingMenuMenu>> ADMIN_RING_MENU = REGISTRY.register("admin_ring_menu", () -> IForgeMenuType.create(AdminRingMenuMenu::new));
	public static final RegistryObject<MenuType<AdminMenuPage2Menu>> ADMIN_MENU_PAGE_2 = REGISTRY.register("admin_menu_page_2", () -> IForgeMenuType.create(AdminMenuPage2Menu::new));
	public static final RegistryObject<MenuType<AdminMenuPage3Menu>> ADMIN_MENU_PAGE_3 = REGISTRY.register("admin_menu_page_3", () -> IForgeMenuType.create(AdminMenuPage3Menu::new));
}
