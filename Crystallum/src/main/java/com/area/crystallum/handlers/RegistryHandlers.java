package com.area.crystallum.handlers;

import com.area.crystallum.core.init.blockInit;
import com.area.crystallum.core.init.itemInit;
import com.area.crystallum.core.recipes.ShapelessCraftingRecipes;
import com.area.crystallum.core.recipes.SmeltingRecipes;
import com.area.crystallum.core.world.gen.WorldGenOres;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class RegistryHandlers {
    @SubscribeEvent
    public static void onBlockReg(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(blockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onItemReg(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(itemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        for(Block block : blockInit.BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
        for(Item item : itemInit.ITEMS) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
    public static void render() {
    }

    public static void preInitRegistries(){
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
    }

    public static void InitRegistries(){
        ShapelessCraftingRecipes.init();
        SmeltingRecipes.init();
        render();
    }

    public static void postInitRegistries(){
    }

    public static void serverInitRegistries(){
    }
}
