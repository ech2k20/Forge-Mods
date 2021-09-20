package com.area.crystallum.core.recipes;

import com.area.crystallum.core.init.blockInit;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(blockInit.CRYSTALLUM_ORE), new ItemStack(itemInit.CRYSTALLUM_INGOT), 10.0f);
    }
}
