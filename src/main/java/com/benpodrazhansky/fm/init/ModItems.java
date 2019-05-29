package com.benpodrazhansky.fm.init;

import java.util.ArrayList;

import com.benpodrazhansky.fm.items.ItemBase;
import com.benpodrazhansky.fm.items.armor.ArmorBase;
import com.benpodrazhansky.fm.items.tools.Chainsaw;
import com.benpodrazhansky.fm.items.tools.RubyAxe;
import com.benpodrazhansky.fm.items.tools.ToolAxe;
import com.benpodrazhansky.fm.items.tools.ToolHoe;
import com.benpodrazhansky.fm.items.tools.ToolPickaxe;
import com.benpodrazhansky.fm.items.tools.ToolSpade;
import com.benpodrazhansky.fm.items.tools.ToolSword;
import com.benpodrazhansky.fm.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public final static ArrayList<Item> ITEMS = new ArrayList<Item>();
	// Materials
	public final static ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8f, 3, 10);
	public final static ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID.concat(":ruby"), 14, 
			//Boots, chest, leggings, helmet
				new int[] {2, 7, 5, 3},
				10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f);
	// Items
	public final static Item BPodCoin = new ItemBase("bencoin");
	public final static Item RUBY = new ItemBase("ruby");
	public final static Item RUBY_INGOT = new ItemBase("ruby_ingot");
	public final static Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public final static Item COPPER_INGOT = new ItemBase("copper_ingot");
	public final static Item COPPER_POWDER = new ItemBase("copper_powder");
	
	// Tools
	public final static ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public final static ItemSpade RUBY_SPADE = new ToolSpade("ruby_spade", MATERIAL_RUBY);
	public final static ItemAxe RUBY_AXE = new RubyAxe("ruby_axe", MATERIAL_RUBY, 6f, -3.2f);
	public final static ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public final static ItemAxe CHAINSAW = new Chainsaw("chainsaw", ToolMaterial.DIAMOND, 20f, -1f);
	public final static ItemHoe RUBY_HOW = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	// Armor
		// Ruby
	public final static Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public final static Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public final static Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public final static Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
		// Stained Diamond
	public final static Item STAINED_DIAMOND_HELMET = new ArmorBase("stained_diamond_helmet", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public final static Item STAINED_DIAMOND_CHESTPLATE = new ArmorBase("stained_diamond_chestplate", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public final static Item STAINED_DIAMOND_LEGGINGS = new ArmorBase("stained_diamond_leggings", ArmorMaterial.DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public final static Item STAINED_DIAMOND_BOOTS = new ArmorBase("stained_diamond_boots", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.FEET);
		// Heavily Stained Diamond
	public final static Item HEAVILY_STAINED_DIAMOND_HELMET = new ArmorBase("heavily_stained_diamond_helmet", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public final static Item HEAVILY_STAINED_DIAMOND_CHESTPLATE = new ArmorBase("heavily_stained_diamond_chestplate", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public final static Item HEAVILY_STAINED_DIAMOND_LEGGINGS = new ArmorBase("heavily_stained_diamond_leggings", ArmorMaterial.DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public final static Item HEAVILY_STAINED_DIAMOND_BOOTS = new ArmorBase("heavily_stained_diamond_boots", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.FEET);
}
