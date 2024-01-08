
package net.dekuffet.omegacraft.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;

import net.dekuffet.omegacraft.procedures.GreenChaosEmeraldEffectEffectStartedappliedProcedure;
import net.dekuffet.omegacraft.procedures.GreenChaosEmeraldEffectEffectExpiresProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class GreenChaosEmeraldEffectMobEffect extends MobEffect {
	public GreenChaosEmeraldEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13369549);
	}

	@Override
	public String getDescriptionId() {
		return "effect.omegacraft.green_chaos_emerald_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GreenChaosEmeraldEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GreenChaosEmeraldEffectEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
