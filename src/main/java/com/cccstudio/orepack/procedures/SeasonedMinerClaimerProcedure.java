package com.cccstudio.orepack.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import com.cccstudio.orepack.network.OrePackModVariables;

public class SeasonedMinerClaimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OrePackModVariables.PlayerVariables())).FoundedTitanium + 1;
			entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FoundedTitanium = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OrePackModVariables.PlayerVariables())).FoundedTitanium >= 20) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ore_pack:seasoned_miner"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
