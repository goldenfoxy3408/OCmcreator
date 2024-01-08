package net.dekuffet.omegacraft.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class TpCoordsProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:TpToX") ? ((EditBox) guistate.get("text:TpToX")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:TpToY") ? ((EditBox) guistate.get("text:TpToY")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:TpToZ") ? ((EditBox) guistate.get("text:TpToZ")).getValue() : ""));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:TpToX") ? ((EditBox) guistate.get("text:TpToX")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:TpToY") ? ((EditBox) guistate.get("text:TpToY")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:TpToZ") ? ((EditBox) guistate.get("text:TpToZ")).getValue() : ""), _ent.getYRot(), _ent.getXRot());
		}
	}
}
