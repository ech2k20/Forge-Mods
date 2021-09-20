package com.area.crystallum.core.init;

import com.area.crystallum.core.Reference;
import com.area.crystallum.common.items.itemBase;

import com.area.crystallum.common.items.tools.*;

import com.area.crystallum.common.items.armor.ArmorBase;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class itemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials for tools and armor sets
    public static final Item.ToolMaterial CRYSTALLUM_TOOL = EnumHelper.addToolMaterial("crystallum_tool",
            4,
            10000,
            20,
            10.0f,
            5);
    //public static final Item.ToolMaterial CRYSTALLUM_TOOL_SCYTHE = EnumHelper.addToolMaterial("crystallum_tool_scythe", 4, 10000, 20, 15.0f, 5);

    public static final ItemArmor.ArmorMaterial CRYSTALLUM_ARMOR = EnumHelper.addArmorMaterial("crystallum_armor",
            Reference.MOD_ID + ":crystallum",
            10000,
            new int[] {4, 7, 9, 5}, //Armor Values for Boots, Leggings, Chest, and Helmet respectively.
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f);

    //Tools
    public static final Item CRYSTALLUM_SCYTHE = new ToolScythe("crystallum_scythe", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_BLADE = new ToolBlade("crystallum_blade", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_SWORD = new ToolSword("crystallum_sword", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_SHOVEL= new ToolShovel("crystallum_shovel", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_PICKAXE = new ToolPickaxe("crystallum_pickaxe", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_AXE = new ToolAxe("crystallum_axe", CRYSTALLUM_TOOL, 15.0f, -3.0f);
    //public static final Item CRYSTALLUM_AXE = new ToolAxeOLD("crystallum_axe", CRYSTALLUM_TOOL);
    public static final Item CRYSTALLUM_HOE = new ToolHoe("crystallum_hoe", CRYSTALLUM_TOOL);

    //Armor
    public static final Item CRYSTALLUM_HELMET = new ArmorBase("crystallum_helmet", CRYSTALLUM_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item CRYSTALLUM_CHEST = new ArmorBase("crystallum_chest", CRYSTALLUM_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item CRYSTALLUM_LEGGINGS = new ArmorBase("crystallum_leggings", CRYSTALLUM_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item CRYSTALLUM_BOOTS = new ArmorBase("crystallum_boots", CRYSTALLUM_ARMOR, 1, EntityEquipmentSlot.FEET);

    //Created Items
    public static final Item CRYSTALLUM_INGOT = new itemBase("crystallum_ingot");
    public static final Item CRYSTALLUM_PEARL = new itemBase("crystallum_pearl");
    public static final Item IRON_ROD = new itemBase("iron_rod");




}
