package com.newjumper.taloi.item.custom;

import com.newjumper.taloi.item.TaloiArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FuturiteArmor extends ArmorItem {
    public FuturiteArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasArmorEquipped(player)) {
                if(!player.hasEffect(MobEffects.REGENERATION)) player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, true, true, false));
                if(!player.hasEffect(MobEffects.MOVEMENT_SPEED)) player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, true, true, false));
            }
        }
    }

    private boolean hasArmorEquipped(Player player) {
        for(ItemStack stack : player.getInventory().armor) {
            if(!(stack.getItem() instanceof ArmorItem)) return false;
            if(stack.isEmpty() || ((ArmorItem)stack.getItem()).getMaterial() != TaloiArmorMaterials.FUTURITE) return false;
        }

        return true;
    }
}