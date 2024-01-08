
package net.dekuffet.omegacraft.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.dekuffet.omegacraft.init.OmegacraftModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class MassiveChestMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public MassiveChestMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(OmegacraftModMenus.MASSIVE_CHEST.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(178);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 3, 7) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 21, 7) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 39, 7) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 57, 7) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 75, 7) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 93, 7) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 111, 7) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 129, 7) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 147, 7) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 165, 7) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 183, 7) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 201, 7) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 219, 7) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 237, 7) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 255, 7) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 273, 7) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 291, 7) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 309, 7) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 327, 7) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 3, 25) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 21, 25) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 39, 25) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 57, 25) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 75, 25) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 93, 25) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 111, 25) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 129, 25) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 147, 25) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 165, 25) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 183, 25) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 201, 25) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 219, 25) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 237, 25) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 255, 25) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 273, 25) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 291, 25) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 309, 25) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 327, 25) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 3, 43) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 21, 43) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 39, 43) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 57, 43) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 75, 43) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 93, 43) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 111, 43) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 129, 43) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 147, 43) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 165, 43) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 183, 43) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 201, 43) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 219, 43) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 237, 43) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 255, 43) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 273, 43) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 291, 43) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 309, 43) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 327, 43) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 3, 61) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 21, 61) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 39, 61) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 57, 61) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 75, 61) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 93, 61) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 111, 61) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 129, 61) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 147, 61) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 165, 61) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 183, 61) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 201, 61) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 219, 61) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 237, 61) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 255, 61) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 273, 61) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 291, 61) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 309, 61) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 327, 61) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 3, 79) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 21, 79) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 39, 79) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 57, 79) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 75, 79) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 93, 79) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 111, 79) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 129, 79) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 147, 79) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 165, 79) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 183, 79) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 201, 79) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 219, 79) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 237, 79) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 255, 79) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 273, 79) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 291, 79) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 309, 79) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 327, 79) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 3, 97) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 21, 97) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 39, 97) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 57, 97) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 75, 97) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 93, 97) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 111, 97) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 129, 97) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 147, 97) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 165, 97) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 183, 97) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 201, 97) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 219, 97) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 237, 97) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 255, 97) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 273, 97) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 291, 97) {
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 309, 97) {
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 327, 97) {
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 3, 115) {
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 21, 115) {
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 39, 115) {
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 57, 115) {
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 75, 115) {
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 93, 115) {
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 111, 115) {
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 129, 115) {
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 147, 115) {
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 165, 115) {
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 183, 115) {
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 201, 115) {
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 219, 115) {
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 237, 115) {
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 255, 115) {
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 273, 115) {
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 291, 115) {
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 309, 115) {
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 327, 115) {
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 3, 133) {
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 21, 133) {
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 39, 133) {
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 57, 133) {
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 75, 133) {
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 93, 133) {
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 111, 133) {
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 129, 133) {
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 147, 133) {
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 3, 151) {
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 21, 151) {
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 39, 151) {
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 57, 151) {
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 75, 151) {
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 93, 151) {
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 111, 151) {
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 129, 151) {
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 147, 151) {
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 3, 169) {
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 21, 169) {
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 39, 169) {
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 57, 169) {
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 75, 169) {
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 93, 169) {
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 111, 169) {
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 129, 169) {
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 147, 169) {
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 3, 187) {
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 57, 187) {
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 21, 187) {
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 39, 187) {
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 75, 187) {
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 93, 187) {
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 111, 187) {
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 129, 187) {
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 147, 187) {
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 3, 205) {
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 21, 205) {
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 39, 205) {
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 57, 205) {
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 75, 205) {
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 93, 205) {
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 111, 205) {
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 129, 205) {
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 147, 205) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 169 + 8 + sj * 18, 61 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 169 + 8 + si * 18, 61 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 178) {
				if (!this.moveItemStackTo(itemstack1, 178, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 178, false)) {
				if (index < 178 + 27) {
					if (!this.moveItemStackTo(itemstack1, 178 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 178, 178 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.setByPlayer(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.setByPlayer(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
