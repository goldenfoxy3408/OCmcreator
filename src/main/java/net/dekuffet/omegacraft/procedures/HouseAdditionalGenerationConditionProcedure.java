package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.dekuffet.omegacraft.network.OmegacraftModVariables;

public class HouseAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return OmegacraftModVariables.MapVariables.get(world).Firstload == false;
	}
}
