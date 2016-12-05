package isenfireldc.cs_chandelier;

import isenfireldc.cs_chandelier.block.ModBlocks;
import isenfireldc.cs_chandelier.client.CSChandelierTab;
import isenfireldc.cs_chandelier.items.ModItems;
import isenfireldc.cs_chandelier.proxy.CommonProxy;
import isenfireldc.cs_chandelier.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CSChandelierMod.MODID, name = CSChandelierMod.MODNAME, version = CSChandelierMod.MODVERSION, acceptedMinecraftVersions = "[1.10.2]", useMetadata = true)
public class CSChandelierMod {
	
	public static final String MODID = "cs_chandelier";
	public static final String MODNAME = "CS Chandelier";
	public static final String MODVERSION = "1.0.0";
	
	public static final CSChandelierTab modTab = new CSChandelierTab();
	
	@SidedProxy(serverSide = "isenfireldc.cs_chandelier.proxy.CommonProxy", clientSide = "isenfireldc.cs_chandelier.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Instance(MODID)
	public static CSChandelierMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
