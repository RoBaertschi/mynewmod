package com.robinb.mynewmod.toolmaterial;

import com.robinb.mynewmod.register.ModItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFabric implements ToolMaterial{

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 10000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 100f;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 10f;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(ModItems.FABRIC_ITEM);
    }

}