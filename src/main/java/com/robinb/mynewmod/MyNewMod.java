package com.robinb.mynewmod;

import com.robinb.mynewmod.register.FuelRegister;
import com.robinb.mynewmod.register.ModBlocks;
import com.robinb.mynewmod.register.ModItems;
import com.robinb.mynewmod.register.ToolRegister;

import net.fabricmc.api.ModInitializer;

public class MyNewMod implements ModInitializer{

    public static final String MOD_ID = "mynewmod";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        FuelRegister.register();
        ToolRegister.register();
    }
    
}
