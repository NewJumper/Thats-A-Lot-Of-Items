package com.newjumper.taloi.item;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.custom.DestabilizedFuturiteAppleItem;
import com.newjumper.taloi.item.custom.FuturiteAppleItem;
import com.newjumper.taloi.item.custom.FuturiteArmor;
import com.newjumper.taloi.item.custom.SermiumOxideItem;
import com.newjumper.taloi.sound.TaloiSounds;
import com.newjumper.taloi.util.TaloiCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    // RAW & INGOTS
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // MACHINERY
    public static final RegistryObject<Item> ALPHA_MACHINE_FRAME = ITEMS.register("alpha_machine_frame", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_MACHINES)));
    public static final RegistryObject<Item> BETA_MACHINE_FRAME = ITEMS.register("beta_machine_frame", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_MACHINES)));
    public static final RegistryObject<Item> UNSTABLE_MACHINE_FRAME = ITEMS.register("unstable_machine_frame", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_MACHINES)));

    // CONSTRUCTING
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> CARBONITE = ITEMS.register("carbonite", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FERRONIOBIUM_INGOT = ITEMS.register("ferroniobium_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FUTURITE = ITEMS.register("futurite", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> HARDENED_CARBONITE = ITEMS.register("hardened_carbonite", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SERMIUM = ITEMS.register("sermium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> ALLOY_X = ITEMS.register("alloy_x", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> ALLOY_Z = ITEMS.register("alloy_z", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // PRESSING
    public static final RegistryObject<Item> ALLOY_PLATE = ITEMS.register("alloy_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> CARBON_PLATE = ITEMS.register("carbon_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FORGE_PLATE = ITEMS.register("forge_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FUTURITE_PLATE = ITEMS.register("futurite_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> GOLD_DISK = ITEMS.register("gold_disk", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> INDUCTION_PLATE = ITEMS.register("induction_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> MAGNESIUM_PLATE = ITEMS.register("magnesium_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> REINFORCED_COPPER_PLATE = ITEMS.register("reinforced_copper_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SEMICONDUCTOR_PLATE = ITEMS.register("semiconductor_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SERMIUM_PLATE = ITEMS.register("sermium_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SILICON_PLATE = ITEMS.register("silicon_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_plate", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // PROCESSING
    public static final RegistryObject<Item> COAL_INFUSED_IRON_INGOT = ITEMS.register("coal_infused_iron_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> COAL_INFUSED_LEAD_INGOT = ITEMS.register("coal_infused_lead_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DIAMOND_INFUSED_STEEL_INGOT = ITEMS.register("diamond_infused_steel_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DIAMOND_INFUSED_TIN_INGOT = ITEMS.register("diamond_infused_tin_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DIAMOND_INFUSED_URANIUM = ITEMS.register("diamond_infused_uranium", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> EMERALD_INFUSED_OSMIUM_INGOT = ITEMS.register("emerald_infused_osmium_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> EMERALD_INFUSED_TUNGSTEN_INGOT = ITEMS.register("emerald_infused_tungsten_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> EMERALD_INFUSED_ZINC_INGOT = ITEMS.register("emerald_infused_zinc_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FUTURITE_INFUSED_NETHERITE_INGOT = ITEMS.register("futurite_infused_netherite_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SERMIUM_INFUSED_NETHERITE_INGOT = ITEMS.register("sermium_infused_netherite_ingot", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SERMIUM_CORE = ITEMS.register("sermium_core", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SERMIUM_OXIDE = ITEMS.register("sermium_oxide", () -> new SermiumOxideItem(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // NUGGETS
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> URANIUM_BIT = ITEMS.register("uranium_bit", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FUTURITE_BIT = ITEMS.register("futurite_bit", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // TOOLS
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(TaloiTiers.EMERALD, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(TaloiTiers.EMERALD, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(TaloiTiers.EMERALD, 6, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(TaloiTiers.EMERALD, 0, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register("iridium_shovel", () -> new ShovelItem(TaloiTiers.IRIDIUM, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe", () -> new PickaxeItem(TaloiTiers.IRIDIUM, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe", () -> new AxeItem(TaloiTiers.IRIDIUM, 4, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe", () -> new HoeItem(TaloiTiers.IRIDIUM, -5, 0f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(TaloiTiers.LAPIS, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(TaloiTiers.LAPIS, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(TaloiTiers.LAPIS, 7, -3.2f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(TaloiTiers.LAPIS, -1, -2f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel", () -> new ShovelItem(TaloiTiers.OSMIUM, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe", () -> new PickaxeItem(TaloiTiers.OSMIUM, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> OSMIUM_AXE = ITEMS.register("osmium_axe", () -> new AxeItem(TaloiTiers.OSMIUM, 4, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> OSMIUM_HOE = ITEMS.register("osmium_hoe", () -> new HoeItem(TaloiTiers.OSMIUM, -5, 0f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(TaloiTiers.PLATINUM, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(TaloiTiers.PLATINUM, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(TaloiTiers.PLATINUM, 5, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(TaloiTiers.PLATINUM, -3, 0f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", () -> new ShovelItem(TaloiTiers.TUNGSTEN, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () -> new PickaxeItem(TaloiTiers.TUNGSTEN, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () -> new AxeItem(TaloiTiers.TUNGSTEN, 5, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () -> new HoeItem(TaloiTiers.TUNGSTEN, -4, 0f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> SERMIUM_SHOVEL = ITEMS.register("sermium_shovel", () -> new ShovelItem(TaloiTiers.SERMIUM, 1.5f, -2.9f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> SERMIUM_PICKAXE = ITEMS.register("sermium_pickaxe", () -> new PickaxeItem(TaloiTiers.SERMIUM, 1, -2.8f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> SERMIUM_AXE = ITEMS.register("sermium_axe", () -> new AxeItem(TaloiTiers.SERMIUM, 6, -3f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> FUTURITE_SHOVEL = ITEMS.register("futurite_shovel", () -> new ShovelItem(TaloiTiers.FUTURITE, 1.5f, -2.9f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> FUTURITE_PICKAXE = ITEMS.register("futurite_pickaxe", () -> new PickaxeItem(TaloiTiers.FUTURITE, 1, -2.7f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));
    public static final RegistryObject<Item> FUTURITE_AXE = ITEMS.register("futurite_axe", () -> new AxeItem(TaloiTiers.FUTURITE, 6, -3f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_TOOLS)));

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new BowItem(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT).durability(1700)));

    // COMBAT
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(TaloiTiers.EMERALD, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register("iridium_sword", () -> new SwordItem(TaloiTiers.IRIDIUM, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(TaloiTiers.LAPIS, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> OSMIUM_SWORD = ITEMS.register("osmium_sword", () -> new SwordItem(TaloiTiers.OSMIUM, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(TaloiTiers.PLATINUM, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () -> new SwordItem(TaloiTiers.TUNGSTEN, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> SERMIUM_SWORD = ITEMS.register("sermium_sword", () -> new SwordItem(TaloiTiers.SERMIUM, 4, -2.2f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> FUTURITE_SWORD = ITEMS.register("futurite_sword", () -> new SwordItem(TaloiTiers.FUTURITE, 4, -2f, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> IRIDIUM_HELMET = ITEMS.register("iridium_helmet", () -> new ArmorItem(TaloiArmorMaterials.IRIDIUM, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register("iridium_chestplate", () -> new ArmorItem(TaloiArmorMaterials.IRIDIUM, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register("iridium_leggings", () -> new ArmorItem(TaloiArmorMaterials.IRIDIUM, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register("iridium_boots", () -> new ArmorItem(TaloiArmorMaterials.IRIDIUM, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> OSMIUM_HELMET = ITEMS.register("osmium_helmet", () -> new ArmorItem(TaloiArmorMaterials.OSMIUM, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> OSMIUM_CHESTPLATE = ITEMS.register("osmium_chestplate", () -> new ArmorItem(TaloiArmorMaterials.OSMIUM, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> OSMIUM_LEGGINGS = ITEMS.register("osmium_leggings", () -> new ArmorItem(TaloiArmorMaterials.OSMIUM, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> OSMIUM_BOOTS = ITEMS.register("osmium_boots", () -> new ArmorItem(TaloiArmorMaterials.OSMIUM, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(TaloiArmorMaterials.PLATINUM, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(TaloiArmorMaterials.PLATINUM, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(TaloiArmorMaterials.PLATINUM, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(TaloiArmorMaterials.PLATINUM, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", () -> new ArmorItem(TaloiArmorMaterials.TUNGSTEN, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", () -> new ArmorItem(TaloiArmorMaterials.TUNGSTEN, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", () -> new ArmorItem(TaloiArmorMaterials.TUNGSTEN, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", () -> new ArmorItem(TaloiArmorMaterials.TUNGSTEN, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> SERMIUM_HELMET = ITEMS.register("sermium_helmet", () -> new ArmorItem(TaloiArmorMaterials.SERMIUM, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> SERMIUM_CHESTPLATE = ITEMS.register("sermium_chestplate", () -> new ArmorItem(TaloiArmorMaterials.SERMIUM, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> SERMIUM_LEGGINGS = ITEMS.register("sermium_leggings", () -> new ArmorItem(TaloiArmorMaterials.SERMIUM, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> SERMIUM_BOOTS = ITEMS.register("sermium_boots", () -> new ArmorItem(TaloiArmorMaterials.SERMIUM, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> FUTURITE_HELMET = ITEMS.register("futurite_helmet", () -> new FuturiteArmor(TaloiArmorMaterials.FUTURITE, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> FUTURITE_CHESTPLATE = ITEMS.register("futurite_chestplate", () -> new FuturiteArmor(TaloiArmorMaterials.FUTURITE, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> FUTURITE_LEGGINGS = ITEMS.register("futurite_leggings", () -> new FuturiteArmor(TaloiArmorMaterials.FUTURITE, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> FUTURITE_BOOTS = ITEMS.register("futurite_boots", () -> new FuturiteArmor(TaloiArmorMaterials.FUTURITE, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    // GEMS
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // FOOD & CROPS
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(TaloiFoods.APPLE_PIE).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new Item(new Item.Properties().food(TaloiFoods.BLUEBERRIES).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> BLUEBERRY_PIE = ITEMS.register("blueberry_pie", () -> new Item(new Item.Properties().food(TaloiFoods.BLUEBERRY_PIE).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl", () -> new BowlFoodItem(new Item.Properties().food(TaloiFoods.RICE_BOWL).stacksTo(1).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().food(TaloiFoods.SWEET_BERRY_PIE).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(TaloiFoods.TOMATO).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(TaloiFoods.DIAMOND_APPLE).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> DESTABILIZED_FUTURITE_APPLE = ITEMS.register("destabilized_futurite_apple", () -> new DestabilizedFuturiteAppleItem(new Item.Properties().rarity(Rarity.EPIC).food(TaloiFoods.FUTURITE_APPLE).stacksTo(32).tab(TaloiCreativeModeTab.TALOI_ITEMS)));
    public static final RegistryObject<Item> FUTURITE_APPLE = ITEMS.register("futurite_apple", () -> new FuturiteAppleItem(new Item.Properties().rarity(Rarity.EPIC).food(TaloiFoods.FUTURITE_APPLE).stacksTo(16).tab(TaloiCreativeModeTab.TALOI_ITEMS)));

    // MISCELLANEOUS
    public static final RegistryObject<Item> MUSIC_DISC_THE_CAVES = ITEMS.register("music_disc_the_caves", () -> new RecordItem(11, TaloiSounds.THE_CAVES, new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(TaloiCreativeModeTab.TALOI_ITEMS), 2560));
}
