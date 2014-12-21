package com.zaddy.twid.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockTable extends BlockTWID
{
    public BlockTable()
    {
        super(Material.wood);
        this.setBlockName("blockTable");
        this.setBlockTextureName("blockTable");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitx, float hity, float hitz)
    {
        world.setBlock(x,y+2,z, Blocks.wool);
        world.setBlock(x-1,y+2,z,Blocks.wool);

        return true;
    }
}