
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SilverOreBlock extends Block {
	public SilverOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.4f, 12f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
