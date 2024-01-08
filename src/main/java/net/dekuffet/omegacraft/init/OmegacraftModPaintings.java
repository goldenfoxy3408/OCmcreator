
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.dekuffet.omegacraft.OmegacraftMod;

public class OmegacraftModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, OmegacraftMod.MODID);
	public static final RegistryObject<PaintingVariant> MIXED_OREP = REGISTRY.register("mixed_orep", () -> new PaintingVariant(48, 48));
}
