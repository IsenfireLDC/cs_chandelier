package isenfireldc.cs_chandelier.proxy;

import isenfireldc.cs_chandelier.CSChandelierMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CSChandelierMod.MODID + ":" + id, "inventory"));
	}

}
