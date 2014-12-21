package com.zaddy.twid.block;

import com.zaddy.twid.tileentity.TileEntityBomb;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBomb extends BlockTWID
{
    public BlockBomb()
    {
        super(Material.iron);
        this.setBlockName("bomb");
        this.setBlockTextureName("bomb");
        this.setHardness(2F);
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitx, float hity, float hitz)
    {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityBomb();
    }
}
