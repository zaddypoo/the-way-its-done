package com.zaddy.twid.smes;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMachineExtractor extends BlockMachineBase {
    public BlockMachineExtractor() {
        super(Material.iron);
    }

    public TileEntity createNewTileEntity(World world, int metadata) {
        return metadata == 0 ? new TileEntityRareMetalExtractor() : null;
    }
}
