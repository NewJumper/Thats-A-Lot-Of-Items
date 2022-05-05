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

public class UnstableConstructorBlockEntity extends ConstructorBlockEntity {
    public UnstableConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.UNSTABLE_CONSTRUCTOR.get(), pWorldPosition, pBlockState, UnstableConstructingRecipe.Type.INSTANCE, 5);
        this.data.set(3, 70);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.uc");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new UnstableConstructorMenu(pContainerId, pInventory, this, this.data);
    }
}
