package net.dekuffet.omegacraft.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class RunCommandButtonDisplayConditionProcedure {
	public static boolean execute(HashMap guistate) {
		if (guistate == null)
			return false;
		return (guistate.containsKey("text:CommandInput") ? ((EditBox) guistate.get("text:CommandInput")).getValue() : "").isEmpty() == false ? true : false;
	}
}
