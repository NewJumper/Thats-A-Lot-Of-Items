package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.UnstableConstructingRecipe;
import com.newjumper.taloi.screen.UnstableConstructorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableConstructorBlockEntity extends AbstractConstructorBlockEntity {
    public UnstableConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.UNSTABLE_CONSTRUCTOR.get(), pWorldPosition, pBlockState, UnstableConstructingRecipe.Type.INSTANCE);
        lastSlotIndex = 4;
        data.set(3, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.uc");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new UnstableConstructorMenu(pContainerId, pInventory, this, this.data);
    }
}
