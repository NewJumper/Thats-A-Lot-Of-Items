package com.newjumper.taloi.item;


import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    // INGOTS & RAW VARIANTS
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // ALLOYS
    public static final RegistryObject<Item> HARDENED_CARBONITE = ITEMS.register("hardened_carbonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> CARBONITE = ITEMS.register("carbonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> FERRONIOBIUM_INGOT = ITEMS.register("ferroniobium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> FUTURITE = ITEMS.register("futurite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> SERMIUM = ITEMS.register("sermium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> ALLOY_X = ITEMS.register("alloy_x", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> ALLOY_Z = ITEMS.register("alloy_z", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // NUGGETS
    public static final RegistryObject<Item> FUTURITE_BIT = ITEMS.register("futurite_bit", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // PROCESSING
    public static final RegistryObject<Item> SERMIUM_CORE = ITEMS.register("sermium_core", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));
    public static final RegistryObject<Item> SERMIUM_OXIDE = ITEMS.register("sermium_oxide", () -> new SermiumOxideItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // TOOLS & WEAPONS
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", () -> new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", () -> new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register("iridium_sword", () -> new SwordItem(ModTiers.OSMIUM, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register("iridium_shovel", () -> new ShovelItem(ModTiers.OSMIUM, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe", () -> new PickaxeItem(ModTiers.OSMIUM, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe", () -> new AxeItem(ModTiers.OSMIUM, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe", () -> new HoeItem(ModTiers.OSMIUM, -5, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_SWORD = ITEMS.register("osmium_sword", () -> new SwordItem(ModTiers.OSMIUM, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel", () -> new ShovelItem(ModTiers.OSMIUM, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe", () -> new PickaxeItem(ModTiers.OSMIUM, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> OSMIUM_AXE = ITEMS.register("osmium_axe", () -> new AxeItem(ModTiers.OSMIUM, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> OSMIUM_HOE = ITEMS.register("osmium_hoe", () -> new HoeItem(ModTiers.OSMIUM, -5, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(Tiers.NETHERITE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(Tiers.NETHERITE, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(Tiers.NETHERITE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(Tiers.NETHERITE, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(Tiers.NETHERITE, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () -> new SwordItem(ModTiers.TUNGSTEN, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", () -> new ShovelItem(ModTiers.TUNGSTEN, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () -> new PickaxeItem(ModTiers.TUNGSTEN, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () -> new AxeItem(ModTiers.TUNGSTEN, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () -> new HoeItem(ModTiers.TUNGSTEN, -4, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> SERMIUM_SWORD = ITEMS.register("sermium_sword", () -> new SwordItem(ModTiers.SERMIUM, 4, -2.2f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> SERMIUM_SHOVEL = ITEMS.register("sermium_shovel", () -> new ShovelItem(ModTiers.SERMIUM, 1.5f, -2.9f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> SERMIUM_PICKAXE = ITEMS.register("sermium_pickaxe", () -> new PickaxeItem(ModTiers.SERMIUM, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> SERMIUM_AXE = ITEMS.register("sermium_axe", () -> new AxeItem(ModTiers.SERMIUM, 6, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    // public static final RegistryObject<Item> SERMIUM_OMNI_TOOL = ITEMS.register("sermium_omni_tool", () -> new AxeItem(ModTiers.SERMIUM, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB))); BALANCE VALUES

    public static final RegistryObject<Item> FUTURITE_SWORD = ITEMS.register("futurite_sword", () -> new SwordItem(ModTiers.FUTURITE, 4, -2f, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> FUTURITE_SHOVEL = ITEMS.register("futurite_shovel", () -> new ShovelItem(ModTiers.FUTURITE, 1.5f, -2.9f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> FUTURITE_PICKAXE = ITEMS.register("futurite_pickaxe", () -> new PickaxeItem(ModTiers.FUTURITE, 1, -2.7f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    public static final RegistryObject<Item> FUTURITE_AXE = ITEMS.register("futurite_axe", () -> new AxeItem(ModTiers.FUTURITE, 6, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));
    // public static final RegistryObject<Item> FUTURITE_OMNI_TOOL = ITEMS.register("futurite_omni_tool", () -> new ShovelItem(ModTiers.FUTURITE, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB))); BALANCE VALUES

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).durability(1700)));

    public static final RegistryObject<Item> BLOWTORCH = ITEMS.register("blowtorch", () -> new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).durability(102)));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // ARMOR
    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> IRIDIUM_HELMET = ITEMS.register("iridium_helmet", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register("iridium_chestplate", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register("iridium_leggings", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register("iridium_boots", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> OSMIUM_HELMET = ITEMS.register("osmium_helmet", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> OSMIUM_CHESTPLATE = ITEMS.register("osmium_chestplate", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> OSMIUM_LEGGINGS = ITEMS.register("osmium_leggings", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> OSMIUM_BOOTS = ITEMS.register("osmium_boots", () -> new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> SERMIUM_HELMET = ITEMS.register("sermium_helmet", () -> new ArmorItem(ModArmorMaterials.SERMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> SERMIUM_CHESTPLATE = ITEMS.register("sermium_chestplate", () -> new SermiumArmorItem(ModArmorMaterials.SERMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> SERMIUM_LEGGINGS = ITEMS.register("sermium_leggings", () -> new ArmorItem(ModArmorMaterials.SERMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> SERMIUM_BOOTS = ITEMS.register("sermium_boots", () -> new ArmorItem(ModArmorMaterials.SERMIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    public static final RegistryObject<Item> FUTURITE_HELMET = ITEMS.register("futurite_helmet", () -> new ArmorItem(ModArmorMaterials.FUTURITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> FUTURITE_CHESTPLATE = ITEMS.register("futurite_chestplate", () -> new ArmorItem(ModArmorMaterials.FUTURITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> FUTURITE_LEGGINGS = ITEMS.register("futurite_leggings", () -> new ArmorItem(ModArmorMaterials.FUTURITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));
    public static final RegistryObject<Item> FUTURITE_BOOTS = ITEMS.register("futurite_boots", () -> new ArmorItem(ModArmorMaterials.FUTURITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_COMBAT_TAB)));

    // FOOD & CROPS
    public static final RegistryObject<Item> DESTABILIZED_FUTURITE_APPLE = ITEMS.register("destabilized_futurite_apple", () -> new DestabilizedFuturiteAppleItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).rarity(Rarity.EPIC).food(ModFoods.FUTURITE_APPLE).stacksTo(32)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).rarity(Rarity.RARE).food(ModFoods.DIAMOND_APPLE)));
    public static final RegistryObject<Item> FUTURITE_APPLE = ITEMS.register("futurite_apple", () -> new FuturiteAppleItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).rarity(Rarity.EPIC).food(ModFoods.FUTURITE_APPLE).stacksTo(16)));
    public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).stacksTo(1).food(ModFoods.RICE_BOWL)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB).food(ModFoods.TOMATO)));

    // add tomato_seeds
    // add crops and seeds stuff

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
