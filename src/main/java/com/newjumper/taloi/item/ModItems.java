package com.newjumper.taloi.item;

import com.newjumper.taloi.item.custom.BlowtorchItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.newjumper.taloi.ThatsALotOfItems;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    // INGOTS AND RAW VARIANTS
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // FOOD
    public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)
                    .stacksTo(1)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(0.2f)
                            .build())));

    // TOOLS
    public static final RegistryObject<Item> BLOWTORCH = ITEMS.register("blowtorch", () ->
            new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)
                    .durability(102)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
