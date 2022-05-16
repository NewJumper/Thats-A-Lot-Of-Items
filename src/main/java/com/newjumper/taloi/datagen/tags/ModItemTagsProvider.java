package com.newjumper.taloi.datagen.tags;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
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
        copy(ModTags.Blocks.EVERGREEN_LOGS, ModTags.Items.EVERGREEN_LOGS);
        copy(ModTags.Blocks.WILLOW_LOGS, ModTags.Items.WILLOW_LOGS);

        copy(ModTags.Blocks.ORES_ALUMINUM, ModTags.Items.ORES_ALUMINUM);
        copy(ModTags.Blocks.ORES_IRIDIUM, ModTags.Items.ORES_IRIDIUM);
        copy(ModTags.Blocks.ORES_LEAD, ModTags.Items.ORES_LEAD);
        copy(ModTags.Blocks.ORES_MAGNESIUM, ModTags.Items.ORES_MAGNESIUM);
        copy(ModTags.Blocks.ORES_OSMIUM, ModTags.Items.ORES_OSMIUM);
        copy(ModTags.Blocks.ORES_PLATINUM, ModTags.Items.ORES_PLATINUM);
        copy(ModTags.Blocks.ORES_SILICON, ModTags.Items.ORES_SILICON);
        copy(ModTags.Blocks.ORES_TIN, ModTags.Items.ORES_TIN);
        copy(ModTags.Blocks.ORES_TUNGSTEN, ModTags.Items.ORES_TUNGSTEN);
        copy(ModTags.Blocks.ORES_URANIUM, ModTags.Items.ORES_URANIUM);
        copy(ModTags.Blocks.ORES_ZINC, ModTags.Items.ORES_ZINC);
        copy(ModTags.Blocks.TALOI_ORES, ModTags.Items.TALOI_ORES);

        copy(ModTags.Blocks.STORAGE_ALUMINUM, ModTags.Items.STORAGE_ALUMINUM);
        copy(ModTags.Blocks.RAW_STORAGE_ALUMINUM, ModTags.Items.RAW_STORAGE_ALUMINUM);
        copy(ModTags.Blocks.STORAGE_IRIDIUM, ModTags.Items.STORAGE_IRIDIUM);
        copy(ModTags.Blocks.RAW_STORAGE_IRIDIUM, ModTags.Items.RAW_STORAGE_IRIDIUM);
        copy(ModTags.Blocks.STORAGE_LEAD, ModTags.Items.STORAGE_LEAD);
        copy(ModTags.Blocks.RAW_STORAGE_LEAD, ModTags.Items.RAW_STORAGE_LEAD);
        copy(ModTags.Blocks.STORAGE_MAGNESIUM, ModTags.Items.STORAGE_MAGNESIUM);
        copy(ModTags.Blocks.RAW_STORAGE_MAGNESIUM, ModTags.Items.RAW_STORAGE_MAGNESIUM);
        copy(ModTags.Blocks.STORAGE_OSMIUM, ModTags.Items.STORAGE_OSMIUM);
        copy(ModTags.Blocks.RAW_STORAGE_OSMIUM, ModTags.Items.RAW_STORAGE_OSMIUM);
        copy(ModTags.Blocks.STORAGE_PLATINUM, ModTags.Items.STORAGE_PLATINUM);
        copy(ModTags.Blocks.RAW_STORAGE_PLATINUM, ModTags.Items.RAW_STORAGE_PLATINUM);
        copy(ModTags.Blocks.STORAGE_SILICON, ModTags.Items.STORAGE_SILICON);
        copy(ModTags.Blocks.RAW_STORAGE_SILICON, ModTags.Items.RAW_STORAGE_SILICON);
        copy(ModTags.Blocks.STORAGE_TIN, ModTags.Items.STORAGE_TIN);
        copy(ModTags.Blocks.RAW_STORAGE_TIN, ModTags.Items.RAW_STORAGE_TIN);
        copy(ModTags.Blocks.STORAGE_TUNGSTEN, ModTags.Items.STORAGE_TUNGSTEN);
        copy(ModTags.Blocks.RAW_STORAGE_TUNGSTEN, ModTags.Items.RAW_STORAGE_TUNGSTEN);
        copy(ModTags.Blocks.STORAGE_URANIUM, ModTags.Items.STORAGE_URANIUM);
        copy(ModTags.Blocks.RAW_STORAGE_URANIUM, ModTags.Items.RAW_STORAGE_URANIUM);
        copy(ModTags.Blocks.STORAGE_ZINC, ModTags.Items.STORAGE_ZINC);
        copy(ModTags.Blocks.RAW_STORAGE_ZINC, ModTags.Items.RAW_STORAGE_ZINC);
        copy(ModTags.Blocks.TALOI_STORAGE_BLOCKS, ModTags.Items.TALOI_STORAGE_BLOCKS);

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(ModItems.IRIDIUM_INGOT.get(), ModItems.MAGNESIUM_INGOT.get(), ModItems.OSMIUM_INGOT.get(), ModItems.PLATINUM_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModItems.STEEL_INGOT.get());
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_CAVES.get());

        tag(ModTags.Items.INGOTS_ALUMINUM).add(ModItems.ALUMINUM_INGOT.get());
        tag(ModTags.Items.INGOTS_IRIDIUM).add(ModItems.IRIDIUM_INGOT.get());
        tag(ModTags.Items.INGOTS_LEAD).add(ModItems.LEAD_INGOT.get());
        tag(ModTags.Items.INGOTS_MAGNESIUM).add(ModItems.MAGNESIUM_INGOT.get());
        tag(ModTags.Items.INGOTS_OSMIUM).add(ModItems.OSMIUM_INGOT.get());
        tag(ModTags.Items.INGOTS_PLATINUM).add(ModItems.PLATINUM_INGOT.get());
        tag(ModTags.Items.INGOTS_SILICON).add(ModItems.SILICON.get());
        tag(ModTags.Items.INGOTS_TIN).add(ModItems.TIN_INGOT.get());
        tag(ModTags.Items.INGOTS_TUNGSTEN).add(ModItems.TUNGSTEN_INGOT.get());
        tag(ModTags.Items.INGOTS_URANIUM).add(ModItems.REFINED_URANIUM.get());
        tag(ModTags.Items.INGOTS_ZINC).add(ModItems.ZINC_INGOT.get());
        tag(ModTags.Items.TALOI_INGOTS).add(ModItems.ALUMINUM_INGOT.get(), ModItems.IRIDIUM_INGOT.get(), ModItems.LEAD_INGOT.get(), ModItems.MAGNESIUM_INGOT.get(), ModItems.OSMIUM_INGOT.get(), ModItems.PLATINUM_INGOT.get(), ModItems.SILICON.get(), ModItems.TIN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.REFINED_URANIUM.get(), ModItems.ZINC_INGOT.get());

        tag(ModTags.Items.RAW_ALUMINUM).add(ModItems.RAW_ALUMINUM.get());
        tag(ModTags.Items.RAW_IRIDIUM).add(ModItems.RAW_IRIDIUM.get());
        tag(ModTags.Items.RAW_LEAD).add(ModItems.RAW_LEAD.get());
        tag(ModTags.Items.RAW_MAGNESIUM).add(ModItems.RAW_MAGNESIUM.get());
        tag(ModTags.Items.RAW_OSMIUM).add(ModItems.RAW_OSMIUM.get());
        tag(ModTags.Items.RAW_PLATINUM).add(ModItems.RAW_PLATINUM.get());
        tag(ModTags.Items.RAW_SILICON).add(ModItems.RAW_SILICON.get());
        tag(ModTags.Items.RAW_TIN).add(ModItems.RAW_TIN.get());
        tag(ModTags.Items.RAW_TUNGSTEN).add(ModItems.RAW_TUNGSTEN.get());
        tag(ModTags.Items.RAW_URANIUM).add(ModItems.RAW_URANIUM.get());
        tag(ModTags.Items.RAW_ZINC).add(ModItems.RAW_ZINC.get());
        tag(ModTags.Items.TALOI_RAW_MATERIALS).add(ModItems.RAW_ALUMINUM.get(), ModItems.RAW_IRIDIUM.get(), ModItems.RAW_LEAD.get(), ModItems.RAW_MAGNESIUM.get(), ModItems.RAW_OSMIUM.get(), ModItems.RAW_PLATINUM.get(), ModItems.RAW_SILICON.get(), ModItems.RAW_TIN.get(), ModItems.RAW_TUNGSTEN.get(), ModItems.RAW_URANIUM.get(), ModItems.RAW_ZINC.get());

        tag(ModTags.Items.NUGGETS_ALUMINUM).add(ModItems.ALUMINUM_NUGGET.get());
        tag(ModTags.Items.NUGGETS_IRIDIUM).add(ModItems.IRIDIUM_NUGGET.get());
        tag(ModTags.Items.NUGGETS_LEAD).add(ModItems.LEAD_NUGGET.get());
        tag(ModTags.Items.NUGGETS_MAGNESIUM).add(ModItems.MAGNESIUM_NUGGET.get());
        tag(ModTags.Items.NUGGETS_OSMIUM).add(ModItems.OSMIUM_NUGGET.get());
        tag(ModTags.Items.NUGGETS_PLATINUM).add(ModItems.PLATINUM_NUGGET.get());
        tag(ModTags.Items.NUGGETS_TIN).add(ModItems.TIN_NUGGET.get());
        tag(ModTags.Items.NUGGETS_TUNGSTEN).add(ModItems.TUNGSTEN_NUGGET.get());
        tag(ModTags.Items.NUGGETS_URANIUM).add(ModItems.REFINED_URANIUM.get());
        tag(ModTags.Items.NUGGETS_ZINC).add(ModItems.ZINC_NUGGET.get());
        tag(ModTags.Items.TALOI_NUGGETS).add(ModItems.ALUMINUM_NUGGET.get(), ModItems.IRIDIUM_NUGGET.get(), ModItems.LEAD_NUGGET.get(), ModItems.MAGNESIUM_NUGGET.get(), ModItems.OSMIUM_NUGGET.get(), ModItems.PLATINUM_NUGGET.get(), ModItems.TIN_NUGGET.get(), ModItems.TUNGSTEN_NUGGET.get(), ModItems.URANIUM_BIT.get(), ModItems.ZINC_NUGGET.get());

        tag(ModTags.Items.PROCESSOR_BASE).add(Items.COAL, Items.DIAMOND, Items.EMERALD, ModItems.FUTURITE_PLATE.get(), ModItems.SERMIUM_PLATE.get());
        tag(ModTags.Items.PROCESSOR_INGOTS).add(Items.IRON_INGOT, Items.NETHERITE_INGOT, ModItems.LEAD_INGOT.get(), ModItems.OSMIUM_INGOT.get(), ModItems.REFINED_URANIUM.get(), ModItems.STEEL_INGOT.get(), ModItems.TIN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.ZINC_INGOT.get());
        tag(ModTags.Items.SEPARATOR_ORES).addTag(Tags.Items.ORES).addTag(ModTags.Items.TALOI_ORES);
    }
}
