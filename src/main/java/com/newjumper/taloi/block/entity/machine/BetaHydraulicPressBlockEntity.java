package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.ModBlockEntities;
import com.newjumper.taloi.recipe.PressingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class BetaHydraulicPressBlockEntity extends AbstractHydraulicPressBlockEntity {
    public BetaHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.BETA_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState, PressingRecipe.Type.INSTANCE);
        lastSlotIndex = 3;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.bhp");
    }
}
