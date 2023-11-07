package com.newjumper.taloi.datagen.assets;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.content.TaloiBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class TaloiItemModelProvider extends ItemModelProvider {
    public TaloiItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        blockModel(TaloiBlocks.OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.SPRUCE_WOOD_STAIRS);
        blockModel(TaloiBlocks.SPRUCE_WOOD_SLAB);
        blockModel(TaloiBlocks.BIRCH_WOOD_STAIRS);
        blockModel(TaloiBlocks.BIRCH_WOOD_SLAB);
        blockModel(TaloiBlocks.JUNGLE_WOOD_STAIRS);
        blockModel(TaloiBlocks.JUNGLE_WOOD_SLAB);
        blockModel(TaloiBlocks.ACACIA_WOOD_STAIRS);
        blockModel(TaloiBlocks.ACACIA_WOOD_SLAB);
        blockModel(TaloiBlocks.DARK_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.DARK_OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.MANGROVE_WOOD_STAIRS);
        blockModel(TaloiBlocks.MANGROVE_WOOD_SLAB);
        blockModel(TaloiBlocks.CHERRY_WOOD_STAIRS);
        blockModel(TaloiBlocks.CHERRY_WOOD_SLAB);
        blockModel(TaloiBlocks.CRIMSON_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.CRIMSON_HYPHAE_SLAB);
        blockModel(TaloiBlocks.WARPED_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.WARPED_HYPHAE_SLAB);

        blockModel(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
        /*blockModel(TaloiBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_MANGROVE_WOOD_SLAB);
        blockModel(TaloiBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_CHERRY_WOOD_SLAB);
        */blockModel(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
        blockModel(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
        blockModel(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB);

        blockModel(TaloiBlocks.WHITE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.WHITE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.ORANGE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.YELLOW_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIME_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIME_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.PINK_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.PINK_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.GRAY_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.GRAY_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.CYAN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.CYAN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.PURPLE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BLUE_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BLUE_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BROWN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BROWN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.GREEN_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.GREEN_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.RED_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.RED_TERRACOTTA_SLAB);
        blockModel(TaloiBlocks.BLACK_TERRACOTTA_STAIRS);
        blockModel(TaloiBlocks.BLACK_TERRACOTTA_SLAB);

        blockModel(TaloiBlocks.WHITE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.WHITE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.ORANGE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.ORANGE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.MAGENTA_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.MAGENTA_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.YELLOW_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.YELLOW_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIME_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIME_CONCRETE_SLAB);
        blockModel(TaloiBlocks.PINK_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.PINK_CONCRETE_SLAB);
        blockModel(TaloiBlocks.GRAY_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.GRAY_CONCRETE_SLAB);
        blockModel(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        blockModel(TaloiBlocks.CYAN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.CYAN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.PURPLE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.PURPLE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BLUE_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BLUE_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BROWN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BROWN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.GREEN_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.GREEN_CONCRETE_SLAB);
        blockModel(TaloiBlocks.RED_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.RED_CONCRETE_SLAB);
        blockModel(TaloiBlocks.BLACK_CONCRETE_STAIRS);
        blockModel(TaloiBlocks.BLACK_CONCRETE_SLAB);
    }

    public void blockModel(RegistryObject<? extends Block> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }
}
