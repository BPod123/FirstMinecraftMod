package com.benpodrazhansky.fm.items.tools;

import com.benpodrazhansky.fm.Main;
import com.benpodrazhansky.fm.init.ModItems;
import com.benpodrazhansky.fm.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public abstract class ToolAxe extends ItemAxe implements IHasModel {
	/** ATTACK_DAMAGE and ATTACK_SPEED can be one of the values in ItemAxe.ATTACK_DAMAGES and ItemAxe.ATTACK_SPEEDS*/
	public ToolAxe(String name, ToolMaterial material, float ATTACK_DAMAGE, float ATTACK_SPEED) {
		super(material, ATTACK_DAMAGE, ATTACK_SPEED);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}