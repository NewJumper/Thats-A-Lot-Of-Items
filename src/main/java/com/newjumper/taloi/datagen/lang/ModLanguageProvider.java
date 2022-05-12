package com.newjumper.taloi.datagen.lang;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator pGenerator) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.taloi_block_tab", "TALOI Blocks");
        add("itemGroup.taloi_machinery_tab", "TALOI Machinery");
        add("itemGroup.taloi_item_tab", "TALOI Items");
        add("itemGroup.taloi_tool_tab", "TALOI Tools");
        add("itemGroup.taloi_combat_tab", "TALOI Combat");

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(this::addTranslation);
        ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(this::addTranslation);
        // ^^^^^^^ CREATES DUPLICATE KEYS FOR BLOCK ITEMS, MUST FIX ^^^^^^^

        // add container translations
        // add advancement translations
    }

    private void addTranslation(Block block) {
        String key = block.getRegistryName().getPath();
        add("block.taloi." + key, convertToName(key));
    }

    private void addTranslation(Item item) {
        String key = item.getRegistryName().getPath();
        add("item.taloi." + item.getRegistryName().getPath(), convertToName(key));
    }

    private String convertToName(String key) {
        if(key.contains("bouncy_") || key.contains("gravity_") || key.contains("feathery_") || key.contains("speedy_") || !key.contains("_block"))
            key = key.substring(0, 1).toUpperCase() + key.substring(1);
        else key = "Block of " + key.substring(0, 1).toUpperCase() + key.substring(1, key.lastIndexOf('_'));

        StringBuilder builder = new StringBuilder(key);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        return builder.toString();
    }
}
