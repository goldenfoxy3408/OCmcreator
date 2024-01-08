
package net.dekuffet.omegacraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.dekuffet.omegacraft.procedures.Xg5Procedure;
import net.dekuffet.omegacraft.procedures.Xg4Procedure;
import net.dekuffet.omegacraft.procedures.Xg3Procedure;
import net.dekuffet.omegacraft.init.OmegacraftModItems;

public abstract class OofArmorItem extends ArmorItem {
	public OofArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 55;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{18, 19, 24, 20}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 31;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OmegacraftModItems.ENDERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "oof_armor";
			}

			@Override
			public float getToughness() {
				return 4.8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.54f;
			}
		}, type, properties);
	}

	public static class Helmet extends OofArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "omegacraft:textures/models/armor/enderite__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg3Procedure.execute(entity);
		}
	}

	public static class Chestplate extends OofArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "omegacraft:textures/models/armor/enderite__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg4Procedure.execute(entity);
		}
	}

	public static class Leggings extends OofArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "omegacraft:textures/models/armor/enderite__layer_2.png";
		}
	}

	public static class Boots extends OofArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "omegacraft:textures/models/armor/enderite__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Xg5Procedure.execute(entity);
		}
	}
}
