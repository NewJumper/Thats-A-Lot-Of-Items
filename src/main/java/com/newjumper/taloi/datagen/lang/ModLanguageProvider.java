package com.newjumper.taloi.datagen.lang;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.block.entity.ModBlockEntities;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
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

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(this::addBlock);
        ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(this::addItem);
        // ^^^^^^^ CREATES DUPLICATE KEYS FOR BLOCK ITEMS, MUST FIX ^^^^^^^

        add("container.constructor", "Constructor");
        add("container.press", "Hydraulic Press");
        add("container.processor", "Processor");
        add("container.separator", "Separator");
        ModBlockEntities.BLOCK_ENTITIES.getEntries().stream().map(RegistryObject::get).forEach(this::addContainer);

        // add advancement translations
    }

    private void addBlock(Block block) {
        String key = block.getRegistryName().getPath();
        add("block.taloi." + key, convertToName(key));
    }

    private void addItem(Item item) {
        String key = item.getRegistryName().getPath();
        add("item.taloi." + key, convertToName(key));
    }

    private void addContainer(BlockEntityType<?> blockEntity) {
        String key = blockEntity.getRegistryName().getPath();
        add("container." + convertToInitials(key), convertToName(key));
    }

    private String convertToName(String key) {
        if(key.contains("bouncy_") || key.contains("gravity_") || key.contains("feathery_") || key.contains("speedy_") || !key.contains("_block"))
            key = key.substring(0, 1).toUpperCase() + key.substring(1);
        else key = "Block of " + key.substring(0, 1).toUpperCase() + key.substring(1, key.lastIndexOf('_'));

        StringBuilder builder = new StringBuilder(key);
        for(int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        return builder.toString();
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
