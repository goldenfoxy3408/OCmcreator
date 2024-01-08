package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class XiaogProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack) != 0)) {
			itemstack.enchant(Enchantments.FIRE_ASPECT, (int) 2.45);
		} else if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.MOB_LOOTING, (int) 3.14);
		} else if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) != 0)) {
			itemstack.enchant(Enchantments.KNOCKBACK, (int) 3.491);
		}
	}
}
