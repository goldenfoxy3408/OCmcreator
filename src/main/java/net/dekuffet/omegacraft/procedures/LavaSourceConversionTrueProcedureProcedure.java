package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class LavaSourceConversionTrueProcedureProcedure {
	public static void execute(LevelAccessor world) {
		world.getLevelData().getGameRules().getRule(GameRules.RULE_LAVA_SOURCE_CONVERSION).set(true, world.getServer());
	}
}
