package me.GargatheOro.PathfinderCore.Blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ITEM LIST
	public static final Block ADAMANTINE_BLOCK = new BlockBase("block_adamantine", Material.IRON);
	public static final Block STEEL_BLOCK = new BlockBase("block_steel", Material.IRON);
	public static final Block BRONZE_BLOCK = new BlockBase("block_bronze", Material.IRON);
	public static final Block SILVER_BLOCK = new BlockBase("block_silver", Material.IRON);
}