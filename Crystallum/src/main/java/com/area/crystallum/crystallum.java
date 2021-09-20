package com.area.crystallum;

import com.area.crystallum.core.Reference;
import com.area.crystallum.core.creativetab.CrystallumTab;
import com.area.crystallum.handlers.RegistryHandlers;

import com.area.crystallum.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class crystallum
{
    /*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;*/

    @SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //CreativeTab
    public static final CreativeTabs CRYSTALLUMTAB = new CrystallumTab(CreativeTabs.getNextID(),"crystallumtab", 1);

    //Two Creative Tabs
    //public static CreativeTabs CRYSTALLUMTAB_ITEMS = new CrystallumTab(CreativeTabs.getNextID(), "crystallumtabitems", 1);
    //public static CreativeTabs CRYSTALLUMTAB_BLOCKS = new CrystallumTab(CreativeTabs.getNextID(), "crystallumtabblocks", 2);


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandlers.preInitRegistries();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        RegistryHandlers.InitRegistries();

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RegistryHandlers.postInitRegistries();

        proxy.postInit(event);
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event){
        RegistryHandlers.serverInitRegistries();

        proxy.serverStarting(event);
    }
}
