package com.newjumper.taloi.item;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.sound.TaloiSounds;
import com.newjumper.taloi.util.TaloiCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThatsALotOfItems.MOD_ID);

    // TOOLS
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(TaloiTiers.EMERALD, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(TaloiTiers.EMERALD, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(TaloiTiers.EMERALD, 6, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(TaloiTiers.EMERALD, 0, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(TaloiTiers.LAPIS, 1.5f, -3f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(TaloiTiers.LAPIS, 1, -2.8f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(TaloiTiers.LAPIS, 7, -3.2f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(TaloiTiers.LAPIS, -1, -2f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new BowItem(new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT).durability(1700)));

    // COMBAT
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(TaloiTiers.EMERALD, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(TaloiTiers.LAPIS, 3, -2.4f, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(TaloiArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.HEAD, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.CHEST, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.LEGS, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new ArmorItem(TaloiArmorMaterials.LAPIS, EquipmentSlot.FEET, new Item.Properties().tab(TaloiCreativeModeTab.TALOI_COMBAT)));

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

    // MISCELLANEOUS
    public static final RegistryObject<Item> MUSIC_DISC_THE_CAVES = ITEMS.register("music_disc_the_caves", () -> new RecordItem(11, TaloiSounds.THE_CAVES, new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(TaloiCreativeModeTab.TALOI_ITEMS), 2560));
}
