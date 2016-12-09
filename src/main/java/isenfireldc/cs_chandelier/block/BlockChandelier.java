package isenfireldc.cs_chandelier.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), 0.0D, 0.0D, 0.0D);
		return true;
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
