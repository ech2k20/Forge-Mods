package com.area.crystallum.common.items;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.Item;

public class itemBase extends Item {
    public itemBase(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
        //RegistryHandlers.regITEMS.add(this);
    }
}
