
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class TitaniumBlockBlock extends Block {
	public TitaniumBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(4f, 14f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
