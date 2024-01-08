
package net.dekuffet.omegacraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MixedOreIngotItem extends Item {
	public MixedOreIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
