package net.dekuffet.omegacraft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.dekuffet.omegacraft.network.OmegacraftModVariables;

public class WitherStormRemainsAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return OmegacraftModVariables.MapVariables.get(world).FirstTimeJoining == false;
	}
}
