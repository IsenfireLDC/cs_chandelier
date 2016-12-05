package isenfireldc.cs_chandelier.items;

import net.minecraft.item.Item;
import isenfireldc.cs_chandelier.items.ItemModelProvider;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase placeholder;
	
	public static void init() {
		placeholder = register(new ItemBase("placeholder"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}

}
