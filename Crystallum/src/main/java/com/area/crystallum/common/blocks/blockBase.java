package com.area.crystallum.common.blocks;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.blockInit;
import com.area.crystallum.core.init.itemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class blockBase extends Block {
    public blockBase (String name, Material material, float hardness, float resistance, String tool, int miningLevel) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        blockInit.BLOCKS.add(this);
        itemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
