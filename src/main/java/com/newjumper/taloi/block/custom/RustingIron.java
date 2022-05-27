package com.newjumper.taloi.block.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface RustingIron extends ChangeOverTimeBlock<RustingIron.RustState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder().put(ModBlocks.REINFORCED_IRON_BLOCK.get(), ModBlocks.RUSTED_REINFORCED_IRON_BLOCK.get()).build());
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    static Optional<Block> getPrevious(Block pBlock) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(pBlock));
    }

    static Block getFirst(Block pBlock) {
        Block block = pBlock;

        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(pBlock); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState pBlockState) {
        return getPrevious(pBlockState.getBlock()).map((block) -> block.withPropertiesOf(pBlockState));
    }

    static Optional<Block> getNext(Block p_154905_) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(p_154905_));
    }

    static BlockState getFirst(BlockState p_154907_) {
        return getFirst(p_154907_.getBlock()).withPropertiesOf(p_154907_);
    }

    default Optional<BlockState> getNext(BlockState pBlockState) {
        return getNext(pBlockState.getBlock()).map((block) -> block.withPropertiesOf(pBlockState));
    }

    default float getChanceModifier() {
        return this.getAge() == RustingIron.RustState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum RustState {
        UNAFFECTED,
        RUSTED
    }
}
