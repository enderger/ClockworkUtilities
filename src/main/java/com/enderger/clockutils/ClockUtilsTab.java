package com.enderger.clockutils;

import com.enderger.clockutils.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ClockUtilsTab extends CreativeTabs {
    public ClockUtilsTab(String label) {
        super("clockutilstab");
        this.setBackgroundImageName("minecraft:textures.gui.container.creative_inventory.tab_item_search");
    }
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.COPPER_GEAR);
    }
    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
