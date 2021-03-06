package isenfireldc.cs_chandelier.items;

import isenfireldc.cs_chandelier.CSChandelierMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider {
	
	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CSChandelierMod.modTab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		CSChandelierMod.proxy.registerItemRenderer(item, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
