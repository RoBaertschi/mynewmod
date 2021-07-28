package com.robinb.mynewmod.register;

import com.robinb.mynewmod.MyNewMod;
import com.robinb.mynewmod.entchantments.BoomBoomEnchantment;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntchantRegister {
	
	public static final Enchantment BOOM_BOOM_ENT = new BoomBoomEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, 
			new EquipmentSlot[] {
					EquipmentSlot.MAINHAND
			});
	
	public static void register() {
		Registry.register(Registry.ENCHANTMENT, new Identifier(MyNewMod.MOD_ID, "boom_boom"), BOOM_BOOM_ENT);
	}
}
