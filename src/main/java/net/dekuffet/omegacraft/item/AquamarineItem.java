
package net.dekuffet.omegacraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AquamarineItem extends Item {
	public AquamarineItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
