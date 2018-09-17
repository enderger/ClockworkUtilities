package com.enderger.clockutils;

import com.enderger.clockutils.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ClockUtilsTab extends CreativeTabs {
    public ClockUtilsTab(String label) {
        super("clockutilstab");
        this.setBackgroundImageName("clockutils:gui/tab_icon_search");
    }
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.GEAR_COPPER);
    }
    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
