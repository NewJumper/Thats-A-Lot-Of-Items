package com.newjumper.taloi.data;

import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        // ALUMINUM
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        this.add(ModBlocks.ALUMINUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get());
        });

        // IRIDIUM
        this.dropSelf(ModBlocks.IRIDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_IRIDIUM_BLOCK.get());
        this.add(ModBlocks.IRIDIUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.IRIDIUM_ORE.get(), ModItems.RAW_IRIDIUM.get());
        });

        // LEAD
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.add(ModBlocks.LEAD_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get());
        });

        // MAGNESIUM
        this.dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        this.add(ModBlocks.MAGNESIUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get());
        });

        // OSMIUM
        this.dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        this.add(ModBlocks.OSMIUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get());
        });

        // PLATINUM
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.add(ModBlocks.PLATINUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get());
        });

        // SILICON
        this.dropSelf(ModBlocks.SILICON_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILICON_BLOCK.get());
        this.add(ModBlocks.SILICON_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.SILICON_ORE.get(), ModItems.RAW_SILICON.get());
        });

        // TIN
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.add(ModBlocks.TIN_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get());
        });

        // TUNGSTEN
        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        this.add(ModBlocks.TUNGSTEN_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get());
        });

        // URANIUM
        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
        this.add(ModBlocks.URANIUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.URANIUM_ORE.get(), ModItems.RAW_URANIUM.get());
        });

        // ZINC
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        this.add(ModBlocks.ZINC_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get());
        });

        // ALLOYS
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());

        // EVERGREEN
        this.dropSelf(ModBlocks.EVERGREEN_LOG.get());
        this.dropSelf(ModBlocks.EVERGREEN_WOOD.get());
        this.dropSelf(ModBlocks.EVERGREEN_PLANKS.get());
        this.dropSelf(ModBlocks.EVERGREEN_STAIRS.get());
        this.dropSelf(ModBlocks.EVERGREEN_SLAB.get());
        this.dropSelf(ModBlocks.STRIPPED_EVERGREEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EVERGREEN_WOOD.get());
        this.dropSelf(ModBlocks.EVERGREEN_FENCE.get());
        this.dropSelf(ModBlocks.EVERGREEN_FENCE_GATE.get());
        this.add(ModBlocks.EVERGREEN_LEAVES.get(), (block) -> {
            return createLeavesDrops(ModBlocks.EVERGREEN_LEAVES.get(), ModBlocks.EVERGREEN_SAPLING.get());
        });
        this.dropSelf(ModBlocks.EVERGREEN_SAPLING.get());

        // WILLOW
        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_STAIRS.get());
        this.dropSelf(ModBlocks.WILLOW_SLAB.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());
        this.add(ModBlocks.WILLOW_LEAVES.get(), (block) -> {
            return createLeavesDrops(ModBlocks.WILLOW_LEAVES.get(), ModBlocks.WILLOW_SAPLING.get());
        });
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());

        // LIMESTONE
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());

        // MARBLE
        this.dropSelf(ModBlocks.MARBLE.get());
        this.dropSelf(ModBlocks.MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.MARBLE_WALL.get());

        // POLISHED LIMESTONE
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_WALL.get());

        // SMOOTH MARBLE
        this.dropSelf(ModBlocks.SMOOTH_MARBLE.get());
        this.dropSelf(ModBlocks.SMOOTH_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_MARBLE_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_MARBLE_WALL.get());

        // CONCRETE STAIRS / SLABS
        this.dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_SLAB.get());

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
