package com.robinb.mynewmod.entchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BoomBoomEnchantment extends Enchantment {

    public BoomBoomEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        //TODO Auto-generated constructor stub
    }
    @Override
    public int getMinPower(int level){
        return 15;
    }
	@Override
	public int getMaxLevel() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level) {
		// TODO Auto-generated method stub
		if(target instanceof LivingEntity) {
			for(int i = 0; i < level; i++){
				World world = user.world;

				TntEntity tnt = EntityType.TNT.create(world);
				tnt.setFuse(0);
				tnt.setPosition(target.getPos());

				world.spawnEntity(tnt);
		}}
	}
	@Override
	public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
		// TODO Auto-generated method stub
		World world = attacker.getEntityWorld();
		BlockPos blockPos = attacker.getBlockPos();
		LightningEntity lightningEntity = (LightningEntity) EntityType.LIGHTNING_BOLT.create(world);
        lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(blockPos) );
        world.spawnEntity(lightningEntity);
	}

    
    
}
