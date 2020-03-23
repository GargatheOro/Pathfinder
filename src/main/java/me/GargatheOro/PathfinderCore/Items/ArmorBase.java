package me.GargatheOro.PathfinderCore.Items;

import me.GargatheOro.PathfinderCore.Main.IHasModel;
import me.GargatheOro.PathfinderCore.Main.Main;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name) {
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