package com.robinb.mynewmod.register;

import com.robinb.mynewmod.MyNewMod;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class FuelRegister {

    public static void register(){
        FuelRegistry.INSTANCE.add(ModItems.FABRIC_ITEM, 1000);
    }
    
}
