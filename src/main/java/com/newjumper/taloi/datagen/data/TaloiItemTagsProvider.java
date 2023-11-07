package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TaloiItemTagsProvider extends ItemTagsProvider {
    public TaloiItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, TagsProvider<Block> pBlockTags, ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags.contentsGetter(), ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);

        copy(TaloiTags.Blocks.TERRACOTTA_SLABS, TaloiTags.Items.TERRACOTTA_SLABS);
        copy(TaloiTags.Blocks.TERRACOTTA_STAIRS, TaloiTags.Items.TERRACOTTA_STAIRS);
        copy(TaloiTags.Blocks.CONCRETE_SLABS, TaloiTags.Items.CONCRETE_SLABS);
        copy(TaloiTags.Blocks.CONCRETE_STAIRS, TaloiTags.Items.CONCRETE_STAIRS);
    }
}
