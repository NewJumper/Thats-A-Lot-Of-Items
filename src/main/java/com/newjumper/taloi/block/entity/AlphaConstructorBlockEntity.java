package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.recipe.ConstructingRecipe;
import com.newjumper.taloi.screen.ConstructorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;

public class AlphaConstructorBlockEntity extends AbstractConstructorBlockEntity {
    public AlphaConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALPHA_CONSTRUCTOR.get(), pWorldPosition, pBlockState, ConstructingRecipe.Type.INSTANCE);
        lastSlotIndex = 3;
        data.set(3, 200);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.taloi.ac");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ConstructorMenu(pContainerId, pInventory, this, this.data);
    }
}
