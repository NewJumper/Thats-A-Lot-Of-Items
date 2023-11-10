package com.newjumper.taloi.content.blocks;

import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class StrippableSlabBlock extends SlabBlock {
    public StrippableSlabBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
            if(state.is(TaloiBlocks.OAK_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.SPRUCE_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.BIRCH_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.JUNGLE_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.ACACIA_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.DARK_OAK_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.MANGROVE_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.CHERRY_WOOD_SLAB.get())) return TaloiBlocks.STRIPPED_CHERRY_WOOD_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get())) return TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.WARPED_HYPHAE_SLAB.get())) return TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
