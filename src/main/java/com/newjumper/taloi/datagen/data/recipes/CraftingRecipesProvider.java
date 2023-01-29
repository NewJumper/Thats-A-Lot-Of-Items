package com.newjumper.taloi.datagen.data.recipes;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CraftingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public CraftingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        // WOODS
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

        // TOOLS
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_SWORD.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("G").pattern("S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_SHOVEL.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("S").pattern("S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_PICKAXE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GGG").pattern(" S ").pattern(" S ").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_AXE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern("GS").pattern(" S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_HOE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern(" S").pattern(" S").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_SWORD.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("G").pattern("S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_SHOVEL.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("G").pattern("S").pattern("S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_PICKAXE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GGG").pattern(" S ").pattern(" S ").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_AXE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern("GS").pattern(" S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_HOE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).define('S', Tags.Items.RODS_WOODEN).pattern("GG").pattern(" S").pattern(" S").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);

        // ARMOR
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_HELMET.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("GGG").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_CHESTPLATE.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("G G").pattern("GGG").pattern("GGG").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_LEGGINGS.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("GGG").pattern("G G").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.EMERALD_BOOTS.get(), 1).define('G', Tags.Items.GEMS_EMERALD).pattern("G G").pattern("G G").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);

        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_HELMET.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("GGG").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_CHESTPLATE.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("G G").pattern("GGG").pattern("GGG").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_LEGGINGS.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("GGG").pattern("G G").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);
        ShapedRecipeBuilder.shaped(TaloiItems.LAPIS_BOOTS.get(), 1).define('G', Tags.Items.GEMS_LAPIS).pattern("G G").pattern("G G").unlockedBy("has_lapis", has(Tags.Items.GEMS_LAPIS)).save(consumer);

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
    }

    @Override
    public @NotNull String getName() {
        return "Crafting Recipes";
    }
}
