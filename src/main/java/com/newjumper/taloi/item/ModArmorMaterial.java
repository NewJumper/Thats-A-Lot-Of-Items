package com.newjumper.taloi.item;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    OSMIUM("osmium", 40, new int[]{ 4, 7, 9, 4 }, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.OSMIUM_INGOT.get());
    }),
    TUNGSTEN("tungsten", 43, new int[]{ 5, 8, 10, 5 }, 18, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F, () -> {
        return Ingredient.of(ModItems.OSMIUM_INGOT.get());
    }),
    SERMIUM("sermium", 45, new int[]{ 6, 10, 13, 6 }, 19, SoundEvents.ARMOR_EQUIP_NETHERITE, 6.0F, 0.4F, () -> {
        return Ingredient.of(ModItems.OSMIUM_INGOT.get());
    }),
    FUTURITE("futurite", 49, new int[]{ 8, 12, 15, 8 }, 21, SoundEvents.ARMOR_EQUIP_NETHERITE, 8.0F, 0.4F, () -> {
        return Ingredient.of(ModItems.OSMIUM_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public String getName() {
        return ThatsALotOfItems.MOD_ID + ":" + this.name;
    }
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    public SoundEvent getEquipSound() {
        return this.sound;
    }
    public float getToughness() {
        return this.toughness;
    }
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
