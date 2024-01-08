
package net.dekuffet.omegacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PureAgeEmeraldItem extends Item {
	public PureAgeEmeraldItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("An emerald from the Sengoku Era"));
		list.add(Component.literal("Truly pure and powerful"));
		list.add(Component.literal("Capable of manipulating the power of the emerald"));
		list.add(Component.literal("Also good for containing essences"));
	}
}
