
package net.dekuffet.omegacraft.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.dekuffet.omegacraft.procedures.ChaosPoweredEffectStartedappliedProcedure;
import net.dekuffet.omegacraft.procedures.ChaosPoweredEffectExpiresProcedure;

public class ChaosPoweredMobEffect extends MobEffect {
	public ChaosPoweredMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13369549);
	}

	@Override
	public String getDescriptionId() {
		return "effect.omegacraft.chaos_powered";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ChaosPoweredEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ChaosPoweredEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
