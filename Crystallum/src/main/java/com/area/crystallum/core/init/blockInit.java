package com.area.crystallum.core.init;

import com.area.crystallum.common.blocks.blockBase;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Created Blocks
    public static final Block CRYSTALLUM_BLOCK = new blockBase("crystallum_block", Material.IRON, 20.0f, 6000.0f, "pickaxe", 3);
    public static final Block CRYSTALLUM_ORE = new blockBase("crystallum_ore", Material.ROCK, 10.0f, 6000.0f, "pickaxe", 3);

}
