package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class LavaSourceConversionTrueButtonDisplayConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(GameRules.RULE_LAVA_SOURCE_CONVERSION) == false ? true : false;
	}
}
