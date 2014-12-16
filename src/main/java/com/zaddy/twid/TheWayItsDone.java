package com.zaddy.twid;

import com.zaddy.twid.proxy.IProxy;
import com.zaddy.twid.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.sql.Ref;

/**
 * Created by Zaddy on 12/16/2014.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TheWayItsDone {
    @Mod.Instance("TheWayItsDone")
    public static TheWayItsDone instance;

    @SidedProxy(clientSide = "com.zaddy.thewayitsdone.proxy.ClientProxy", serverSide = "com.zaddy.thewayitsdone.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
