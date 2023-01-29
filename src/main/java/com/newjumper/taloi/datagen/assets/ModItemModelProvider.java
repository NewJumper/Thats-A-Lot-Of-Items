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
        // ARMOR
        itemModel(TaloiItems.EMERALD_HELMET, GENERATED);
        itemModel(TaloiItems.EMERALD_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.EMERALD_LEGGINGS, GENERATED);
        itemModel(TaloiItems.EMERALD_BOOTS, GENERATED);

        itemModel(TaloiItems.LAPIS_HELMET, GENERATED);
        itemModel(TaloiItems.LAPIS_CHESTPLATE, GENERATED);
        itemModel(TaloiItems.LAPIS_LEGGINGS, GENERATED);
        itemModel(TaloiItems.LAPIS_BOOTS, GENERATED);

        // TOOLS
        itemModel(TaloiItems.EMERALD_SHOVEL, HANDHELD);
        itemModel(TaloiItems.EMERALD_PICKAXE, HANDHELD);
        itemModel(TaloiItems.EMERALD_AXE, HANDHELD);
        itemModel(TaloiItems.EMERALD_HOE, HANDHELD);

        itemModel(TaloiItems.LAPIS_SHOVEL, HANDHELD);
        itemModel(TaloiItems.LAPIS_PICKAXE, HANDHELD);
        itemModel(TaloiItems.LAPIS_AXE, HANDHELD);
        itemModel(TaloiItems.LAPIS_HOE, HANDHELD);

        // WEAPONS
        itemModel(TaloiItems.EMERALD_SWORD, HANDHELD);
        itemModel(TaloiItems.LAPIS_SWORD, HANDHELD);
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
        itemModel(TaloiItems.DIAMOND_APPLE, GENERATED);
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
