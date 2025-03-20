
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cccstudio.orepack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.cccstudio.orepack.block.TitaniumStairsBlock;
import com.cccstudio.orepack.block.TitaniumSlabBlock;
import com.cccstudio.orepack.block.TitaniumOreBlock;
import com.cccstudio.orepack.block.TitaniumBlockBlock;
import com.cccstudio.orepack.block.SilverStairsBlock;
import com.cccstudio.orepack.block.SilverSlabBlock;
import com.cccstudio.orepack.block.SilverOreBlock;
import com.cccstudio.orepack.block.SilverBlockBlock;
import com.cccstudio.orepack.block.NickelStairsBlock;
import com.cccstudio.orepack.block.NickelSlabBlock;
import com.cccstudio.orepack.block.NickelOreBlock;
import com.cccstudio.orepack.block.NickelBlockBlock;
import com.cccstudio.orepack.block.ManganeseStairsBlock;
import com.cccstudio.orepack.block.ManganeseSlabBlock;
import com.cccstudio.orepack.block.ManganeseOreBlock;
import com.cccstudio.orepack.block.ManganeseBlockBlock;
import com.cccstudio.orepack.block.BronzeStairsBlock;
import com.cccstudio.orepack.block.BronzeSlabBlock;
import com.cccstudio.orepack.block.BronzeOreBlock;
import com.cccstudio.orepack.block.BronzeBlockBlock;
import com.cccstudio.orepack.OrePackMod;

public class OrePackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OrePackMod.MODID);
	public static final RegistryObject<Block> MANGANESE_ORE = REGISTRY.register("manganese_ore", () -> new ManganeseOreBlock());
	public static final RegistryObject<Block> MANGANESE_BLOCK = REGISTRY.register("manganese_block", () -> new ManganeseBlockBlock());
	public static final RegistryObject<Block> MANGANESE_STAIRS = REGISTRY.register("manganese_stairs", () -> new ManganeseStairsBlock());
	public static final RegistryObject<Block> MANGANESE_SLAB = REGISTRY.register("manganese_slab", () -> new ManganeseSlabBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> NICKEL_STAIRS = REGISTRY.register("nickel_stairs", () -> new NickelStairsBlock());
	public static final RegistryObject<Block> NICKEL_SLAB = REGISTRY.register("nickel_slab", () -> new NickelSlabBlock());
	public static final RegistryObject<Block> BRONZE_ORE = REGISTRY.register("bronze_ore", () -> new BronzeOreBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> BRONZE_STAIRS = REGISTRY.register("bronze_stairs", () -> new BronzeStairsBlock());
	public static final RegistryObject<Block> BRONZE_SLAB = REGISTRY.register("bronze_slab", () -> new BronzeSlabBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_STAIRS = REGISTRY.register("silver_stairs", () -> new SilverStairsBlock());
	public static final RegistryObject<Block> SILVER_SLAB = REGISTRY.register("silver_slab", () -> new SilverSlabBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> TITANIUM_STAIRS = REGISTRY.register("titanium_stairs", () -> new TitaniumStairsBlock());
	public static final RegistryObject<Block> TITANIUM_SLAB = REGISTRY.register("titanium_slab", () -> new TitaniumSlabBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
