package com.benpodrazhansky.fm.blocks;

import net.minecraft.block.material.Material;

public class ImprovedJackOLantern extends BlockBase{

	public ImprovedJackOLantern() {
		super("improved_jack_o_lantern", Material.GOURD);
		setLightLevel(15);
		/* Crafting Recipe:
		 *  Pumpkin
		 *  lantern
		 *  
		 *  Or:
		 *  Jackolantern surrounded by iron nuggets
		 * */
		setHardness(1);
		setHarvestLevel("axe",0);
		setResistance(10);
	}
}
