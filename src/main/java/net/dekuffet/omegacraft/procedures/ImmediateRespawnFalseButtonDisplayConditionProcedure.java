package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class ImmediateRespawnFalseButtonDisplayConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DO_IMMEDIATE_RESPAWN) == true ? true : false;
	}
}
