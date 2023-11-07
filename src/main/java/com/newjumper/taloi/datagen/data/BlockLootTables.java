package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlockLootTables extends BlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.PIGLIN_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(Collectors.toSet());

    public BlockLootTables() {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(TaloiBlocks.OAK_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.SPRUCE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.BIRCH_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BIRCH_WOOD_STAIRS.get());
        this.add(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.JUNGLE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.ACACIA_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ACACIA_WOOD_STAIRS.get());
        this.add(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get());
        this.add(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WARPED_HYPHAE_STAIRS.get());

        this.add(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get());
        this.add(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get());

        this.add(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.RED_TERRACOTTA_STAIRS.get());
        this.add(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get());

        this.add(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.WHITE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIME_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIME_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.PINK_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PINK_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GRAY_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.CYAN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLUE_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BROWN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.GREEN_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.RED_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.RED_CONCRETE_STAIRS.get());
        this.add(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TaloiBlocks.BLACK_CONCRETE_STAIRS.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return TaloiBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
