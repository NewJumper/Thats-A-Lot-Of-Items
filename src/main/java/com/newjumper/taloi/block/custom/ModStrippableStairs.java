package com.newjumper.taloi.block.custom;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.function.Supplier;

public class ModStrippableStairs extends StairBlock {
    public ModStrippableStairs(Supplier<BlockState> pState, Properties pProperties) {
        super(pState, pProperties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
            if(state.is(ModBlocks.OAK_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_OAK_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.SPRUCE_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.BIRCH_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.JUNGLE_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.ACACIA_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.DARK_OAK_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.CRIMSON_HYPHAE_STAIRS.get())) return ModBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.WARPED_HYPHAE_STAIRS.get())) return ModBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.EVERGREEN_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get().withPropertiesOf(state);
            if(state.is(ModBlocks.WILLOW_WOOD_STAIRS.get())) return ModBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
