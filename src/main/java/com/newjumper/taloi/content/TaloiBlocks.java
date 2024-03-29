package com.newjumper.taloi.content;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.blocks.StrippableFenceBlock;
import com.newjumper.taloi.content.blocks.StrippableFenceGateBlock;
import com.newjumper.taloi.content.blocks.StrippableSlabBlock;
import com.newjumper.taloi.content.blocks.StrippableStairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TaloiBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThatsALotOfItems.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<StairBlock> OAK_WOOD_STAIRS = register("oak_wood_stairs", () -> new StrippableStairBlock(Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> OAK_WOOD_SLAB = register("oak_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> SPRUCE_WOOD_STAIRS = register("spruce_wood_stairs", () -> new StrippableStairBlock(Blocks.SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> SPRUCE_WOOD_SLAB = register("spruce_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> BIRCH_WOOD_STAIRS = register("birch_wood_stairs", () -> new StrippableStairBlock(Blocks.BIRCH_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> BIRCH_WOOD_SLAB = register("birch_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> JUNGLE_WOOD_STAIRS = register("jungle_wood_stairs", () -> new StrippableStairBlock(Blocks.JUNGLE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> JUNGLE_WOOD_SLAB = register("jungle_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> ACACIA_WOOD_STAIRS = register("acacia_wood_stairs", () -> new StrippableStairBlock(Blocks.ACACIA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> ACACIA_WOOD_SLAB = register("acacia_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> DARK_OAK_WOOD_STAIRS = register("dark_oak_wood_stairs", () -> new StrippableStairBlock(Blocks.DARK_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> DARK_OAK_WOOD_SLAB = register("dark_oak_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> MANGROVE_WOOD_STAIRS = register("mangrove_wood_stairs", () -> new StrippableStairBlock(Blocks.MANGROVE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> MANGROVE_WOOD_SLAB = register("mangrove_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> CHERRY_WOOD_STAIRS = register("cherry_wood_stairs", () -> new StrippableStairBlock(Blocks.CHERRY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> CHERRY_WOOD_SLAB = register("cherry_wood_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs", () -> new StrippableStairBlock(Blocks.CRIMSON_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<SlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<StairBlock> WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs", () -> new StrippableStairBlock(Blocks.WARPED_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<SlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab", () -> new StrippableSlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).sound(SoundType.STEM)));

    public static final RegistryObject<StairBlock> STRIPPED_OAK_WOOD_STAIRS = register("stripped_oak_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_WOOD_SLAB = register("stripped_oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_SPRUCE_WOOD_STAIRS = register("stripped_spruce_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = register("stripped_spruce_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_BIRCH_WOOD_STAIRS = register("stripped_birch_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_BIRCH_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = register("stripped_birch_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_JUNGLE_WOOD_STAIRS = register("stripped_jungle_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_JUNGLE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = register("stripped_jungle_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_ACACIA_WOOD_STAIRS = register("stripped_acacia_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_ACACIA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = register("stripped_acacia_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIRS = register("stripped_dark_oak_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_DARK_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = register("stripped_dark_oak_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_MANGROVE_WOOD_STAIRS = register("stripped_mangrove_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_MANGROVE_WOOD::defaultBlockState, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = register("stripped_mangrove_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<StairBlock> STRIPPED_CHERRY_WOOD_STAIRS = register("stripped_cherry_wood_stairs", () -> new StairBlock(Blocks.STRIPPED_CHERRY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> STRIPPED_CHERRY_WOOD_SLAB = register("stripped_cherry_wood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_hyphae_stairs", () -> new StairBlock(Blocks.STRIPPED_CRIMSON_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<StairBlock> STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_hyphae_stairs", () -> new StairBlock(Blocks.STRIPPED_WARPED_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).sound(SoundType.STEM)));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).sound(SoundType.STEM)));

    public static final RegistryObject<FenceBlock> OAK_WOOD_FENCE = register("oak_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> OAK_WOOD_FENCE_GATE = register("oak_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final RegistryObject<FenceBlock> SPRUCE_WOOD_FENCE = register("spruce_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = register("spruce_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE));
    public static final RegistryObject<FenceBlock> BIRCH_WOOD_FENCE = register("birch_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE)));
    public static final RegistryObject<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE), WoodType.BIRCH));
    public static final RegistryObject<FenceBlock> JUNGLE_WOOD_FENCE = register("jungle_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE)));
    public static final RegistryObject<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = register("jungle_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE));
    public static final RegistryObject<FenceBlock> ACACIA_WOOD_FENCE = register("acacia_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE)));
    public static final RegistryObject<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE), WoodType.ACACIA));
    public static final RegistryObject<FenceBlock> DARK_OAK_WOOD_FENCE = register("dark_oak_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = register("dark_oak_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE), WoodType.DARK_OAK));
    public static final RegistryObject<FenceBlock> MANGROVE_WOOD_FENCE = register("mangrove_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE)));
    public static final RegistryObject<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = register("mangrove_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE), WoodType.MANGROVE));
    public static final RegistryObject<FenceBlock> CHERRY_WOOD_FENCE = register("cherry_wood_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE)));
    public static final RegistryObject<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = register("cherry_wood_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
    public static final RegistryObject<FenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE)));
    public static final RegistryObject<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE_GATE), WoodType.CRIMSON));
    public static final RegistryObject<FenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence", () -> new StrippableFenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE)));
    public static final RegistryObject<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate", () -> new StrippableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE), WoodType.WARPED));

    public static final RegistryObject<FenceBlock> STRIPPED_OAK_WOOD_FENCE = register("stripped_oak_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_OAK_WOOD_FENCE_GATE = register("stripped_oak_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final RegistryObject<FenceBlock> STRIPPED_SPRUCE_WOOD_FENCE = register("stripped_spruce_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_SPRUCE_WOOD_FENCE_GATE = register("stripped_spruce_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE));
    public static final RegistryObject<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = register("stripped_birch_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = register("stripped_birch_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE), WoodType.BIRCH));
    public static final RegistryObject<FenceBlock> STRIPPED_JUNGLE_WOOD_FENCE = register("stripped_jungle_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_JUNGLE_WOOD_FENCE_GATE = register("stripped_jungle_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE));
    public static final RegistryObject<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = register("stripped_acacia_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = register("stripped_acacia_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE), WoodType.ACACIA));
    public static final RegistryObject<FenceBlock> STRIPPED_DARK_OAK_WOOD_FENCE = register("stripped_dark_oak_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_DARK_OAK_WOOD_FENCE_GATE = register("stripped_dark_oak_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE), WoodType.DARK_OAK));
    public static final RegistryObject<FenceBlock> STRIPPED_MANGROVE_WOOD_FENCE = register("stripped_mangrove_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_MANGROVE_WOOD_FENCE_GATE = register("stripped_mangrove_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE), WoodType.MANGROVE));
    public static final RegistryObject<FenceBlock> STRIPPED_CHERRY_WOOD_FENCE = register("stripped_cherry_wood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = register("stripped_cherry_wood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
    public static final RegistryObject<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE_GATE), WoodType.CRIMSON));
    public static final RegistryObject<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE)));
    public static final RegistryObject<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE), WoodType.WARPED));

    public static final RegistryObject<StairBlock> WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", () -> new StairBlock(Blocks.ORANGE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", () -> new StairBlock(Blocks.YELLOW_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", () -> new StairBlock(Blocks.LIME_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", () -> new StairBlock(Blocks.PINK_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", () -> new StairBlock(Blocks.GRAY_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", () -> new StairBlock(Blocks.CYAN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", () -> new StairBlock(Blocks.PURPLE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", () -> new StairBlock(Blocks.BLUE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", () -> new StairBlock(Blocks.BROWN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", () -> new StairBlock(Blocks.RED_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = register("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", () -> new StairBlock(Blocks.BLACK_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = register("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", () -> new StairBlock(Blocks.ORANGE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", () -> new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", () -> new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", () -> new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = register("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", () -> new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = register("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", () -> new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = register("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", () -> new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", () -> new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", () -> new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = register("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = register("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = register("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> RED_CONCRETE_STAIRS = register("red_concrete_stairs", () -> new StairBlock(Blocks.RED_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = register("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", () -> new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = register("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> registeredBlock = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(registeredBlock.get(), new Item.Properties()));
        return registeredBlock;
    }
}
