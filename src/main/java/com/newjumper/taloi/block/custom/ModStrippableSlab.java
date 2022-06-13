package com.newjumper.taloi.block.custom;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class ModStrippableSlab extends SlabBlock {
    public ModStrippableSlab(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
            if(state.is(ModBlocks.OAK_WOOD_SLAB.get())) return ModBlocks.STRIPPED_OAK_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.SPRUCE_WOOD_SLAB.get())) return ModBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.BIRCH_WOOD_SLAB.get())) return ModBlocks.STRIPPED_BIRCH_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.JUNGLE_WOOD_SLAB.get())) return ModBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.ACACIA_WOOD_SLAB.get())) return ModBlocks.STRIPPED_ACACIA_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.DARK_OAK_WOOD_SLAB.get())) return ModBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.EVERGREEN_WOOD_SLAB.get())) return ModBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(ModBlocks.WILLOW_WOOD_SLAB.get())) return ModBlocks.STRIPPED_WILLOW_WOOD_SLAB.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
