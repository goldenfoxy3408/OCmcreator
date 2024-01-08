package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.dekuffet.omegacraft.init.OmegacraftModMobEffects;

public class ChaosPoweredEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.PURPLE_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.YELLOW_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.WHITE_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.TURQUIOSE_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.RED_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.PINK_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.ORANGE_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.GREEN_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.BLUE_CHAOS_EMERALD_EFFECT.get(), 2147483647, 1, true, false));
	}
}
