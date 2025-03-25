
package com.cccstudio.orepack.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TitaniumPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 300, 5f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("ore_pack:titanium_pickaxe_repair_items")));

	public TitaniumPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -3f, properties);
	}
}
