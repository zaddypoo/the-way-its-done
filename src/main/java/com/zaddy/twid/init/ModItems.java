package com.zaddy.twid.init;

import com.zaddy.twid.item.*;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTWID mapleLeaf = new ItemMapleLeaf();
    public static final ItemTWID husky = new ItemHusky();
    public static final ItemTWID table = new ItemTable();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(husky, "husky");
        GameRegistry.registerItem(table, "table");
    }
}
