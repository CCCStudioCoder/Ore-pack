
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cccstudio.orepack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

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
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OrePackMod.MODID);
	public static final DeferredBlock<Block> MANGANESE_ORE = register("manganese_ore", ManganeseOreBlock::new);
	public static final DeferredBlock<Block> MANGANESE_BLOCK = register("manganese_block", ManganeseBlockBlock::new);
	public static final DeferredBlock<Block> MANGANESE_STAIRS = register("manganese_stairs", ManganeseStairsBlock::new);
	public static final DeferredBlock<Block> MANGANESE_SLAB = register("manganese_slab", ManganeseSlabBlock::new);
	public static final DeferredBlock<Block> NICKEL_ORE = register("nickel_ore", NickelOreBlock::new);
	public static final DeferredBlock<Block> NICKEL_BLOCK = register("nickel_block", NickelBlockBlock::new);
	public static final DeferredBlock<Block> NICKEL_STAIRS = register("nickel_stairs", NickelStairsBlock::new);
	public static final DeferredBlock<Block> NICKEL_SLAB = register("nickel_slab", NickelSlabBlock::new);
	public static final DeferredBlock<Block> BRONZE_ORE = register("bronze_ore", BronzeOreBlock::new);
	public static final DeferredBlock<Block> BRONZE_BLOCK = register("bronze_block", BronzeBlockBlock::new);
	public static final DeferredBlock<Block> BRONZE_STAIRS = register("bronze_stairs", BronzeStairsBlock::new);
	public static final DeferredBlock<Block> BRONZE_SLAB = register("bronze_slab", BronzeSlabBlock::new);
	public static final DeferredBlock<Block> SILVER_ORE = register("silver_ore", SilverOreBlock::new);
	public static final DeferredBlock<Block> SILVER_STAIRS = register("silver_stairs", SilverStairsBlock::new);
	public static final DeferredBlock<Block> SILVER_SLAB = register("silver_slab", SilverSlabBlock::new);
	public static final DeferredBlock<Block> SILVER_BLOCK = register("silver_block", SilverBlockBlock::new);
	public static final DeferredBlock<Block> TITANIUM_ORE = register("titanium_ore", TitaniumOreBlock::new);
	public static final DeferredBlock<Block> TITANIUM_BLOCK = register("titanium_block", TitaniumBlockBlock::new);
	public static final DeferredBlock<Block> TITANIUM_STAIRS = register("titanium_stairs", TitaniumStairsBlock::new);
	public static final DeferredBlock<Block> TITANIUM_SLAB = register("titanium_slab", TitaniumSlabBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
