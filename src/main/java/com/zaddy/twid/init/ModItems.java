package com.zaddy.twid.init;

import com.zaddy.twid.item.ItemHusky;
import com.zaddy.twid.item.ItemMapleLeaf;
import com.zaddy.twid.item.ItemTWID;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTWID mapleLeaf = new ItemMapleLeaf();
    public static final ItemTWID husky = new ItemHusky();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(husky, "husky");
    }
}
