package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.dekuffet.omegacraft.init.OmegacraftModMobEffects;

public class MasterEmeraldItemBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(OmegacraftModMobEffects.CHAOS_POWERED.get());
	}
}
