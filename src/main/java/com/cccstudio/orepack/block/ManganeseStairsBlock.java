
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class ManganeseStairsBlock extends StairBlock {
	public ManganeseStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.METAL).strength(1f, 8f));
	}

	@Override
	public float getExplosionResistance() {
		return 8f;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}
