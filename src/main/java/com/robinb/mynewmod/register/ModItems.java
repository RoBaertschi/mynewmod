package com.robinb.mynewmod.register;


import com.robinb.mynewmod.MyNewMod;
import com.robinb.mynewmod.blocks.FabricBlock;
import com.robinb.mynewmod.items.FabricItem;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder()
    .hunger(1)
    .saturationModifier(6f)
    .snack()
    .meat()
    .alwaysEdible()
    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,20*10,3), 1f)
    .build()));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MyNewMod.MOD_ID, "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MyNewMod.MOD_ID, "fabric_block"), new BlockItem(ModBlocks.FABRIC_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

    }
}
