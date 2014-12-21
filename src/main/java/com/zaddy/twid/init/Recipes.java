package com.zaddy.twid.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 4), " c ", " p ", " p ", 'c', Blocks.cobblestone, 'p', Blocks.planks));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 4), "  c", "  p", "  p", 'c', Blocks.cobblestone, 'p', Blocks.planks));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 4), "c  ", "p  ", "p  ", 'c', Blocks.cobblestone, 'p', Blocks.planks));
        GameRegistry.addSmelting(ModFood.cheese, new ItemStack(ModFood.grilledCheese), 5.0F);
    }
}
