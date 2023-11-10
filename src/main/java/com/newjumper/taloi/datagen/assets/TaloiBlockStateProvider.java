package com.newjumper.taloi.datagen.assets;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class TaloiBlockStateProvider extends BlockStateProvider {
    public TaloiBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        stairsBlock(TaloiBlocks.OAK_WOOD_STAIRS.get(), mcLoc(Blocks.OAK_LOG));
        slabBlock(TaloiBlocks.OAK_WOOD_SLAB.get(), mcLoc(Blocks.OAK_WOOD), mcLoc(Blocks.OAK_LOG));
        stairsBlock(TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), mcLoc(Blocks.SPRUCE_LOG));
        slabBlock(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), mcLoc(Blocks.SPRUCE_WOOD), mcLoc(Blocks.SPRUCE_LOG));
        stairsBlock(TaloiBlocks.BIRCH_WOOD_STAIRS.get(), mcLoc(Blocks.BIRCH_LOG));
        slabBlock(TaloiBlocks.BIRCH_WOOD_SLAB.get(), mcLoc(Blocks.BIRCH_WOOD), mcLoc(Blocks.BIRCH_LOG));
        stairsBlock(TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), mcLoc(Blocks.JUNGLE_LOG));
        slabBlock(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), mcLoc(Blocks.JUNGLE_WOOD), mcLoc(Blocks.JUNGLE_LOG));
        stairsBlock(TaloiBlocks.ACACIA_WOOD_STAIRS.get(), mcLoc(Blocks.ACACIA_LOG));
        slabBlock(TaloiBlocks.ACACIA_WOOD_SLAB.get(), mcLoc(Blocks.ACACIA_WOOD), mcLoc(Blocks.ACACIA_LOG));
        stairsBlock(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.DARK_OAK_LOG));
        slabBlock(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), mcLoc(Blocks.DARK_OAK_WOOD), mcLoc(Blocks.DARK_OAK_LOG));
        stairsBlock(TaloiBlocks.MANGROVE_WOOD_STAIRS.get(), mcLoc(Blocks.MANGROVE_LOG));
        slabBlock(TaloiBlocks.MANGROVE_WOOD_SLAB.get(), mcLoc(Blocks.MANGROVE_WOOD), mcLoc(Blocks.MANGROVE_LOG));
        stairsBlock(TaloiBlocks.CHERRY_WOOD_STAIRS.get(), mcLoc(Blocks.CHERRY_LOG));
        slabBlock(TaloiBlocks.CHERRY_WOOD_SLAB.get(), mcLoc(Blocks.CHERRY_WOOD), mcLoc(Blocks.CHERRY_LOG));
        stairsBlock(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), mcLoc(Blocks.CRIMSON_STEM));
        slabBlock(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), mcLoc(Blocks.CRIMSON_HYPHAE), mcLoc(Blocks.CRIMSON_STEM));
        stairsBlock(TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), mcLoc(Blocks.WARPED_STEM));
        slabBlock(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), mcLoc(Blocks.WARPED_HYPHAE), mcLoc(Blocks.WARPED_STEM));

        stairsBlock(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_OAK_LOG));
        slabBlock(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_OAK_WOOD), mcLoc(Blocks.STRIPPED_OAK_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_SPRUCE_LOG));
        slabBlock(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_SPRUCE_WOOD), mcLoc(Blocks.STRIPPED_SPRUCE_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_BIRCH_LOG));
        slabBlock(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_BIRCH_WOOD), mcLoc(Blocks.STRIPPED_BIRCH_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_JUNGLE_LOG));
        slabBlock(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_JUNGLE_WOOD), mcLoc(Blocks.STRIPPED_JUNGLE_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_ACACIA_LOG));
        slabBlock(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_ACACIA_WOOD), mcLoc(Blocks.STRIPPED_ACACIA_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_DARK_OAK_LOG));
        slabBlock(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_DARK_OAK_WOOD), mcLoc(Blocks.STRIPPED_DARK_OAK_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_MANGROVE_LOG));
        slabBlock(TaloiBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_MANGROVE_WOOD), mcLoc(Blocks.STRIPPED_MANGROVE_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), mcLoc(Blocks.STRIPPED_CHERRY_LOG));
        slabBlock(TaloiBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), mcLoc(Blocks.STRIPPED_CHERRY_WOOD), mcLoc(Blocks.STRIPPED_CHERRY_LOG));
        stairsBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), mcLoc(Blocks.STRIPPED_CRIMSON_STEM));
        slabBlock(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), mcLoc(Blocks.STRIPPED_CRIMSON_HYPHAE), mcLoc(Blocks.STRIPPED_CRIMSON_STEM));
        stairsBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), mcLoc(Blocks.STRIPPED_WARPED_STEM));
        slabBlock(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), mcLoc(Blocks.STRIPPED_WARPED_HYPHAE), mcLoc(Blocks.STRIPPED_WARPED_STEM));

        stairsBlock(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.WHITE_TERRACOTTA));
        slabBlock(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.WHITE_TERRACOTTA), mcLoc(Blocks.WHITE_TERRACOTTA));
        stairsBlock(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.ORANGE_TERRACOTTA));
        slabBlock(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.ORANGE_TERRACOTTA), mcLoc(Blocks.ORANGE_TERRACOTTA));
        stairsBlock(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.MAGENTA_TERRACOTTA));
        slabBlock(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), mcLoc(Blocks.MAGENTA_TERRACOTTA), mcLoc(Blocks.MAGENTA_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA), mcLoc(Blocks.LIGHT_BLUE_TERRACOTTA));
        stairsBlock(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.YELLOW_TERRACOTTA));
        slabBlock(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), mcLoc(Blocks.YELLOW_TERRACOTTA), mcLoc(Blocks.YELLOW_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIME_TERRACOTTA));
        slabBlock(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIME_TERRACOTTA), mcLoc(Blocks.LIME_TERRACOTTA));
        stairsBlock(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.PINK_TERRACOTTA));
        slabBlock(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), mcLoc(Blocks.PINK_TERRACOTTA), mcLoc(Blocks.PINK_TERRACOTTA));
        stairsBlock(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.GRAY_TERRACOTTA));
        slabBlock(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), mcLoc(Blocks.GRAY_TERRACOTTA), mcLoc(Blocks.GRAY_TERRACOTTA));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA), mcLoc(Blocks.LIGHT_GRAY_TERRACOTTA));
        stairsBlock(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.CYAN_TERRACOTTA));
        slabBlock(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.CYAN_TERRACOTTA), mcLoc(Blocks.CYAN_TERRACOTTA));
        stairsBlock(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.PURPLE_TERRACOTTA));
        slabBlock(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.PURPLE_TERRACOTTA), mcLoc(Blocks.PURPLE_TERRACOTTA));
        stairsBlock(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BLUE_TERRACOTTA));
        slabBlock(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BLUE_TERRACOTTA), mcLoc(Blocks.BLUE_TERRACOTTA));
        stairsBlock(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BROWN_TERRACOTTA));
        slabBlock(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BROWN_TERRACOTTA), mcLoc(Blocks.BROWN_TERRACOTTA));
        stairsBlock(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.GREEN_TERRACOTTA));
        slabBlock(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), mcLoc(Blocks.GREEN_TERRACOTTA), mcLoc(Blocks.GREEN_TERRACOTTA));
        stairsBlock(TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.RED_TERRACOTTA));
        slabBlock(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), mcLoc(Blocks.RED_TERRACOTTA), mcLoc(Blocks.RED_TERRACOTTA));
        stairsBlock(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get(), mcLoc(Blocks.BLACK_TERRACOTTA));
        slabBlock(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), mcLoc(Blocks.BLACK_TERRACOTTA), mcLoc(Blocks.BLACK_TERRACOTTA));

        stairsBlock(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), mcLoc(Blocks.WHITE_CONCRETE));
        slabBlock(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), mcLoc(Blocks.WHITE_CONCRETE), mcLoc(Blocks.WHITE_CONCRETE));
        stairsBlock(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), mcLoc(Blocks.ORANGE_CONCRETE));
        slabBlock(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), mcLoc(Blocks.ORANGE_CONCRETE), mcLoc(Blocks.ORANGE_CONCRETE));
        stairsBlock(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), mcLoc(Blocks.MAGENTA_CONCRETE));
        slabBlock(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), mcLoc(Blocks.MAGENTA_CONCRETE), mcLoc(Blocks.MAGENTA_CONCRETE));
        stairsBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIGHT_BLUE_CONCRETE));
        slabBlock(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), mcLoc(Blocks.LIGHT_BLUE_CONCRETE), mcLoc(Blocks.LIGHT_BLUE_CONCRETE));
        stairsBlock(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), mcLoc(Blocks.YELLOW_CONCRETE));
        slabBlock(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), mcLoc(Blocks.YELLOW_CONCRETE), mcLoc(Blocks.YELLOW_CONCRETE));
        stairsBlock(TaloiBlocks.LIME_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIME_CONCRETE));
        slabBlock(TaloiBlocks.LIME_CONCRETE_SLAB.get(), mcLoc(Blocks.LIME_CONCRETE), mcLoc(Blocks.LIME_CONCRETE));
        stairsBlock(TaloiBlocks.PINK_CONCRETE_STAIRS.get(), mcLoc(Blocks.PINK_CONCRETE));
        slabBlock(TaloiBlocks.PINK_CONCRETE_SLAB.get(), mcLoc(Blocks.PINK_CONCRETE), mcLoc(Blocks.PINK_CONCRETE));
        stairsBlock(TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), mcLoc(Blocks.GRAY_CONCRETE));
        slabBlock(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), mcLoc(Blocks.GRAY_CONCRETE), mcLoc(Blocks.GRAY_CONCRETE));
        stairsBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), mcLoc(Blocks.LIGHT_GRAY_CONCRETE));
        slabBlock(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), mcLoc(Blocks.LIGHT_GRAY_CONCRETE), mcLoc(Blocks.LIGHT_GRAY_CONCRETE));
        stairsBlock(TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), mcLoc(Blocks.CYAN_CONCRETE));
        slabBlock(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), mcLoc(Blocks.CYAN_CONCRETE), mcLoc(Blocks.CYAN_CONCRETE));
        stairsBlock(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), mcLoc(Blocks.PURPLE_CONCRETE));
        slabBlock(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), mcLoc(Blocks.PURPLE_CONCRETE), mcLoc(Blocks.PURPLE_CONCRETE));
        stairsBlock(TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), mcLoc(Blocks.BLUE_CONCRETE));
        slabBlock(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), mcLoc(Blocks.BLUE_CONCRETE), mcLoc(Blocks.BLUE_CONCRETE));
        stairsBlock(TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), mcLoc(Blocks.BROWN_CONCRETE));
        slabBlock(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), mcLoc(Blocks.BROWN_CONCRETE), mcLoc(Blocks.BROWN_CONCRETE));
        stairsBlock(TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), mcLoc(Blocks.GREEN_CONCRETE));
        slabBlock(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), mcLoc(Blocks.GREEN_CONCRETE), mcLoc(Blocks.GREEN_CONCRETE));
        stairsBlock(TaloiBlocks.RED_CONCRETE_STAIRS.get(), mcLoc(Blocks.RED_CONCRETE));
        slabBlock(TaloiBlocks.RED_CONCRETE_SLAB.get(), mcLoc(Blocks.RED_CONCRETE), mcLoc(Blocks.RED_CONCRETE));
        stairsBlock(TaloiBlocks.BLACK_CONCRETE_STAIRS.get(), mcLoc(Blocks.BLACK_CONCRETE));
        slabBlock(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), mcLoc(Blocks.BLACK_CONCRETE), mcLoc(Blocks.BLACK_CONCRETE));
    }

    public ResourceLocation mcLoc(Block block) {
        return super.mcLoc("block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath());
    }
}
