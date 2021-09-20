package com.area.crystallum.common.items.tools;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe {
    public ToolPickaxe(String name, ToolMaterial material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }
}
