package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class FireSpreadsFalseProcedureProcedure {
	public static void execute(LevelAccessor world) {
		world.getLevelData().getGameRules().getRule(GameRules.RULE_DOFIRETICK).set(false, world.getServer());
	}
}
