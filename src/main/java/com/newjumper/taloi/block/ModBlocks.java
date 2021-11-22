package com.newjumper.taloi.block;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.custom.BouncyBlock;
import com.newjumper.taloi.item.ModCreativeModeTab;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ThatsALotOfItems.MOD_ID);

    // INGOT BLOCKS
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRIDIUM_ORE = registerBlock("iridium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGNESIUM_ORE = registerBlock("magnesium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OSMIUM_ORE = registerBlock("osmium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILICON_ORE = registerBlock("silicon_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_SILICON_BLOCK = registerBlock("raw_silicon_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(12f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(12f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    // ALLOY BLOCKS
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()));

    // TREES AND PLANTS
    public static final RegistryObject<Block> EVERGREEN_LOG = registerBlock("evergreen_log", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> EVERGREEN_WOOD = registerBlock("evergreen_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> EVERGREEN_LEAVES = registerBlock("evergreen_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(0.2f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EVERGREEN_PLANKS = registerBlock("evergreen_planks", () ->
            new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_EVERGREEN_LOG = registerBlock("stripped_evergreen_log", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_EVERGREEN_WOOD = registerBlock("stripped_evergreen_wood", () ->
            new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> EVERGREEN_SAPLING = registerBlock("evergreen_sapling", () ->
            new SaplingBlock(new OakTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT)
                    .instabreak()
                    .randomTicks()
                    .sound(SoundType.GRASS)));

    // MISCELLANEOUS BLOCKS
    public static final RegistryObject<Block> BOUNCY_BLOCK = registerBlock("bouncy_block", () ->
            new BouncyBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(-1f)));

    // in game mod tab
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () ->
                new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    // custom mod tab
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () ->
                new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.TALOI_BLOCK_TAB)));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
