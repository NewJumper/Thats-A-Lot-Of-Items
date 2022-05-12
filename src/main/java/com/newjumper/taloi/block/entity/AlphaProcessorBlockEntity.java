package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaProcessorBlockEntity extends ProcessorBlockEntity {
    public AlphaProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE, 4);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.ap");
    }
}
