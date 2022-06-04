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

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new HydraulicPressMenu(pContainerId, pInventory, this, this.data);
    }
}
