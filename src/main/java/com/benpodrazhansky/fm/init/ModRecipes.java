package com.benpodrazhansky.fm.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModItems.RUBY_INGOT, 1), 2.3f);
		GameRegistry.addSmelting(ModItems.COPPER_POWDER, new ItemStack(ModItems.COPPER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE_BLOCK, new ItemStack(ModItems.COPPER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), (float) 1);
	}

}
