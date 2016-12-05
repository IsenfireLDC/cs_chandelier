package isenfireldc.cs_chandelier.client;

import isenfireldc.cs_chandelier.CSChandelierMod;
import isenfireldc.cs_chandelier.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CSChandelierTab extends CreativeTabs {
	
	public CSChandelierTab() {
		super(CSChandelierMod.MODNAME);
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.placeholder;
	}

}
