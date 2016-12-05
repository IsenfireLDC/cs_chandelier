package isenfireldc.cs_chandelier.recipe;

import isenfireldc.cs_chandelier.block.ModBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.chandelier), "TTT", " T ", " T ", 'T', Items.TORCH);
	}

}
