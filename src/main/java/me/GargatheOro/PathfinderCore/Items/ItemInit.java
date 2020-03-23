package me.GargatheOro.PathfinderCore.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	// ITEM LIST
	public static final Item CHARACTER_CREATOR = new ItemBase("character_creator");
	public static final Item LEVEL_UP = new ItemBase("level_up");
	
	//METALS
	public static final Item ADAMANTINE_INGOT = new ItemBase("ingot_adamantine");
	public static final Item STEEL_INGOT = new ItemBase("ingot_steel");
	public static final Item BRONZE_INGOT = new ItemBase("ingot_bronze");
	public static final Item SILVER_INGOT = new ItemBase("ingot_silver");
	
	//MAGIC
	public static final Item SPELLBOOK = new ItemBase("spellbook");
	public static final Item BLANK_SCROLL = new ItemBase("scroll_blank");
}