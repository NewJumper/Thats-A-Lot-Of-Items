package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.PressingRecipe;
import com.newjumper.taloi.screen.HydraulicPressMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AlphaHydraulicPressBlockEntity extends HydraulicPressBlockEntity {
    public AlphaHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState, PressingRecipe.Type.INSTANCE);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.ahp");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new HydraulicPressMenu(pContainerId, pInventory, this, this.data);
    }
}
