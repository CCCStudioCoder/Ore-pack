
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cccstudio.orepack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.cccstudio.orepack.OrePackMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OrePackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrePackMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(OrePackModItems.NICKEL_SWORD.get());
			tabData.accept(OrePackModItems.BRONZE_SWORD.get());
			tabData.accept(OrePackModItems.TITANIUM_HELMET.get());
			tabData.accept(OrePackModItems.TITANIUM_CHESTPLATE.get());
			tabData.accept(OrePackModItems.TITANIUM_LEGGINGS.get());
			tabData.accept(OrePackModItems.TITANIUM_BOOTS.get());
			tabData.accept(OrePackModItems.TITANIUM_SWORD.get());
			tabData.accept(OrePackModItems.COPPER_SWORD.get());
			tabData.accept(OrePackModItems.LAPIS_LAZULI_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(OrePackModItems.NICKEL_PICKAXE.get());
			tabData.accept(OrePackModItems.NICKEL_AXE.get());
			tabData.accept(OrePackModItems.NICKEL_HOE.get());
			tabData.accept(OrePackModItems.NICKEL_SHOVEL.get());
			tabData.accept(OrePackModItems.BRONZE_PICKAXE.get());
			tabData.accept(OrePackModItems.BRONZE_SHOVEL.get());
			tabData.accept(OrePackModItems.TITANIUM_PICKAXE.get());
			tabData.accept(OrePackModItems.TITANIUM_AXE.get());
			tabData.accept(OrePackModItems.TITANIUM_SHOVEL.get());
			tabData.accept(OrePackModItems.COPPER_PICKAXE.get());
			tabData.accept(OrePackModItems.COPPER_AXE.get());
			tabData.accept(OrePackModItems.COPPER_SHOVEL.get());
			tabData.accept(OrePackModItems.LAPIS_LAZULI_PICKAXE.get());
			tabData.accept(OrePackModItems.LAPIS_LAZULI_AXE.get());
			tabData.accept(OrePackModItems.LAPIS_LAZULI_HOE.get());
			tabData.accept(OrePackModItems.LAPIS_LAZULI_SHOVEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(OrePackModItems.RAW_MANGANESE.get());
			tabData.accept(OrePackModItems.MANGANESE_INGOT.get());
			tabData.accept(OrePackModItems.RAW_NICKEL.get());
			tabData.accept(OrePackModItems.NICKEL.get());
			tabData.accept(OrePackModItems.REPARATION_BALL.get());
			tabData.accept(OrePackModItems.RAW_BRONZE.get());
			tabData.accept(OrePackModItems.BRONZE_INGOT.get());
			tabData.accept(OrePackModItems.RAW_SILVER.get());
			tabData.accept(OrePackModItems.SILVER_NUGGET.get());
			tabData.accept(OrePackModItems.RAW_TITANIUM.get());
			tabData.accept(OrePackModItems.TITANIUM_NUGGET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(OrePackModBlocks.MANGANESE_ORE.get().asItem());
			tabData.accept(OrePackModBlocks.MANGANESE_BLOCK.get().asItem());
			tabData.accept(OrePackModBlocks.MANGANESE_STAIRS.get().asItem());
			tabData.accept(OrePackModBlocks.MANGANESE_SLAB.get().asItem());
			tabData.accept(OrePackModBlocks.NICKEL_ORE.get().asItem());
			tabData.accept(OrePackModBlocks.NICKEL_BLOCK.get().asItem());
			tabData.accept(OrePackModBlocks.NICKEL_STAIRS.get().asItem());
			tabData.accept(OrePackModBlocks.NICKEL_SLAB.get().asItem());
			tabData.accept(OrePackModBlocks.BRONZE_ORE.get().asItem());
			tabData.accept(OrePackModBlocks.BRONZE_BLOCK.get().asItem());
			tabData.accept(OrePackModBlocks.BRONZE_STAIRS.get().asItem());
			tabData.accept(OrePackModBlocks.BRONZE_SLAB.get().asItem());
			tabData.accept(OrePackModBlocks.SILVER_ORE.get().asItem());
			tabData.accept(OrePackModBlocks.SILVER_STAIRS.get().asItem());
			tabData.accept(OrePackModBlocks.SILVER_SLAB.get().asItem());
			tabData.accept(OrePackModBlocks.SILVER_BLOCK.get().asItem());
			tabData.accept(OrePackModBlocks.TITANIUM_ORE.get().asItem());
			tabData.accept(OrePackModBlocks.TITANIUM_BLOCK.get().asItem());
			tabData.accept(OrePackModBlocks.TITANIUM_STAIRS.get().asItem());
			tabData.accept(OrePackModBlocks.TITANIUM_SLAB.get().asItem());
		}
	}
}
