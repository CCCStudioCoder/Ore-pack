
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BronzeBlockBlock extends Block {
	public BronzeBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(3f, 8f).friction(0.7f).speedFactor(1.1f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
