package com.newjumper.taloi.item;

import com.newjumper.taloi.item.custom.BlowtorchItem;
import com.newjumper.taloi.item.custom.SermiumOxideItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.newjumper.taloi.ThatsALotOfItems;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    // INGOTS AND RAW VARIANTS
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // ALLOYS
    public static final RegistryObject<Item> HARDENED_CARBONITE = ITEMS.register("hardened_carbonite", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> CARBONITE = ITEMS.register("carbonite", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> FERRONIOBIUM_INGOT = ITEMS.register("ferroniobium_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> FUTURITE = ITEMS.register("futurite", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> SERMIUM = ITEMS.register("sermium", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> ALLOY_X = ITEMS.register("alloy_x", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    public static final RegistryObject<Item> ALLOY_Z = ITEMS.register("alloy_z", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // PROCESSING
    public static final RegistryObject<Item> SERMIUM_OXIDE = ITEMS.register("sermium_oxide", () ->
            new SermiumOxideItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)));

    // TOOLS / WEAPONS
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", () ->
            new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register("iridium_sword", () ->
            new SwordItem(ModTiers.OSMIUM, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register("iridium_shovel", () ->
            new ShovelItem(ModTiers.OSMIUM, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe", () ->
            new PickaxeItem(ModTiers.OSMIUM, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe", () ->
            new AxeItem(ModTiers.OSMIUM, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe", () ->
            new HoeItem(ModTiers.OSMIUM, -5, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", () ->
            new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_SWORD = ITEMS.register("magnesium_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_SHOVEL = ITEMS.register("magnesium_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_PICKAXE = ITEMS.register("magnesium_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_AXE = ITEMS.register("magnesium_axe", () ->
            new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_HOE = ITEMS.register("magnesium_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_SWORD = ITEMS.register("osmium_sword", () ->
            new SwordItem(ModTiers.OSMIUM, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel", () ->
            new ShovelItem(ModTiers.OSMIUM, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe", () ->
            new PickaxeItem(ModTiers.OSMIUM, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_AXE = ITEMS.register("osmium_axe", () ->
            new AxeItem(ModTiers.OSMIUM, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_HOE = ITEMS.register("osmium_hoe", () ->
            new HoeItem(ModTiers.OSMIUM, -5, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () ->
            new SwordItem(Tiers.DIAMOND, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () ->
            new ShovelItem(Tiers.DIAMOND, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () ->
            new PickaxeItem(Tiers.DIAMOND, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () ->
            new AxeItem(Tiers.DIAMOND, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () ->
            new HoeItem(Tiers.DIAMOND, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () ->
            new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () ->
            new SwordItem(Tiers.NETHERITE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", () ->
            new ShovelItem(Tiers.NETHERITE, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () ->
            new PickaxeItem(Tiers.NETHERITE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () ->
            new AxeItem(Tiers.NETHERITE, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () ->
            new HoeItem(Tiers.NETHERITE, -4, 0f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_SWORD = ITEMS.register("zinc_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_AXE = ITEMS.register("zinc_axe", () ->
            new AxeItem(Tiers.IRON, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_HOE = ITEMS.register("zinc_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> BLOWTORCH = ITEMS.register("blowtorch", () ->
            new BlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)
                    .durability(102)));

    // ARMOR
    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_HELMET = ITEMS.register("iridium_helmet", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register("iridium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register("iridium_leggings", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register("iridium_boots", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_HELMET = ITEMS.register("magnesium_helmet", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_CHESTPLATE = ITEMS.register("magnesium_chestplate", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_LEGGINGS = ITEMS.register("magnesium_leggings", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> MAGNESIUM_BOOTS = ITEMS.register("magnesium_boots", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_HELMET = ITEMS.register("osmium_helmet", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_CHESTPLATE = ITEMS.register("osmium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_LEGGINGS = ITEMS.register("osmium_leggings", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> OSMIUM_BOOTS = ITEMS.register("osmium_boots", () ->
            new ArmorItem(ModArmorMaterial.OSMIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () ->
            new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () ->
            new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () ->
            new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () ->
            new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", () ->
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", () ->
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", () ->
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", () ->
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_HELMET = ITEMS.register("zinc_helmet", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    public static final RegistryObject<Item> ZINC_BOOTS = ITEMS.register("zinc_boots", () ->
            new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TALOI_TOOL_TAB)));

    // FOOD
    public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTab.TALOI_ITEM_TAB)
                    .stacksTo(1)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(0.2f)
                            .build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
