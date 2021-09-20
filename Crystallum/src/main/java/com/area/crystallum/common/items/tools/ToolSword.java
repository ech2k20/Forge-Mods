package com.area.crystallum.common.items.tools;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword {
    public ToolSword(String name, ToolMaterial material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot){
        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();
        if (equipmentSlot == EntityEquipmentSlot.MAINHAND){
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 13.0f, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4f, 0));
        }
        return multimap;
    }
}
