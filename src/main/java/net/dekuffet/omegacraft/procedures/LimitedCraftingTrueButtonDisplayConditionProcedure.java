package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;

public class LimitedCraftingTrueButtonDisplayConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(GameRules.RULE_LIMITED_CRAFTING) == false ? true : false;
	}
}
