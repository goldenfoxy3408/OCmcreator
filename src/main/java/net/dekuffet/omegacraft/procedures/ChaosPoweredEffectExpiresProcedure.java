package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.dekuffet.omegacraft.init.OmegacraftModMobEffects;

public class ChaosPoweredEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.BLUE_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.GREEN_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.ORANGE_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.PINK_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.PURPLE_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.RED_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.TURQUIOSE_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.WHITE_CHAOS_EMERALD_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.YELLOW_CHAOS_EMERALD_EFFECT.get());
	}
}
