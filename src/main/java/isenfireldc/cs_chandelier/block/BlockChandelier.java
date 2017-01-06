package isenfireldc.cs_chandelier.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
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
		playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 100, true, true));
		playerIn.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1, 4, true, true));
		return true;
	}
	
	public void onBlockPlaced(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		worldIn.spawnParticle(EnumParticleTypes.SPELL_INSTANT, (double)pos.getX(), (double)pos.getY()+1, (double)pos.getZ(), 25.5D, 200.0D, 146.7D);
	}
	
	/*
	 * Beacon code
    int j = (9 + this.levels * 2) * 20;
    int k = this.pos.getX();
    int l = this.pos.getY();
    int i1 = this.pos.getZ();
    AxisAlignedBB axisalignedbb = (new AxisAlignedBB((double)k, (double)l, (double)i1, (double)(k + 1), (double)(l + 1), (double)(i1 + 1))).expandXyz(d0).addCoord(0.0D, (double)this.worldObj.getHeight(), 0.0D);
    List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);

    for (EntityPlayer entityplayer : list)
    {
        entityplayer.addPotionEffect(new PotionEffect(this.primaryEffect, j, i, true, true));
    }
    */
	
	/*@Override
	public boolean canSustainLeaves(IBlockState state, IBlockAccess access, BlockPos pos) {
		return true;
	}*/
	
	/*@Override
	public float getLightLevel(IBlockState state) {
		return 1f;
	}*/

}
