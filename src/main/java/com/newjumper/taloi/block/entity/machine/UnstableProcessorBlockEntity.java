package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableProcessorBlockEntity extends AbstractProcessorBlockEntity {
    public UnstableProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.UNSTABLE_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE);
        data.set(3, 60);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.up");
    }
}
