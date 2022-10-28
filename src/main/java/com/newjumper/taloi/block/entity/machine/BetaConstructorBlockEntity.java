package com.newjumper.taloi.block.entity.machine;

import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.recipe.ConstructingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;

public class BetaConstructorBlockEntity extends AbstractConstructorBlockEntity {
    public BetaConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TaloiBlockEntities.BETA_CONSTRUCTOR.get(), pWorldPosition, pBlockState, ConstructingRecipe.Type.INSTANCE);
        lastSlotIndex = 3;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.taloi.bc");
    }
}
