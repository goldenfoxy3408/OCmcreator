
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.dekuffet.omegacraft.potion.YellowChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.WhiteChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.TurquioseChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.RedChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.PurpleChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.PinkChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.OrangeChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.GreenChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.potion.ChaosPoweredMobEffect;
import net.dekuffet.omegacraft.potion.BlueChaosEmeraldEffectMobEffect;
import net.dekuffet.omegacraft.OmegacraftMod;

public class OmegacraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OmegacraftMod.MODID);
	public static final RegistryObject<MobEffect> CHAOS_POWERED = REGISTRY.register("chaos_powered", () -> new ChaosPoweredMobEffect());
	public static final RegistryObject<MobEffect> RED_CHAOS_EMERALD_EFFECT = REGISTRY.register("red_chaos_emerald_effect", () -> new RedChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> BLUE_CHAOS_EMERALD_EFFECT = REGISTRY.register("blue_chaos_emerald_effect", () -> new BlueChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> YELLOW_CHAOS_EMERALD_EFFECT = REGISTRY.register("yellow_chaos_emerald_effect", () -> new YellowChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> WHITE_CHAOS_EMERALD_EFFECT = REGISTRY.register("white_chaos_emerald_effect", () -> new WhiteChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> GREEN_CHAOS_EMERALD_EFFECT = REGISTRY.register("green_chaos_emerald_effect", () -> new GreenChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> PINK_CHAOS_EMERALD_EFFECT = REGISTRY.register("pink_chaos_emerald_effect", () -> new PinkChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> ORANGE_CHAOS_EMERALD_EFFECT = REGISTRY.register("orange_chaos_emerald_effect", () -> new OrangeChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> TURQUIOSE_CHAOS_EMERALD_EFFECT = REGISTRY.register("turquiose_chaos_emerald_effect", () -> new TurquioseChaosEmeraldEffectMobEffect());
	public static final RegistryObject<MobEffect> PURPLE_CHAOS_EMERALD_EFFECT = REGISTRY.register("purple_chaos_emerald_effect", () -> new PurpleChaosEmeraldEffectMobEffect());
}
