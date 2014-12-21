package com.zaddy.twid.init;

import com.zaddy.twid.food.ItemCheese;
import com.zaddy.twid.food.ItemGrilledCheese;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModFood
{
    public static final ItemFood cheese = new ItemCheese();
    public static final ItemFood grilledCheese = new ItemGrilledCheese();

    public static void init()
    {
        GameRegistry.registerItem(cheese, "cheese");
        GameRegistry.registerItem(grilledCheese, "grilledCheese");
    }
}
