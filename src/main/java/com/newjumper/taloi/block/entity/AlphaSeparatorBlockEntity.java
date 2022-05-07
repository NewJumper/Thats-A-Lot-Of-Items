package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.SeparatingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaSeparatorBlockEntity extends SeparatorBlockEntity {
    public AlphaSeparatorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_SEPARATOR.get(), pWorldPosition, pBlockState, SeparatingRecipe.Type.INSTANCE);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.ase");
    }
}
