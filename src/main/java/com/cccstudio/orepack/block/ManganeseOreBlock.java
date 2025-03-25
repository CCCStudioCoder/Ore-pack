
package com.cccstudio.orepack.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ManganeseOreBlock extends Block {
	public ManganeseOreBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.ancient_debris.break")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.ancient_debris.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.metal.place")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.ancient_debris.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.ancient_debris.fall"))))
				.strength(1.5f, 10f).requiresCorrectToolForDrops().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}
}
