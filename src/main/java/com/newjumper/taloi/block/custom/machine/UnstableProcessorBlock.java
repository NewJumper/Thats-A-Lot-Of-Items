package com.newjumper.taloi.block.custom.machine;

import com.newjumper.taloi.block.entity.machine.ModBlockEntities;
import com.newjumper.taloi.block.entity.machine.UnstableProcessorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class UnstableProcessorBlock extends AbstractProcessorBlock {
    public UnstableProcessorBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.UNSTABLE_PROCESSOR.get(), UnstableProcessorBlockEntity::tick);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new UnstableProcessorBlockEntity(pPos, pState);
    }
}
