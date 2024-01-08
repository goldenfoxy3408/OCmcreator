
package net.dekuffet.omegacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.dekuffet.omegacraft.procedures.Xiaog2Procedure;
import net.dekuffet.omegacraft.init.OmegacraftModItems;

public class AquamarineShovelItem extends ShovelItem {
	public AquamarineShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 4337;
			}

			public float getSpeed() {
				return 16.5f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OmegacraftModItems.AQUAMARINE.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Xiaog2Procedure.execute(itemstack);
	}
}
