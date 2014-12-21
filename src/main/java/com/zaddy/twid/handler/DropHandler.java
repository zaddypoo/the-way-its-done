package com.zaddy.twid.handler;

import com.zaddy.twid.init.ModFood;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import java.util.Random;

public class DropHandler
{
    public static Random random;
    public static int dropped;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        random = new Random();
        dropped = random.nextInt(2) + 1;

        if(event.entityLiving instanceof EntityCow)
        {
            event.entityLiving.entityDropItem(new ItemStack(ModFood.cheese), dropped);
        }
    }
}
