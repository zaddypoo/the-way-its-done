package com.zaddy.twid.tileentity;

import com.zaddy.twid.init.ModBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBomb extends TileEntity
{
    private int timer;

    public TileEntityBomb()
    {
        timer = 100;
    }

    public boolean isIdle()
    {
        return timer < 0;
    }



    @Override
    public void updateEntity()
    {
        if(timer == 0 && !worldObj.isRemote)
        {
            spread(xCoord + 1, yCoord, zCoord);
            spread(xCoord - 1, yCoord, zCoord);
            spread(xCoord, yCoord, zCoord + 1);
            spread(xCoord, yCoord, zCoord - 1);
        }

        timer--;
    }

    private void spread(int x, int y, int z)
    {
        if(worldObj.isAirBlock(x,y,z))
        {
            worldObj.setBlock(x,y,z, ModBlocks.bomb);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        compound.setShort("Timer", (short)timer);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        timer = compound.getShort("Timer");
    }
}
