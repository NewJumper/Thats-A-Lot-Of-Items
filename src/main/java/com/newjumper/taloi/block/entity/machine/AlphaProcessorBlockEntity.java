package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaProcessorBlockEntity extends AbstractProcessorBlockEntity {
    public AlphaProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.ALPHA_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.taloi.ap");
    }
}
