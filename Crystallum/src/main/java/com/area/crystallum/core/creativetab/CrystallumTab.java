package com.area.crystallum.core.creativetab;

import com.area.crystallum.core.init.itemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CrystallumTab extends CreativeTabs {

    private int tab;

    public CrystallumTab(int par1, String par2Str, int par3) {
        super(par1, par2Str);
        tab = par3;
        //super("crystallumtab");
        //this.setBackgroundImageName("crystallum.png");
    }

    @Override
    public ItemStack getTabIconItem() {

        //Multiple Tabs
        /*if (tab == 1) {
            return new ItemStack(itemInit.CRYSTALLUM_INGOT);
        }
        else {
            return new ItemStack((blockInit.CRYSTALLUM_ORE));
        }*/

        //Singular Tab
        return new ItemStack(itemInit.CRYSTALLUM_INGOT);
    }

}
