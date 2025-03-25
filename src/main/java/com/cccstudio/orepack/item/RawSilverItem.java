
package com.cccstudio.orepack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawSilverItem extends Item {
	public RawSilverItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
