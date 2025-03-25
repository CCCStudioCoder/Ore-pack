
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TitaniumSlabBlock extends SlabBlock {
	public TitaniumSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(2f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}
