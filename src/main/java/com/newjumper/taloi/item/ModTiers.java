package com.newjumper.taloi.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier OSMIUM = new ForgeTier(4, 2521, 11f, 4f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.OSMIUM_INGOT.get()));
    public static final ForgeTier TUNGSTEN = new ForgeTier(5, 3249, 13f, 5f, 18, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));
}
