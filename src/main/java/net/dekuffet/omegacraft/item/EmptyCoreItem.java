
package net.dekuffet.omegacraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyCoreItem extends Item {
	public EmptyCoreItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
