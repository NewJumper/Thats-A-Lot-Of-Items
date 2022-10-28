package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.PressingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;

public class BetaHydraulicPressBlockEntity extends AbstractHydraulicPressBlockEntity {
    public BetaHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.BETA_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState, PressingRecipe.Type.INSTANCE);
        lastSlotIndex = 3;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.taloi.bhp");
    }
}
