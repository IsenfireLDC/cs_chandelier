package isenfireldc.cs_chandelier.block;

import isenfireldc.cs_chandelier.CSChandelierMod;
import isenfireldc.cs_chandelier.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {
	
	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		
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
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
