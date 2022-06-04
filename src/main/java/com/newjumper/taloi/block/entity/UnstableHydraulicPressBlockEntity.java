package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.UnstablePressingRecipe;
import com.newjumper.taloi.screen.UnstableHydraulicPressMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableHydraulicPressBlockEntity extends AbstractHydraulicPressBlockEntity {
    public UnstableHydraulicPressBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.UNSTABLE_HYDRAULIC_PRESS.get(), pWorldPosition, pBlockState, UnstablePressingRecipe.Type.INSTANCE);
        lastSlotIndex = 4;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.uhp");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new UnstableHydraulicPressMenu(pContainerId, pInventory, this, this.data);
    }
}
