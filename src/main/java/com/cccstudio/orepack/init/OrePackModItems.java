
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cccstudio.orepack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OrePackMod.MODID);
	public static final RegistryObject<Item> RAW_MANGANESE = REGISTRY.register("raw_manganese", () -> new RawManganeseItem());
	public static final RegistryObject<Item> MANGANESE_INGOT = REGISTRY.register("manganese_ingot", () -> new ManganeseIngotItem());
	public static final RegistryObject<Item> MANGANESE_ORE = block(OrePackModBlocks.MANGANESE_ORE);
	public static final RegistryObject<Item> MANGANESE_BLOCK = block(OrePackModBlocks.MANGANESE_BLOCK);
	public static final RegistryObject<Item> MANGANESE_STAIRS = block(OrePackModBlocks.MANGANESE_STAIRS);
	public static final RegistryObject<Item> MANGANESE_SLAB = block(OrePackModBlocks.MANGANESE_SLAB);
	public static final RegistryObject<Item> RAW_NICKEL = REGISTRY.register("raw_nickel", () -> new RawNickelItem());
	public static final RegistryObject<Item> NICKEL_ORE = block(OrePackModBlocks.NICKEL_ORE);
	public static final RegistryObject<Item> NICKEL = REGISTRY.register("nickel", () -> new NickelItem());
	public static final RegistryObject<Item> NICKEL_BLOCK = block(OrePackModBlocks.NICKEL_BLOCK);
	public static final RegistryObject<Item> NICKEL_STAIRS = block(OrePackModBlocks.NICKEL_STAIRS);
	public static final RegistryObject<Item> NICKEL_SLAB = block(OrePackModBlocks.NICKEL_SLAB);
	public static final RegistryObject<Item> NICKEL_SWORD = REGISTRY.register("nickel_sword", () -> new NickelSwordItem());
	public static final RegistryObject<Item> NICKEL_PICKAXE = REGISTRY.register("nickel_pickaxe", () -> new NickelPickaxeItem());
	public static final RegistryObject<Item> NICKEL_AXE = REGISTRY.register("nickel_axe", () -> new NickelAxeItem());
	public static final RegistryObject<Item> NICKEL_HOE = REGISTRY.register("nickel_hoe", () -> new NickelHoeItem());
	public static final RegistryObject<Item> NICKEL_SHOVEL = REGISTRY.register("nickel_shovel", () -> new NickelShovelItem());
	public static final RegistryObject<Item> REPARATION_BALL = REGISTRY.register("reparation_ball", () -> new ReparationBallItem());
	public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", () -> new RawBronzeItem());
	public static final RegistryObject<Item> BRONZE_ORE = block(OrePackModBlocks.BRONZE_ORE);
	public static final RegistryObject<Item> BRONZE_BLOCK = block(OrePackModBlocks.BRONZE_BLOCK);
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_STAIRS = block(OrePackModBlocks.BRONZE_STAIRS);
	public static final RegistryObject<Item> BRONZE_SLAB = block(OrePackModBlocks.BRONZE_SLAB);
	public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BronzeSwordItem());
	public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BronzePickaxeItem());
	public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BronzeShovelItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> SILVER_ORE = block(OrePackModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> SILVER_STAIRS = block(OrePackModBlocks.SILVER_STAIRS);
	public static final RegistryObject<Item> SILVER_SLAB = block(OrePackModBlocks.SILVER_SLAB);
	public static final RegistryObject<Item> SILVER_BLOCK = block(OrePackModBlocks.SILVER_BLOCK);
	public static final RegistryObject<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", () -> new RawTitaniumItem());
	public static final RegistryObject<Item> TITANIUM_NUGGET = REGISTRY.register("titanium_nugget", () -> new TitaniumNuggetItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(OrePackModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(OrePackModBlocks.TITANIUM_BLOCK);
	public static final RegistryObject<Item> TITANIUM_HELMET = REGISTRY.register("titanium_helmet", () -> new TitaniumItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_CHESTPLATE = REGISTRY.register("titanium_chestplate", () -> new TitaniumItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_LEGGINGS = REGISTRY.register("titanium_leggings", () -> new TitaniumItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_BOOTS = REGISTRY.register("titanium_boots", () -> new TitaniumItem.Boots());
	public static final RegistryObject<Item> TITANIUM_STAIRS = block(OrePackModBlocks.TITANIUM_STAIRS);
	public static final RegistryObject<Item> TITANIUM_SLAB = block(OrePackModBlocks.TITANIUM_SLAB);
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_SWORD = REGISTRY.register("lapis_lazuli_sword", () -> new LapisLazuliSwordItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_PICKAXE = REGISTRY.register("lapis_lazuli_pickaxe", () -> new LapisLazuliPickaxeItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_AXE = REGISTRY.register("lapis_lazuli_axe", () -> new LapisLazuliAxeItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_HOE = REGISTRY.register("lapis_lazuli_hoe", () -> new LapisLazuliHoeItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_SHOVEL = REGISTRY.register("lapis_lazuli_shovel", () -> new LapisLazuliShovelItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
