package com.robinb.mynewmod.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EntityList;
import net.minecraft.world.World;

public class FightItem extends Item{

    public FightItem(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context){

        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        LightningEntity lightningEntity = (LightningEntity) EntityType.LIGHTNING_BOLT.create(world);
        lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(blockPos) );
        world.spawnEntity(lightningEntity);


        return ActionResult.SUCCESS;
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("mynewmod.fight_item.falvor_text"));
    }

}