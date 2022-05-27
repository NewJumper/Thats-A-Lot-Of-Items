package com.newjumper.taloi.block;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.custom.*;
import com.newjumper.taloi.block.machine.*;
import com.newjumper.taloi.item.ModCreativeModeTab;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.world.features.tree.EvergreenTreeGrower;
import com.newjumper.taloi.world.features.tree.WillowTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThatsALotOfItems.MOD_ID);

    // EVERGREEN
    public static final RegistryObject<Block> EVERGREEN_PLANKS = registerBlock("evergreen_planks", () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> EVERGREEN_SAPLING = registerBlock("evergreen_sapling", () -> new SaplingBlock(new EvergreenTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<RotatedPillarBlock> EVERGREEN_LOG = registerBlock("evergreen_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_EVERGREEN_LOG = registerBlock("stripped_evergreen_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_EVERGREEN_WOOD = registerBlock("stripped_evergreen_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> EVERGREEN_WOOD = registerBlock("evergreen_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> EVERGREEN_LEAVES = registerBlock("evergreen_leaves", () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> EVERGREEN_SLAB = registerBlock("evergreen_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<FenceBlock> EVERGREEN_FENCE = registerBlock("evergreen_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> EVERGREEN_STAIRS = registerBlock("evergreen_stairs", () -> new StairBlock(() -> EVERGREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<ButtonBlock> EVERGREEN_BUTTON = registerBlock("evergreen_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).noCollission().strength(0.5f).sound(SoundType.WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<PressurePlateBlock> EVERGREEN_PRESSURE_PLATE = registerBlock("evergreen_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).noCollission().strength(0.5f).sound(SoundType.WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<FenceGateBlock> EVERGREEN_FENCE_GATE = registerBlock("evergreen_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // WILLOW
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks", () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling", () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<RotatedPillarBlock> WILLOW_LOG = registerBlock("willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves", () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> WILLOW_SLAB = registerBlock("willow_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<FenceBlock> WILLOW_FENCE = registerBlock("willow_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> WILLOW_STAIRS = registerBlock("willow_stairs", () -> new StairBlock(() -> WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<ButtonBlock> WILLOW_BUTTON = registerBlock("willow_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).noCollission().strength(0.5f).sound(SoundType.WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<PressurePlateBlock> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).noCollission().strength(0.5f).sound(SoundType.WOOD)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<FenceGateBlock> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // NATURAL & DECORATION
    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5f, 5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5f, 5f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(LIMESTONE.get())
            .strength(2f, 6f)
            .sound(SoundType.NETHER_BRICKS)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> MARBLE = registerBlock("marble", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5f, 4f)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> SLATE = registerBlock("slate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5f, 4f)
            .sound(SoundType.GILDED_BLACKSTONE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(SLATE.get())
            .strength(1.5f, 5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)
            .strength(1.5f, 6f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> LIMESTONE_STAIRS = registerBlock("limestone_stairs", () -> new StairBlock(() -> LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIMESTONE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs", () -> new StairBlock(() -> LIMESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIMESTONE_BRICKS.get())
            .strength(2f, 6f)
            .sound(SoundType.NETHER_BRICKS)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> MARBLE_STAIRS = registerBlock("marble_stairs", () -> new StairBlock(() -> MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MARBLE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> SLATE_STAIRS = registerBlock("slate_stairs", () -> new StairBlock(() -> SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SLATE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.GILDED_BLACKSTONE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<StairBlock> SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs", () -> new StairBlock(() -> SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(SLATE_BRICKS.get())
            .strength(1.5f, 5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<SlabBlock> LIMESTONE_SLAB = registerBlock("limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIMESTONE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIMESTONE_BRICKS.get())
            .strength(2f, 6f)
            .sound(SoundType.NETHER_BRICKS)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> MARBLE_SLAB = registerBlock("marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MARBLE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> SLATE_SLAB = registerBlock("slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SLATE.get())
            .strength(1.5f, 5f)
            .sound(SoundType.GILDED_BLACKSTONE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> SLATE_BRICK_SLAB = registerBlock("slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SLATE_BRICKS.get())
            .strength(1.5f, 5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<WallBlock> LIMESTONE_WALL = registerBlock("limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIMESTONE.get())
            .strength(1.5f, 6f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<WallBlock> LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIMESTONE_BRICKS.get())
            .strength(2f, 6f)
            .sound(SoundType.NETHER_BRICKS)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<WallBlock> MARBLE_WALL = registerBlock("marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MARBLE.get())
            .strength(1.5f, 6f)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<WallBlock> SLATE_WALL = registerBlock("slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SLATE.get())
            .strength(1.5f, 6f)
            .sound(SoundType.GILDED_BLACKSTONE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<WallBlock> SLATE_BRICK_WALL = registerBlock("slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SLATE_BRICKS.get())
            .strength(1.5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> CHISELED_DRIPSTONE_BLOCK = registerBlock("chiseled_dripstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)
            .strength(1.5f, 1.0f)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> CHISELED_LIMESTONE_BRICKS = registerBlock("chiseled_limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.LIMESTONE_BRICKS.get())
            .strength(2f, 6f)
            .sound(SoundType.NETHER_BRICKS)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> CHISELED_MARBLE = registerBlock("chiseled_marble", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get())
            .strength(1.5f, 4f)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> CHISELED_SLATE = registerBlock("chiseled_slate", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.SLATE.get())
            .strength(1.5f, 4f)
            .sound(SoundType.GILDED_BLACKSTONE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> CHISELED_TUFF = registerBlock("chiseled_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)
            .strength(1.5f, 6f)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<RotatedPillarBlock> BUNDLED_BAMBOO = registerBlock("bundled_bamboo", () -> new BundledBambooBlock(BlockBehaviour.Properties.of(Material.BAMBOO)
            .strength(0.5f)
            .sound(SoundType.BAMBOO)), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> BAMBOO_PLANKS = registerBlock("bamboo_planks", () -> new Block(BlockBehaviour.Properties.of(Material.BAMBOO)
            .strength(1f)
            .sound(SoundType.BAMBOO)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> SNOWY_ICE = registerBlock("snowy_ice", () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
            .strength(0.5f)
            .sound(SoundType.SNOW)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> MALACHITE_BLOCK = registerBlock("malachite_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
            .strength(1.5f)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> TANZANITE_BLOCK = registerBlock("tanzanite_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
            .strength(1.5f)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
            .strength(1.5f)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // METALS
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", () -> new Block(BlockBehaviour.Properties.copy(ALUMINUM_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(11f, 11f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> IRIDIUM_ORE = registerBlock("iridium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(8f, 8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore", () -> new Block(BlockBehaviour.Properties.copy(IRIDIUM_ORE.get())
            .strength(10f, 8f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(11f, 11f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", () -> new Block(BlockBehaviour.Properties.copy(LEAD_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> MAGNESIUM_ORE = registerBlock("magnesium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MAGNESIUM_ORE = registerBlock("deepslate_magnesium_ore", () -> new Block(BlockBehaviour.Properties.copy(MAGNESIUM_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(12f, 12f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> OSMIUM_ORE = registerBlock("osmium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(9f, 10f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = registerBlock("deepslate_osmium_ore", () -> new Block(BlockBehaviour.Properties.copy(OSMIUM_ORE.get())
            .strength(13f, 10f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(12f, 12f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(11f, 11f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(8f, 8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", () -> new Block(BlockBehaviour.Properties.copy(PLATINUM_ORE.get())
            .strength(10f, 8f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(11f, 11f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> SILICON_ORE = registerBlock("silicon_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SILICON_ORE = registerBlock("deepslate_silicon_ore", () -> new Block(BlockBehaviour.Properties.copy(SILICON_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_SILICON_BLOCK = registerBlock("raw_silicon_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(TIN_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(10f, 10f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(8f, 8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", () -> new Block(BlockBehaviour.Properties.copy(TUNGSTEN_ORE.get())
            .strength(10f, 8f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(10f, 10f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(8f, 8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore", () -> new Block(BlockBehaviour.Properties.copy(URANIUM_ORE.get())
            .strength(8f, 6f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(8f, 8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3f, 3f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(ZINC_ORE.get())
            .strength(4.5f, 3f)
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // ALLOYS
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(6f, 6f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(6f, 7f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // MACHINERY
    public static final RegistryObject<Block> ALPHA_CONSTRUCTOR = registerBlock("alpha_constructor", () -> new AlphaConstructorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> BETA_CONSTRUCTOR = registerBlock("beta_constructor", () -> new BetaConstructorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> UNSTABLE_CONSTRUCTOR = registerBlock("unstable_constructor", () -> new UnstableConstructorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(4f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);

    public static final RegistryObject<Block> ALPHA_HYDRAULIC_PRESS = registerBlock("alpha_hydraulic_press", () -> new AlphaHydraulicPressBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> BETA_HYDRAULIC_PRESS = registerBlock("beta_hydraulic_press", () -> new BetaHydraulicPressBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> UNSTABLE_HYDRAULIC_PRESS = registerBlock("unstable_hydraulic_press", () -> new UnstableHydraulicPressBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(4f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);

    public static final RegistryObject<Block> ALPHA_PROCESSOR = registerBlock("alpha_processor", () -> new AlphaProcessorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> BETA_PROCESSOR = registerBlock("beta_processor", () -> new BetaProcessorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> UNSTABLE_PROCESSOR = registerBlock("unstable_processor", () -> new UnstableProcessorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(4f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);

    public static final RegistryObject<Block> ALPHA_SEPARATOR = registerBlock("alpha_separator", () -> new AlphaSeparatorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> BETA_SEPARATOR = registerBlock("beta_separator", () -> new BetaSeparatorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> UNSTABLE_SEPARATOR = registerBlock("unstable_separator", () -> new UnstableSeparatorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(4f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);

    public static final RegistryObject<Block> ALPHA_SMELTERY = registerBlock("alpha_smeltery", () -> new AlphaSmelteryBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> BETA_SMELTERY = registerBlock("beta_smeltery", () -> new BetaSmelteryBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(3.5f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);
    public static final RegistryObject<Block> UNSTABLE_SMELTERY = registerBlock("unstable_smeltery", () -> new UnstableSmelteryBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(4f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_MACHINERY_TAB);

    // CONCRETE STAIRS & SLABS
    public static final RegistryObject<StairBlock> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", () -> new StairBlock(Blocks.ORANGE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", () -> new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", () -> new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", () -> new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", () -> new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", () -> new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", () -> new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", () -> new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", () -> new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", () -> new StairBlock(Blocks.RED_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<StairBlock> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", () -> new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);
    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // MISCELLANEOUS
    public static final RegistryObject<Block> BOUNCY_BLOCK = registerBlock("bouncy_block", () -> new BouncyBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(-1f)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> FEATHERY_BLOCK = registerBlock("feathery_block", () -> new FeatheryBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(-1f)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> GRAVITY_BLOCK = registerBlock("gravity_block", () -> new GravityBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(-1f)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block", () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
            .strength(-1f)), ModCreativeModeTab.TALOI_BLOCK_TAB);

    // register blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
