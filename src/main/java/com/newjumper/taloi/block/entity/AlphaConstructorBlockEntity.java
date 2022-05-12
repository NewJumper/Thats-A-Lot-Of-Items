package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ConstructingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaConstructorBlockEntity extends ConstructorBlockEntity {
    public AlphaConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_CONSTRUCTOR.get(), pWorldPosition, pBlockState, ConstructingRecipe.Type.INSTANCE, 4);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.ac");
    }
}
