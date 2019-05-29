package com.benpodrazhansky.fm.init;

import java.util.ArrayList;

import com.benpodrazhansky.fm.blocks.BlockBase;
import com.benpodrazhansky.fm.blocks.CopperOre;
import com.benpodrazhansky.fm.blocks.ImprovedJackOLantern;
import com.benpodrazhansky.fm.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public final static ArrayList<Block> BLOCKS = new ArrayList<>();
	
	public final static Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public final static Block COPPER_ORE_BLOCK = new CopperOre("copper_ore_block", Material.IRON);
	public final static Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
	public final static Block IMPROVEDJACKOLANTERN = new ImprovedJackOLantern();
}
