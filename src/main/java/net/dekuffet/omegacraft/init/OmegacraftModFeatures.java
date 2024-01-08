
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.dekuffet.omegacraft.world.features.ores.RubyOreFeature;
import net.dekuffet.omegacraft.world.features.ores.PureEmeraldOreFeature;
import net.dekuffet.omegacraft.world.features.ores.MixedOreFeature;
import net.dekuffet.omegacraft.world.features.ores.EnderiteOreFeature;
import net.dekuffet.omegacraft.world.features.ores.DeepslateMixedOreFeature;
import net.dekuffet.omegacraft.world.features.ores.DeepslateAquamarineOreFeature;
import net.dekuffet.omegacraft.world.features.ores.AquamarineOreFeature;
import net.dekuffet.omegacraft.world.features.WitherStormRemainsFeature;
import net.dekuffet.omegacraft.world.features.HouseFeature;
import net.dekuffet.omegacraft.OmegacraftMod;

@Mod.EventBusSubscriber
public class OmegacraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OmegacraftMod.MODID);
	public static final RegistryObject<Feature<?>> PURE_EMERALD_ORE = REGISTRY.register("pure_emerald_ore", PureEmeraldOreFeature::new);
	public static final RegistryObject<Feature<?>> MIXED_ORE = REGISTRY.register("mixed_ore", MixedOreFeature::new);
	public static final RegistryObject<Feature<?>> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", AquamarineOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_MIXED_ORE = REGISTRY.register("deepslate_mixed_ore", DeepslateMixedOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_AQUAMARINE_ORE = REGISTRY.register("deepslate_aquamarine_ore", DeepslateAquamarineOreFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::new);
	public static final RegistryObject<Feature<?>> HOUSE = REGISTRY.register("house", HouseFeature::new);
	public static final RegistryObject<Feature<?>> WITHER_STORM_REMAINS = REGISTRY.register("wither_storm_remains", WitherStormRemainsFeature::new);
}
