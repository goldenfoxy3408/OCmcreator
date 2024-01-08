package net.dekuffet.omegacraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.network.OmegacraftModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WitherStormRemainsOnStructureInstanceGeneratedProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (OmegacraftModVariables.MapVariables.get(world).FirstTimeJoining == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("omegacraft", "wither_storm_remains"));
				if (template != null) {
					template.placeInWorld(_serverworld,
							BlockPos.containing(world.getLevelData().getXSpawn() + 150, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (world.getLevelData().getXSpawn() + 150), (int) (world.getLevelData().getZSpawn() + 150)),
									world.getLevelData().getZSpawn() + 150),
							BlockPos.containing(world.getLevelData().getXSpawn() + 150, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (world.getLevelData().getXSpawn() + 150), (int) (world.getLevelData().getZSpawn() + 150)),
									world.getLevelData().getZSpawn() + 150),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			OmegacraftModVariables.MapVariables.get(world).FirstTimeJoining = true;
			OmegacraftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
