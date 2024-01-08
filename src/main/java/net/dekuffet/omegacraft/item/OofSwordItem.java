
package net.dekuffet.omegacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.dekuffet.omegacraft.procedures.XiaogProcedure;
import net.dekuffet.omegacraft.procedures.XgProcedure;
import net.dekuffet.omegacraft.init.OmegacraftModItems;

public class OofSwordItem extends SwordItem {
	public OofSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5668;
			}

			public float getSpeed() {
				return 19.5f;
			}

			public float getAttackDamageBonus() {
				return 13.5f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 1003;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OmegacraftModItems.ENDERITE_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		XgProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		XiaogProcedure.execute(itemstack);
	}
}
