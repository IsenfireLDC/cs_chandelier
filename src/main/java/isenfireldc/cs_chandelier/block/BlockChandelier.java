package isenfireldc.cs_chandelier.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockChandelier extends BlockBase {
	
	public BlockChandelier() {
		super(Material.ROCK, "chandelier");
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	/*@Override
	public boolean canSustainLeaves(IBlockState state, IBlockAccess access, BlockPos pos) {
		return true;
	}*/
	
	/*@Override
	public float getLightLevel(IBlockState state) {
		return 1f;
	}*/

}
