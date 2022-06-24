package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class CraftingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public CraftingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // EVERGREEN
        ShapelessRecipeBuilder.shapeless(TaloiBlocks.EVERGREEN_PLANKS.get(), 4).requires(TaloiTags.Items.EVERGREEN_LOGS).unlockedBy("has_log", has(TaloiTags.Items.EVERGREEN_LOGS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get(), 3).define('L', TaloiBlocks.STRIPPED_EVERGREEN_LOG.get()).pattern("LL").pattern("LL").unlockedBy("has_log", has(TaloiBlocks.STRIPPED_EVERGREEN_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_WOOD.get(), 3).define('L', TaloiBlocks.EVERGREEN_LOG.get()).pattern("LL").pattern("LL").unlockedBy("has_log", has(TaloiBlocks.EVERGREEN_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_SLAB.get(), 6).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_FENCE.get(), 3).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).define('S', Tags.Items.RODS_WOODEN).pattern("PSP").pattern("PSP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_STAIRS.get(), 4).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).pattern("P  ").pattern("PP ").pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiBlocks.EVERGREEN_BUTTON.get(), 1).requires(TaloiBlocks.EVERGREEN_PLANKS.get()).unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_PRESSURE_PLATE.get(), 1).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).pattern("PP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_DOOR.get(), 3).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).pattern("PP").pattern("PP").pattern("PP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_TRAPDOOR.get(), 2).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).pattern("PPP").pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_FENCE_GATE.get(), 1).define('P', TaloiBlocks.EVERGREEN_PLANKS.get()).define('S', Tags.Items.RODS_WOODEN).pattern("SPS").pattern("SPS").unlockedBy("has_planks", has(TaloiBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_WOOD_STAIRS.get(), 4).define('W', TaloiBlocks.EVERGREEN_WOOD.get()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.EVERGREEN_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.EVERGREEN_WOOD_SLAB.get(), 6).define('W', TaloiBlocks.EVERGREEN_WOOD.get()).pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.EVERGREEN_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_STAIRS.get(), 4).define('W', TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_EVERGREEN_WOOD_SLAB.get(), 6).define('W', TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get()).pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.STRIPPED_EVERGREEN_WOOD.get())).save(consumer);

        // WILLOW
        ShapelessRecipeBuilder.shapeless(TaloiBlocks.WILLOW_PLANKS.get(), 4).requires(TaloiTags.Items.WILLOW_LOGS).unlockedBy("has_log", has(TaloiTags.Items.WILLOW_LOGS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_WILLOW_WOOD.get(), 3).define('L', TaloiBlocks.STRIPPED_WILLOW_LOG.get()).pattern("LL").pattern("LL").unlockedBy("has_log", has(TaloiBlocks.STRIPPED_WILLOW_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_WOOD.get(), 3).define('L', TaloiBlocks.WILLOW_LOG.get()).pattern("LL").pattern("LL").unlockedBy("has_log", has(TaloiBlocks.WILLOW_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_SLAB.get(), 6).define('P', TaloiBlocks.WILLOW_PLANKS.get()).pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_FENCE.get(), 3).define('P', TaloiBlocks.WILLOW_PLANKS.get()).define('S', Tags.Items.RODS_WOODEN).pattern("PSP").pattern("PSP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_STAIRS.get(), 4).define('P', TaloiBlocks.WILLOW_PLANKS.get()).pattern("P  ").pattern("PP ").pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiBlocks.WILLOW_BUTTON.get(), 1).requires(TaloiBlocks.WILLOW_PLANKS.get()).unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_PRESSURE_PLATE.get(), 1).define('P', TaloiBlocks.WILLOW_PLANKS.get()).pattern("PP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_DOOR.get(), 3).define('P', TaloiBlocks.WILLOW_PLANKS.get()).pattern("PP").pattern("PP").pattern("PP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_TRAPDOOR.get(), 2).define('P', TaloiBlocks.WILLOW_PLANKS.get()).pattern("PPP").pattern("PPP").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_FENCE_GATE.get(), 1).define('P', TaloiBlocks.WILLOW_PLANKS.get()).define('S', Tags.Items.RODS_WOODEN).pattern("SPS").pattern("SPS").unlockedBy("has_planks", has(TaloiBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_WOOD_STAIRS.get(), 4).define('W', TaloiBlocks.WILLOW_WOOD.get()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.WILLOW_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WILLOW_WOOD_SLAB.get(), 6).define('W', TaloiBlocks.WILLOW_WOOD.get()).pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.WILLOW_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get(), 4).define('W', TaloiBlocks.STRIPPED_WILLOW_WOOD.get()).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.STRIPPED_WILLOW_WOOD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_WILLOW_WOOD_SLAB.get(), 6).define('W', TaloiBlocks.STRIPPED_WILLOW_WOOD.get()).pattern("WWW").unlockedBy("has_wood", has(TaloiBlocks.STRIPPED_WILLOW_WOOD.get())).save(consumer);

        // NATURAL & DECORATION
        ShapedRecipeBuilder.shaped(TaloiBlocks.ASPHALT.get(), 4).define('S', Blocks.SAND).define('T', Blocks.STONE).pattern("ST").pattern("TS").unlockedBy("has_sand", has(Blocks.SAND)).unlockedBy("has_stone", has(Blocks.STONE)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_SLAB.get(), 6).define('L', TaloiBlocks.LIMESTONE.get()).pattern("LLL").unlockedBy("has_limestone", has(TaloiBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_STAIRS.get(), 4).define('L', TaloiBlocks.LIMESTONE.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_limestone", has(TaloiBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_WALL.get(), 6).define('L', TaloiBlocks.LIMESTONE.get()).pattern("LLL").pattern("LLL").unlockedBy("has_limestone", has(TaloiBlocks.LIMESTONE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_BRICKS.get(), 4).define('L', TaloiBlocks.LIMESTONE.get()).pattern("LL").pattern("LL").unlockedBy("has_limestone", has(TaloiBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_BRICK_SLAB.get(), 6).define('L', TaloiBlocks.LIMESTONE_BRICKS.get()).pattern("LLL").unlockedBy("has_limestone_bricks", has(TaloiBlocks.LIMESTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_BRICK_STAIRS.get(), 4).define('L', TaloiBlocks.LIMESTONE_BRICKS.get()).pattern("L  ").pattern("LL ").pattern("LLL").unlockedBy("has_limestone_bricks", has(TaloiBlocks.LIMESTONE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIMESTONE_BRICK_WALL.get(), 6).define('L', TaloiBlocks.LIMESTONE_BRICKS.get()).pattern("LLL").pattern("LLL").unlockedBy("has_limestone_bricks", has(TaloiBlocks.LIMESTONE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.MARBLE_SLAB.get(), 6).define('M', TaloiBlocks.MARBLE.get()).pattern("MMM").unlockedBy("has_marble", has(TaloiBlocks.MARBLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MARBLE_STAIRS.get(), 4).define('M', TaloiBlocks.MARBLE.get()).pattern("M  ").pattern("MM ").pattern("MMM").unlockedBy("has_marble", has(TaloiBlocks.MARBLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MARBLE_WALL.get(), 6).define('M', TaloiBlocks.MARBLE.get()).pattern("MMM").pattern("MMM").unlockedBy("has_marble", has(TaloiBlocks.MARBLE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_SLAB.get(), 6).define('S', TaloiBlocks.SLATE.get()).pattern("SSS").unlockedBy("has_slate", has(TaloiBlocks.SLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_STAIRS.get(), 4).define('S', TaloiBlocks.SLATE.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_slate", has(TaloiBlocks.SLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_WALL.get(), 6).define('S', TaloiBlocks.SLATE.get()).pattern("SSS").pattern("SSS").unlockedBy("has_slate", has(TaloiBlocks.SLATE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_BRICKS.get(), 4).define('S', TaloiBlocks.SLATE.get()).pattern("SS").pattern("SS").unlockedBy("has_slate", has(TaloiBlocks.SLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_BRICK_SLAB.get(), 6).define('S', TaloiBlocks.SLATE_BRICKS.get()).pattern("SSS").unlockedBy("has_slate_bricks", has(TaloiBlocks.SLATE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_BRICK_STAIRS.get(), 4).define('S', TaloiBlocks.SLATE_BRICKS.get()).pattern("S  ").pattern("SS ").pattern("SSS").unlockedBy("has_slate_bricks", has(TaloiBlocks.SLATE_BRICKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SLATE_BRICK_WALL.get(), 6).define('S', TaloiBlocks.SLATE_BRICKS.get()).pattern("SSS").pattern("SSS").unlockedBy("has_slate_bricks", has(TaloiBlocks.SLATE_BRICKS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.POLISHED_TUFF.get(), 4).define('T', Blocks.TUFF).pattern("TT").pattern("TT").unlockedBy("has_tuff", has(Blocks.TUFF)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.NETHERRACK_BRICKS.get(), 4).define('N', Tags.Items.NETHERRACK).pattern("NN").pattern("NN").unlockedBy("has_netherrack", has(Tags.Items.NETHERRACK)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.REINFORCED_IRON_BLOCK.get(), 4).define('I', Tags.Items.STORAGE_BLOCKS_IRON).pattern("II").pattern("II").unlockedBy("has_iron_block", has(Tags.Items.STORAGE_BLOCKS_IRON)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BUNDLED_BAMBOO.get(), 1).define('B', Blocks.BAMBOO).pattern("BB").pattern("BB").unlockedBy("has_bamboo", has(Blocks.BAMBOO)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.MALACHITE_BLOCK.get(), 2).define('M', TaloiItems.MALACHITE.get()).pattern("MM").pattern("MM").unlockedBy("has_malachite", has(TaloiItems.MALACHITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.TANZANITE_BLOCK.get(), 2).define('T', TaloiItems.TANZANITE.get()).pattern("TT").pattern("TT").unlockedBy("has_tanzanite", has(TaloiItems.TANZANITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.TOPAZ_BLOCK.get(), 2).define('T', TaloiItems.TOPAZ.get()).pattern("TT").pattern("TT").unlockedBy("has_topaz", has(TaloiItems.TOPAZ.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.WOODEN_CRATE.get(), 1).define('P', ItemTags.PLANKS).define('S', ItemTags.WOODEN_SLABS).pattern("SSS").pattern("P P").pattern("SSS").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.IRON_CRATE.get(), 1).define('N', Tags.Items.NUGGETS_IRON).define('C', TaloiBlocks.WOODEN_CRATE.get()).pattern("NNN").pattern("NCN").pattern("NNN").unlockedBy("has_wooden_crate", has(TaloiBlocks.WOODEN_CRATE.get())).save(consumer);

        // ALUMINUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.ALUMINUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_ALUMINUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_aluminum", has(TaloiTags.Items.INGOTS_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.ALUMINUM_INGOT.get(), 9).group("aluminum").requires(TaloiTags.Items.STORAGE_ALUMINUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_ALUMINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ingot_from_aluminum_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_ALUMINUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_ALUMINUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_aluminum", has(TaloiTags.Items.RAW_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_ALUMINUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_ALUMINUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_ALUMINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.ALUMINUM_INGOT.get(), 1).group("aluminum").define('N', TaloiTags.Items.NUGGETS_ALUMINUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_aluminum_nugget", has(TaloiTags.Items.NUGGETS_ALUMINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ingot_from_aluminum_nugget"));

        // IRIDIUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.IRIDIUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.IRIDIUM_INGOT.get(), 9).group("iridium").requires(TaloiTags.Items.STORAGE_IRIDIUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_IRIDIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ingot_from_iridium_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_IRIDIUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_IRIDIUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_iridium", has(TaloiTags.Items.RAW_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_IRIDIUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_IRIDIUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_INGOT.get(), 1).group("iridium").define('N', TaloiTags.Items.NUGGETS_IRIDIUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_iridium_nugget", has(TaloiTags.Items.NUGGETS_IRIDIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ingot_from_iridium_nugget"));

        // LEAD
        ShapedRecipeBuilder.shaped(TaloiBlocks.LEAD_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_LEAD).pattern("III").pattern("III").pattern("III").unlockedBy("has_lead", has(TaloiTags.Items.INGOTS_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.LEAD_INGOT.get(), 9).group("lead").requires(TaloiTags.Items.STORAGE_LEAD).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_LEAD)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ingot_from_lead_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_LEAD_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_LEAD).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_lead", has(TaloiTags.Items.RAW_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_LEAD.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_LEAD).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_LEAD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LEAD_INGOT.get(), 1).group("lead").define('N', TaloiTags.Items.NUGGETS_LEAD).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_lead_nugget", has(TaloiTags.Items.NUGGETS_LEAD)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ingot_from_lead_nugget"));

        // MAGNESIUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.MAGNESIUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_MAGNESIUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_magnesium", has(TaloiTags.Items.INGOTS_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.MAGNESIUM_INGOT.get(), 9).group("magnesium").requires(TaloiTags.Items.STORAGE_MAGNESIUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_MAGNESIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ingot_from_magnesium_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_MAGNESIUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_MAGNESIUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_magnesium", has(TaloiTags.Items.RAW_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_MAGNESIUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_MAGNESIUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_MAGNESIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.MAGNESIUM_INGOT.get(), 1).group("magnesium").define('N', TaloiTags.Items.NUGGETS_MAGNESIUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_magnesium_nugget", has(TaloiTags.Items.NUGGETS_MAGNESIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ingot_from_magnesium_nugget"));

        // OSMIUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.OSMIUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.OSMIUM_INGOT.get(), 9).group("osmium").requires(TaloiTags.Items.STORAGE_OSMIUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_OSMIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ingot_from_osmium_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_OSMIUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_OSMIUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_osmium", has(TaloiTags.Items.RAW_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_OSMIUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_OSMIUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_INGOT.get(), 1).group("osmium").define('N', TaloiTags.Items.NUGGETS_OSMIUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_osmium_nugget", has(TaloiTags.Items.NUGGETS_OSMIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ingot_from_osmium_nugget"));

        // PLATINUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.PLATINUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.PLATINUM_INGOT.get(), 9).group("platinum").requires(TaloiTags.Items.STORAGE_PLATINUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_PLATINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ingot_from_platinum_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_PLATINUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_PLATINUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_platinum", has(TaloiTags.Items.RAW_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_PLATINUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_PLATINUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_INGOT.get(), 1).group("platinum").define('N', TaloiTags.Items.NUGGETS_PLATINUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_platinum_nugget", has(TaloiTags.Items.NUGGETS_PLATINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ingot_from_platinum_nugget"));

        // SILICON
        ShapedRecipeBuilder.shaped(TaloiBlocks.SILICON_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_SILICON).pattern("III").pattern("III").pattern("III").unlockedBy("has_silicon", has(TaloiTags.Items.INGOTS_SILICON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.SILICON.get(), 9).group("silicon").requires(TaloiTags.Items.STORAGE_SILICON).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_SILICON)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "silicon_from_silicon_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_SILICON_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_SILICON).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_silicon", has(TaloiTags.Items.RAW_SILICON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_SILICON.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_SILICON).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_SILICON)).save(consumer);

        // TIN
        ShapedRecipeBuilder.shaped(TaloiBlocks.TIN_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_TIN).pattern("III").pattern("III").pattern("III").unlockedBy("has_tin", has(TaloiTags.Items.INGOTS_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.TIN_INGOT.get(), 9).group("tin").requires(TaloiTags.Items.STORAGE_TIN).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_TIN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ingot_from_tin_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_TIN_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_TIN).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_tin", has(TaloiTags.Items.RAW_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_TIN.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_TIN).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_TIN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TIN_INGOT.get(), 1).group("tin").define('N', TaloiTags.Items.NUGGETS_TIN).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_tin_nugget", has(TaloiTags.Items.NUGGETS_TIN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ingot_from_tin_nugget"));

        // TUNGSTEN
        ShapedRecipeBuilder.shaped(TaloiBlocks.TUNGSTEN_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).pattern("III").pattern("III").pattern("III").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.TUNGSTEN_INGOT.get(), 9).group("tungsten").requires(TaloiTags.Items.STORAGE_TUNGSTEN).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_TUNGSTEN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ingot_from_tungsten_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_TUNGSTEN_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_TUNGSTEN).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_tungsten", has(TaloiTags.Items.RAW_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_TUNGSTEN.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_TUNGSTEN).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_INGOT.get(), 1).group("tungsten").define('N', TaloiTags.Items.NUGGETS_TUNGSTEN).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_tungsten_nugget", has(TaloiTags.Items.NUGGETS_TUNGSTEN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ingot_from_tungsten_nugget"));

        // URANIUM
        ShapedRecipeBuilder.shaped(TaloiBlocks.URANIUM_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_URANIUM).pattern("III").pattern("III").pattern("III").unlockedBy("has_uranium", has(TaloiTags.Items.INGOTS_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.REFINED_URANIUM.get(), 9).group("uranium").requires(TaloiTags.Items.STORAGE_URANIUM).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_URANIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "refined_uranium_from_uranium_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_URANIUM_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_URANIUM).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_uranium", has(TaloiTags.Items.RAW_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_URANIUM.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_URANIUM).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_URANIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.REFINED_URANIUM.get(), 1).group("uranium").define('N', TaloiTags.Items.NUGGETS_URANIUM).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_uranium_bit", has(TaloiTags.Items.NUGGETS_URANIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "refined_uranium_from_uranium_bit"));

        // ZINC
        ShapedRecipeBuilder.shaped(TaloiBlocks.ZINC_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_ZINC).pattern("III").pattern("III").pattern("III").unlockedBy("has_zinc", has(TaloiTags.Items.INGOTS_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.ZINC_INGOT.get(), 9).group("zinc").requires(TaloiTags.Items.STORAGE_ZINC).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_ZINC)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ingot_from_zinc_block"));
        ShapedRecipeBuilder.shaped(TaloiBlocks.RAW_ZINC_BLOCK.get(), 1).define('R', TaloiTags.Items.RAW_ZINC).pattern("RRR").pattern("RRR").pattern("RRR").unlockedBy("has_raw_zinc", has(TaloiTags.Items.RAW_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.RAW_ZINC.get(), 9).requires(TaloiTags.Items.RAW_STORAGE_ZINC).unlockedBy("has_raw_storage", has(TaloiTags.Items.RAW_STORAGE_ZINC)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.ZINC_INGOT.get(), 1).group("zinc").define('N', TaloiTags.Items.NUGGETS_ZINC).pattern("NNN").pattern("NNN").pattern("NNN").unlockedBy("has_zinc_nugget", has(TaloiTags.Items.NUGGETS_ZINC)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ingot_from_zinc_nugget"));

        // ALLOYS
        ShapedRecipeBuilder.shaped(TaloiBlocks.BRONZE_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_BRONZE).pattern("III").pattern("III").pattern("III").unlockedBy("has_bronze", has(TaloiTags.Items.INGOTS_BRONZE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.BRONZE_INGOT.get(), 9).requires(TaloiTags.Items.STORAGE_BRONZE).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_BRONZE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "bronze_ingot_from_bronze_block"));

        ShapedRecipeBuilder.shaped(TaloiBlocks.STEEL_BLOCK.get(), 1).define('I', TaloiTags.Items.INGOTS_STEEL).pattern("III").pattern("III").pattern("III").unlockedBy("has_steel", has(TaloiTags.Items.INGOTS_STEEL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.STEEL_INGOT.get(), 9).requires(TaloiTags.Items.STORAGE_STEEL).unlockedBy("has_storage_block", has(TaloiTags.Items.STORAGE_STEEL)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "steel_ingot_from_steel_block"));
        ShapelessRecipeBuilder.shapeless(TaloiItems.STEEL_INGOT.get(), 1).requires(Ingredient.of(Tags.Items.INGOTS_IRON), 2).requires(Items.COAL, 2).unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON)).unlockedBy("has_coal", has(Items.COAL)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiItems.FUTURITE.get(), 1).define('B', TaloiItems.FUTURITE_BIT.get()).pattern("BBB").pattern("BBB").pattern("BBB").unlockedBy("has_futurite_bit", has(TaloiItems.FUTURITE_BIT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_from_futurite_bit"));

        ShapedRecipeBuilder.shaped(TaloiItems.COPPER_PLATE.get(), 1).define('I', Tags.Items.INGOTS_COPPER).pattern("I").pattern("I").pattern("I").unlockedBy("has_copper", has(Tags.Items.INGOTS_COPPER)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.SILICON_PLATE.get(), 1).define('S', TaloiTags.Items.INGOTS_SILICON).pattern("S").pattern("S").pattern("S").unlockedBy("has_silicon", has(TaloiTags.Items.INGOTS_SILICON)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.STEEL_PLATE.get(), 1).define('I', TaloiTags.Items.INGOTS_STEEL).pattern("I").pattern("I").pattern("I").unlockedBy("has_steel", has(TaloiTags.Items.INGOTS_STEEL)).save(consumer);

        // EMERALD TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_SWORD.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("G").pattern("S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_SHOVEL.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("S").pattern("S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_PICKAXE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GGG").pattern(" S ").pattern(" S ").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_AXE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern("GS").pattern(" S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_HOE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern(" S").pattern(" S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);

        // IRIDIUM TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_SWORD.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("I").pattern("S").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_SHOVEL.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("S").pattern("S").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_PICKAXE.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).define('S', Tags.Items.RODS_WOODEN).pattern("III").pattern(" S ").pattern(" S ").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_AXE.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern("IS").pattern(" S").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_HOE.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern(" S").pattern(" S").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);

        // LAPIS TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_SWORD.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("G").pattern("S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_SHOVEL.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("S").pattern("S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_PICKAXE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GGG").pattern(" S ").pattern(" S ").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_AXE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern("GS").pattern(" S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_HOE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern(" S").pattern(" S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);

        // OSMIUM TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_SWORD.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("I").pattern("S").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_SHOVEL.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("S").pattern("S").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_PICKAXE.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).define('S', Tags.Items.RODS_WOODEN).pattern("III").pattern(" S ").pattern(" S ").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_AXE.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern("IS").pattern(" S").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_HOE.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern(" S").pattern(" S").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);

        // PLATINUM TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_SWORD.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("I").pattern("S").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_SHOVEL.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("S").pattern("S").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_PICKAXE.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).define('S', Tags.Items.RODS_WOODEN).pattern("III").pattern(" S ").pattern(" S ").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_AXE.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern("IS").pattern(" S").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_HOE.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern(" S").pattern(" S").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);

        // TUNGSTEN TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_SWORD.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("I").pattern("S").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_SHOVEL.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).define('S', Tags.Items.RODS_WOODEN).pattern("I").pattern("S").pattern("S").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_PICKAXE.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).define('S', Tags.Items.RODS_WOODEN).pattern("III").pattern(" S ").pattern(" S ").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_AXE.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern("IS").pattern(" S").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_HOE.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).define('S', Tags.Items.RODS_WOODEN).pattern("II").pattern(" S").pattern(" S").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);

        // EMERALD ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_HELMET.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("GGG").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_CHESTPLATE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("G G").pattern("GGG").pattern("GGG").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_LEGGINGS.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("GGG").pattern("G G").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_BOOTS.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("G G").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        
        // IRIDIUM ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_HELMET.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).pattern("III").pattern("I I").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_CHESTPLATE.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).pattern("I I").pattern("III").pattern("III").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_LEGGINGS.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).pattern("III").pattern("I I").pattern("I I").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.IRIDIUM_BOOTS.get(), 1).define('I', TaloiTags.Items.INGOTS_IRIDIUM).pattern("I I").pattern("I I").unlockedBy("has_iridium", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);

        // LAPIS ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_HELMET.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("GGG").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_CHESTPLATE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("G G").pattern("GGG").pattern("GGG").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_LEGGINGS.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("GGG").pattern("G G").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_BOOTS.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("G G").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);

        // OSMIUM ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_HELMET.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).pattern("III").pattern("I I").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_CHESTPLATE.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).pattern("I I").pattern("III").pattern("III").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_LEGGINGS.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).pattern("III").pattern("I I").pattern("I I").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.OSMIUM_BOOTS.get(), 1).define('I', TaloiTags.Items.INGOTS_OSMIUM).pattern("I I").pattern("I I").unlockedBy("has_osmium", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);

        // PLATINUM ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_HELMET.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).pattern("III").pattern("I I").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_CHESTPLATE.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).pattern("I I").pattern("III").pattern("III").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_LEGGINGS.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).pattern("III").pattern("I I").pattern("I I").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.PLATINUM_BOOTS.get(), 1).define('I', TaloiTags.Items.INGOTS_PLATINUM).pattern("I I").pattern("I I").unlockedBy("has_platinum", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);

        // TUNGSTEN ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_HELMET.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).pattern("III").pattern("I I").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_CHESTPLATE.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).pattern("I I").pattern("III").pattern("III").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_LEGGINGS.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).pattern("III").pattern("I I").pattern("I I").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.TUNGSTEN_BOOTS.get(), 1).define('I', TaloiTags.Items.INGOTS_TUNGSTEN).pattern("I I").pattern("I I").unlockedBy("has_tungsten", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);


        // NUGGETS
        ShapelessRecipeBuilder.shapeless(TaloiItems.ALUMINUM_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_ALUMINUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.IRIDIUM_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_IRIDIUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.LEAD_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_LEAD).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.MAGNESIUM_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_MAGNESIUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.OSMIUM_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_OSMIUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.PLATINUM_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_PLATINUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.TIN_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_TIN).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.TUNGSTEN_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_TUNGSTEN).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.URANIUM_BIT.get(), 9).requires(TaloiTags.Items.INGOTS_URANIUM).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.ZINC_NUGGET.get(), 9).requires(TaloiTags.Items.INGOTS_ZINC).unlockedBy("has_material", has(TaloiTags.Items.INGOTS_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.FUTURITE_BIT.get(), 9).requires(TaloiItems.FUTURITE.get()).unlockedBy("has_material", has(TaloiItems.FUTURITE.get())).save(consumer);

        // MACHINERY
        ShapedRecipeBuilder.shaped(TaloiItems.ALPHA_MACHINE_FRAME.get(), 1)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .define('G', Tags.Items.GLASS)
                .define('O', Blocks.OBSIDIAN)
                .define('C', TaloiItems.COPPER_PLATE.get())
                .define('S', TaloiItems.STEEL_PLATE.get())
                .pattern("RCR")
                .pattern("SGS")
                .pattern("ROR")
                .unlockedBy("has_copper", has(TaloiItems.COPPER_PLATE.get()))
                .unlockedBy("has_steel", has(TaloiItems.STEEL_PLATE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.BETA_MACHINE_FRAME.get(), 1)
                .define('G', Tags.Items.INGOTS_GOLD)
                .define('O', Blocks.OBSIDIAN)
                .define('C', TaloiItems.REINFORCED_COPPER_PLATE.get())
                .define('A', TaloiItems.ALLOY_PLATE.get())
                .define('M', TaloiItems.ALPHA_MACHINE_FRAME.get())
                .pattern("GCG")
                .pattern("AMA")
                .pattern("GOG")
                .unlockedBy("has_reinforced_copper", has(TaloiItems.REINFORCED_COPPER_PLATE.get()))
                .unlockedBy("has_alloy_plate", has(TaloiItems.ALLOY_PLATE.get()))
                .unlockedBy("has_alpha_machine_frame", has(TaloiItems.ALPHA_MACHINE_FRAME.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.UNSTABLE_MACHINE_FRAME.get(), 1)
                .define('O', Blocks.OBSIDIAN)
                .define('D', TaloiItems.DIAMOND_PLATE.get())
                .define('C', TaloiItems.REINFORCED_COPPER_PLATE.get())
                .define('A', TaloiItems.ALLOY_PLATE.get())
                .define('M', TaloiItems.BETA_MACHINE_FRAME.get())
                .pattern("DCD")
                .pattern("AMA")
                .pattern("DOD")
                .unlockedBy("has_beta_machine_frame", has(TaloiItems.BETA_MACHINE_FRAME.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.ALPHA_CONSTRUCTOR.get(), 1)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .define('B', Tags.Items.SLIMEBALLS)
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('S', TaloiTags.Items.INGOTS_STEEL)
                .define('M', TaloiItems.ALPHA_MACHINE_FRAME.get())
                .define('P', TaloiItems.SILICON_PLATE.get())
                .pattern("RBR")
                .pattern("SMS")
                .pattern("PCP")
                .unlockedBy("has_alpha_machine_frame", has(TaloiItems.ALPHA_MACHINE_FRAME.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BETA_CONSTRUCTOR.get(), 1)
                .define('G', Blocks.GLASS)
                .define('C', TaloiItems.COAL_INFUSED_LEAD_INGOT.get())
                .define('H', TaloiItems.HARDENED_CARBONITE.get())
                .define('M', TaloiItems.BETA_MACHINE_FRAME.get())
                .define('D', TaloiItems.DIAMOND_INFUSED_TIN_INGOT.get())
                .define('A', TaloiBlocks.ALPHA_CONSTRUCTOR.get())
                .pattern("CHC")
                .pattern("GMG")
                .pattern("DAD")
                .unlockedBy("has_beta_machine_frame", has(TaloiItems.BETA_MACHINE_FRAME.get()))
                .unlockedBy("has_alpha_constructor", has(TaloiBlocks.ALPHA_CONSTRUCTOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.UNSTABLE_CONSTRUCTOR.get(), 1)
                .define('I', TaloiItems.INDUCTION_PLATE.get())
                .define('S', TaloiItems.STEEL_PLATE.get())
                .define('T', TaloiItems.TUNGSTEN_PLATE.get())
                .define('M', TaloiItems.UNSTABLE_MACHINE_FRAME.get())
                .define('B', TaloiBlocks.BETA_CONSTRUCTOR.get())
                .pattern("ISI")
                .pattern("TMT")
                .pattern("IBI")
                .unlockedBy("has_unstable_machine_frame", has(TaloiItems.UNSTABLE_MACHINE_FRAME.get()))
                .unlockedBy("has_beta_constructor", has(TaloiBlocks.BETA_CONSTRUCTOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get(), 1)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .define('G', Tags.Items.GLASS)
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('I', Blocks.IRON_BLOCK)
                .define('M', TaloiItems.ALPHA_MACHINE_FRAME.get())
                .define('S', TaloiItems.SILICON_PLATE.get())
                .pattern("RIR")
                .pattern("GMG")
                .pattern("SCS")
                .unlockedBy("has_alpha_machine_frame", has(TaloiItems.ALPHA_MACHINE_FRAME.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BETA_HYDRAULIC_PRESS.get(), 1)
                .define('G', Tags.Items.GLASS)
                .define('C', TaloiItems.COAL_INFUSED_IRON_INGOT.get())
                .define('H', TaloiItems.HARDENED_CARBONITE.get())
                .define('M', TaloiItems.BETA_MACHINE_FRAME.get())
                .define('E', TaloiItems.EMERALD_INFUSED_ZINC_INGOT.get())
                .define('A', TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get())
                .pattern("CHC")
                .pattern("GMG")
                .pattern("EAE")
                .unlockedBy("has_beta_machine_frame", has(TaloiItems.BETA_MACHINE_FRAME.get()))
                .unlockedBy("has_alpha_press", has(TaloiBlocks.ALPHA_HYDRAULIC_PRESS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.UNSTABLE_HYDRAULIC_PRESS.get(), 1)
                .define('E', TaloiItems.EMERALD_INFUSED_OSMIUM_INGOT.get())
                .define('T', TaloiItems.TUNGSTEN_PLATE.get())
                .define('M', TaloiItems.UNSTABLE_MACHINE_FRAME.get())
                .define('S', TaloiItems.SEMICONDUCTOR_PLATE.get())
                .define('B', TaloiBlocks.BETA_HYDRAULIC_PRESS.get())
                .pattern("ETE")
                .pattern("TMT")
                .pattern("SBS")
                .unlockedBy("has_unstable_machine_frame", has(TaloiItems.UNSTABLE_MACHINE_FRAME.get()))
                .unlockedBy("has_beta_press", has(TaloiBlocks.BETA_HYDRAULIC_PRESS.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.ALPHA_PROCESSOR.get(), 1)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .define('C', Tags.Items.STORAGE_BLOCKS_COAL)
                .define('I', Tags.Items.INGOTS_COPPER)
                .define('B', Items.BLAZE_POWDER)
                .define('M', TaloiItems.ALPHA_MACHINE_FRAME.get())
                .define('S', TaloiItems.SILICON_PLATE.get())
                .pattern("RCR")
                .pattern("BMB")
                .pattern("SIS")
                .unlockedBy("has_alpha_machine_frame", has(TaloiItems.ALPHA_MACHINE_FRAME.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BETA_PROCESSOR.get(), 1)
                .define('G', Tags.Items.GLASS)
                .define('E', TaloiItems.EMERALD_INFUSED_OSMIUM_INGOT.get())
                .define('H', TaloiItems.HARDENED_CARBONITE.get())
                .define('M', TaloiItems.BETA_MACHINE_FRAME.get())
                .define('D', TaloiItems.DIAMOND_INFUSED_URANIUM.get())
                .define('A', TaloiBlocks.ALPHA_PROCESSOR.get())
                .pattern("EHE")
                .pattern("GMG")
                .pattern("DAD")
                .unlockedBy("has_beta_machine_frame", has(TaloiItems.BETA_MACHINE_FRAME.get()))
                .unlockedBy("has_alpha_processor", has(TaloiBlocks.ALPHA_PROCESSOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.UNSTABLE_PROCESSOR.get(), 1)
                .define('I', TaloiItems.INDUCTION_PLATE.get())
                .define('S', TaloiItems.SERMIUM_PLATE.get())
                .define('T', TaloiItems.TUNGSTEN_PLATE.get())
                .define('M', TaloiItems.UNSTABLE_MACHINE_FRAME.get())
                .define('F', TaloiItems.FORGE_PLATE.get())
                .define('B', TaloiBlocks.BETA_PROCESSOR.get())
                .pattern("ISI")
                .pattern("TMT")
                .pattern("FBF")
                .unlockedBy("has_unstable_machine_frame", has(TaloiItems.UNSTABLE_MACHINE_FRAME.get()))
                .unlockedBy("has_beta_processor", has(TaloiBlocks.BETA_PROCESSOR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.ALPHA_SEPARATOR.get(), 1)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .define('G', Tags.Items.GLASS)
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('I', Items.IRON_PICKAXE)
                .define('M', TaloiItems.ALPHA_MACHINE_FRAME.get())
                .define('S', TaloiItems.SILICON_PLATE.get())
                .pattern("RIR")
                .pattern("GMG")
                .pattern("SCS")
                .unlockedBy("has_alpha_machine_frame", has(TaloiItems.ALPHA_MACHINE_FRAME.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BETA_SEPARATOR.get(), 1)
                .define('G', Tags.Items.GLASS)
                .define('D', TaloiItems.DIAMOND_INFUSED_STEEL_INGOT.get())
                .define('H', TaloiItems.HARDENED_CARBONITE.get())
                .define('M', TaloiItems.BETA_MACHINE_FRAME.get())
                .define('U', TaloiItems.DIAMOND_INFUSED_URANIUM.get())
                .define('A', TaloiBlocks.ALPHA_SEPARATOR.get())
                .pattern("DHD")
                .pattern("GMG")
                .pattern("UAU")
                .unlockedBy("has_beta_machine_frame", has(TaloiItems.BETA_MACHINE_FRAME.get()))
                .unlockedBy("has_alpha_separator", has(TaloiBlocks.ALPHA_SEPARATOR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.UNSTABLE_SEPARATOR.get(), 1)
                .define('I', TaloiItems.INDUCTION_PLATE.get())
                .define('S', TaloiItems.SERMIUM_PLATE.get())
                .define('T', TaloiItems.TUNGSTEN_PLATE.get())
                .define('M', TaloiItems.UNSTABLE_MACHINE_FRAME.get())
                .define('F', TaloiItems.FORGE_PLATE.get())
                .define('B', TaloiBlocks.BETA_SEPARATOR.get())
                .pattern("ISI")
                .pattern("TMT")
                .pattern("FBF")
                .unlockedBy("has_unstable_machine_frame", has(TaloiItems.UNSTABLE_MACHINE_FRAME.get()))
                .unlockedBy("has_beta_separator", has(TaloiBlocks.BETA_SEPARATOR.get())).save(consumer);

        // FOOD
        ShapelessRecipeBuilder.shapeless(TaloiItems.APPLE_PIE.get())
                .requires(Items.APPLE)
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .unlockedBy("has_apple", has(Items.APPLE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.BLUEBERRY_PIE.get())
                .requires(TaloiItems.BLUEBERRIES.get())
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .unlockedBy("has_blueberry", has(TaloiItems.BLUEBERRIES.get())).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.DIAMOND_APPLE.get(), 1)
                .define('D', Tags.Items.GEMS_DIAMOND)
                .define('G', Items.GOLDEN_APPLE)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .unlockedBy("has_diamond", has(Tags.Items.GEMS_DIAMOND))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.FUTURITE_APPLE.get(), 1)
                .define('F', TaloiItems.FUTURITE_BIT.get())
                .define('D', TaloiItems.DIAMOND_APPLE.get())
                .pattern("FFF")
                .pattern("FDF")
                .pattern("FFF")
                .unlockedBy("has_futurite_bit", has(TaloiItems.FUTURITE_BIT.get()))
                .unlockedBy("has_diamond_apple", has(TaloiItems.DIAMOND_APPLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_apple_from_diamond_apple"));
        ShapelessRecipeBuilder.shapeless(TaloiItems.FUTURITE_APPLE.get(), 1)
                .requires(TaloiItems.DESTABILIZED_FUTURITE_APPLE.get())
                .requires(TaloiItems.FUTURITE_BIT.get(), 3)
                .unlockedBy("has_destabilized_apple", has(TaloiItems.DESTABILIZED_FUTURITE_APPLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_apple_from_destabilized_futurite_apple"));
        ShapelessRecipeBuilder.shapeless(TaloiItems.RICE_BOWL.get(), 1)
                .requires(Items.BOWL)
                .requires(Ingredient.of(Tags.Items.CROPS_WHEAT), 3)
                .unlockedBy("has_bowl", has(Items.BOWL))
                .unlockedBy("has_wheat", has(Tags.Items.CROPS_WHEAT)).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.SWEET_BERRY_PIE.get())
                .requires(Items.SWEET_BERRIES)
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .unlockedBy("has_sweet_berry", has(Items.SWEET_BERRIES)).save(consumer);

        // VANILLA
        ShapedRecipeBuilder.shaped(TaloiBlocks.OAK_WOOD_SLAB.get(), 6).define('W', Blocks.OAK_WOOD).pattern("WWW").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.OAK_WOOD_STAIRS.get(), 4).define('W', Blocks.OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_oak_wood", has(Blocks.OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SPRUCE_WOOD_SLAB.get(), 6).define('W', Blocks.SPRUCE_WOOD).pattern("WWW").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.SPRUCE_WOOD_STAIRS.get(), 4).define('W', Blocks.SPRUCE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_spruce_wood", has(Blocks.SPRUCE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BIRCH_WOOD_SLAB.get(), 6).define('W', Blocks.BIRCH_WOOD).pattern("WWW").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BIRCH_WOOD_STAIRS.get(), 4).define('W', Blocks.BIRCH_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_birch_wood", has(Blocks.BIRCH_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.JUNGLE_WOOD_SLAB.get(), 6).define('W', Blocks.JUNGLE_WOOD).pattern("WWW").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.JUNGLE_WOOD_STAIRS.get(), 4).define('W', Blocks.JUNGLE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_jungle_wood", has(Blocks.JUNGLE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ACACIA_WOOD_SLAB.get(), 6).define('W', Blocks.ACACIA_WOOD).pattern("WWW").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ACACIA_WOOD_STAIRS.get(), 4).define('W', Blocks.ACACIA_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_acacia_wood", has(Blocks.ACACIA_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.DARK_OAK_WOOD_SLAB.get(), 6).define('W', Blocks.DARK_OAK_WOOD).pattern("WWW").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.DARK_OAK_WOOD_STAIRS.get(), 4).define('W', Blocks.DARK_OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_dark_oak_wood", has(Blocks.DARK_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CRIMSON_HYPHAE_SLAB.get(), 6).define('H', Blocks.CRIMSON_HYPHAE).pattern("HHH").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CRIMSON_HYPHAE_STAIRS.get(), 4).define('H', Blocks.CRIMSON_HYPHAE).pattern("H  ").pattern("HH ").pattern("HHH").unlockedBy("has_crimson_hyphae", has(Blocks.CRIMSON_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WARPED_HYPHAE_SLAB.get(), 6).define('H', Blocks.WARPED_HYPHAE).pattern("HHH").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WARPED_HYPHAE_STAIRS.get(), 4).define('H', Blocks.WARPED_HYPHAE).pattern("H  ").pattern("HH ").pattern("HHH").unlockedBy("has_warped_hyphae", has(Blocks.WARPED_HYPHAE)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_OAK_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_OAK_WOOD).pattern("WWW").unlockedBy("has_stripped_oak_wood", has(Blocks.STRIPPED_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_oak_wood", has(Blocks.STRIPPED_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_SPRUCE_WOOD).pattern("WWW").unlockedBy("has_stripped_spruce_wood", has(Blocks.STRIPPED_SPRUCE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_SPRUCE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_spruce_wood", has(Blocks.STRIPPED_SPRUCE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_BIRCH_WOOD).pattern("WWW").unlockedBy("has_stripped_birch_wood", has(Blocks.STRIPPED_BIRCH_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_BIRCH_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_birch_wood", has(Blocks.STRIPPED_BIRCH_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_JUNGLE_WOOD).pattern("WWW").unlockedBy("has_stripped_jungle_wood", has(Blocks.STRIPPED_JUNGLE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_JUNGLE_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_jungle_wood", has(Blocks.STRIPPED_JUNGLE_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_ACACIA_WOOD).pattern("WWW").unlockedBy("has_stripped_acacia_wood", has(Blocks.STRIPPED_ACACIA_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_ACACIA_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_acacia_wood", has(Blocks.STRIPPED_ACACIA_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), 6).define('W', Blocks.STRIPPED_DARK_OAK_WOOD).pattern("WWW").unlockedBy("has_stripped_dark_oak_wood", has(Blocks.STRIPPED_DARK_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), 4).define('W', Blocks.STRIPPED_DARK_OAK_WOOD).pattern("W  ").pattern("WW ").pattern("WWW").unlockedBy("has_stripped_dark_oak_wood", has(Blocks.STRIPPED_DARK_OAK_WOOD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), 6).define('H', Blocks.STRIPPED_CRIMSON_HYPHAE).pattern("HHH").unlockedBy("has_stripped_crimson_hyphae", has(Blocks.STRIPPED_CRIMSON_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), 4).define('H', Blocks.STRIPPED_CRIMSON_HYPHAE).pattern("H  ").pattern("HH ").pattern("HHH").unlockedBy("has_stripped_crimson_hyphae", has(Blocks.STRIPPED_CRIMSON_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), 6).define('H', Blocks.STRIPPED_WARPED_HYPHAE).pattern("HHH").unlockedBy("has_stripped_warped_hyphae", has(Blocks.STRIPPED_WARPED_HYPHAE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), 4).define('H', Blocks.STRIPPED_WARPED_HYPHAE).pattern("H  ").pattern("HH ").pattern("HHH").unlockedBy("has_stripped_warped_hyphae", has(Blocks.STRIPPED_WARPED_HYPHAE)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.WHITE_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.WHITE_TERRACOTTA).pattern("TTT").unlockedBy("has_white_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WHITE_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.WHITE_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_white_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ORANGE_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.ORANGE_TERRACOTTA).pattern("TTT").unlockedBy("has_orange_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ORANGE_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.ORANGE_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_orange_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MAGENTA_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.MAGENTA_TERRACOTTA).pattern("TTT").unlockedBy("has_magenta_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.MAGENTA_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_magenta_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.LIGHT_BLUE_TERRACOTTA).pattern("TTT").unlockedBy("has_light_blue_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.LIGHT_BLUE_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_light_blue_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.YELLOW_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.YELLOW_TERRACOTTA).pattern("TTT").unlockedBy("has_yellow_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.YELLOW_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.YELLOW_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_yellow_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIME_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.LIME_TERRACOTTA).pattern("TTT").unlockedBy("has_lime_terracotta", has(Blocks.LIME_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIME_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.LIME_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_lime_terracotta", has(Blocks.LIME_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PINK_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.PINK_TERRACOTTA).pattern("TTT").unlockedBy("has_pink_terracotta", has(Blocks.PINK_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PINK_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.PINK_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_pink_terracotta", has(Blocks.PINK_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GRAY_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.GRAY_TERRACOTTA).pattern("TTT").unlockedBy("has_gray_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GRAY_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.GRAY_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_gray_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.LIGHT_GRAY_TERRACOTTA).pattern("TTT").unlockedBy("has_light_gray_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.LIGHT_GRAY_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_light_gray_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CYAN_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.CYAN_TERRACOTTA).pattern("TTT").unlockedBy("has_cyan_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CYAN_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.CYAN_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_cyan_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PURPLE_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.PURPLE_TERRACOTTA).pattern("TTT").unlockedBy("has_purple_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PURPLE_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.PURPLE_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_purple_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLUE_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.BLUE_TERRACOTTA).pattern("TTT").unlockedBy("has_blue_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLUE_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.BLUE_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_blue_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BROWN_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.BROWN_TERRACOTTA).pattern("TTT").unlockedBy("has_brown_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BROWN_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.BROWN_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_brown_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GREEN_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.GREEN_TERRACOTTA).pattern("TTT").unlockedBy("has_green_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GREEN_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.GREEN_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_green_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.RED_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.RED_TERRACOTTA).pattern("TTT").unlockedBy("has_red_terracotta", has(Blocks.RED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.RED_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.RED_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_red_terracotta", has(Blocks.RED_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLACK_TERRACOTTA_SLAB.get(), 6).define('T', Blocks.BLACK_TERRACOTTA).pattern("TTT").unlockedBy("has_black_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLACK_TERRACOTTA_STAIRS.get(), 4).define('T', Blocks.BLACK_TERRACOTTA).pattern("T  ").pattern("TT ").pattern("TTT").unlockedBy("has_black_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiBlocks.WHITE_CONCRETE_SLAB.get(), 6).define('C', Blocks.WHITE_CONCRETE).pattern("CCC").unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.WHITE_CONCRETE_STAIRS.get(), 4).define('C', Blocks.WHITE_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ORANGE_CONCRETE_SLAB.get(), 6).define('C', Blocks.ORANGE_CONCRETE).pattern("CCC").unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.ORANGE_CONCRETE_STAIRS.get(), 4).define('C', Blocks.ORANGE_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MAGENTA_CONCRETE_SLAB.get(), 6).define('C', Blocks.MAGENTA_CONCRETE).pattern("CCC").unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.MAGENTA_CONCRETE_STAIRS.get(), 4).define('C', Blocks.MAGENTA_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), 6).define('C', Blocks.LIGHT_BLUE_CONCRETE).pattern("CCC").unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), 4).define('C', Blocks.LIGHT_BLUE_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.YELLOW_CONCRETE_SLAB.get(), 6).define('C', Blocks.YELLOW_CONCRETE).pattern("CCC").unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.YELLOW_CONCRETE_STAIRS.get(), 4).define('C', Blocks.YELLOW_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIME_CONCRETE_SLAB.get(), 6).define('C', Blocks.LIME_CONCRETE).pattern("CCC").unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIME_CONCRETE_STAIRS.get(), 4).define('C', Blocks.LIME_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PINK_CONCRETE_SLAB.get(), 6).define('C', Blocks.PINK_CONCRETE).pattern("CCC").unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PINK_CONCRETE_STAIRS.get(), 4).define('C', Blocks.PINK_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GRAY_CONCRETE_SLAB.get(), 6).define('C', Blocks.GRAY_CONCRETE).pattern("CCC").unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GRAY_CONCRETE_STAIRS.get(), 4).define('C', Blocks.GRAY_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), 6).define('C', Blocks.LIGHT_GRAY_CONCRETE).pattern("CCC").unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), 4).define('C', Blocks.LIGHT_GRAY_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CYAN_CONCRETE_SLAB.get(), 6).define('C', Blocks.CYAN_CONCRETE).pattern("CCC").unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.CYAN_CONCRETE_STAIRS.get(), 4).define('C', Blocks.CYAN_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PURPLE_CONCRETE_SLAB.get(), 6).define('C', Blocks.PURPLE_CONCRETE).pattern("CCC").unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.PURPLE_CONCRETE_STAIRS.get(), 4).define('C', Blocks.PURPLE_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLUE_CONCRETE_SLAB.get(), 6).define('C', Blocks.BLUE_CONCRETE).pattern("CCC").unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLUE_CONCRETE_STAIRS.get(), 4).define('C', Blocks.BLUE_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BROWN_CONCRETE_SLAB.get(), 6).define('C', Blocks.BROWN_CONCRETE).pattern("CCC").unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BROWN_CONCRETE_STAIRS.get(), 4).define('C', Blocks.BROWN_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GREEN_CONCRETE_SLAB.get(), 6).define('C', Blocks.GREEN_CONCRETE).pattern("CCC").unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.GREEN_CONCRETE_STAIRS.get(), 4).define('C', Blocks.GREEN_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.RED_CONCRETE_SLAB.get(), 6).define('C', Blocks.RED_CONCRETE).pattern("CCC").unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.RED_CONCRETE_STAIRS.get(), 4).define('C', Blocks.RED_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLACK_CONCRETE_SLAB.get(), 6).define('C', Blocks.BLACK_CONCRETE).pattern("CCC").unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiBlocks.BLACK_CONCRETE_STAIRS.get(), 4).define('C', Blocks.BLACK_CONCRETE).pattern("C  ").pattern("CC ").pattern("CCC").unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE)).save(consumer);

        // MISCELLANEOUS
        ShapelessRecipeBuilder.shapeless(Items.RED_DYE, 1).requires(Items.SWEET_BERRIES).unlockedBy("has_sweet_berry", has(Items.SWEET_BERRIES)).save(consumer, "red_dye_from_sweet_berries");
        ShapelessRecipeBuilder.shapeless(Items.BLUE_DYE, 1).requires(TaloiItems.BLUEBERRIES.get()).unlockedBy("has_blueberry", has(TaloiItems.BLUEBERRIES.get())).save(consumer, "blue_dye_from_blueberries");

        ShapedRecipeBuilder.shaped(TaloiItems.SERMIUM_CORE.get(), 2)
                .define('C', Items.COAL)
                .define('S', TaloiItems.SERMIUM.get())
                .pattern("C")
                .pattern("S")
                .pattern("C")
                .unlockedBy("has_sermium", has(TaloiItems.SERMIUM.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(TaloiItems.SERMIUM_OXIDE.get(), 2)
                .requires(Tags.Items.INGOTS_IRON)
                .requires(TaloiItems.SERMIUM_CORE.get())
                .unlockedBy("has_sermium_core", has(TaloiItems.SERMIUM_CORE.get())).save(consumer);
    }

    @Override
    public String getName() {
        return "Crafting Recipes";
    }
}
