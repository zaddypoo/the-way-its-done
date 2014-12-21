package com.zaddy.twid.smes;

import com.zaddy.twid.creativetab.CreativeTabTWID;
import com.zaddy.twid.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
    public BlockBase(Material material) {
        super(material);
        setCreativeTab(CreativeTabTWID.TWID_TAB);
    }

    @Override
    public Block setBlockName(String name) {
        super.setBlockName(Reference.MOD_PRE + name);
        return super.setBlockTextureName(Reference.MOD_PRE + name);
    }
}
