
package net.dekuffet.omegacraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
