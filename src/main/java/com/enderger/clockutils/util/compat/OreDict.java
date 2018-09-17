package com.enderger.clockutils.util.compat;

import com.enderger.clockutils.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
    public static void registerOres() {
        OreDictionary.registerOre("gearCopper", ItemInit.GEAR_COPPER);
    }
}
