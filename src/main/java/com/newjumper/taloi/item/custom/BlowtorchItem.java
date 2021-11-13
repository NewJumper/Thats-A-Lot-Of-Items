package com.newjumper.taloi.item.custom;

import com.google.common.collect.ImmutableMap;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class BlowtorchItem extends Item {
    private static final Map<Block, Item> BLOWTORCH_ITEM =
            new ImmutableMap.Builder<Block, Item>()
                    .put(ModBlocks.ALUMINUM_BLOCK.get(), ModItems.ALUMINUM_INGOT.get()) // if using content from mod
                    .put(Blocks.SAND, Blocks.GLASS.asItem()) // if using content from minecraft
                    .build();

    public BlowtorchItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos positionClicked = pContext.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if(canBlowtorch(blockClicked)) {
                ItemEntity entityItem = new ItemEntity(level,
                        positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                        new ItemStack(BLOWTORCH_ITEM.get(blockClicked), 1));

                level.destroyBlock(positionClicked, false);
                level.addFreshEntity(entityItem);
                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), p -> {
                    p.broadcastBreakEvent(pContext.getHand());
                });
            }
        }

        return InteractionResult.SUCCESS;
    }

    private boolean canBlowtorch(Block block) {
        return BLOWTORCH_ITEM.containsKey(block);
    }
}
