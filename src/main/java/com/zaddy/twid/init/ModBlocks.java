package com.zaddy.twid.init;

import com.zaddy.twid.block.BlockFlag;
import com.zaddy.twid.block.BlockTWID;
import com.zaddy.twid.block.BlockTable;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTWID flag = new BlockFlag();
    public static final BlockTWID blockTable = new BlockTable();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(blockTable, "blockTable");
    }
}
