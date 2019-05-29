package com.benpodrazhansky.fm.blocks;

import com.benpodrazhansky.fm.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5);
		setResistance(15);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(5); // Makes it glow
		//setLightOpacity(1); // Makes it clear (0, or 1)
		// setBlockUnbreakable(); // Makes block unbreakable like bedrock
	}
	
}
