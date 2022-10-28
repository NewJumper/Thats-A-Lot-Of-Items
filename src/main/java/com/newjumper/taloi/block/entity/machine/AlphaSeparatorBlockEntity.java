package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.SeparatingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaSeparatorBlockEntity extends AbstractSeparatorBlockEntity {
    public AlphaSeparatorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.ALPHA_SEPARATOR.get(), pWorldPosition, pBlockState, SeparatingRecipe.Type.INSTANCE);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.taloi.ase");
    }
}
