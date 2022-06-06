package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.ModBlockEntities;
import com.newjumper.taloi.recipe.ProcessingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class BetaProcessorBlockEntity extends AbstractProcessorBlockEntity {
    public BetaProcessorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.BETA_PROCESSOR.get(), pWorldPosition, pBlockState, ProcessingRecipe.Type.INSTANCE);
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.bp");
    }
}
