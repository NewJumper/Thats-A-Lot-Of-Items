package com.newjumper.taloi.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier ALUMINUM = new ForgeTier(2, 250, 6f, 2f, 14, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.ALUMINUM_INGOT.get()));
    public static final ForgeTier IRIDIUM = new ForgeTier(5, 3249, 12f, 5f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.IRIDIUM_INGOT.get()));
    public static final ForgeTier LEAD = new ForgeTier(2, 250, 6f, 2f, 14, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.LEAD_INGOT.get()));
    public static final ForgeTier MAGNESIUM = new ForgeTier(2, 250, 6f, 2f, 14, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.MAGNESIUM_INGOT.get()));
    public static final ForgeTier OSMIUM = new ForgeTier(5, 3249, 12f, 5f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.OSMIUM_INGOT.get()));
    public static final ForgeTier PLATINUM = new ForgeTier(3, 1561, 8f, 3f, 10, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get()));
    public static final ForgeTier TIN = new ForgeTier(2, 250, 6, 2f, 14, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get()));
    public static final ForgeTier TUNGSTEN = new ForgeTier(4, 2031, 9, 4f, 15, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));
    public static final ForgeTier ZINC = new ForgeTier(2, 250, 6, 2f, 14, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(ModItems.ZINC_INGOT.get()));
}
