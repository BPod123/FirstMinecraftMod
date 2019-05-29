package com.benpodrazhansky.fm.blocks;


import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends BlockBase {
	public CopperOre(String name, Material material) {
		super(name, material);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.STONE);
		setHardness(3);
		setResistance(15);
		setHarvestLevel("pickaxe", 2);
	}

}
