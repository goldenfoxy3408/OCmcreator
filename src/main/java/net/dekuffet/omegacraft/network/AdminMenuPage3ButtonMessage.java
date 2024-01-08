
package net.dekuffet.omegacraft.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.world.inventory.AdminMenuPage3Menu;
import net.dekuffet.omegacraft.procedures.RunCommandProcedureProcedure;
import net.dekuffet.omegacraft.procedures.PreviousPage2Procedure;
import net.dekuffet.omegacraft.procedures.LimitedCraftingTrueProcedureProcedure;
import net.dekuffet.omegacraft.procedures.LimitedCraftingFalseProcedureProcedure;
import net.dekuffet.omegacraft.procedures.LavaSourceConversionTrueProcedureProcedure;
import net.dekuffet.omegacraft.procedures.LavaSourceConversionFalseProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KeepInventoryTrueButtonProcedureProcedure;
import net.dekuffet.omegacraft.procedures.KeepInventoryFalseButtonProcedureProcedure;
import net.dekuffet.omegacraft.procedures.ImmediateRespawnTrueProcedureProcedure;
import net.dekuffet.omegacraft.procedures.ImmediateRespawnFalseProcedureProcedure;
import net.dekuffet.omegacraft.procedures.FireSpreadsTrueProcedureProcedure;
import net.dekuffet.omegacraft.procedures.FireSpreadsFalseProcedureProcedure;
import net.dekuffet.omegacraft.OmegacraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdminMenuPage3ButtonMessage {
	private final int buttonID, x, y, z;

	public AdminMenuPage3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AdminMenuPage3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AdminMenuPage3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AdminMenuPage3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AdminMenuPage3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PreviousPage2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			KeepInventoryTrueButtonProcedureProcedure.execute(world);
		}
		if (buttonID == 2) {

			KeepInventoryFalseButtonProcedureProcedure.execute(world);
		}
		if (buttonID == 3) {

			LimitedCraftingTrueProcedureProcedure.execute(world);
		}
		if (buttonID == 4) {

			LimitedCraftingFalseProcedureProcedure.execute(world);
		}
		if (buttonID == 5) {

			ImmediateRespawnTrueProcedureProcedure.execute(world);
		}
		if (buttonID == 6) {

			FireSpreadsTrueProcedureProcedure.execute(world);
		}
		if (buttonID == 7) {

			LavaSourceConversionTrueProcedureProcedure.execute(world);
		}
		if (buttonID == 8) {

			FireSpreadsFalseProcedureProcedure.execute(world);
		}
		if (buttonID == 9) {

			ImmediateRespawnFalseProcedureProcedure.execute(world);
		}
		if (buttonID == 10) {

			LavaSourceConversionFalseProcedureProcedure.execute(world);
		}
		if (buttonID == 11) {

			RunCommandProcedureProcedure.execute(entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		OmegacraftMod.addNetworkMessage(AdminMenuPage3ButtonMessage.class, AdminMenuPage3ButtonMessage::buffer, AdminMenuPage3ButtonMessage::new, AdminMenuPage3ButtonMessage::handler);
	}
}
