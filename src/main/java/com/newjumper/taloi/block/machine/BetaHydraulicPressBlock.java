package com.newjumper.taloi.block.machine;

import com.newjumper.taloi.block.entity.BetaHydraulicPressBlockEntity;
import com.newjumper.taloi.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class BetaHydraulicPressBlock extends AbstractHydraulicPressBlock {
    public BetaHydraulicPressBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.BETA_HYDRAULIC_PRESS.get(), BetaHydraulicPressBlockEntity::tick);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BetaHydraulicPressBlockEntity(pPos, pState);
    }
}
