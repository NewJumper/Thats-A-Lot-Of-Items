package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.recipe.SeparatingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableSeparatorBlockEntity extends AbstractSeparatorBlockEntity {
    public UnstableSeparatorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.UNSTABLE_SEPARATOR.get(), pWorldPosition, pBlockState, SeparatingRecipe.Type.INSTANCE);
        data.set(3, 60);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.use");
    }
}
