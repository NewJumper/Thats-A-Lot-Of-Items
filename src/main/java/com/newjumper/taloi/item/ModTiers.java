package com.newjumper.taloi.item;

import com.newjumper.taloi.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier EMERALD = new ForgeTier(0, 64, 13f, 0f, 22, Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Tags.Items.GEMS_EMERALD));
    public static final ForgeTier LAPIS = new ForgeTier(1, 168, 4f, 1f, 6, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Tags.Items.GEMS_LAPIS));
    public static final ForgeTier PLATINUM = new ForgeTier(4, 2031, 9, 4f, 15, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_PLATINUM));
    public static final ForgeTier IRIDIUM = new ForgeTier(4, 2521, 11f, 4f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_IRIDIUM));
    public static final ForgeTier OSMIUM = new ForgeTier(4, 2521, 11f, 4f, 16, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_OSMIUM));
    public static final ForgeTier TUNGSTEN = new ForgeTier(5, 3249, 12f, 5f, 18, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_TUNGSTEN));
    public static final ForgeTier SERMIUM = new ForgeTier(6, 4096, 14f, 6f, 19, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.SERMIUM.get()));
    public static final ForgeTier FUTURITE = new ForgeTier(7, 4622, 15f, 7f, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.FUTURITE.get()));
}
