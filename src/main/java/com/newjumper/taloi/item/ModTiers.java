package com.newjumper.taloi.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier OSMIUM = new ForgeTier(5, 3249, 12f, 5f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.OSMIUM_INGOT.get()));
}
