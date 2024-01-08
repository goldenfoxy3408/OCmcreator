
package net.dekuffet.omegacraft.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.dekuffet.omegacraft.procedures.MasterEmeraldItemBaubleIsUnequippedProcedure;
import net.dekuffet.omegacraft.procedures.MasterEmeraldItemBaubleIsEquippedProcedure;

import java.util.List;

public class MasterEmeraldItemItem extends Item implements ICurioItem {
	public MasterEmeraldItemItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Many years ago"));
		list.add(Component.literal("a fearsome group of warriors known as the echidnas"));
		list.add(Component.literal("forged the 9 Chaos Emeralds into the most unstoppable"));
		list.add(Component.literal("weapon ever created: The Master Emerald"));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		MasterEmeraldItemBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		MasterEmeraldItemBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
