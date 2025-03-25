package com.cccstudio.orepack.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import com.cccstudio.orepack.network.OrePackModVariables;

public class SeasonedMinerClaimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			OrePackModVariables.PlayerVariables _vars = entity.getData(OrePackModVariables.PLAYER_VARIABLES);
			_vars.FoundedTitanium = entity.getData(OrePackModVariables.PLAYER_VARIABLES).FoundedTitanium + 1;
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(OrePackModVariables.PLAYER_VARIABLES).FoundedTitanium >= 20) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("ore_pack:seasoned_miner"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
