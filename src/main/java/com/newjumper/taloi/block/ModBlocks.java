package com.newjumper.taloi.block;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.custom.BouncyBlock;
import com.newjumper.taloi.item.ModCreativeModeTab;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
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
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
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

    // MISCELLANEOUS BLOCKS
    public static final RegistryObject<Block> BOUNCY_BLOCK = registerBlock("bouncy_block", () ->
            new BouncyBlock(BlockBehaviour.Properties.of(Material.METAL)
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
