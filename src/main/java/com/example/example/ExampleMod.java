package com.example.example;

import com.example.example.init.ModItems;
import com.example.example.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.MODNAME, version = ExampleMod.VERSION)
public class ExampleMod {

    public static final String MODID = "example";
    public static final String MODNAME = "Example Mod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.example.example.proxy.ClientProxy", serverSide = "com.example.example.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.Instance
    public static ExampleMod instance;

    /**
     * PreInit is where you can setup logging, check your config file,
     * and most importantly register blocks and items!
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        proxy.preInit(event);
    }

    /**
     * Init is where you register recipes and the Ore Dictionary
     * You can also use IMC during this phase
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is where you can communicate with other mods
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
