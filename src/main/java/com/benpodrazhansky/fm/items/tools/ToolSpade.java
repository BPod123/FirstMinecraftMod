package com.benpodrazhansky.fm.items.tools;

import com.benpodrazhansky.fm.Main;
import com.benpodrazhansky.fm.init.ModItems;
import com.benpodrazhansky.fm.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ToolSpade extends ItemSpade implements IHasModel {
	public ToolSpade(String name, ToolMaterial material) {
		super(material);
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