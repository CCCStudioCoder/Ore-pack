
package com.cccstudio.orepack.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class NickelSlabBlock extends SlabBlock {
	public NickelSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1f, 8f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}
