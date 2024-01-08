
package net.dekuffet.omegacraft.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.world.inventory.AdminMenuPage2Menu;
import net.dekuffet.omegacraft.procedures.TpItemsSelfProcedure;
import net.dekuffet.omegacraft.procedures.TpCoordsProcedure;
import net.dekuffet.omegacraft.procedures.PreviousPageProcedure;
import net.dekuffet.omegacraft.procedures.NextPage2Procedure;
import net.dekuffet.omegacraft.procedures.KillSelfProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KillPlayersProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KillEntitiesProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KillBossesProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KillAllProcedureProcedure;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdminMenuPage2ButtonMessage {
	private final int buttonID, x, y, z;

	public AdminMenuPage2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AdminMenuPage2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AdminMenuPage2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AdminMenuPage2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = AdminMenuPage2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PreviousPageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			KillBossesProcedureProcedure.execute(entity);
		}
		if (buttonID == 2) {

			KillPlayersProcedureProcedure.execute(entity);
		}
		if (buttonID == 3) {

			KillAllProcedureProcedure.execute(entity);
		}
		if (buttonID == 4) {

			KillEntitiesProcedureProcedure.execute(entity);
		}
		if (buttonID == 5) {

			TpItemsSelfProcedure.execute(entity);
		}
		if (buttonID == 6) {

			TpCoordsProcedure.execute(entity, guistate);
		}
		if (buttonID == 7) {

			NextPage2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			KillSelfProcedureProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		OmegacraftMod.addNetworkMessage(AdminMenuPage2ButtonMessage.class, AdminMenuPage2ButtonMessage::buffer, AdminMenuPage2ButtonMessage::new, AdminMenuPage2ButtonMessage::handler);
	}
}
