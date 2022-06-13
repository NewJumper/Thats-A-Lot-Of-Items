package com.newjumper.taloi.block.custom.machine;

import com.newjumper.taloi.block.entity.ModBlockEntities;
import com.newjumper.taloi.block.entity.machine.AlphaConstructorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AlphaConstructorBlock extends AbstractConstructorBlock {
    public AlphaConstructorBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.ALPHA_CONSTRUCTOR.get(), AlphaConstructorBlockEntity::tick);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new AlphaConstructorBlockEntity(pPos, pState);
    }
}
