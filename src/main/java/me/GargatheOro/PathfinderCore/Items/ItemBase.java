package me.GargatheOro.PathfinderCore.Items;

import me.GargatheOro.PathfinderCore.Main.IHasModel;
import me.GargatheOro.PathfinderCore.Main.Main;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel  {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.maintab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}