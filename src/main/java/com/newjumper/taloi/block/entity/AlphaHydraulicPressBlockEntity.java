package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.PressingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaHydraulicPressBlockEntity extends HydraulicPressBlockEntity {
    public AlphaHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState, PressingRecipe.Type.INSTANCE, 4);
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.ahp");
    }
}
