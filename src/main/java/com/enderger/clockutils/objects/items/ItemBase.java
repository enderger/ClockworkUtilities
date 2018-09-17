package com.enderger.clockutils.objects.items;

//Imports
import com.enderger.clockutils.Main;
import com.enderger.clockutils.init.ItemInit;
import com.enderger.clockutils.proxy.ClientProxy;
import com.enderger.clockutils.util.interfaces.InterfaceHandler.*;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.clockutilstab);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
