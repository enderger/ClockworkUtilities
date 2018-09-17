package com.enderger.clockutils.init;

//Imports
import com.enderger.clockutils.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Gears
    public static final Item COPPER_GEAR = new ItemBase("gear_copper");
}
