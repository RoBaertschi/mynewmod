package com.robinb.mynewmod.register;

import com.robinb.mynewmod.MyNewMod;
import com.robinb.mynewmod.blocks.FabricBlock;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    public static final Block FABRIC_BLOCK = new FabricBlock();


    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MyNewMod.MOD_ID, "fabric_block"), FABRIC_BLOCK);
    }
}