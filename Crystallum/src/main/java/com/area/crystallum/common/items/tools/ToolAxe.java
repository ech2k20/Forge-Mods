package com.area.crystallum.common.items.tools;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe {
    public ToolAxe(String name, ToolMaterial material, float damage, float speed){
        super(material, damage, speed);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }

}
