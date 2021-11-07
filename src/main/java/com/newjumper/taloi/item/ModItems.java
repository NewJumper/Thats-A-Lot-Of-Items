package com.newjumper.taloi.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.newjumper.taloi.ThatsALotOfItems;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
