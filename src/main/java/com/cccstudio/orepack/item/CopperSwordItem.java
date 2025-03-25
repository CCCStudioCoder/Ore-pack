
package com.cccstudio.orepack.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.cccstudio.orepack.procedures.OrangeFighterClaimProcedure;

public class CopperSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 175, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("ore_pack:copper_sword_repair_items")));

	public CopperSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -3f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		OrangeFighterClaimProcedure.execute(entity);
	}
}
