package com.newjumper.taloi.item;

import com.newjumper.taloi.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum TaloiTiers implements Tier {
    EMERALD(0, 64, 13f, 0f, 22,Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Tags.Items.GEMS_EMERALD)),
    LAPIS(1, 168, 4f, 1f, 6, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Tags.Items.GEMS_LAPIS)),
    PLATINUM(4, 2031, 9, 4f, 15, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_PLATINUM)),
    IRIDIUM(4, 2521, 11f, 4f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_IRIDIUM)),
    OSMIUM(4, 2521, 11f, 4f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_OSMIUM)),
    TUNGSTEN(5, 3249, 12f, 5f, 18, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN)),
    SERMIUM(6, 4096, 14f, 6f, 19, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.SERMIUM.get())),
    FUTURITE(7, 4622, 15f, 7f, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.FUTURITE.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final TagKey<Block> tag;
    private final Supplier<Ingredient> repairIngredient;

    TaloiTiers(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Block> tag, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.tag = tag;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
    @Override
    public int getUses() {
        return this.uses;
    }
    @Override
    public float getSpeed() {
        return this.speed;
    }
    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    @Override
    public TagKey<Block> getTag() {
        return this.tag;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
