
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.dekuffet.omegacraft.block.entity.OreCrusherBlockEntity;
import net.dekuffet.omegacraft.block.entity.MassiveChestBlockBlockEntity;
import net.dekuffet.omegacraft.OmegacraftMod;

public class OmegacraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OmegacraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MASSIVE_CHEST_BLOCK = register("massive_chest_block", OmegacraftModBlocks.MASSIVE_CHEST_BLOCK, MassiveChestBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORE_CRUSHER = register("ore_crusher", OmegacraftModBlocks.ORE_CRUSHER, OreCrusherBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
