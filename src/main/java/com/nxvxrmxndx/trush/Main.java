package com.nxvxrmxndx.trush;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "trush";
    public static final String VERSION = "0.3";
    
    @EventHandler
    public void postInitialization(FMLPostInitializationEvent event)
    {
		MinecraftForge.EVENT_BUS.register(new OnMyTick()); // removing sound from game for free
                MinecraftForge.EVENT_BUS.register(new MyChat());
    }
}
