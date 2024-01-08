
package net.dekuffet.omegacraft.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.world.inventory.AdminRingMenuMenu;
import net.dekuffet.omegacraft.procedures.ThunderProcedure;
import net.dekuffet.omegacraft.procedures.SurvivalProcedure;
import net.dekuffet.omegacraft.procedures.SpectatorProcedure;
import net.dekuffet.omegacraft.procedures.RainProcedure;
import net.dekuffet.omegacraft.procedures.PeacefulProcedure;
import net.dekuffet.omegacraft.procedures.NormalProcedure;
import net.dekuffet.omegacraft.procedures.NextPageProcedure;
import net.dekuffet.omegacraft.procedures.HardProcedure;
import net.dekuffet.omegacraft.procedures.EasyProcedure;
import net.dekuffet.omegacraft.procedures.CreativeProcedure;
import net.dekuffet.omegacraft.procedures.ClearProcedure;
import net.dekuffet.omegacraft.procedures.AdventureProcedure;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdminRingMenuButtonMessage {
	private final int buttonID, x, y, z;

	public AdminRingMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AdminRingMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AdminRingMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AdminRingMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AdminRingMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CreativeProcedure.execute(entity);
		}
		if (buttonID == 1) {

			SurvivalProcedure.execute(entity);
		}
		if (buttonID == 2) {

			AdventureProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SpectatorProcedure.execute(entity);
		}
		if (buttonID == 4) {

			PeacefulProcedure.execute(entity);
		}
		if (buttonID == 5) {

			EasyProcedure.execute(entity);
		}
		if (buttonID == 6) {

			NormalProcedure.execute(entity);
		}
		if (buttonID == 7) {

			HardProcedure.execute(entity);
		}
		if (buttonID == 8) {

			NextPageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ClearProcedure.execute(entity);
		}
		if (buttonID == 10) {

			RainProcedure.execute(entity);
		}
		if (buttonID == 11) {

			ThunderProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		OmegacraftMod.addNetworkMessage(AdminRingMenuButtonMessage.class, AdminRingMenuButtonMessage::buffer, AdminRingMenuButtonMessage::new, AdminRingMenuButtonMessage::handler);
	}
}
