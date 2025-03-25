
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package com.cccstudio.orepack.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class OrePackModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(OrePackModItems.BRONZE_INGOT.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 17), new ItemStack(OrePackModItems.TITANIUM_HELMET.get()), 10, 7, 0.1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(OrePackModItems.TITANIUM_CHESTPLATE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(OrePackModItems.TITANIUM_LEGGINGS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(OrePackModItems.TITANIUM_BOOTS.get()), 10, 6, 0.08f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OrePackModItems.TITANIUM_NUGGET.get(), 2), new ItemStack(Items.EMERALD, 3), 20, 2, 0.02f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(OrePackModItems.TITANIUM_SWORD.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(OrePackModItems.COPPER_SWORD.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(OrePackModItems.NICKEL_SWORD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(OrePackModBlocks.MANGANESE_STAIRS.get()), new ItemStack(Items.EMERALD, 4), 16, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OrePackModBlocks.NICKEL_STAIRS.get()), new ItemStack(Items.EMERALD, 7), 12, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(OrePackModBlocks.SILVER_STAIRS.get()), new ItemStack(Items.EMERALD, 9), 8, 6, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(OrePackModBlocks.BRONZE_STAIRS.get()), new ItemStack(Items.EMERALD, 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OrePackModBlocks.TITANIUM_STAIRS.get()), new ItemStack(Items.EMERALD, 10), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(OrePackModItems.SILVER_NUGGET.get()), 10, 5, 0.05f));
		}
	}
}
