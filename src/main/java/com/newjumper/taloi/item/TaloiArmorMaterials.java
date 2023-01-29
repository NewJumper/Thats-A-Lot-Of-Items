package com.newjumper.taloi.item;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum TaloiArmorMaterials implements ArmorMaterial {
    EMERALD("emerald", 10, new int[]{ 2, 3, 5, 2 }, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(Tags.Items.GEMS_EMERALD)),
    LAPIS("lapis", 10, new int[]{ 1, 4, 5, 2 }, 12, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(Tags.Items.GEMS_LAPIS));

    private static final int[] HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    TaloiArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    public @NotNull String getName() {
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
    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }
    public float getToughness() {
        return this.toughness;
    }
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
