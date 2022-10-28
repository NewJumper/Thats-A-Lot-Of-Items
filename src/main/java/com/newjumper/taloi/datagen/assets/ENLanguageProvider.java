package com.newjumper.taloi.datagen.assets;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ENLanguageProvider extends LanguageProvider {
    public ENLanguageProvider(DataGenerator pGenerator) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.taloi_blocks", "TALOI Blocks");
        add("itemGroup.taloi_machines", "TALOI Machines");
        add("itemGroup.taloi_items", "TALOI Items");
        add("itemGroup.taloi_tools", "TALOI Tools");
        add("itemGroup.taloi_combat", "TALOI Combat");

        TaloiBlocks.BLOCKS.getEntries().forEach(this::addBlock);
        TaloiItems.ITEMS.getEntries().stream().filter(item -> !(item.get() instanceof BlockItem)).forEach(this::addItem);
        TaloiBlockEntities.BLOCK_ENTITIES.getEntries().forEach(this::addContainer);

        add("advancements.taloi.root.title", "That IS Indeed A Lot Of Items");
        add("advancements.taloi.root.description", "The beginning of a new end");
        add("advancements.taloi.radioactive.title", "Radioactive");
        add("advancements.taloi.radioactive.description", "I'm getting some weird readings off of this...");
        add("advancements.taloi.shiny.title", "Sparkly Business");
        add("advancements.taloi.shiny.description", "More than just amethyst");
        add("advancements.taloi.machinery.title", "Machinery");
        add("advancements.taloi.machinery.description", "Craft a machine frame, the building blocks of all machines");
        add("advancements.taloi.construct_alloy.title", "Alloy Constructor");
        add("advancements.taloi.construct_alloy.description", "Use a constructor to make an alloy");
        add("advancements.taloi.press_material.title", "Metal Slam");
        add("advancements.taloi.press_material.description", "Press a metal into a plate");
        add("advancements.taloi.infuse_ingot.title", "Infusion");
        add("advancements.taloi.infuse_ingot.description", "Infuse coal, diamonds, or emeralds into an ingot");
        add("advancements.taloi.obtain_sermium.title", "Upgraded Technology");
        add("advancements.taloi.obtain_sermium.description", "Obtain Sermium using a Constructor");
        add("advancements.taloi.sermium_armor.title", "There's Better?");
        add("advancements.taloi.sermium_armor.description", "Obtain a piece of Sermium armor through a smithing table");
        add("advancements.taloi.obtain_futurite.title", "The Future Is HERE!");
        add("advancements.taloi.obtain_futurite.description", "Obtain Futurite using a Constructor");
        add("advancements.taloi.futurite_armor.title", "Okay, Now This Is OP");
        add("advancements.taloi.futurite_armor.description", "Construct a full set of Futurite armor");
        add("advancements.taloi.eat_futurite_apple.title", "This Is Insane");
        add("advancements.taloi.eat_futurite_apple.description", "Eat a Futurite apple");
    }

    private void addBlock(RegistryObject<Block> block) {
        String key = block.getId().getPath();
        add("block." + ThatsALotOfItems.MOD_ID + "." + key, convertToName(key));
    }

    private void addItem(RegistryObject<Item> item) {
        String key = item.getId().getPath();
        if(key.contains("music_disc")) {
            add("item." + ThatsALotOfItems.MOD_ID + ".music_disc_the_caves", "Music Disc");
            add("item." + ThatsALotOfItems.MOD_ID + ".music_disc_the_caves.desc", "NewJumper - The Caves");
        } else add("item." + ThatsALotOfItems.MOD_ID + "." + key, convertToName(key));
    }

    private void addContainer(RegistryObject<BlockEntityType<?>> blockEntity) {
        String key = blockEntity.getId().getPath();
        add("container." + ThatsALotOfItems.MOD_ID + "." + convertToInitials(key), convertToName(key));
    }

    private String convertToName(String key) {
        if(key.equals("chiseled_dripstone_block") || key.contains("reinforced_iron_block") || key.contains("bouncy_") || key.contains("gravity_") || key.contains("feathery_") || key.contains("speedy_") || !key.contains("_block")) key = key.substring(0, 1).toUpperCase() + key.substring(1);

        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        String name = builder.toString();
        if(name.contains(" Block")) name = "Block of " + name.substring(0, name.indexOf(" Block"));

        return name;
    }

    private String convertToInitials(String key) {
        StringBuilder builder = new StringBuilder();
        builder.append(key.charAt(0));

        for(int i = 1; i < key.length() - 2; i++) {
            if(key.charAt(i) == '_') {
                builder.append(key.charAt(i + 1));
                if(key.charAt(i + 1) == 's') builder.append(key.charAt(i + 2));
            }

        }

        return builder.toString();
    }
}
