package com.robinb.mynewmod.tools;

import com.robinb.mynewmod.MyNewMod;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem{

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -0.1f, new Item.Settings().group(MyNewMod.MAIN_GROUP));
        //TODO Auto-generated constructor stub
    }
    
}
