
package net.dekuffet.omegacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.dekuffet.omegacraft.procedures.Xiaog2Procedure;
import net.dekuffet.omegacraft.init.OmegacraftModItems;

public class OofPickaxeItem extends PickaxeItem {
	public OofPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5668;
			}

			public float getSpeed() {
				return 19.5f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OmegacraftModItems.ENDERITE_INGOT.get()));
			}
		}, 1, -2.35f, new Item.Properties().fireResistant());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Xiaog2Procedure.execute(itemstack);
	}
}
