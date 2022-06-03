package com.newjumper.taloi.item;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    PLATINUM("platinum", 37, new int[]{ 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(ModTags.Items.INGOTS_PLATINUM)),
    IRIDIUM("iridium", 38, new int[]{ 3, 7, 8, 3 }, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(ModTags.Items.INGOTS_IRIDIUM)),
    OSMIUM("osmium", 38, new int[]{ 3, 7, 8, 3 }, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(ModTags.Items.INGOTS_OSMIUM)),
    TUNGSTEN("tungsten", 39, new int[]{ 4, 7, 8, 3 }, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN)),
    SERMIUM("sermium", 42, new int[]{ 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.of(ModItems.SERMIUM.get())),
    FUTURITE("futurite", 42, new int[]{ 5, 8, 10, 5 }, 19, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0f, 0.2f, () -> Ingredient.of(ModItems.FUTURITE.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
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
