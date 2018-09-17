package com.enderger.clockutils;

//Imports
import com.enderger.clockutils.proxy.CommonProxy;
import com.enderger.clockutils.util.Reference;
import com.enderger.clockutils.util.compat.OreDict;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.*;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    @Instance
    public static Main instance;

    public static final CreativeTabs clockutilstab = new ClockUtilsTab("clockutilstab");
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        OreDict.registerOres();
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
