package com.newjumper.taloi.content.blocks;

import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class StrippableFenceGateBlock extends FenceGateBlock {
    public StrippableFenceGateBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction == ToolActions.AXE_STRIP && context.getPlayer().isCrouching()) {
            if(state.is(TaloiBlocks.OAK_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.SPRUCE_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.BIRCH_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.JUNGLE_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.ACACIA_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.DARK_OAK_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.MANGROVE_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.CHERRY_WOOD_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.CRIMSON_HYPHAE_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().withPropertiesOf(state);
            if(state.is(TaloiBlocks.WARPED_HYPHAE_FENCE_GATE.get())) return TaloiBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
