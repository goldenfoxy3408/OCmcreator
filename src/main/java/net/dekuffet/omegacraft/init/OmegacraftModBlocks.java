
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.dekuffet.omegacraft.block.RubyOreBlock;
import net.dekuffet.omegacraft.block.RubyBlockBlock;
import net.dekuffet.omegacraft.block.PureEmeraldOreBlock;
import net.dekuffet.omegacraft.block.PureAgeEmeraldBlockBlock;
import net.dekuffet.omegacraft.block.OreCrusherBlock;
import net.dekuffet.omegacraft.block.MixedOreBlockBlock;
import net.dekuffet.omegacraft.block.MixedOreBlock;
import net.dekuffet.omegacraft.block.MassiveChestBlockBlock;
import net.dekuffet.omegacraft.block.KamisWorkshopBlock;
import net.dekuffet.omegacraft.block.EnderiteOreBlock;
import net.dekuffet.omegacraft.block.EnderiteBlockBlock;
import net.dekuffet.omegacraft.block.DeepslateMixedOreBlock;
import net.dekuffet.omegacraft.block.DeepslateAquamarineOreBlock;
import net.dekuffet.omegacraft.block.AquamarineOreBlock;
import net.dekuffet.omegacraft.block.AquamarineBlockBlock;
import net.dekuffet.omegacraft.OmegacraftMod;

public class OmegacraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmegacraftMod.MODID);
	public static final RegistryObject<Block> PURE_AGE_EMERALD_BLOCK = REGISTRY.register("pure_age_emerald_block", () -> new PureAgeEmeraldBlockBlock());
	public static final RegistryObject<Block> MIXED_ORE_BLOCK = REGISTRY.register("mixed_ore_block", () -> new MixedOreBlockBlock());
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = REGISTRY.register("aquamarine_block", () -> new AquamarineBlockBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> PURE_EMERALD_ORE = REGISTRY.register("pure_emerald_ore", () -> new PureEmeraldOreBlock());
	public static final RegistryObject<Block> MIXED_ORE = REGISTRY.register("mixed_ore", () -> new MixedOreBlock());
	public static final RegistryObject<Block> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", () -> new AquamarineOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_MIXED_ORE = REGISTRY.register("deepslate_mixed_ore", () -> new DeepslateMixedOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_AQUAMARINE_ORE = REGISTRY.register("deepslate_aquamarine_ore", () -> new DeepslateAquamarineOreBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> MASSIVE_CHEST_BLOCK = REGISTRY.register("massive_chest_block", () -> new MassiveChestBlockBlock());
	public static final RegistryObject<Block> ORE_CRUSHER = REGISTRY.register("ore_crusher", () -> new OreCrusherBlock());
	public static final RegistryObject<Block> KAMIS_WORKSHOP = REGISTRY.register("kamis_workshop", () -> new KamisWorkshopBlock());
}
