package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.TaloiBlocks;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public class TaloiBlockTagsProvider extends BlockTagsProvider {
    public TaloiBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_AXE).addTags(TaloiTags.Blocks.WOOD_STAIRS, TaloiTags.Blocks.WOOD_SLABS, TaloiTags.Blocks.WOOD_FENCES, TaloiTags.Blocks.WOOD_FENCE_GATES);

        tag(BlockTags.WOODEN_STAIRS).addTag(TaloiTags.Blocks.WOOD_STAIRS);
        tag(BlockTags.WOODEN_SLABS).addTag(TaloiTags.Blocks.WOOD_SLABS);
        tag(BlockTags.WOODEN_FENCES).addTag(TaloiTags.Blocks.WOOD_FENCES);
        tag(BlockTags.FENCE_GATES).addTag(TaloiTags.Blocks.WOOD_FENCE_GATES);
        tag(BlockTags.STAIRS).addTags(TaloiTags.Blocks.CONCRETE_STAIRS, TaloiTags.Blocks.TERRACOTTA_STAIRS);
        tag(BlockTags.SLABS).addTags(TaloiTags.Blocks.CONCRETE_SLABS, TaloiTags.Blocks.TERRACOTTA_SLABS);

        tag(TaloiTags.Blocks.WOOD_STAIRS).add(TaloiBlocks.OAK_WOOD_STAIRS.get(), TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.BIRCH_WOOD_STAIRS.get(), TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.ACACIA_WOOD_STAIRS.get(), TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.MANGROVE_WOOD_STAIRS.get(), TaloiBlocks.CHERRY_WOOD_STAIRS.get(), TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get());
        tag(TaloiTags.Blocks.WOOD_SLABS).add(TaloiBlocks.OAK_WOOD_SLAB.get(), TaloiBlocks.SPRUCE_WOOD_SLAB.get(), TaloiBlocks.BIRCH_WOOD_SLAB.get(), TaloiBlocks.JUNGLE_WOOD_SLAB.get(), TaloiBlocks.ACACIA_WOOD_SLAB.get(), TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.MANGROVE_WOOD_SLAB.get(), TaloiBlocks.CHERRY_WOOD_SLAB.get(), TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), TaloiBlocks.WARPED_HYPHAE_SLAB.get(), TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get());
        tag(TaloiTags.Blocks.WOOD_FENCES).add(TaloiBlocks.OAK_WOOD_FENCE.get(), TaloiBlocks.SPRUCE_WOOD_FENCE.get(), TaloiBlocks.BIRCH_WOOD_FENCE.get(), TaloiBlocks.JUNGLE_WOOD_FENCE.get(), TaloiBlocks.ACACIA_WOOD_FENCE.get(), TaloiBlocks.DARK_OAK_WOOD_FENCE.get(), TaloiBlocks.MANGROVE_WOOD_FENCE.get(), TaloiBlocks.CHERRY_WOOD_FENCE.get(), TaloiBlocks.CRIMSON_HYPHAE_FENCE.get(), TaloiBlocks.WARPED_HYPHAE_FENCE.get(), TaloiBlocks.STRIPPED_OAK_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get());
        tag(TaloiTags.Blocks.WOOD_FENCE_GATES).add(TaloiBlocks.OAK_WOOD_FENCE_GATE.get(), TaloiBlocks.SPRUCE_WOOD_FENCE_GATE.get(), TaloiBlocks.BIRCH_WOOD_FENCE_GATE.get(), TaloiBlocks.JUNGLE_WOOD_FENCE_GATE.get(), TaloiBlocks.ACACIA_WOOD_FENCE_GATE.get(), TaloiBlocks.DARK_OAK_WOOD_FENCE_GATE.get(), TaloiBlocks.MANGROVE_WOOD_FENCE_GATE.get(), TaloiBlocks.CHERRY_WOOD_FENCE_GATE.get(), TaloiBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(), TaloiBlocks.WARPED_HYPHAE_FENCE_GATE.get(), TaloiBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get(), TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get(), TaloiBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get());
        tag(TaloiTags.Blocks.CONCRETE_STAIRS).add(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), TaloiBlocks.LIME_CONCRETE_STAIRS.get(), TaloiBlocks.PINK_CONCRETE_STAIRS.get(), TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), TaloiBlocks.RED_CONCRETE_STAIRS.get(), TaloiBlocks.BLACK_CONCRETE_STAIRS.get());
        tag(TaloiTags.Blocks.CONCRETE_SLABS).add(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), TaloiBlocks.LIME_CONCRETE_SLAB.get(), TaloiBlocks.PINK_CONCRETE_SLAB.get(), TaloiBlocks.GRAY_CONCRETE_SLAB.get(), TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), TaloiBlocks.CYAN_CONCRETE_SLAB.get(), TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), TaloiBlocks.BLUE_CONCRETE_SLAB.get(), TaloiBlocks.BROWN_CONCRETE_SLAB.get(), TaloiBlocks.GREEN_CONCRETE_SLAB.get(), TaloiBlocks.RED_CONCRETE_SLAB.get(), TaloiBlocks.BLACK_CONCRETE_SLAB.get());
        tag(TaloiTags.Blocks.TERRACOTTA_STAIRS).add(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get());
        tag(TaloiTags.Blocks.TERRACOTTA_SLABS).add(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), TaloiBlocks.RED_TERRACOTTA_SLAB.get(), TaloiBlocks.BLACK_TERRACOTTA_SLAB.get());
    }
}
