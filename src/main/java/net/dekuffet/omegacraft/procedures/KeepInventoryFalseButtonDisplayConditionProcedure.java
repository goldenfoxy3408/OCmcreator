package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class KeepInventoryFalseButtonDisplayConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(GameRules.RULE_KEEPINVENTORY) == true ? true : false;
	}
}
