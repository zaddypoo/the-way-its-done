package com.zaddy.twid.init;

import com.zaddy.twid.item.ItemMapleLeaf;
import com.zaddy.twid.item.ItemTWID;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zaddy on 12/17/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTWID mapleLeaf = new ItemMapleLeaf();

            public static void init()
            {
                GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
            }
}
