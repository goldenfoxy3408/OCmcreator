package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.entity.Entity;

public class OPMPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
