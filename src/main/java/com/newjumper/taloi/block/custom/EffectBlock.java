package com.newjumper.taloi.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class EffectBlock extends Block {
    private final MobEffect effect;
    private final int duration;
    private final int amplifier;

    public EffectBlock(Properties pProperties, MobEffect pEffect, int pDuration, int pAmplifier) {
        super(pProperties);
        this.effect = pEffect;
        this.duration = pDuration;
        this.amplifier = pAmplifier;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()) {
            if(pEntity instanceof Player entity) {
                entity.addEffect(new MobEffectInstance(effect, duration, amplifier));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
