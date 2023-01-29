package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(BlockTags.LEAVES, ItemTags.LEAVES);
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);

        copy(TaloiTags.Blocks.EVERGREEN_LOGS, TaloiTags.Items.EVERGREEN_LOGS);
        copy(TaloiTags.Blocks.WILLOW_LOGS, TaloiTags.Items.WILLOW_LOGS);

        copy(TaloiTags.Blocks.TERRACOTTA_SLABS, TaloiTags.Items.TERRACOTTA_SLABS);
        copy(TaloiTags.Blocks.TERRACOTTA_STAIRS, TaloiTags.Items.TERRACOTTA_STAIRS);
        copy(TaloiTags.Blocks.CONCRETE_SLABS, TaloiTags.Items.CONCRETE_SLABS);
        copy(TaloiTags.Blocks.CONCRETE_STAIRS, TaloiTags.Items.CONCRETE_STAIRS);

        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(TaloiItems.MUSIC_DISC_THE_CAVES.get());
    }
}
