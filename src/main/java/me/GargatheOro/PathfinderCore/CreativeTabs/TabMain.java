package me.GargatheOro.PathfinderCore.CreativeTabs;

import me.GargatheOro.PathfinderCore.Items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMain extends CreativeTabs {

	public TabMain(String label) {
		super("maintab");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.LEVEL_UP);
	}
}