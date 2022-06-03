package com.newjumper.taloi.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DIAMOND_APPLE = (new FoodProperties.Builder()).nutrition(5).saturationMod(1.3f).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2800, 0), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 0), 1.0F).alwaysEat().build();
    public static final FoodProperties FUTURITE_APPLE = (new FoodProperties.Builder()).nutrition(8).saturationMod(4.2f).effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 3400, 4), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).alwaysEat().build();
    public static final FoodProperties RICE_BOWL = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4f).build();
    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.6f).build();
}
