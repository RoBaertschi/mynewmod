package com.robinb.mynewmod.register;

import com.robinb.mynewmod.MyNewMod;
import com.robinb.mynewmod.toolmaterial.ToolMaterialFabric;
import com.robinb.mynewmod.tools.PickaxeBase;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ToolRegister {

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MyNewMod.MOD_ID, "fabric_pickaxe"), new PickaxeBase(new ToolMaterialFabric()));
    }
    
}
