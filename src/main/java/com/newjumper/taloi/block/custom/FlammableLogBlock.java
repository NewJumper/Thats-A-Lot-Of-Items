package com.newjumper.taloi.block.custom;

import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import javax.annotation.Nullable;

public class FlammableLogBlock extends RotatedPillarBlock {
    public FlammableLogBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
            if(state.is(TaloiBlocks.EVERGREEN_LOG.get())) return TaloiBlocks.STRIPPED_EVERGREEN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            if(state.is(TaloiBlocks.EVERGREEN_WOOD.get())) return TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            if(state.is(TaloiBlocks.WILLOW_LOG.get())) return TaloiBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            if(state.is(TaloiBlocks.WILLOW_WOOD.get())) return TaloiBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
