
package com.cccstudio.orepack.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class NickelAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 150, 3f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("ore_pack:nickel_axe_repair_items")));

	public NickelAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -3f, properties);
	}
}
