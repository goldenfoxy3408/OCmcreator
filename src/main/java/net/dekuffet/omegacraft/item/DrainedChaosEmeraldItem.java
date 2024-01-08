
package net.dekuffet.omegacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DrainedChaosEmeraldItem extends Item {
	public DrainedChaosEmeraldItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The shell of a chaos emerald that"));
		list.add(Component.literal("once existed but lost its power"));
		list.add(Component.literal("these things are all around the earth but"));
		list.add(Component.literal("only the purest of emeralds..."));
	}
}
