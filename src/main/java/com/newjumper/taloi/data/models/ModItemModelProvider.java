package com.newjumper.taloi.data.models;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        // - BLOCKS -
        // EVERGREEN
        withExistingParent("evergreen_log", modLoc("block/evergreen_log"));
        withExistingParent("evergreen_wood", modLoc("block/evergreen_wood"));
        withExistingParent("evergreen_planks", modLoc("block/evergreen_planks"));
        withExistingParent("evergreen_slab", modLoc("block/evergreen_slab"));
        withExistingParent("evergreen_stairs", modLoc("block/evergreen_stairs"));
        withExistingParent("stripped_evergreen_log", modLoc("block/stripped_evergreen_log"));
        withExistingParent("stripped_evergreen_wood", modLoc("block/stripped_evergreen_wood"));
        withExistingParent("evergreen_fence", modLoc("block/evergreen_fence_inventory"));
        withExistingParent("evergreen_fence_gate", modLoc("block/evergreen_fence_gate"));
        withExistingParent("evergreen_leaves", modLoc("block/evergreen_leaves"));
        getBuilder("evergreen_sapling").parent(itemGenerated).texture("layer0", "block/evergreen_sapling");
        withExistingParent("evergreen_button", modLoc("block/evergreen_button_inventory"));
        withExistingParent("evergreen_pressure_plate", modLoc("block/evergreen_pressure_plate"));

        // WILLOW
        withExistingParent("willow_log", modLoc("block/willow_log"));
        withExistingParent("willow_wood", modLoc("block/willow_wood"));
        withExistingParent("willow_planks", modLoc("block/willow_planks"));
        withExistingParent("willow_slab", modLoc("block/willow_slab"));
        withExistingParent("willow_stairs", modLoc("block/willow_stairs"));
        withExistingParent("stripped_willow_log", modLoc("block/stripped_willow_log"));
        withExistingParent("stripped_willow_wood", modLoc("block/stripped_willow_wood"));
        withExistingParent("willow_fence", modLoc("block/willow_fence_inventory"));
        withExistingParent("willow_fence_gate", modLoc("block/willow_fence_gate"));
        withExistingParent("willow_leaves", modLoc("block/willow_leaves"));
        getBuilder("willow_sapling").parent(itemGenerated).texture("layer0", "block/willow_sapling");
        withExistingParent("willow_button", modLoc("block/willow_button_inventory"));
        withExistingParent("willow_pressure_plate", modLoc("block/willow_pressure_plate"));

        // NATURAL
        withExistingParent("limestone", modLoc("block/limestone"));
        withExistingParent("limestone_slab", modLoc("block/limestone_slab"));
        withExistingParent("limestone_stairs", modLoc("block/limestone_stairs"));
        withExistingParent("limestone_wall", modLoc("block/limestone_wall_inventory"));

        withExistingParent("marble", modLoc("block/marble"));
        withExistingParent("marble_slab", modLoc("block/marble_slab"));
        withExistingParent("marble_stairs", modLoc("block/marble_stairs"));
        withExistingParent("marble_wall", modLoc("block/marble_wall_inventory"));

        // ALUMINUM
        withExistingParent("aluminum_block", modLoc("block/aluminum_block"));
        withExistingParent("aluminum_ore", modLoc("block/aluminum_ore"));
        withExistingParent("deepslate_aluminum_ore", modLoc("block/deepslate_aluminum_ore"));
        withExistingParent("raw_aluminum_block", modLoc("block/raw_aluminum_block"));

        // IRIDIUM
        withExistingParent("iridium_block", modLoc("block/iridium_block"));
        withExistingParent("iridium_ore", modLoc("block/iridium_ore"));
        withExistingParent("deepslate_iridium_ore", modLoc("block/deepslate_iridium_ore"));
        withExistingParent("raw_iridium_block", modLoc("block/raw_iridium_block"));

        // LEAD
        withExistingParent("lead_block", modLoc("block/lead_block"));
        withExistingParent("lead_ore", modLoc("block/lead_ore"));
        withExistingParent("deepslate_lead_ore", modLoc("block/deepslate_lead_ore"));
        withExistingParent("raw_lead_block", modLoc("block/raw_lead_block"));

        // MAGNESIUM
        withExistingParent("magnesium_block", modLoc("block/magnesium_block"));
        withExistingParent("magnesium_ore", modLoc("block/magnesium_ore"));
        withExistingParent("deepslate_magnesium_ore", modLoc("block/deepslate_magnesium_ore"));
        withExistingParent("raw_magnesium_block", modLoc("block/raw_magnesium_block"));

        // OSMIUM
        withExistingParent("osmium_block", modLoc("block/osmium_block"));
        withExistingParent("osmium_ore", modLoc("block/osmium_ore"));
        withExistingParent("deepslate_osmium_ore", modLoc("block/deepslate_osmium_ore"));
        withExistingParent("raw_osmium_block", modLoc("block/raw_osmium_block"));

        // PLATINUM
        withExistingParent("platinum_block", modLoc("block/platinum_block"));
        withExistingParent("platinum_ore", modLoc("block/platinum_ore"));
        withExistingParent("deepslate_platinum_ore", modLoc("block/deepslate_platinum_ore"));
        withExistingParent("raw_platinum_block", modLoc("block/raw_platinum_block"));

        // SILICON
        withExistingParent("silicon_block", modLoc("block/silicon_block"));
        withExistingParent("silicon_ore", modLoc("block/silicon_ore"));
        withExistingParent("deepslate_silicon_ore", modLoc("block/deepslate_silicon_ore"));
        withExistingParent("raw_silicon_block", modLoc("block/raw_silicon_block"));

        // TIN
        withExistingParent("tin_block", modLoc("block/tin_block"));
        withExistingParent("tin_ore", modLoc("block/tin_ore"));
        withExistingParent("deepslate_tin_ore", modLoc("block/deepslate_tin_ore"));
        withExistingParent("raw_tin_block", modLoc("block/raw_tin_block"));

        // TUNGSTEN
        withExistingParent("tungsten_block", modLoc("block/tungsten_block"));
        withExistingParent("tungsten_ore", modLoc("block/tungsten_ore"));
        withExistingParent("deepslate_tungsten_ore", modLoc("block/deepslate_tungsten_ore"));
        withExistingParent("raw_tungsten_block", modLoc("block/raw_tungsten_block"));

        // URANIUM
        withExistingParent("uranium_block", modLoc("block/uranium_block"));
        withExistingParent("uranium_ore", modLoc("block/uranium_ore"));
        withExistingParent("deepslate_uranium_ore", modLoc("block/deepslate_uranium_ore"));
        withExistingParent("raw_uranium_block", modLoc("block/raw_uranium_block"));

        // ZINC
        withExistingParent("zinc_block", modLoc("block/zinc_block"));
        withExistingParent("zinc_ore", modLoc("block/zinc_ore"));
        withExistingParent("deepslate_zinc_ore", modLoc("block/deepslate_zinc_ore"));
        withExistingParent("raw_zinc_block", modLoc("block/raw_zinc_block"));

        // ALLOYS
        withExistingParent("bronze_block", modLoc("block/bronze_block"));
        withExistingParent("steel_block", modLoc("block/steel_block"));

        // CONCRETE
        withExistingParent("white_concrete_slab", modLoc("block/white_concrete_slab"));
        withExistingParent("white_concrete_stairs", modLoc("block/white_concrete_stairs"));

        withExistingParent("orange_concrete_slab", modLoc("block/orange_concrete_slab"));
        withExistingParent("orange_concrete_stairs", modLoc("block/orange_concrete_stairs"));

        withExistingParent("magenta_concrete_slab", modLoc("block/magenta_concrete_slab"));
        withExistingParent("magenta_concrete_stairs", modLoc("block/magenta_concrete_stairs"));

        withExistingParent("light_blue_concrete_slab", modLoc("block/light_blue_concrete_slab"));
        withExistingParent("light_blue_concrete_stairs", modLoc("block/light_blue_concrete_stairs"));

        withExistingParent("yellow_concrete_slab", modLoc("block/yellow_concrete_slab"));
        withExistingParent("yellow_concrete_stairs", modLoc("block/yellow_concrete_stairs"));

        withExistingParent("lime_concrete_slab", modLoc("block/lime_concrete_slab"));
        withExistingParent("lime_concrete_stairs", modLoc("block/lime_concrete_stairs"));

        withExistingParent("pink_concrete_slab", modLoc("block/pink_concrete_slab"));
        withExistingParent("pink_concrete_stairs", modLoc("block/pink_concrete_stairs"));

        withExistingParent("gray_concrete_slab", modLoc("block/gray_concrete_slab"));
        withExistingParent("gray_concrete_stairs", modLoc("block/gray_concrete_stairs"));

        withExistingParent("light_gray_concrete_slab", modLoc("block/light_gray_concrete_slab"));
        withExistingParent("light_gray_concrete_stairs", modLoc("block/light_gray_concrete_stairs"));

        withExistingParent("cyan_concrete_slab", modLoc("block/cyan_concrete_slab"));
        withExistingParent("cyan_concrete_stairs", modLoc("block/cyan_concrete_stairs"));

        withExistingParent("purple_concrete_slab", modLoc("block/purple_concrete_slab"));
        withExistingParent("purple_concrete_stairs", modLoc("block/purple_concrete_stairs"));

        withExistingParent("blue_concrete_slab", modLoc("block/blue_concrete_slab"));
        withExistingParent("blue_concrete_stairs", modLoc("block/blue_concrete_stairs"));

        withExistingParent("brown_concrete_slab", modLoc("block/brown_concrete_slab"));
        withExistingParent("brown_concrete_stairs", modLoc("block/brown_concrete_stairs"));

        withExistingParent("green_concrete_slab", modLoc("block/green_concrete_slab"));
        withExistingParent("green_concrete_stairs", modLoc("block/green_concrete_stairs"));

        withExistingParent("red_concrete_slab", modLoc("block/red_concrete_slab"));
        withExistingParent("red_concrete_stairs", modLoc("block/red_concrete_stairs"));

        withExistingParent("black_concrete_slab", modLoc("block/black_concrete_slab"));
        withExistingParent("black_concrete_stairs", modLoc("block/black_concrete_stairs"));

        // MISCELLANEOUS
        withExistingParent("bouncy_block", modLoc("block/bouncy_block"));
        withExistingParent("feathery_block", modLoc("block/feathery_block"));
        withExistingParent("gravity_block", modLoc("block/gravity_block"));
        withExistingParent("speedy_block", modLoc("block/speedy_block"));

        // - ITEMS -
        // ALUMINUM
        getBuilder("aluminum_ingot").parent(itemGenerated).texture("layer0", "item/aluminum_ingot");
        getBuilder("raw_aluminum").parent(itemGenerated).texture("layer0", "item/raw_aluminum");

        // IRIDIUM
        getBuilder("iridium_ingot").parent(itemGenerated).texture("layer0", "item/iridium_ingot");
        getBuilder("raw_iridium").parent(itemGenerated).texture("layer0", "item/raw_iridium");

        // LEAD
        getBuilder("lead_ingot").parent(itemGenerated).texture("layer0", "item/lead_ingot");
        getBuilder("raw_lead").parent(itemGenerated).texture("layer0", "item/raw_lead");

        // MAGNESIUM
        getBuilder("magnesium_ingot").parent(itemGenerated).texture("layer0", "item/magnesium_ingot");
        getBuilder("raw_magnesium").parent(itemGenerated).texture("layer0", "item/raw_magnesium");

        // OSMIUM
        getBuilder("osmium_ingot").parent(itemGenerated).texture("layer0", "item/osmium_ingot");
        getBuilder("raw_osmium").parent(itemGenerated).texture("layer0", "item/raw_osmium");

        // PLATINUM
        getBuilder("platinum_ingot").parent(itemGenerated).texture("layer0", "item/platinum_ingot");
        getBuilder("raw_platinum").parent(itemGenerated).texture("layer0", "item/raw_platinum");

        // SILICON
        getBuilder("silicon").parent(itemGenerated).texture("layer0", "item/silicon");
        getBuilder("raw_silicon").parent(itemGenerated).texture("layer0", "item/raw_silicon");

        // TIN
        getBuilder("tin_ingot").parent(itemGenerated).texture("layer0", "item/tin_ingot");
        getBuilder("raw_tin").parent(itemGenerated).texture("layer0", "item/raw_tin");

        // TUNGSTEN
        getBuilder("tungsten_ingot").parent(itemGenerated).texture("layer0", "item/tungsten_ingot");
        getBuilder("raw_tungsten").parent(itemGenerated).texture("layer0", "item/raw_tungsten");

        // URANIUM
        getBuilder("refined_uranium").parent(itemGenerated).texture("layer0", "item/refined_uranium");
        getBuilder("raw_uranium").parent(itemGenerated).texture("layer0", "item/raw_uranium");

        // ZINC
        getBuilder("zinc_ingot").parent(itemGenerated).texture("layer0", "item/zinc_ingot");
        getBuilder("raw_zinc").parent(itemGenerated).texture("layer0", "item/raw_zinc");

        // ALLOYS
        getBuilder("bronze_ingot").parent(itemGenerated).texture("layer0", "item/bronze_ingot");
        getBuilder("carbonite").parent(itemGenerated).texture("layer0", "item/carbonite");
        getBuilder("ferroniobium_ingot").parent(itemGenerated).texture("layer0", "item/ferroniobium_ingot");
        getBuilder("futurite").parent(itemGenerated).texture("layer0", "item/futurite");
        getBuilder("hardened_carbonite").parent(itemGenerated).texture("layer0", "item/hardened_carbonite");
        getBuilder("sermium").parent(itemGenerated).texture("layer0", "item/sermium");
        getBuilder("steel_ingot").parent(itemGenerated).texture("layer0", "item/steel_ingot");
        getBuilder("alloy_x").parent(itemGenerated).texture("layer0", "item/alloy_x");
        getBuilder("alloy_z").parent(itemGenerated).texture("layer0", "item/alloy_z");

        // PLATES
        getBuilder("alloy_plate").parent(itemGenerated).texture("layer0", "item/alloy_plate");
        getBuilder("bronze_plate").parent(itemGenerated).texture("layer0", "item/bronze_plate");
        getBuilder("carbon_plate").parent(itemGenerated).texture("layer0", "item/carbon_plate");
        getBuilder("copper_plate").parent(itemGenerated).texture("layer0", "item/copper_plate");
        getBuilder("diamond_plate").parent(itemGenerated).texture("layer0", "item/diamond_plate");
        getBuilder("forge_plate").parent(itemGenerated).texture("layer0", "item/forge_plate");
        getBuilder("futurite_plate").parent(itemGenerated).texture("layer0", "item/futurite_plate");
        getBuilder("gold_disk").parent(itemGenerated).texture("layer0", "item/gold_disk");
        getBuilder("induction_plate").parent(itemGenerated).texture("layer0", "item/induction_plate");
        getBuilder("magnesium_plate").parent(itemGenerated).texture("layer0", "item/magnesium_plate");
        getBuilder("reinforced_copper_plate").parent(itemGenerated).texture("layer0", "item/reinforced_copper_plate");
        getBuilder("semiconductor_plate").parent(itemGenerated).texture("layer0", "item/semiconductor_plate");
        getBuilder("sermium_plate").parent(itemGenerated).texture("layer0", "item/sermium_plate");
        getBuilder("silicon_plate").parent(itemGenerated).texture("layer0", "item/silicon_plate");
        getBuilder("steel_plate").parent(itemGenerated).texture("layer0", "item/steel_plate");
        getBuilder("tungsten_plate").parent(itemGenerated).texture("layer0", "item/tungsten_plate");

        // NUGGETS
        getBuilder("aluminum_nugget").parent(itemGenerated).texture("layer0", "item/aluminum_nugget");
        getBuilder("iridium_nugget").parent(itemGenerated).texture("layer0", "item/iridium_nugget");
        getBuilder("lead_nugget").parent(itemGenerated).texture("layer0", "item/lead_nugget");
        getBuilder("magnesium_nugget").parent(itemGenerated).texture("layer0", "item/magnesium_nugget");
        getBuilder("osmium_nugget").parent(itemGenerated).texture("layer0", "item/osmium_nugget");
        getBuilder("platinum_nugget").parent(itemGenerated).texture("layer0", "item/platinum_nugget");
        getBuilder("tin_nugget").parent(itemGenerated).texture("layer0", "item/tin_nugget");
        getBuilder("tungsten_nugget").parent(itemGenerated).texture("layer0", "item/tungsten_nugget");
        getBuilder("uranium_bit").parent(itemGenerated).texture("layer0", "item/uranium_bit");
        getBuilder("zinc_nugget").parent(itemGenerated).texture("layer0", "item/zinc_nugget");
        getBuilder("futurite_bit").parent(itemGenerated).texture("layer0", "item/futurite_bit");

        // ARMOR
        getBuilder("iridium_helmet").parent(itemGenerated).texture("layer0", "item/iridium_helmet");
        getBuilder("iridium_chestplate").parent(itemGenerated).texture("layer0", "item/iridium_chestplate");
        getBuilder("iridium_leggings").parent(itemGenerated).texture("layer0", "item/iridium_leggings");
        getBuilder("iridium_boots").parent(itemGenerated).texture("layer0", "item/iridium_boots");

        getBuilder("osmium_helmet").parent(itemGenerated).texture("layer0", "item/osmium_helmet");
        getBuilder("osmium_chestplate").parent(itemGenerated).texture("layer0", "item/osmium_chestplate");
        getBuilder("osmium_leggings").parent(itemGenerated).texture("layer0", "item/osmium_leggings");
        getBuilder("osmium_boots").parent(itemGenerated).texture("layer0", "item/osmium_boots");

        getBuilder("platinum_helmet").parent(itemGenerated).texture("layer0", "item/platinum_helmet");
        getBuilder("platinum_chestplate").parent(itemGenerated).texture("layer0", "item/platinum_chestplate");
        getBuilder("platinum_leggings").parent(itemGenerated).texture("layer0", "item/platinum_leggings");
        getBuilder("platinum_boots").parent(itemGenerated).texture("layer0", "item/platinum_boots");

        getBuilder("tungsten_helmet").parent(itemGenerated).texture("layer0", "item/tungsten_helmet");
        getBuilder("tungsten_chestplate").parent(itemGenerated).texture("layer0", "item/tungsten_chestplate");
        getBuilder("tungsten_leggings").parent(itemGenerated).texture("layer0", "item/tungsten_leggings");
        getBuilder("tungsten_boots").parent(itemGenerated).texture("layer0", "item/tungsten_boots");

        getBuilder("futurite_helmet").parent(itemGenerated).texture("layer0", "item/futurite_helmet");
        getBuilder("futurite_chestplate").parent(itemGenerated).texture("layer0", "item/futurite_chestplate");
        getBuilder("futurite_leggings").parent(itemGenerated).texture("layer0", "item/futurite_leggings");
        getBuilder("futurite_boots").parent(itemGenerated).texture("layer0", "item/futurite_boots");

        getBuilder("sermium_helmet").parent(itemGenerated).texture("layer0", "item/sermium_helmet");
        getBuilder("sermium_chestplate").parent(itemGenerated).texture("layer0", "item/sermium_chestplate");
        getBuilder("sermium_leggings").parent(itemGenerated).texture("layer0", "item/sermium_leggings");
        getBuilder("sermium_boots").parent(itemGenerated).texture("layer0", "item/sermium_boots");

        // TOOLS
        getBuilder("iridium_shovel").parent(itemHandheld).texture("layer0", "item/iridium_shovel");
        getBuilder("iridium_pickaxe").parent(itemHandheld).texture("layer0", "item/iridium_pickaxe");
        getBuilder("iridium_axe").parent(itemHandheld).texture("layer0", "item/iridium_axe");
        getBuilder("iridium_hoe").parent(itemHandheld).texture("layer0", "item/iridium_hoe");

        getBuilder("osmium_shovel").parent(itemHandheld).texture("layer0", "item/osmium_shovel");
        getBuilder("osmium_pickaxe").parent(itemHandheld).texture("layer0", "item/osmium_pickaxe");
        getBuilder("osmium_axe").parent(itemHandheld).texture("layer0", "item/osmium_axe");
        getBuilder("osmium_hoe").parent(itemHandheld).texture("layer0", "item/osmium_hoe");

        getBuilder("platinum_shovel").parent(itemHandheld).texture("layer0", "item/platinum_shovel");
        getBuilder("platinum_pickaxe").parent(itemHandheld).texture("layer0", "item/platinum_pickaxe");
        getBuilder("platinum_axe").parent(itemHandheld).texture("layer0", "item/platinum_axe");
        getBuilder("platinum_hoe").parent(itemHandheld).texture("layer0", "item/platinum_hoe");

        getBuilder("tungsten_shovel").parent(itemHandheld).texture("layer0", "item/tungsten_shovel");
        getBuilder("tungsten_pickaxe").parent(itemHandheld).texture("layer0", "item/tungsten_pickaxe");
        getBuilder("tungsten_axe").parent(itemHandheld).texture("layer0", "item/tungsten_axe");
        getBuilder("tungsten_hoe").parent(itemHandheld).texture("layer0", "item/tungsten_hoe");

        getBuilder("futurite_shovel").parent(itemHandheld).texture("layer0", "item/futurite_shovel");
        getBuilder("futurite_pickaxe").parent(itemHandheld).texture("layer0", "item/futurite_pickaxe");
        getBuilder("futurite_axe").parent(itemHandheld).texture("layer0", "item/futurite_axe");

        getBuilder("sermium_shovel").parent(itemHandheld).texture("layer0", "item/sermium_shovel");
        getBuilder("sermium_pickaxe").parent(itemHandheld).texture("layer0", "item/sermium_pickaxe");
        getBuilder("sermium_axe").parent(itemHandheld).texture("layer0", "item/sermium_axe");

        // WEAPONS
        getBuilder("iridium_sword").parent(itemHandheld).texture("layer0", "item/iridium_sword");
        getBuilder("osmium_sword").parent(itemHandheld).texture("layer0", "item/osmium_sword");
        getBuilder("platinum_sword").parent(itemHandheld).texture("layer0", "item/platinum_sword");
        getBuilder("tungsten_sword").parent(itemHandheld).texture("layer0", "item/tungsten_sword");
        getBuilder("futurite_sword").parent(itemHandheld).texture("layer0", "item/futurite_sword");
        getBuilder("sermium_sword").parent(itemHandheld).texture("layer0", "item/sermium_sword");

        // FOOD
        getBuilder("destabilized_futurite_apple").parent(itemGenerated).texture("layer0", "item/destabilized_futurite_apple");
        getBuilder("diamond_apple").parent(itemGenerated).texture("layer0", "item/diamond_apple");
        getBuilder("futurite_apple").parent(itemGenerated).texture("layer0", "item/futurite_apple");
        getBuilder("rice_bowl").parent(itemGenerated).texture("layer0", "item/rice_bowl");
        getBuilder("tomato").parent(itemGenerated).texture("layer0", "item/tomato");

        // MISC
        getBuilder("music_disc_the_caves").parent(itemGenerated).texture("layer0", "item/music_disc_the_caves");
        getBuilder("sermium_core").parent(itemGenerated).texture("layer0", "item/sermium_core");
        getBuilder("sermium_oxide").parent(itemGenerated).texture("layer0", "item/sermium_oxide");
    }
}
