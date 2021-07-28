package com.robinb.mynewmod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        if(this.isOnFire()) {
            TntEntity tnt = EntityType.TNT.create(this.world);
            tnt.setFuse(10);
            tnt.setPosition(this.getX(), this.getY(), this.getZ());

            world.spawnEntity(tnt);
        }
    }
}
