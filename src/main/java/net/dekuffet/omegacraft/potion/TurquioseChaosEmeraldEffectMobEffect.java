
package net.dekuffet.omegacraft.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;

import net.dekuffet.omegacraft.procedures.TurquioseChaosEmeraldEffectEffectStartedappliedProcedure;
import net.dekuffet.omegacraft.procedures.TurquioseChaosEmeraldEffectEffectExpiresProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class TurquioseChaosEmeraldEffectMobEffect extends MobEffect {
	public TurquioseChaosEmeraldEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.omegacraft.turquiose_chaos_emerald_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TurquioseChaosEmeraldEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TurquioseChaosEmeraldEffectEffectExpiresProcedure.execute(entity);
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
