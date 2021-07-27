package com.robinb.mynewmod.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem{

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -0.1f, new Item.Settings().group(ItemGroup.TOOLS));
        //TODO Auto-generated constructor stub
    }
    
}
