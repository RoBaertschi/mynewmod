package com.robinb.mynewmod.tools;

import com.robinb.mynewmod.MyNewMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, -0.1f, new Item.Settings().group(MyNewMod.MAIN_GROUP));
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
        tooltip.add(new TranslatableText("mynewmod.fabric_sword.falvor_text"));
    }
}
