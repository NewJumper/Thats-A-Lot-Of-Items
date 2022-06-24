package com.newjumper.taloi.datagen.loot;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    private static final float[] LEAVES_SAPLING_CHANCES = new float[] { 0.05f, 0.0625f, 0.083333336f, 0.1f };

    @Override
    protected void addTables() {
        // EVERGREEN
        this.dropSelf(TaloiBlocks.EVERGREEN_PLANKS.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_SAPLING.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_LOG.get());
        this.dropSelf(TaloiBlocks.STRIPPED_EVERGREEN_LOG.get());
        this.dropSelf(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_WOOD.get());
        this.add(TaloiBlocks.EVERGREEN_LEAVES.get(), (block) -> createLeavesDrops(block, TaloiBlocks.EVERGREEN_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(TaloiBlocks.EVERGREEN_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.EVERGREEN_FENCE.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_STAIRS.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_BUTTON.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_PRESSURE_PLATE.get());
        this.add(TaloiBlocks.EVERGREEN_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(TaloiBlocks.EVERGREEN_TRAPDOOR.get());
        this.dropSelf(TaloiBlocks.EVERGREEN_FENCE_GATE.get());
        this.add(TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.EVERGREEN_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get());

        // WILLOW
        this.dropSelf(TaloiBlocks.WILLOW_PLANKS.get());
        this.dropSelf(TaloiBlocks.WILLOW_SAPLING.get());
        this.dropSelf(TaloiBlocks.WILLOW_LOG.get());
        this.dropSelf(TaloiBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(TaloiBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(TaloiBlocks.WILLOW_WOOD.get());
        this.add(TaloiBlocks.WILLOW_LEAVES.get(), (block) -> createLeavesDrops(block, TaloiBlocks.WILLOW_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(TaloiBlocks.WILLOW_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WILLOW_FENCE.get());
        this.dropSelf(TaloiBlocks.WILLOW_STAIRS.get());
        this.dropSelf(TaloiBlocks.WILLOW_BUTTON.get());
        this.dropSelf(TaloiBlocks.WILLOW_PRESSURE_PLATE.get());
        this.add(TaloiBlocks.WILLOW_DOOR.get(), BlockLoot::createDoorTable);
        this.dropSelf(TaloiBlocks.WILLOW_TRAPDOOR.get());
        this.dropSelf(TaloiBlocks.WILLOW_FENCE_GATE.get());
        this.add(TaloiBlocks.WILLOW_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WILLOW_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get());

        // NATURAL & DECORATION
        this.dropSelf(TaloiBlocks.ASPHALT.get());
        this.dropSelf(TaloiBlocks.LIMESTONE.get());
        this.dropSelf(TaloiBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(TaloiBlocks.MARBLE.get());
        this.dropSelf(TaloiBlocks.SLATE.get());
        this.dropSelf(TaloiBlocks.SLATE_BRICKS.get());
        this.dropSelf(TaloiBlocks.POLISHED_TUFF.get());

        this.add(TaloiBlocks.LIMESTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(TaloiBlocks.MARBLE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(TaloiBlocks.SLATE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(TaloiBlocks.SLATE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);

        this.dropSelf(TaloiBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(TaloiBlocks.LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(TaloiBlocks.MARBLE_STAIRS.get());
        this.dropSelf(TaloiBlocks.SLATE_STAIRS.get());
        this.dropSelf(TaloiBlocks.SLATE_BRICK_STAIRS.get());

        this.dropSelf(TaloiBlocks.LIMESTONE_WALL.get());
        this.dropSelf(TaloiBlocks.LIMESTONE_BRICK_WALL.get());
        this.dropSelf(TaloiBlocks.MARBLE_WALL.get());
        this.dropSelf(TaloiBlocks.SLATE_WALL.get());
        this.dropSelf(TaloiBlocks.SLATE_BRICK_WALL.get());

        this.dropSelf(TaloiBlocks.CHISELED_ANDESITE.get());
        this.dropSelf(TaloiBlocks.CHISELED_DIORITE.get());
        this.dropSelf(TaloiBlocks.CHISELED_DRIPSTONE_BLOCK.get());
        this.dropSelf(TaloiBlocks.CHISELED_GRANITE.get());
        this.dropSelf(TaloiBlocks.CHISELED_LIMESTONE_BRICKS.get());
        this.dropSelf(TaloiBlocks.CHISELED_MARBLE.get());
        this.dropSelf(TaloiBlocks.CHISELED_SLATE.get());
        this.dropSelf(TaloiBlocks.CHISELED_TUFF.get());

        this.dropSelf(TaloiBlocks.NETHERRACK_BRICKS.get());

        this.dropSelf(TaloiBlocks.REINFORCED_IRON_BLOCK.get());
        this.dropSelf(TaloiBlocks.RUSTED_REINFORCED_IRON_BLOCK.get());

        this.dropSelf(TaloiBlocks.BUNDLED_BAMBOO.get());
        this.dropSelf(TaloiBlocks.BAMBOO_PLANKS.get());

        this.dropWhenSilkTouch(TaloiBlocks.SNOWY_ICE.get());

        this.dropSelf(TaloiBlocks.MALACHITE_BLOCK.get());
        this.dropSelf(TaloiBlocks.TANZANITE_BLOCK.get());
        this.dropSelf(TaloiBlocks.TOPAZ_BLOCK.get());

        this.dropSelf(TaloiBlocks.WOODEN_CRATE.get());
        this.dropSelf(TaloiBlocks.IRON_CRATE.get());

        // METALS
        this.dropSelf(TaloiBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_ALUMINUM_BLOCK.get());
        this.add(TaloiBlocks.ALUMINUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.ALUMINUM_ORE.get(), TaloiItems.RAW_ALUMINUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), TaloiItems.RAW_ALUMINUM.get()));

        this.dropSelf(TaloiBlocks.IRIDIUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_IRIDIUM_BLOCK.get());
        this.add(TaloiBlocks.IRIDIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.IRIDIUM_ORE.get(), TaloiItems.RAW_IRIDIUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), TaloiItems.RAW_IRIDIUM.get()));

        this.dropSelf(TaloiBlocks.LEAD_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_LEAD_BLOCK.get());
        this.add(TaloiBlocks.LEAD_ORE.get(), (block) -> createOreDrop(TaloiBlocks.LEAD_ORE.get(), TaloiItems.RAW_LEAD.get()));
        this.add(TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), TaloiItems.RAW_LEAD.get()));

        this.dropSelf(TaloiBlocks.MAGNESIUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_MAGNESIUM_BLOCK.get());
        this.add(TaloiBlocks.MAGNESIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.MAGNESIUM_ORE.get(), TaloiItems.RAW_MAGNESIUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), TaloiItems.RAW_MAGNESIUM.get()));

        this.dropSelf(TaloiBlocks.OSMIUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_OSMIUM_BLOCK.get());
        this.add(TaloiBlocks.OSMIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.OSMIUM_ORE.get(), TaloiItems.RAW_OSMIUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), TaloiItems.RAW_OSMIUM.get()));

        this.dropSelf(TaloiBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_PLATINUM_BLOCK.get());
        this.add(TaloiBlocks.PLATINUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.PLATINUM_ORE.get(), TaloiItems.RAW_PLATINUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), TaloiItems.RAW_PLATINUM.get()));

        this.dropSelf(TaloiBlocks.SILICON_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_SILICON_BLOCK.get());
        this.add(TaloiBlocks.SILICON_ORE.get(), (block) -> createOreDrop(TaloiBlocks.SILICON_ORE.get(), TaloiItems.RAW_SILICON.get()));
        this.add(TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), TaloiItems.RAW_SILICON.get()));

        this.dropSelf(TaloiBlocks.TIN_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_TIN_BLOCK.get());
        this.add(TaloiBlocks.TIN_ORE.get(), (block) -> createOreDrop(TaloiBlocks.TIN_ORE.get(), TaloiItems.RAW_TIN.get()));
        this.add(TaloiBlocks.DEEPSLATE_TIN_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_TIN_ORE.get(), TaloiItems.RAW_TIN.get()));

        this.dropSelf(TaloiBlocks.TUNGSTEN_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_TUNGSTEN_BLOCK.get());
        this.add(TaloiBlocks.TUNGSTEN_ORE.get(), (block) -> createOreDrop(TaloiBlocks.TUNGSTEN_ORE.get(), TaloiItems.RAW_TUNGSTEN.get()));
        this.add(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), TaloiItems.RAW_TUNGSTEN.get()));

        this.dropSelf(TaloiBlocks.URANIUM_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_URANIUM_BLOCK.get());
        this.add(TaloiBlocks.URANIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.URANIUM_ORE.get(), TaloiItems.RAW_URANIUM.get()));
        this.add(TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), TaloiItems.RAW_URANIUM.get()));

        this.dropSelf(TaloiBlocks.ZINC_BLOCK.get());
        this.dropSelf(TaloiBlocks.RAW_ZINC_BLOCK.get());
        this.add(TaloiBlocks.ZINC_ORE.get(), (block) -> createOreDrop(TaloiBlocks.ZINC_ORE.get(), TaloiItems.RAW_ZINC.get()));
        this.add(TaloiBlocks.DEEPSLATE_ZINC_ORE.get(), (block) -> createOreDrop(TaloiBlocks.DEEPSLATE_ZINC_ORE.get(), TaloiItems.RAW_ZINC.get()));

        this.dropSelf(TaloiBlocks.BRONZE_BLOCK.get());
        this.dropSelf(TaloiBlocks.STEEL_BLOCK.get());

        // MACHINERY
        this.dropSelf(TaloiBlocks.ALPHA_CONSTRUCTOR.get());
        this.dropSelf(TaloiBlocks.BETA_CONSTRUCTOR.get());
        this.dropSelf(TaloiBlocks.UNSTABLE_CONSTRUCTOR.get());

        this.dropSelf(TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get());
        this.dropSelf(TaloiBlocks.BETA_HYDRAULIC_PRESS.get());
        this.dropSelf(TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get());

        this.dropSelf(TaloiBlocks.ALPHA_PROCESSOR.get());
        this.dropSelf(TaloiBlocks.BETA_PROCESSOR.get());
        this.dropSelf(TaloiBlocks.UNSTABLE_PROCESSOR.get());

        this.dropSelf(TaloiBlocks.ALPHA_SEPARATOR.get());
        this.dropSelf(TaloiBlocks.BETA_SEPARATOR.get());
        this.dropSelf(TaloiBlocks.UNSTABLE_SEPARATOR.get());

        // VANILLA
        this.add(TaloiBlocks.OAK_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.SPRUCE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.BIRCH_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BIRCH_WOOD_STAIRS.get());
        this.add(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.JUNGLE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.ACACIA_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ACACIA_WOOD_STAIRS.get());
        this.add(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get());
        this.add(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WARPED_HYPHAE_STAIRS.get());

        this.add(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get());

        this.add(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.RED_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get());

        this.add(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WHITE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIME_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIME_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.PINK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PINK_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GRAY_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CYAN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLUE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BROWN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GREEN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.RED_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.RED_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLACK_CONCRETE_STAIRS.get());

        // MISCELLANEOUS
        this.dropSelf(TaloiBlocks.BOUNCY_BLOCK.get());
        this.dropSelf(TaloiBlocks.FEATHERY_BLOCK.get());
        this.dropSelf(TaloiBlocks.GRAVITY_BLOCK.get());
        this.dropSelf(TaloiBlocks.SPEEDY_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TaloiBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
