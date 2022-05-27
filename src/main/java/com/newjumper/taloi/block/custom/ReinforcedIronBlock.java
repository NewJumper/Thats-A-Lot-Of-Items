package com.newjumper.taloi.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class ReinforcedIronBlock extends Block implements RustingIron {
    private final RustState rustState;

    public ReinforcedIronBlock(RustState pRustState, Properties pProperties) {
        super(pProperties);
        this.rustState = pRustState;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        this.onRandomTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return RustingIron.getNext(pState.getBlock()).isPresent();
    }

    @Override
    public RustState getAge() {
        return this.rustState;
    }
}
