package com.area.crystallum.common.items.armor;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {
    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot) {
        super(material, renderIndex, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }
}