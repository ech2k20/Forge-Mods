package com.area.crystallum.common.items.tools;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade {
    public ToolShovel(String name, ToolMaterial material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }
}
