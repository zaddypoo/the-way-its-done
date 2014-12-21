package com.zaddy.twid;

import com.zaddy.twid.client.handler.KeyInputEventHandler;
import com.zaddy.twid.handler.ConfigurationHandler;
import com.zaddy.twid.handler.DropHandler;
import com.zaddy.twid.init.ModBlocks;
import com.zaddy.twid.init.ModFood;
import com.zaddy.twid.init.ModItems;
import com.zaddy.twid.init.Recipes;
import com.zaddy.twid.proxy.IProxy;
import com.zaddy.twid.reference.Reference;
import com.zaddy.twid.utility.LogHelper;
import com.zaddy.twid.world.WorldGeneratorFlag;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class TheWayItsDone
{
    @Mod.Instance("TheWayItsDone")
    public static TheWayItsDone instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBindings();
        ModItems.init();
        ModBlocks.init();
        ModFood.init();
        GameRegistry.registerWorldGenerator(new WorldGeneratorFlag(), 0);
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        ModBlocks.registerTileEntities();
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            OreDictionary.getOres(oreName);
        }

        LogHelper.info("Post Initialization Complete!");
    }
}
