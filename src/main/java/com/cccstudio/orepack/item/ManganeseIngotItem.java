
package com.cccstudio.orepack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ManganeseIngotItem extends Item {
	public ManganeseIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
