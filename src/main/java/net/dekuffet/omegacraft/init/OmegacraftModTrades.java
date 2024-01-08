
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.dekuffet.omegacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OmegacraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR), new ItemStack(OmegacraftModItems.ONE_STAR_DRAGON_BALL.get()), 1, 20, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 2), new ItemStack(OmegacraftModItems.TWO_STAR_DRAGON_BALL.get()), 1, 20, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 3), new ItemStack(OmegacraftModItems.THREE_STAR_DRAGON_BALL.get()), 1, 40, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 4), new ItemStack(OmegacraftModItems.FOUR_STAR_DRAGON_BALL.get()), 1, 40, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 5), new ItemStack(OmegacraftModItems.FIVE_STAR_DRAGON_BALL.get()), 1, 60, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 6), new ItemStack(OmegacraftModItems.SIX_STAR_DRAGON_BALL.get()), 1, 60, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Items.NETHER_STAR, 7), new ItemStack(OmegacraftModItems.SEVEN_STAR_DRAGON_BALL.get()), 1, 160, 0f));
		}
		if (event.getType() == OmegacraftModVillagerProfessions.GAURDIAN_OF_EARTH.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.TOTEM_OF_UNDYING), new ItemStack(OmegacraftModItems.COMMAND_BOOK.get()), new ItemStack(OmegacraftModItems.OPM.get()), 1, 200, 0f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 20), new ItemStack(Items.EMERALD, 33), new ItemStack(OmegacraftModItems.MIXED_ORE_INGOT.get(), 3), 5, 9, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OmegacraftModItems.MIXED_ORE_INGOT.get(), 2),

					new ItemStack(Items.NETHERITE_INGOT, 4), 8, 7, 0.05f));
		}
	}
}
