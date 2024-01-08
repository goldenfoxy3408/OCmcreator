
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.dekuffet.omegacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmegacraftModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("omegacraft", "minecraftplus_items"),
				builder -> builder.title(Component.translatable("item_group.omegacraft.minecraftplus_items")).icon(() -> new ItemStack(OmegacraftModItems.RGB_STAR.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OmegacraftModItems.GREEN_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.RED_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.BLUE_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.WHITE_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.YELLOW_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.PURPLE_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.PINK_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.ORANGE_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.TURQUOISE_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.DRAINED_CHAOS_EMERALD.get());
					tabData.accept(OmegacraftModItems.ONE_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.TWO_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.THREE_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.FOUR_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.FIVE_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.SIX_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.SEVEN_STAR_DRAGON_BALL.get());
					tabData.accept(OmegacraftModItems.RED_STAR_DRAGON_BALL_SET.get());
					tabData.accept(OmegacraftModItems.PURE_AGE_EMERALD.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_INGOT.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE.get());
					tabData.accept(OmegacraftModItems.RUBY.get());
					tabData.accept(OmegacraftModItems.ENDERITE_SCRAP.get());
					tabData.accept(OmegacraftModItems.ENDERITE_INGOT.get());
					tabData.accept(OmegacraftModItems.RGB_GEM.get());
					tabData.accept(OmegacraftModItems.EMPTY_CORE.get());
					tabData.accept(OmegacraftModItems.ENDER_CORE.get());
					tabData.accept(OmegacraftModItems.NETHER_CORE.get());
					tabData.accept(OmegacraftModItems.WARDEN_CORE.get());
					tabData.accept(OmegacraftModItems.WITHER_STORM_CORE.get());
					tabData.accept(OmegacraftModItems.COMMAND_CORE.get());
					tabData.accept(OmegacraftModItems.DIAMOND_STICK.get());
					tabData.accept(OmegacraftModItems.RGB_STICK.get());
					tabData.accept(OmegacraftModItems.END_PORTAL_SLOT.get());
					tabData.accept(OmegacraftModItems.END_PORTAL_SIDE_FRAMES.get());
					tabData.accept(OmegacraftModItems.WITHERED_NETHER_STAR.get());
					tabData.accept(OmegacraftModItems.RGB_STAR.get());
					tabData.accept(OmegacraftModItems.END_ESSENCE.get());
					tabData.accept(OmegacraftModItems.CREATIVE_ESSENCE.get());
					tabData.accept(OmegacraftModItems.WARDEN_HEART.get());
					tabData.accept(OmegacraftModItems.COAL_DUST.get());
					tabData.accept(OmegacraftModItems.COPPER_DUST.get());
					tabData.accept(OmegacraftModItems.IRON_DUST.get());
					tabData.accept(OmegacraftModItems.GOLD_DUST.get());
					tabData.accept(OmegacraftModItems.RED_STONE_DUST.get());
					tabData.accept(OmegacraftModItems.LAPIS_DUST.get());
					tabData.accept(OmegacraftModItems.DIAMOND_DUST.get());
					tabData.accept(OmegacraftModItems.EMERALD_DUST.get());
					tabData.accept(OmegacraftModItems.NETHERITE_DUST.get());
					tabData.accept(OmegacraftModItems.MEATDUST.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_MEAT_INGOT.get());
					tabData.accept(OmegacraftModItems.SENZU_BEAN.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("omegacraft", "minecraftplus_armor_and_baubles"),
				builder -> builder.title(Component.translatable("item_group.omegacraft.minecraftplus_armor_and_baubles")).icon(() -> new ItemStack(OmegacraftModItems.ADMIN_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OmegacraftModItems.MIXED_OREA_HELMET.get());
					tabData.accept(OmegacraftModItems.MIXED_OREA_CHESTPLATE.get());
					tabData.accept(OmegacraftModItems.MIXED_OREA_LEGGINGS.get());
					tabData.accept(OmegacraftModItems.MIXED_OREA_BOOTS.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_ARMOR_HELMET.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_ARMOR_CHESTPLATE.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_ARMOR_LEGGINGS.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_ARMOR_BOOTS.get());
					tabData.accept(OmegacraftModItems.RUBY_ARMOR_HELMET.get());
					tabData.accept(OmegacraftModItems.RUBY_ARMOR_CHESTPLATE.get());
					tabData.accept(OmegacraftModItems.RUBY_ARMOR_LEGGINGS.get());
					tabData.accept(OmegacraftModItems.RUBY_ARMOR_BOOTS.get());
					tabData.accept(OmegacraftModItems.OOF_ARMOR_HELMET.get());
					tabData.accept(OmegacraftModItems.OOF_ARMOR_CHESTPLATE.get());
					tabData.accept(OmegacraftModItems.OOF_ARMOR_LEGGINGS.get());
					tabData.accept(OmegacraftModItems.OOF_ARMOR_BOOTS.get());
					tabData.accept(OmegacraftModItems.ADMIN_ARMOR_HELMET.get());
					tabData.accept(OmegacraftModItems.ADMIN_ARMOR_CHESTPLATE.get());
					tabData.accept(OmegacraftModItems.ADMIN_ARMOR_LEGGINGS.get());
					tabData.accept(OmegacraftModItems.ADMIN_ARMOR_BOOTS.get());
					tabData.accept(OmegacraftModItems.MASTER_EMERALD_ITEM.get());
					tabData.accept(OmegacraftModItems.RING.get());
					tabData.accept(OmegacraftModItems.ADMIN_RING.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("omegacraft", "cmcp_weapons_and_tools"),
				builder -> builder.title(Component.translatable("item_group.omegacraft.cmcp_weapons_and_tools")).icon(() -> new ItemStack(OmegacraftModItems.ADMIN_STAFF.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OmegacraftModItems.COMMAND_BOOK.get());
					tabData.accept(OmegacraftModItems.MELTED_NETHERITE.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_BOW.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_SWORD.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_AXE.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_SHOVEL.get());
					tabData.accept(OmegacraftModItems.MIXED_ORE_PICK_AXE.get());
					tabData.accept(OmegacraftModItems.MIXEDOREHOE.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_SWORD.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_AXE.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_PICKAXE.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_SHOVEL.get());
					tabData.accept(OmegacraftModItems.AQUAMARINE_HOE.get());
					tabData.accept(OmegacraftModItems.RUBY_SWORD.get());
					tabData.accept(OmegacraftModItems.RUBY_AXE.get());
					tabData.accept(OmegacraftModItems.RUBY_PICKAXE.get());
					tabData.accept(OmegacraftModItems.RUBY_SHOVEL.get());
					tabData.accept(OmegacraftModItems.RUBY_HOE.get());
					tabData.accept(OmegacraftModItems.OOF_SWORD.get());
					tabData.accept(OmegacraftModItems.OOF_AXE.get());
					tabData.accept(OmegacraftModItems.OOF_PICKAXE.get());
					tabData.accept(OmegacraftModItems.OOF_SHOVEL.get());
					tabData.accept(OmegacraftModItems.OOF_HOE.get());
					tabData.accept(OmegacraftModItems.ADMIN_STAFF.get());
					tabData.accept(OmegacraftModItems.OPM.get());
					tabData.accept(OmegacraftModItems.INCOMPLETE_ADMIN_STAFF.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("omegacraft", "cmcp_blocks"),
				builder -> builder.title(Component.translatable("item_group.omegacraft.cmcp_blocks")).icon(() -> new ItemStack(OmegacraftModBlocks.KAMIS_WORKSHOP.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OmegacraftModBlocks.PURE_AGE_EMERALD_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.MIXED_ORE_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.AQUAMARINE_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.RUBY_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.ENDERITE_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.PURE_EMERALD_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.MIXED_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.AQUAMARINE_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.DEEPSLATE_MIXED_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.DEEPSLATE_AQUAMARINE_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.RUBY_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.ENDERITE_ORE.get().asItem());
					tabData.accept(OmegacraftModBlocks.MASSIVE_CHEST_BLOCK.get().asItem());
					tabData.accept(OmegacraftModBlocks.ORE_CRUSHER.get().asItem());
					tabData.accept(OmegacraftModBlocks.KAMIS_WORKSHOP.get().asItem());
				})

		);
	}
}
