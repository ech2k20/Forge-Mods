package com.area.crystallum.core.recipes;

import com.area.crystallum.core.init.blockInit;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShapelessCraftingRecipes {
    public static void init() {
        //Shapeless Crystallum Block ---> Crystalluim Ingots
        ItemStack crystallum_block = new ItemStack(blockInit.CRYSTALLUM_BLOCK);
        ItemStack crystallum_ingot = new ItemStack(itemInit.CRYSTALLUM_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("crystallum_ingot"), null, crystallum_ingot, Ingredient.fromStacks(crystallum_block));
    }
}
