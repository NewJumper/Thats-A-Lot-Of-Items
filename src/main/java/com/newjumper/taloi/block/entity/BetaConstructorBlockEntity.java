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
import org.jetbrains.annotations.Nullable;

public class BetaConstructorBlockEntity extends ConstructorBlockEntity {
    public BetaConstructorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.BETA_CONSTRUCTOR.get(), pWorldPosition, pBlockState, ConstructingRecipe.Type.INSTANCE);
        data.set(2, 100);
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("container.bc");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ConstructorMenu(pContainerId, pInventory, this, this.data);
    }
}
