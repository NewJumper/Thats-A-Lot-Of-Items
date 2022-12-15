package com.newjumper.taloi.datagen.assets;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    public ModItemModelProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // - BLOCKS -
        // EVERGREEN
        blockModel(TaloiBlocks.EVERGREEN_PLANKS);
        getBuilder("evergreen_sapling").parent(GENERATED).texture("layer0", "block/evergreen_sapling");
        blockModel(TaloiBlocks.EVERGREEN_LOG);
        blockModel(TaloiBlocks.STRIPPED_EVERGREEN_LOG);
        blockModel(TaloiBlocks.STRIPPED_EVERGREEN_WOOD);
        blockModel(TaloiBlocks.EVERGREEN_WOOD);
        blockModel(TaloiBlocks.EVERGREEN_LEAVES);
        blockModel(TaloiBlocks.EVERGREEN_SLAB);
        blockModel(TaloiBlocks.EVERGREEN_FENCE, "inventory");
        blockModel(TaloiBlocks.EVERGREEN_STAIRS);
        blockModel(TaloiBlocks.EVERGREEN_BUTTON, "inventory");
        blockModel(TaloiBlocks.EVERGREEN_PRESSURE_PLATE);
        getBuilder("evergreen_door").parent(GENERATED).texture("layer0", "item/evergreen_door");
        blockModel(TaloiBlocks.EVERGREEN_TRAPDOOR, "bottom");
        blockModel(TaloiBlocks.EVERGREEN_FENCE_GATE);
        blockModel(TaloiBlocks.EVERGREEN_WOOD_SLAB);
        blockModel(TaloiBlocks.EVERGREEN_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS);

        // WILLOW
        blockModel(TaloiBlocks.WILLOW_PLANKS);
        getBuilder("willow_sapling").parent(GENERATED).texture("layer0", "block/willow_sapling");
        blockModel(TaloiBlocks.WILLOW_LOG);
        blockModel(TaloiBlocks.STRIPPED_WILLOW_LOG);
        blockModel(TaloiBlocks.STRIPPED_WILLOW_WOOD);
        blockModel(TaloiBlocks.WILLOW_WOOD);
        blockModel(TaloiBlocks.WILLOW_LEAVES);
        blockModel(TaloiBlocks.WILLOW_SLAB);
        blockModel(TaloiBlocks.WILLOW_FENCE, "inventory");
        blockModel(TaloiBlocks.WILLOW_STAIRS);
        blockModel(TaloiBlocks.WILLOW_BUTTON, "inventory");
        blockModel(TaloiBlocks.WILLOW_PRESSURE_PLATE);
        getBuilder("willow_door").parent(GENERATED).texture("layer0", "item/willow_door");
        blockModel(TaloiBlocks.WILLOW_TRAPDOOR, "bottom");
        blockModel(TaloiBlocks.WILLOW_FENCE_GATE);
        blockModel(TaloiBlocks.WILLOW_WOOD_SLAB);
        blockModel(TaloiBlocks.WILLOW_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS);

        // NATURAL
        blockModel(TaloiBlocks.ASPHALT);
        blockModel(TaloiBlocks.LIMESTONE);
        blockModel(TaloiBlocks.LIMESTONE_BRICKS);
        blockModel(TaloiBlocks.MARBLE);
        blockModel(TaloiBlocks.SLATE);
        blockModel(TaloiBlocks.SLATE_BRICKS);
        blockModel(TaloiBlocks.POLISHED_TUFF);

        blockModel(TaloiBlocks.LIMESTONE_SLAB);
        blockModel(TaloiBlocks.LIMESTONE_BRICK_SLAB);
        blockModel(TaloiBlocks.MARBLE_SLAB);
        blockModel(TaloiBlocks.SLATE_SLAB);
        blockModel(TaloiBlocks.SLATE_BRICK_SLAB);

        blockModel(TaloiBlocks.LIMESTONE_STAIRS);
        blockModel(TaloiBlocks.LIMESTONE_BRICK_STAIRS);
        blockModel(TaloiBlocks.MARBLE_STAIRS);
        blockModel(TaloiBlocks.SLATE_STAIRS);
        blockModel(TaloiBlocks.SLATE_BRICK_STAIRS);

        blockModel(TaloiBlocks.LIMESTONE_WALL, "inventory");
        blockModel(TaloiBlocks.LIMESTONE_BRICK_WALL, "inventory");
        blockModel(TaloiBlocks.MARBLE_WALL, "inventory");
        blockModel(TaloiBlocks.SLATE_WALL, "inventory");
        blockModel(TaloiBlocks.SLATE_BRICK_WALL, "inventory");

        blockModel(TaloiBlocks.CHISELED_ANDESITE);
        blockModel(TaloiBlocks.CHISELED_DIORITE);
        blockModel(TaloiBlocks.CHISELED_DRIPSTONE_BLOCK);
        blockModel(TaloiBlocks.CHISELED_GRANITE);
        blockModel(TaloiBlocks.CHISELED_LIMESTONE_BRICKS);
        blockModel(TaloiBlocks.CHISELED_MARBLE);
        blockModel(TaloiBlocks.CHISELED_SLATE);
        blockModel(TaloiBlocks.CHISELED_TUFF);

        blockModel(TaloiBlocks.NETHERRACK_BRICKS);

        blockModel(TaloiBlocks.REINFORCED_IRON_BLOCK);
        blockModel(TaloiBlocks.RUSTED_REINFORCED_IRON_BLOCK);

        blockModel(TaloiBlocks.BUNDLED_BAMBOO);
        blockModel(TaloiBlocks.BAMBOO_PLANKS);

        blockModel(TaloiBlocks.SNOWY_ICE);

        blockModel(TaloiBlocks.MALACHITE_BLOCK);
        blockModel(TaloiBlocks.TANZANITE_BLOCK);
        blockModel(TaloiBlocks.TOPAZ_BLOCK);

        blockModel(TaloiBlocks.WOODEN_CRATE);
        blockModel(TaloiBlocks.IRON_CRATE);

        // METALS
        blockModel(TaloiBlocks.ALUMINUM_BLOCK);
        blockModel(TaloiBlocks.ALUMINUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE);
        blockModel(TaloiBlocks.RAW_ALUMINUM_BLOCK);
        blockModel(TaloiBlocks.IRIDIUM_BLOCK);
        blockModel(TaloiBlocks.IRIDIUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE);
        blockModel(TaloiBlocks.RAW_IRIDIUM_BLOCK);
        blockModel(TaloiBlocks.LEAD_BLOCK);
        blockModel(TaloiBlocks.LEAD_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_LEAD_ORE);
        blockModel(TaloiBlocks.RAW_LEAD_BLOCK);
        blockModel(TaloiBlocks.MAGNESIUM_BLOCK);
        blockModel(TaloiBlocks.MAGNESIUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE);
        blockModel(TaloiBlocks.RAW_MAGNESIUM_BLOCK);
        blockModel(TaloiBlocks.OSMIUM_BLOCK);
        blockModel(TaloiBlocks.OSMIUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_OSMIUM_ORE);
        blockModel(TaloiBlocks.RAW_OSMIUM_BLOCK);
        blockModel(TaloiBlocks.PLATINUM_BLOCK);
        blockModel(TaloiBlocks.PLATINUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_PLATINUM_ORE);
        blockModel(TaloiBlocks.RAW_PLATINUM_BLOCK);
        blockModel(TaloiBlocks.SILICON_BLOCK);
        blockModel(TaloiBlocks.SILICON_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_SILICON_ORE);
        blockModel(TaloiBlocks.RAW_SILICON_BLOCK);
        blockModel(TaloiBlocks.TIN_BLOCK);
        blockModel(TaloiBlocks.TIN_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_TIN_ORE);
        blockModel(TaloiBlocks.RAW_TIN_BLOCK);
        blockModel(TaloiBlocks.TUNGSTEN_BLOCK);
        blockModel(TaloiBlocks.TUNGSTEN_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockModel(TaloiBlocks.RAW_TUNGSTEN_BLOCK);
        blockModel(TaloiBlocks.URANIUM_BLOCK);
        blockModel(TaloiBlocks.URANIUM_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_URANIUM_ORE);
        blockModel(TaloiBlocks.RAW_URANIUM_BLOCK);
        blockModel(TaloiBlocks.ZINC_BLOCK);
        blockModel(TaloiBlocks.ZINC_ORE);
        blockModel(TaloiBlocks.DEEPSLATE_ZINC_ORE);
        blockModel(TaloiBlocks.RAW_ZINC_BLOCK);

        blockModel(TaloiBlocks.BRONZE_BLOCK);
        blockModel(TaloiBlocks.STEEL_BLOCK);

        // MACHINERY
        blockModel(TaloiBlocks.ALPHA_CONSTRUCTOR);
        blockModel(TaloiBlocks.BETA_CONSTRUCTOR);
        blockModel(TaloiBlocks.UNSTABLE_CONSTRUCTOR);
        blockModel(TaloiBlocks.ALPHA_HYDRAULIC_PRESS);
        blockModel(TaloiBlocks.BETA_HYDRAULIC_PRESS);
        blockModel(TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS);
        blockModel(TaloiBlocks.ALPHA_PROCESSOR);
        blockModel(TaloiBlocks.BETA_PROCESSOR);
        blockModel(TaloiBlocks.UNSTABLE_PROCESSOR);
        blockModel(TaloiBlocks.ALPHA_SEPARATOR);
        blockModel(TaloiBlocks.BETA_SEPARATOR);
        blockModel(TaloiBlocks.UNSTABLE_SEPARATOR);

        // VANILLA
        blockModel(TaloiBlocks.OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.SPRUCE_WOOD_SLAB);
        blockModel(TaloiBlocks.SPRUCE_WOOD_STAIRS);
        blockModel(TaloiBlocks.BIRCH_WOOD_SLAB);
        blockModel(TaloiBlocks.BIRCH_WOOD_STAIRS);
        blockModel(TaloiBlocks.JUNGLE_WOOD_SLAB);
        blockModel(TaloiBlocks.JUNGLE_WOOD_STAIRS);
        blockModel(TaloiBlocks.ACACIA_WOOD_SLAB);
        blockModel(TaloiBlocks.ACACIA_WOOD_STAIRS);
        blockModel(TaloiBlocks.DARK_OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.DARK_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.CRIMSON_HYPHAE_SLAB);
        blockModel(TaloiBlocks.CRIMSON_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.WARPED_HYPHAE_SLAB);
        blockModel(TaloiBlocks.WARPED_HYPHAE_STAIRS);

        blockModel(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
        blockModel(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
        blockModel(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);

        blockModel(TaloiBlocks.WHITE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.WHITE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.ORANGE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.YELLOW_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIME_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIME_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.PINK_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.PINK_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.GRAY_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.GRAY_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.CYAN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.CYAN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.PURPLE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BLUE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BLUE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BROWN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BROWN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.GREEN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.GREEN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.RED_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.RED_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BLACK_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BLACK_TERRACOTTA_STAIRS);

        blockModel(TaloiBlocks.WHITE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.WHITE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.ORANGE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.ORANGE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.MAGENTA_CONCRETE_SLAB);
        blockModel(TaloiBlocks.MAGENTA_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.YELLOW_CONCRETE_SLAB);
        blockModel(TaloiBlocks.YELLOW_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIME_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIME_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.PINK_CONCRETE_SLAB);
        blockModel(TaloiBlocks.PINK_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.GRAY_CONCRETE_SLAB);
        blockModel(TaloiBlocks.GRAY_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.CYAN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.CYAN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.PURPLE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.PURPLE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BLUE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BLUE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BROWN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BROWN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.GREEN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.GREEN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.RED_CONCRETE_SLAB);
        blockModel(TaloiBlocks.RED_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BLACK_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BLACK_CONCRETE_STAIRS);

        // MISCELLANEOUS
        blockModel(TaloiBlocks.BOUNCY_BLOCK);
        blockModel(TaloiBlocks.FEATHERY_BLOCK);
        blockModel(TaloiBlocks.GRAVITY_BLOCK);
        blockModel(TaloiBlocks.SPEEDY_BLOCK);

        // - ITEMS -
        // RAW & INGOTS
        itemModel(TaloiItems.ALUMINUM_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_ALUMINUM, GENERATED);
        itemModel(TaloiItems.IRIDIUM_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_IRIDIUM, GENERATED);
        itemModel(TaloiItems.LEAD_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_LEAD, GENERATED);
        itemModel(TaloiItems.MAGNESIUM_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_MAGNESIUM, GENERATED);
        itemModel(TaloiItems.OSMIUM_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_OSMIUM, GENERATED);
        itemModel(TaloiItems.PLATINUM_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_PLATINUM, GENERATED);
        itemModel(TaloiItems.SILICON, GENERATED);
        itemModel(TaloiItems.RAW_SILICON, GENERATED);
        itemModel(TaloiItems.TIN_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_TIN, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_TUNGSTEN, GENERATED);
        itemModel(TaloiItems.REFINED_URANIUM, GENERATED);
        itemModel(TaloiItems.RAW_URANIUM, GENERATED);
        itemModel(TaloiItems.ZINC_INGOT, GENERATED);
        itemModel(TaloiItems.RAW_ZINC, GENERATED);

        // MACHINERY
        itemModel(TaloiItems.ALPHA_MACHINE_FRAME, GENERATED);
        itemModel(TaloiItems.BETA_MACHINE_FRAME, GENERATED);
        itemModel(TaloiItems.UNSTABLE_MACHINE_FRAME, GENERATED);

        // CONSTRUCTING
        itemModel(TaloiItems.BRONZE_INGOT, GENERATED);
        itemModel(TaloiItems.CARBONITE, GENERATED);
        itemModel(TaloiItems.FERRONIOBIUM_INGOT, GENERATED);
        itemModel(TaloiItems.FUTURITE, GENERATED);
        itemModel(TaloiItems.HARDENED_CARBONITE, GENERATED);
        itemModel(TaloiItems.SERMIUM, GENERATED);
        itemModel(TaloiItems.STEEL_INGOT, GENERATED);
        itemModel(TaloiItems.ALLOY_X, GENERATED);
        itemModel(TaloiItems.ALLOY_Z, GENERATED);

        // PRESSING
        itemModel(TaloiItems.ALLOY_PLATE, GENERATED);
        itemModel(TaloiItems.BRONZE_PLATE, GENERATED);
        itemModel(TaloiItems.CARBON_PLATE, GENERATED);
        itemModel(TaloiItems.COPPER_PLATE, GENERATED);
        itemModel(TaloiItems.DIAMOND_PLATE, GENERATED);
        itemModel(TaloiItems.FORGE_PLATE, GENERATED);
        itemModel(TaloiItems.FUTURITE_PLATE, GENERATED);
        itemModel(TaloiItems.GOLD_DISK, GENERATED);
        itemModel(TaloiItems.INDUCTION_PLATE, GENERATED);
        itemModel(TaloiItems.MAGNESIUM_PLATE, GENERATED);
        itemModel(TaloiItems.REINFORCED_COPPER_PLATE, GENERATED);
        itemModel(TaloiItems.SEMICONDUCTOR_PLATE, GENERATED);
        itemModel(TaloiItems.SERMIUM_PLATE, GENERATED);
        itemModel(TaloiItems.SILICON_PLATE, GENERATED);
        itemModel(TaloiItems.STEEL_PLATE, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_PLATE, GENERATED);

        // PROCESSING
        itemModel(TaloiItems.COAL_INFUSED_IRON_INGOT, GENERATED);
        itemModel(TaloiItems.COAL_INFUSED_LEAD_INGOT, GENERATED);
        itemModel(TaloiItems.DIAMOND_INFUSED_STEEL_INGOT, GENERATED);
        itemModel(TaloiItems.DIAMOND_INFUSED_TIN_INGOT, GENERATED);
        itemModel(TaloiItems.DIAMOND_INFUSED_URANIUM, GENERATED);
        itemModel(TaloiItems.EMERALD_INFUSED_OSMIUM_INGOT, GENERATED);
        itemModel(TaloiItems.EMERALD_INFUSED_TUNGSTEN_INGOT, GENERATED);
        itemModel(TaloiItems.EMERALD_INFUSED_ZINC_INGOT, GENERATED);
        itemModel(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT, GENERATED);
        itemModel(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT, GENERATED);
        itemModel(TaloiItems.SERMIUM_CORE, GENERATED);
        itemModel(TaloiItems.SERMIUM_OXIDE, GENERATED);

        // NUGGETS
        itemModel(TaloiItems.ALUMINUM_NUGGET, GENERATED);
        itemModel(TaloiItems.IRIDIUM_NUGGET, GENERATED);
        itemModel(TaloiItems.LEAD_NUGGET, GENERATED);
        itemModel(TaloiItems.MAGNESIUM_NUGGET, GENERATED);
        itemModel(TaloiItems.OSMIUM_NUGGET, GENERATED);
        itemModel(TaloiItems.PLATINUM_NUGGET, GENERATED);
        itemModel(TaloiItems.TIN_NUGGET, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_NUGGET, GENERATED);
        itemModel(TaloiItems.URANIUM_BIT, GENERATED);
        itemModel(TaloiItems.ZINC_NUGGET, GENERATED);
        itemModel(TaloiItems.FUTURITE_BIT, GENERATED);

        // ARMOR
        itemModel(TaloiItems.EMERALD_HELMET, GENERATED);
        itemModel(TaloiItems.EMERALD_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.EMERALD_LEGGINGS, GENERATED);
        itemModel(TaloiItems.EMERALD_BOOTS, GENERATED);

        itemModel(TaloiItems.IRIDIUM_HELMET, GENERATED);
        itemModel(TaloiItems.IRIDIUM_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.IRIDIUM_LEGGINGS, GENERATED);
        itemModel(TaloiItems.IRIDIUM_BOOTS, GENERATED);

        itemModel(TaloiItems.LAPIS_HELMET, GENERATED);
        itemModel(TaloiItems.LAPIS_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.LAPIS_LEGGINGS, GENERATED);
        itemModel(TaloiItems.LAPIS_BOOTS, GENERATED);

        itemModel(TaloiItems.OSMIUM_HELMET, GENERATED);
        itemModel(TaloiItems.OSMIUM_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.OSMIUM_LEGGINGS, GENERATED);
        itemModel(TaloiItems.OSMIUM_BOOTS, GENERATED);

        itemModel(TaloiItems.PLATINUM_HELMET, GENERATED);
        itemModel(TaloiItems.PLATINUM_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.PLATINUM_LEGGINGS, GENERATED);
        itemModel(TaloiItems.PLATINUM_BOOTS, GENERATED);

        itemModel(TaloiItems.TUNGSTEN_HELMET, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_LEGGINGS, GENERATED);
        itemModel(TaloiItems.TUNGSTEN_BOOTS, GENERATED);

        itemModel(TaloiItems.FUTURITE_HELMET, GENERATED);
        itemModel(TaloiItems.FUTURITE_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.FUTURITE_LEGGINGS, GENERATED);
        itemModel(TaloiItems.FUTURITE_BOOTS, GENERATED);

        itemModel(TaloiItems.SERMIUM_HELMET, GENERATED);
        itemModel(TaloiItems.SERMIUM_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.SERMIUM_LEGGINGS, GENERATED);
        itemModel(TaloiItems.SERMIUM_BOOTS, GENERATED);

        // TOOLS
        itemModel(TaloiItems.EMERALD_SHOVEL, HANDHELD);
        itemModel(TaloiItems.EMERALD_PICKAXE, HANDHELD);
        itemModel(TaloiItems.EMERALD_AXE, HANDHELD);
        itemModel(TaloiItems.EMERALD_HOE, HANDHELD);

        itemModel(TaloiItems.IRIDIUM_SHOVEL, HANDHELD);
        itemModel(TaloiItems.IRIDIUM_PICKAXE, HANDHELD);
        itemModel(TaloiItems.IRIDIUM_AXE, HANDHELD);
        itemModel(TaloiItems.IRIDIUM_HOE, HANDHELD);

        itemModel(TaloiItems.LAPIS_SHOVEL, HANDHELD);
        itemModel(TaloiItems.LAPIS_PICKAXE, HANDHELD);
        itemModel(TaloiItems.LAPIS_AXE, HANDHELD);
        itemModel(TaloiItems.LAPIS_HOE, HANDHELD);

        itemModel(TaloiItems.OSMIUM_SHOVEL, HANDHELD);
        itemModel(TaloiItems.OSMIUM_PICKAXE, HANDHELD);
        itemModel(TaloiItems.OSMIUM_AXE, HANDHELD);
        itemModel(TaloiItems.OSMIUM_HOE, HANDHELD);

        itemModel(TaloiItems.PLATINUM_SHOVEL, HANDHELD);
        itemModel(TaloiItems.PLATINUM_PICKAXE, HANDHELD);
        itemModel(TaloiItems.PLATINUM_AXE, HANDHELD);
        itemModel(TaloiItems.PLATINUM_HOE, HANDHELD);

        itemModel(TaloiItems.TUNGSTEN_SHOVEL, HANDHELD);
        itemModel(TaloiItems.TUNGSTEN_PICKAXE, HANDHELD);
        itemModel(TaloiItems.TUNGSTEN_AXE, HANDHELD);
        itemModel(TaloiItems.TUNGSTEN_HOE, HANDHELD);

        itemModel(TaloiItems.FUTURITE_SHOVEL, HANDHELD);
        itemModel(TaloiItems.FUTURITE_PICKAXE, HANDHELD);
        itemModel(TaloiItems.FUTURITE_AXE, HANDHELD);

        itemModel(TaloiItems.SERMIUM_SHOVEL, HANDHELD);
        itemModel(TaloiItems.SERMIUM_PICKAXE, HANDHELD);
        itemModel(TaloiItems.SERMIUM_AXE, HANDHELD);

        // WEAPONS
        itemModel(TaloiItems.EMERALD_SWORD, HANDHELD);
        itemModel(TaloiItems.IRIDIUM_SWORD, HANDHELD);
        itemModel(TaloiItems.LAPIS_SWORD, HANDHELD);
        itemModel(TaloiItems.OSMIUM_SWORD, HANDHELD);
        itemModel(TaloiItems.PLATINUM_SWORD, HANDHELD);
        itemModel(TaloiItems.TUNGSTEN_SWORD, HANDHELD);
        itemModel(TaloiItems.FUTURITE_SWORD, HANDHELD);
        itemModel(TaloiItems.SERMIUM_SWORD, HANDHELD);
        getBuilder("netherite_bow_pulling_0").parent(getExistingFile(modLoc("item/netherite_bow"))).texture("layer0", "item/netherite_bow_pulling_0");
        getBuilder("netherite_bow_pulling_1").parent(getExistingFile(modLoc("item/netherite_bow"))).texture("layer0", "item/netherite_bow_pulling_1");
        getBuilder("netherite_bow_pulling_2").parent(getExistingFile(modLoc("item/netherite_bow"))).texture("layer0", "item/netherite_bow_pulling_2");

        // GEMS
        itemModel(TaloiItems.MALACHITE, GENERATED);
        itemModel(TaloiItems.TANZANITE, GENERATED);
        itemModel(TaloiItems.TOPAZ, GENERATED);

        // FOOD
        itemModel(TaloiItems.APPLE_PIE, GENERATED);
        itemModel(TaloiItems.BLUEBERRIES, GENERATED);
        itemModel(TaloiItems.BLUEBERRY_PIE, GENERATED);
        itemModel(TaloiItems.DESTABILIZED_FUTURITE_APPLE, GENERATED);
        itemModel(TaloiItems.DIAMOND_APPLE, GENERATED);
        itemModel(TaloiItems.FUTURITE_APPLE, GENERATED);
        itemModel(TaloiItems.RICE_BOWL, GENERATED);
        itemModel(TaloiItems.SWEET_BERRY_PIE, GENERATED);
        itemModel(TaloiItems.TOMATO, GENERATED);

        itemModel(TaloiItems.MUSIC_DISC_THE_CAVES, GENERATED);
    }

    public void blockModel(RegistryObject<? extends Block> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }

    public void blockModel(RegistryObject<? extends Block> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }

    public void itemModel(RegistryObject<Item> item, ModelFile parent) {
        getBuilder(item.getId().getPath()).parent(parent).texture("layer0", "item/" + item.getId().getPath());
    }
}
