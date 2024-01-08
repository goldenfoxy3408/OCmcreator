package net.dekuffet.omegacraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.network.OmegacraftModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HouseOnStructureInstanceGeneratedProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (OmegacraftModVariables.MapVariables.get(world).Firstload == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("omegacraft", "house"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(world.getLevelData().getXSpawn() - 30, 200, world.getLevelData().getZSpawn() - 30),
							BlockPos.containing(world.getLevelData().getXSpawn() - 30, 200, world.getLevelData().getZSpawn() - 30), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			OmegacraftModVariables.MapVariables.get(world).Firstload = true;
			OmegacraftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
