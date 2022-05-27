package com.newjumper.taloi.datagen.loot;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    private static final float[] LEAVES_SAPLING_CHANCES = new float[] { 0.05f, 0.0625f, 0.083333336f, 0.1f };

    @Override
    protected void addTables() {
        // EVERGREEN
        this.dropSelf(ModBlocks.EVERGREEN_PLANKS.get());
        this.dropSelf(ModBlocks.EVERGREEN_SAPLING.get());
        this.dropSelf(ModBlocks.EVERGREEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EVERGREEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EVERGREEN_WOOD.get());
        this.dropSelf(ModBlocks.EVERGREEN_WOOD.get());
        this.add(ModBlocks.EVERGREEN_LEAVES.get(), (block) -> createLeavesDrops(block, ModBlocks.EVERGREEN_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.EVERGREEN_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.EVERGREEN_FENCE.get());
        this.dropSelf(ModBlocks.EVERGREEN_STAIRS.get());
        this.dropSelf(ModBlocks.EVERGREEN_BUTTON.get());
        this.dropSelf(ModBlocks.EVERGREEN_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.EVERGREEN_FENCE_GATE.get());

        // WILLOW
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());
        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.add(ModBlocks.WILLOW_LEAVES.get(), (block) -> createLeavesDrops(block, ModBlocks.WILLOW_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WILLOW_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WILLOW_STAIRS.get());
        this.dropSelf(ModBlocks.WILLOW_BUTTON.get());
        this.dropSelf(ModBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());

        // NATURAL & DECORATION
        this.dropSelf(ModBlocks.ASPHALT.get());
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.MARBLE.get());
        this.dropSelf(ModBlocks.SLATE.get());
        this.dropSelf(ModBlocks.SLATE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_TUFF.get());

        this.add(ModBlocks.LIMESTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.LIMESTONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.MARBLE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.SLATE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.add(ModBlocks.SLATE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);

        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.SLATE_STAIRS.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_STAIRS.get());

        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MARBLE_WALL.get());
        this.dropSelf(ModBlocks.SLATE_WALL.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_WALL.get());

        this.dropSelf(ModBlocks.CHISELED_ANDESITE.get());
        this.dropSelf(ModBlocks.CHISELED_DIORITE.get());
        this.dropSelf(ModBlocks.CHISELED_DRIPSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.CHISELED_GRANITE.get());
        this.dropSelf(ModBlocks.CHISELED_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_MARBLE.get());
        this.dropSelf(ModBlocks.CHISELED_SLATE.get());
        this.dropSelf(ModBlocks.CHISELED_TUFF.get());

        this.dropSelf(ModBlocks.BUNDLED_BAMBOO.get());
        this.dropSelf(ModBlocks.BAMBOO_PLANKS.get());

        this.dropWhenSilkTouch(ModBlocks.SNOWY_ICE.get());

        this.dropSelf(ModBlocks.MALACHITE_BLOCK.get());
        this.dropSelf(ModBlocks.TANZANITE_BLOCK.get());
        this.dropSelf(ModBlocks.TOPAZ_BLOCK.get());

        // METALS
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        this.add(ModBlocks.ALUMINUM_ORE.get(), (block) -> createOreDrop(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));
        this.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.dropSelf(ModBlocks.IRIDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_IRIDIUM_BLOCK.get());
        this.add(ModBlocks.IRIDIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.IRIDIUM_ORE.get(), ModItems.RAW_IRIDIUM.get()));
        this.add(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), ModItems.RAW_IRIDIUM.get()));

        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.add(ModBlocks.LEAD_ORE.get(), (block) -> createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.DEEPSLATE_LEAD_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));

        this.dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        this.add(ModBlocks.MAGNESIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get()));
        this.add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get()));

        this.dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        this.add(ModBlocks.OSMIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get()));
        this.add(ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get()));

        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.add(ModBlocks.PLATINUM_ORE.get(), (block) -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));

        this.dropSelf(ModBlocks.SILICON_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILICON_BLOCK.get());
        this.add(ModBlocks.SILICON_ORE.get(), (block) -> createOreDrop(ModBlocks.SILICON_ORE.get(), ModItems.RAW_SILICON.get()));
        this.add(ModBlocks.DEEPSLATE_SILICON_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModItems.RAW_SILICON.get()));

        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.add(ModBlocks.TIN_ORE.get(), (block) -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        this.add(ModBlocks.TUNGSTEN_ORE.get(), (block) -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));
        this.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));

        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
        this.add(ModBlocks.URANIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.URANIUM_ORE.get(), ModItems.RAW_URANIUM.get()));
        this.add(ModBlocks.DEEPSLATE_URANIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModItems.RAW_URANIUM.get()));

        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        this.add(ModBlocks.ZINC_ORE.get(), (block) -> createOreDrop(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.DEEPSLATE_ZINC_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));

        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());

        // MACHINERY
        this.dropSelf(ModBlocks.ALPHA_CONSTRUCTOR.get());
        this.dropSelf(ModBlocks.BETA_CONSTRUCTOR.get());
        this.dropSelf(ModBlocks.UNSTABLE_CONSTRUCTOR.get());

        this.dropSelf(ModBlocks.ALPHA_HYDRAULIC_PRESS.get());
        this.dropSelf(ModBlocks.BETA_HYDRAULIC_PRESS.get());
        this.dropSelf(ModBlocks.UNSTABLE_HYDRAULIC_PRESS.get());

        this.dropSelf(ModBlocks.ALPHA_PROCESSOR.get());
        this.dropSelf(ModBlocks.BETA_PROCESSOR.get());
        this.dropSelf(ModBlocks.UNSTABLE_PROCESSOR.get());

        this.dropSelf(ModBlocks.ALPHA_SEPARATOR.get());
        this.dropSelf(ModBlocks.BETA_SEPARATOR.get());
        this.dropSelf(ModBlocks.UNSTABLE_SEPARATOR.get());

        this.dropSelf(ModBlocks.ALPHA_SMELTERY.get());
        this.dropSelf(ModBlocks.BETA_SMELTERY.get());
        this.dropSelf(ModBlocks.UNSTABLE_SMELTERY.get());

        // CONCRETE
        this.dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.WHITE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIME_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        this.add(ModBlocks.PINK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        this.add(ModBlocks.GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.CYAN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BROWN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.GREEN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        this.add(ModBlocks.RED_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BLACK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);

        // MISCELLANEOUS
        this.dropSelf(ModBlocks.BOUNCY_BLOCK.get());
        this.dropSelf(ModBlocks.FEATHERY_BLOCK.get());
        this.dropSelf(ModBlocks.GRAVITY_BLOCK.get());
        this.dropSelf(ModBlocks.SPEEDY_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
