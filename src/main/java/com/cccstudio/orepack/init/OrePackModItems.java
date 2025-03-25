
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cccstudio.orepack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.cccstudio.orepack.item.TitaniumSwordItem;
import com.cccstudio.orepack.item.TitaniumShovelItem;
import com.cccstudio.orepack.item.TitaniumPickaxeItem;
import com.cccstudio.orepack.item.TitaniumNuggetItem;
import com.cccstudio.orepack.item.TitaniumItem;
import com.cccstudio.orepack.item.TitaniumAxeItem;
import com.cccstudio.orepack.item.SilverNuggetItem;
import com.cccstudio.orepack.item.ReparationBallItem;
import com.cccstudio.orepack.item.RawTitaniumItem;
import com.cccstudio.orepack.item.RawSilverItem;
import com.cccstudio.orepack.item.RawNickelItem;
import com.cccstudio.orepack.item.RawManganeseItem;
import com.cccstudio.orepack.item.RawBronzeItem;
import com.cccstudio.orepack.item.NickelSwordItem;
import com.cccstudio.orepack.item.NickelShovelItem;
import com.cccstudio.orepack.item.NickelPickaxeItem;
import com.cccstudio.orepack.item.NickelItem;
import com.cccstudio.orepack.item.NickelHoeItem;
import com.cccstudio.orepack.item.NickelAxeItem;
import com.cccstudio.orepack.item.ManganeseIngotItem;
import com.cccstudio.orepack.item.LapisLazuliSwordItem;
import com.cccstudio.orepack.item.LapisLazuliShovelItem;
import com.cccstudio.orepack.item.LapisLazuliPickaxeItem;
import com.cccstudio.orepack.item.LapisLazuliHoeItem;
import com.cccstudio.orepack.item.LapisLazuliAxeItem;
import com.cccstudio.orepack.item.CopperSwordItem;
import com.cccstudio.orepack.item.CopperShovelItem;
import com.cccstudio.orepack.item.CopperPickaxeItem;
import com.cccstudio.orepack.item.CopperAxeItem;
import com.cccstudio.orepack.item.BronzeSwordItem;
import com.cccstudio.orepack.item.BronzeShovelItem;
import com.cccstudio.orepack.item.BronzePickaxeItem;
import com.cccstudio.orepack.item.BronzeIngotItem;
import com.cccstudio.orepack.OrePackMod;

public class OrePackModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OrePackMod.MODID);
	public static final DeferredItem<Item> RAW_MANGANESE = register("raw_manganese", RawManganeseItem::new);
	public static final DeferredItem<Item> MANGANESE_INGOT = register("manganese_ingot", ManganeseIngotItem::new);
	public static final DeferredItem<Item> MANGANESE_ORE = block(OrePackModBlocks.MANGANESE_ORE);
	public static final DeferredItem<Item> MANGANESE_BLOCK = block(OrePackModBlocks.MANGANESE_BLOCK);
	public static final DeferredItem<Item> MANGANESE_STAIRS = block(OrePackModBlocks.MANGANESE_STAIRS);
	public static final DeferredItem<Item> MANGANESE_SLAB = block(OrePackModBlocks.MANGANESE_SLAB);
	public static final DeferredItem<Item> RAW_NICKEL = register("raw_nickel", RawNickelItem::new);
	public static final DeferredItem<Item> NICKEL_ORE = block(OrePackModBlocks.NICKEL_ORE);
	public static final DeferredItem<Item> NICKEL = register("nickel", NickelItem::new);
	public static final DeferredItem<Item> NICKEL_BLOCK = block(OrePackModBlocks.NICKEL_BLOCK);
	public static final DeferredItem<Item> NICKEL_STAIRS = block(OrePackModBlocks.NICKEL_STAIRS);
	public static final DeferredItem<Item> NICKEL_SLAB = block(OrePackModBlocks.NICKEL_SLAB);
	public static final DeferredItem<Item> NICKEL_SWORD = register("nickel_sword", NickelSwordItem::new);
	public static final DeferredItem<Item> NICKEL_PICKAXE = register("nickel_pickaxe", NickelPickaxeItem::new);
	public static final DeferredItem<Item> NICKEL_AXE = register("nickel_axe", NickelAxeItem::new);
	public static final DeferredItem<Item> NICKEL_HOE = register("nickel_hoe", NickelHoeItem::new);
	public static final DeferredItem<Item> NICKEL_SHOVEL = register("nickel_shovel", NickelShovelItem::new);
	public static final DeferredItem<Item> REPARATION_BALL = register("reparation_ball", ReparationBallItem::new);
	public static final DeferredItem<Item> RAW_BRONZE = register("raw_bronze", RawBronzeItem::new);
	public static final DeferredItem<Item> BRONZE_ORE = block(OrePackModBlocks.BRONZE_ORE);
	public static final DeferredItem<Item> BRONZE_BLOCK = block(OrePackModBlocks.BRONZE_BLOCK);
	public static final DeferredItem<Item> BRONZE_INGOT = register("bronze_ingot", BronzeIngotItem::new);
	public static final DeferredItem<Item> BRONZE_STAIRS = block(OrePackModBlocks.BRONZE_STAIRS);
	public static final DeferredItem<Item> BRONZE_SLAB = block(OrePackModBlocks.BRONZE_SLAB);
	public static final DeferredItem<Item> BRONZE_SWORD = register("bronze_sword", BronzeSwordItem::new);
	public static final DeferredItem<Item> BRONZE_PICKAXE = register("bronze_pickaxe", BronzePickaxeItem::new);
	public static final DeferredItem<Item> BRONZE_SHOVEL = register("bronze_shovel", BronzeShovelItem::new);
	public static final DeferredItem<Item> RAW_SILVER = register("raw_silver", RawSilverItem::new);
	public static final DeferredItem<Item> SILVER_ORE = block(OrePackModBlocks.SILVER_ORE);
	public static final DeferredItem<Item> SILVER_NUGGET = register("silver_nugget", SilverNuggetItem::new);
	public static final DeferredItem<Item> SILVER_STAIRS = block(OrePackModBlocks.SILVER_STAIRS);
	public static final DeferredItem<Item> SILVER_SLAB = block(OrePackModBlocks.SILVER_SLAB);
	public static final DeferredItem<Item> SILVER_BLOCK = block(OrePackModBlocks.SILVER_BLOCK);
	public static final DeferredItem<Item> RAW_TITANIUM = register("raw_titanium", RawTitaniumItem::new);
	public static final DeferredItem<Item> TITANIUM_NUGGET = register("titanium_nugget", TitaniumNuggetItem::new);
	public static final DeferredItem<Item> TITANIUM_ORE = block(OrePackModBlocks.TITANIUM_ORE);
	public static final DeferredItem<Item> TITANIUM_BLOCK = block(OrePackModBlocks.TITANIUM_BLOCK);
	public static final DeferredItem<Item> TITANIUM_HELMET = register("titanium_helmet", TitaniumItem.Helmet::new);
	public static final DeferredItem<Item> TITANIUM_CHESTPLATE = register("titanium_chestplate", TitaniumItem.Chestplate::new);
	public static final DeferredItem<Item> TITANIUM_LEGGINGS = register("titanium_leggings", TitaniumItem.Leggings::new);
	public static final DeferredItem<Item> TITANIUM_BOOTS = register("titanium_boots", TitaniumItem.Boots::new);
	public static final DeferredItem<Item> TITANIUM_STAIRS = block(OrePackModBlocks.TITANIUM_STAIRS);
	public static final DeferredItem<Item> TITANIUM_SLAB = block(OrePackModBlocks.TITANIUM_SLAB);
	public static final DeferredItem<Item> TITANIUM_SWORD = register("titanium_sword", TitaniumSwordItem::new);
	public static final DeferredItem<Item> TITANIUM_PICKAXE = register("titanium_pickaxe", TitaniumPickaxeItem::new);
	public static final DeferredItem<Item> TITANIUM_AXE = register("titanium_axe", TitaniumAxeItem::new);
	public static final DeferredItem<Item> TITANIUM_SHOVEL = register("titanium_shovel", TitaniumShovelItem::new);
	public static final DeferredItem<Item> COPPER_SWORD = register("copper_sword", CopperSwordItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = register("copper_pickaxe", CopperPickaxeItem::new);
	public static final DeferredItem<Item> COPPER_AXE = register("copper_axe", CopperAxeItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = register("copper_shovel", CopperShovelItem::new);
	public static final DeferredItem<Item> LAPIS_LAZULI_SWORD = register("lapis_lazuli_sword", LapisLazuliSwordItem::new);
	public static final DeferredItem<Item> LAPIS_LAZULI_PICKAXE = register("lapis_lazuli_pickaxe", LapisLazuliPickaxeItem::new);
	public static final DeferredItem<Item> LAPIS_LAZULI_AXE = register("lapis_lazuli_axe", LapisLazuliAxeItem::new);
	public static final DeferredItem<Item> LAPIS_LAZULI_HOE = register("lapis_lazuli_hoe", LapisLazuliHoeItem::new);
	public static final DeferredItem<Item> LAPIS_LAZULI_SHOVEL = register("lapis_lazuli_shovel", LapisLazuliShovelItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
