package com.newjumper.taloi.block.custom;

import com.newjumper.taloi.block.TaloiBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.function.Supplier;

public class StrippableStairBlock extends StairBlock {
    public StrippableStairBlock(Supplier<BlockState> pState, Properties pProperties) {
        super(pState, pProperties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
            if(state.is(TaloiBlocks.OAK_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.SPRUCE_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.BIRCH_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.JUNGLE_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.ACACIA_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get())) return TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.WARPED_HYPHAE_STAIRS.get())) return TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.EVERGREEN_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.WILLOW_WOOD_STAIRS.get())) return TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
