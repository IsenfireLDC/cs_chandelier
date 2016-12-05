package isenfireldc.cs_chandelier.block;

import isenfireldc.cs_chandelier.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockChandelier chandelier;
	
	public static void init() {
		
		chandelier = register(new BlockChandelier());
		chandelier.setLightLevel(1f);
		
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		if (itemBlock != null) {
			GameRegistry.register(block);
			GameRegistry.register(itemBlock);
		} else {
			GameRegistry.register(block);
		}
		
		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}
