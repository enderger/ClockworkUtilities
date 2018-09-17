package com.enderger.clockutils.util.handlers;

import com.enderger.clockutils.init.ItemInit;
import com.enderger.clockutils.util.interfaces.InterfaceHandler.*;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }
    }
}
