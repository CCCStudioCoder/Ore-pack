
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BronzeOreBlock extends Block {
	public BronzeOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.3f, 12f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
