package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class GreenChaosEmeraldEffectEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.JUMP);
	}
}
