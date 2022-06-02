package com.newjumper.taloi.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FeatheryBlock extends Block {
    public FeatheryBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()) {
            if(pEntity instanceof Player entity) {
                entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 80));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
