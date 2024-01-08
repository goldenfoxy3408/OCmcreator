package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.dekuffet.omegacraft.init.OmegacraftModMobEffects;

public class MasterEmeraldItemBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(OmegacraftModMobEffects.CHAOS_POWERED.get(), 2147483647, 1, false, true));
	}
}
