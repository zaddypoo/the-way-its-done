package com.zaddy.twid.smes;

import net.minecraft.item.ItemStack;

public interface IRecipe {
    public boolean isInputValid(ItemStack input);
    public ItemStack getInput();
    public ItemStack getOutput();
}