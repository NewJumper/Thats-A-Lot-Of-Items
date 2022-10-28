package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
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

        copy(TaloiTags.Blocks.ORES_ALUMINUM, TaloiTags.Items.ORES_ALUMINUM);
        copy(TaloiTags.Blocks.ORES_IRIDIUM, TaloiTags.Items.ORES_IRIDIUM);
        copy(TaloiTags.Blocks.ORES_LEAD, TaloiTags.Items.ORES_LEAD);
        copy(TaloiTags.Blocks.ORES_MAGNESIUM, TaloiTags.Items.ORES_MAGNESIUM);
        copy(TaloiTags.Blocks.ORES_OSMIUM, TaloiTags.Items.ORES_OSMIUM);
        copy(TaloiTags.Blocks.ORES_PLATINUM, TaloiTags.Items.ORES_PLATINUM);
        copy(TaloiTags.Blocks.ORES_SILICON, TaloiTags.Items.ORES_SILICON);
        copy(TaloiTags.Blocks.ORES_TIN, TaloiTags.Items.ORES_TIN);
        copy(TaloiTags.Blocks.ORES_TUNGSTEN, TaloiTags.Items.ORES_TUNGSTEN);
        copy(TaloiTags.Blocks.ORES_URANIUM, TaloiTags.Items.ORES_URANIUM);
        copy(TaloiTags.Blocks.ORES_ZINC, TaloiTags.Items.ORES_ZINC);
        copy(TaloiTags.Blocks.TALOI_ORES, TaloiTags.Items.TALOI_ORES);

        copy(TaloiTags.Blocks.STORAGE_ALUMINUM, TaloiTags.Items.STORAGE_ALUMINUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_ALUMINUM, TaloiTags.Items.RAW_STORAGE_ALUMINUM);
        copy(TaloiTags.Blocks.STORAGE_IRIDIUM, TaloiTags.Items.STORAGE_IRIDIUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_IRIDIUM, TaloiTags.Items.RAW_STORAGE_IRIDIUM);
        copy(TaloiTags.Blocks.STORAGE_LEAD, TaloiTags.Items.STORAGE_LEAD);
        copy(TaloiTags.Blocks.RAW_STORAGE_LEAD, TaloiTags.Items.RAW_STORAGE_LEAD);
        copy(TaloiTags.Blocks.STORAGE_MAGNESIUM, TaloiTags.Items.STORAGE_MAGNESIUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_MAGNESIUM, TaloiTags.Items.RAW_STORAGE_MAGNESIUM);
        copy(TaloiTags.Blocks.STORAGE_OSMIUM, TaloiTags.Items.STORAGE_OSMIUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_OSMIUM, TaloiTags.Items.RAW_STORAGE_OSMIUM);
        copy(TaloiTags.Blocks.STORAGE_PLATINUM, TaloiTags.Items.STORAGE_PLATINUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_PLATINUM, TaloiTags.Items.RAW_STORAGE_PLATINUM);
        copy(TaloiTags.Blocks.STORAGE_SILICON, TaloiTags.Items.STORAGE_SILICON);
        copy(TaloiTags.Blocks.RAW_STORAGE_SILICON, TaloiTags.Items.RAW_STORAGE_SILICON);
        copy(TaloiTags.Blocks.STORAGE_TIN, TaloiTags.Items.STORAGE_TIN);
        copy(TaloiTags.Blocks.RAW_STORAGE_TIN, TaloiTags.Items.RAW_STORAGE_TIN);
        copy(TaloiTags.Blocks.STORAGE_TUNGSTEN, TaloiTags.Items.STORAGE_TUNGSTEN);
        copy(TaloiTags.Blocks.RAW_STORAGE_TUNGSTEN, TaloiTags.Items.RAW_STORAGE_TUNGSTEN);
        copy(TaloiTags.Blocks.STORAGE_URANIUM, TaloiTags.Items.STORAGE_URANIUM);
        copy(TaloiTags.Blocks.RAW_STORAGE_URANIUM, TaloiTags.Items.RAW_STORAGE_URANIUM);
        copy(TaloiTags.Blocks.STORAGE_ZINC, TaloiTags.Items.STORAGE_ZINC);
        copy(TaloiTags.Blocks.RAW_STORAGE_ZINC, TaloiTags.Items.RAW_STORAGE_ZINC);
        copy(TaloiTags.Blocks.TALOI_STORAGE_BLOCKS, TaloiTags.Items.TALOI_STORAGE_BLOCKS);

        copy(TaloiTags.Blocks.TERRACOTTA_SLABS, TaloiTags.Items.TERRACOTTA_SLABS);
        copy(TaloiTags.Blocks.TERRACOTTA_STAIRS, TaloiTags.Items.TERRACOTTA_STAIRS);
        copy(TaloiTags.Blocks.CONCRETE_SLABS, TaloiTags.Items.CONCRETE_SLABS);
        copy(TaloiTags.Blocks.CONCRETE_STAIRS, TaloiTags.Items.CONCRETE_STAIRS);

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(TaloiItems.IRIDIUM_INGOT.get(), TaloiItems.MAGNESIUM_INGOT.get(), TaloiItems.OSMIUM_INGOT.get(), TaloiItems.PLATINUM_INGOT.get(), TaloiItems.TUNGSTEN_INGOT.get(), TaloiItems.BRONZE_INGOT.get(), TaloiItems.STEEL_INGOT.get());
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(TaloiItems.MUSIC_DISC_THE_CAVES.get());

        tag(TaloiTags.Items.INGOTS_ALUMINUM).add(TaloiItems.ALUMINUM_INGOT.get());
        tag(TaloiTags.Items.INGOTS_IRIDIUM).add(TaloiItems.IRIDIUM_INGOT.get());
        tag(TaloiTags.Items.INGOTS_LEAD).add(TaloiItems.LEAD_INGOT.get());
        tag(TaloiTags.Items.INGOTS_MAGNESIUM).add(TaloiItems.MAGNESIUM_INGOT.get());
        tag(TaloiTags.Items.INGOTS_OSMIUM).add(TaloiItems.OSMIUM_INGOT.get());
        tag(TaloiTags.Items.INGOTS_PLATINUM).add(TaloiItems.PLATINUM_INGOT.get());
        tag(TaloiTags.Items.INGOTS_SILICON).add(TaloiItems.SILICON.get());
        tag(TaloiTags.Items.INGOTS_TIN).add(TaloiItems.TIN_INGOT.get());
        tag(TaloiTags.Items.INGOTS_TUNGSTEN).add(TaloiItems.TUNGSTEN_INGOT.get());
        tag(TaloiTags.Items.INGOTS_URANIUM).add(TaloiItems.REFINED_URANIUM.get());
        tag(TaloiTags.Items.INGOTS_ZINC).add(TaloiItems.ZINC_INGOT.get());
        tag(TaloiTags.Items.INGOTS_BRONZE).add(TaloiItems.BRONZE_INGOT.get());
        tag(TaloiTags.Items.INGOTS_STEEL).add(TaloiItems.STEEL_INGOT.get());
        tag(TaloiTags.Items.TALOI_INGOTS).add(TaloiItems.ALUMINUM_INGOT.get(), TaloiItems.IRIDIUM_INGOT.get(), TaloiItems.LEAD_INGOT.get(), TaloiItems.MAGNESIUM_INGOT.get(), TaloiItems.OSMIUM_INGOT.get(), TaloiItems.PLATINUM_INGOT.get(), TaloiItems.SILICON.get(), TaloiItems.TIN_INGOT.get(), TaloiItems.TUNGSTEN_INGOT.get(), TaloiItems.REFINED_URANIUM.get(), TaloiItems.ZINC_INGOT.get(), TaloiItems.BRONZE_INGOT.get(), TaloiItems.STEEL_INGOT.get());

        tag(TaloiTags.Items.RAW_ALUMINUM).add(TaloiItems.RAW_ALUMINUM.get());
        tag(TaloiTags.Items.RAW_IRIDIUM).add(TaloiItems.RAW_IRIDIUM.get());
        tag(TaloiTags.Items.RAW_LEAD).add(TaloiItems.RAW_LEAD.get());
        tag(TaloiTags.Items.RAW_MAGNESIUM).add(TaloiItems.RAW_MAGNESIUM.get());
        tag(TaloiTags.Items.RAW_OSMIUM).add(TaloiItems.RAW_OSMIUM.get());
        tag(TaloiTags.Items.RAW_PLATINUM).add(TaloiItems.RAW_PLATINUM.get());
        tag(TaloiTags.Items.RAW_SILICON).add(TaloiItems.RAW_SILICON.get());
        tag(TaloiTags.Items.RAW_TIN).add(TaloiItems.RAW_TIN.get());
        tag(TaloiTags.Items.RAW_TUNGSTEN).add(TaloiItems.RAW_TUNGSTEN.get());
        tag(TaloiTags.Items.RAW_URANIUM).add(TaloiItems.RAW_URANIUM.get());
        tag(TaloiTags.Items.RAW_ZINC).add(TaloiItems.RAW_ZINC.get());
        tag(TaloiTags.Items.TALOI_RAW_MATERIALS).add(TaloiItems.RAW_ALUMINUM.get(), TaloiItems.RAW_IRIDIUM.get(), TaloiItems.RAW_LEAD.get(), TaloiItems.RAW_MAGNESIUM.get(), TaloiItems.RAW_OSMIUM.get(), TaloiItems.RAW_PLATINUM.get(), TaloiItems.RAW_SILICON.get(), TaloiItems.RAW_TIN.get(), TaloiItems.RAW_TUNGSTEN.get(), TaloiItems.RAW_URANIUM.get(), TaloiItems.RAW_ZINC.get());

        tag(TaloiTags.Items.NUGGETS_ALUMINUM).add(TaloiItems.ALUMINUM_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_IRIDIUM).add(TaloiItems.IRIDIUM_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_LEAD).add(TaloiItems.LEAD_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_MAGNESIUM).add(TaloiItems.MAGNESIUM_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_OSMIUM).add(TaloiItems.OSMIUM_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_PLATINUM).add(TaloiItems.PLATINUM_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_TIN).add(TaloiItems.TIN_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_TUNGSTEN).add(TaloiItems.TUNGSTEN_NUGGET.get());
        tag(TaloiTags.Items.NUGGETS_URANIUM).add(TaloiItems.REFINED_URANIUM.get());
        tag(TaloiTags.Items.NUGGETS_ZINC).add(TaloiItems.ZINC_NUGGET.get());
        tag(TaloiTags.Items.TALOI_NUGGETS).add(TaloiItems.ALUMINUM_NUGGET.get(), TaloiItems.IRIDIUM_NUGGET.get(), TaloiItems.LEAD_NUGGET.get(), TaloiItems.MAGNESIUM_NUGGET.get(), TaloiItems.OSMIUM_NUGGET.get(), TaloiItems.PLATINUM_NUGGET.get(), TaloiItems.TIN_NUGGET.get(), TaloiItems.TUNGSTEN_NUGGET.get(), TaloiItems.URANIUM_BIT.get(), TaloiItems.ZINC_NUGGET.get());

        tag(TaloiTags.Items.PROCESSOR_BASE).add(Items.COAL, Items.DIAMOND, Items.EMERALD, TaloiItems.FUTURITE_PLATE.get(), TaloiItems.SERMIUM_PLATE.get());
        tag(TaloiTags.Items.PROCESSOR_RAW).add(TaloiItems.STEEL_INGOT.get()).addTag(Tags.Items.RAW_MATERIALS_IRON).addTag(Tags.Items.INGOTS_NETHERITE).addTag(TaloiTags.Items.RAW_LEAD).addTag(TaloiTags.Items.RAW_OSMIUM).addTag(TaloiTags.Items.RAW_URANIUM).addTag(TaloiTags.Items.RAW_TIN).addTag(TaloiTags.Items.RAW_TUNGSTEN).addTag(TaloiTags.Items.RAW_ZINC);
        tag(TaloiTags.Items.SEPARATOR_ORES).addTag(Tags.Items.ORES).addTag(TaloiTags.Items.TALOI_ORES);
    }
}
