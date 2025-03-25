
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class TitaniumStairsBlock extends StairBlock {
	public TitaniumStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.METAL).strength(2f, 12f));
	}

	@Override
	public float getExplosionResistance() {
		return 12f;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}
