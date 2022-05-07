package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableProcessorBlockEntity extends ProcessorBlockEntity {
    public UnstableProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.UNSTABLE_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE, 4);
        data.set(3, 60);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.up");
    }
}
