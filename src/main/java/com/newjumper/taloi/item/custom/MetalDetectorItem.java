package com.newjumper.taloi.item.custom;

import com.newjumper.taloi.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                Block oreLocated = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                if(isOreBlock(oreLocated)) {
                    sendOreCoordinates(positionClicked.below(i), player, oreLocated);
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableComponent("item.taloi.metal_detector.no_ore"), player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private void sendOreCoordinates(BlockPos blockPos, Player player, Block oreLocated) {
        player.sendMessage(new TextComponent("Found " + oreLocated.asItem().getRegistryName().toString() + " at " + "[" + blockPos.getX() + ", " + blockPos.getY() + "," + blockPos.getZ() + "]"), player.getUUID());
    }

    private boolean isOreBlock(Block block) {
        return Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(ModTags.Blocks.TALOI_ORES) || Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(Tags.Blocks.ORES);
//        return Tags.Blocks.ORES.contains(block) || ModTags.Blocks.TALOI_ORES.contains(block);
    }
}
