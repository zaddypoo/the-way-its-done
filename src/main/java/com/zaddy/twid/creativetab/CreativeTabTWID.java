package com.zaddy.twid.creativetab;

import com.zaddy.twid.init.ModItems;
import com.zaddy.twid.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTWID
{
    public static final CreativeTabs TWID_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.husky;
        }
    };
}