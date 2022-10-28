package com.newjumper.taloi.item.custom;

import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class DestabilizedFuturiteAppleItem extends Item {
    public DestabilizedFuturiteAppleItem(Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        super.finishUsingItem(pStack, pLevel, pEntityLiving);
        if (pEntityLiving instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!pLevel.isClientSide) {
            pEntityLiving.removeEffect(MobEffects.DIG_SLOWDOWN);
            pEntityLiving.removeEffect(MobEffects.HUNGER);
            pEntityLiving.removeEffect(MobEffects.POISON);
        }

        if (pStack.isEmpty()) {
            return new ItemStack(TaloiItems.DIAMOND_APPLE.get());
        } else {
            if (pEntityLiving instanceof Player player && !((Player)pEntityLiving).getAbilities().instabuild) {
                ItemStack stack = new ItemStack(TaloiItems.DIAMOND_APPLE.get());
                if (!player.getInventory().add(stack)) {
                    player.drop(stack, false);
                }
            }

            return pStack;
        }
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.EAT;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_EAT;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pUsedHand);
    }
}
