package com.robinb.mynewmod.register;


import com.robinb.mynewmod.MyNewMod;
import com.robinb.mynewmod.items.FabricItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MyNewMod.MOD_ID, "fabric_item"), FABRIC_ITEM);

    }
}
