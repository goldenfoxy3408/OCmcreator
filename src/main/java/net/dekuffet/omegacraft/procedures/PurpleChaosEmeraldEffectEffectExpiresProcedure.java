package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class PurpleChaosEmeraldEffectEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.ABSORPTION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HEALTH_BOOST);
	}
}
