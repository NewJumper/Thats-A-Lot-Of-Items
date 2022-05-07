package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class BetaProcessorBlockEntity extends ProcessorBlockEntity {
    public BetaProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.BETA_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE, 4);
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.bp");
    }
}
