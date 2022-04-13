package com.newjumper.taloi.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class CraftingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public CraftingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // >>>>>>>>>>>>>>> REPLACE ALL ORE BLOCKS WITH TAGS <<<<<<<<<<<<<<<

        // EVERGREEN
        ShapedRecipeBuilder.shaped(ModBlocks.EVERGREEN_WOOD.get(), 3)
                .define('E', ModBlocks.EVERGREEN_LOG.get())
                .pattern("EE")
                .pattern("EE")
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_EVERGREEN_WOOD.get(), 3)
                .define('E', ModBlocks.STRIPPED_EVERGREEN_LOG.get())
                .pattern("EE")
                .pattern("EE")
                .unlockedBy("has_material", has(ModBlocks.STRIPPED_EVERGREEN_LOG.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.EVERGREEN_PLANKS.get(), 4)
                .requires(ModBlocks.EVERGREEN_LOG.get())
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EVERGREEN_SLAB.get(), 6)
                .define('E', ModBlocks.EVERGREEN_PLANKS.get())
                .pattern("EEE")
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EVERGREEN_STAIRS.get(), 4)
                .define('E', ModBlocks.EVERGREEN_PLANKS.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EVERGREEN_FENCE.get(), 3)
                .define('E', ModBlocks.EVERGREEN_PLANKS.get())
                .define('S', Items.STICK)
                .pattern("ESE")
                .pattern("ESE")
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EVERGREEN_FENCE_GATE.get(), 1)
                .define('E', ModBlocks.EVERGREEN_PLANKS.get())
                .define('S', Items.STICK)
                .pattern("SES")
                .pattern("SES")
                .unlockedBy("has_material", has(ModBlocks.EVERGREEN_PLANKS.get())).save(consumer);

        // WILLOW
        ShapedRecipeBuilder.shaped(ModBlocks.WILLOW_WOOD.get(), 3)
                .define('W', ModBlocks.WILLOW_LOG.get())
                .pattern("WW")
                .pattern("WW")
                .unlockedBy("has_material", has(ModBlocks.WILLOW_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.STRIPPED_WILLOW_WOOD.get(), 3)
                .define('W', ModBlocks.STRIPPED_WILLOW_LOG.get())
                .pattern("WW")
                .pattern("WW")
                .unlockedBy("has_material", has(ModBlocks.STRIPPED_WILLOW_LOG.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.WILLOW_LOG.get())
                .unlockedBy("has_material", has(ModBlocks.WILLOW_LOG.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WILLOW_SLAB.get(), 6)
                .define('W', ModBlocks.WILLOW_PLANKS.get())
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WILLOW_STAIRS.get(), 4)
                .define('W', ModBlocks.WILLOW_PLANKS.get())
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WILLOW_FENCE.get(), 3)
                .define('W', ModBlocks.WILLOW_PLANKS.get())
                .define('S', Items.STICK)
                .pattern("WSW")
                .pattern("WSW")
                .unlockedBy("has_material", has(ModBlocks.WILLOW_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WILLOW_FENCE_GATE.get(), 1)
                .define('W', ModBlocks.WILLOW_PLANKS.get())
                .define('S', Items.STICK)
                .pattern("SWS")
                .pattern("SWS")
                .unlockedBy("has_material", has(ModBlocks.WILLOW_PLANKS.get())).save(consumer);

        // NATURAL
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SLAB.get(), 6)
                .define('W', ModBlocks.LIMESTONE.get())
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_STAIRS.get(), 4)
                .define('W', ModBlocks.LIMESTONE.get())
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_WALL.get(), 6)
                .define('W', ModBlocks.LIMESTONE.get())
                .pattern("WWW")
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.LIMESTONE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MARBLE_SLAB.get(), 6)
                .define('W', ModBlocks.MARBLE.get())
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MARBLE_STAIRS.get(), 4)
                .define('W', ModBlocks.MARBLE.get())
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MARBLE_WALL.get(), 6)
                .define('W', ModBlocks.MARBLE.get())
                .pattern("WWW")
                .pattern("WWW")
                .unlockedBy("has_material", has(ModBlocks.MARBLE.get())).save(consumer);

        // ALUMINUM
        ShapedRecipeBuilder.shaped(ModBlocks.ALUMINUM_BLOCK.get(), 1)
                .define('A', ModTags.Items.INGOT_ALUMINUM)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ALUMINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ingot_from_aluminum_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_ALUMINUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_ALUMINUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_ALUMINUM.get(), 9)
                .requires(ModBlocks.RAW_ALUMINUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_ALUMINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_ALUMINUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ALUMINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ingot_from_aluminum_nugget"));

        // IRIDIUM
        ShapedRecipeBuilder.shaped(ModBlocks.IRIDIUM_BLOCK.get(), 1)
                .define('I', ModTags.Items.INGOT_IRIDIUM)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.IRIDIUM_INGOT.get(), 9)
                .requires(ModBlocks.IRIDIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ingot_from_iridium_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_IRIDIUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_IRIDIUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_IRIDIUM.get(), 9)
                .requires(ModBlocks.RAW_IRIDIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_IRIDIUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ingot_from_iridium_nugget"));

        // LEAD
        ShapedRecipeBuilder.shaped(ModBlocks.LEAD_BLOCK.get(), 1)
                .define('L', ModTags.Items.INGOT_LEAD)
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_LEAD)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ingot_from_lead_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_LEAD_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_LEAD)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_LEAD.get(), 9)
                .requires(ModBlocks.RAW_LEAD_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_LEAD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.LEAD_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_LEAD)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_LEAD)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ingot_from_lead_nugget"));

        // MAGNESIUM
        ShapedRecipeBuilder.shaped(ModBlocks.MAGNESIUM_BLOCK.get(), 1)
                .define('M', ModTags.Items.INGOT_MAGNESIUM)
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.MAGNESIUM_INGOT.get(), 9)
                .requires(ModBlocks.MAGNESIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_MAGNESIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ingot_from_magnesium_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_MAGNESIUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_MAGNESIUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_MAGNESIUM.get(), 9)
                .requires(ModBlocks.RAW_MAGNESIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_MAGNESIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.MAGNESIUM_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_MAGNESIUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_MAGNESIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ingot_from_magnesium_nugget"));

        // OSMIUM
        ShapedRecipeBuilder.shaped(ModBlocks.OSMIUM_BLOCK.get(), 1)
                .define('O', ModTags.Items.INGOT_OSMIUM)
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.OSMIUM_INGOT.get(), 9)
                .requires(ModBlocks.OSMIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ingot_from_osmium_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_OSMIUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_OSMIUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_OSMIUM.get(), 9)
                .requires(ModBlocks.RAW_OSMIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_OSMIUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ingot_from_osmium_nugget"));

        // PLATINUM
        ShapedRecipeBuilder.shaped(ModBlocks.PLATINUM_BLOCK.get(), 1)
                .define('P', ModTags.Items.INGOT_PLATINUM)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ingot_from_platinum_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_PLATINUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_PLATINUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_PLATINUM.get(), 9)
                .requires(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_PLATINUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ingot_from_platinum_nugget"));

        // SILICON
        ShapedRecipeBuilder.shaped(ModBlocks.SILICON_BLOCK.get(), 1)
                .define('S', ModTags.Items.INGOT_SILICON)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_SILICON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.SILICON.get(), 9)
                .requires(ModBlocks.SILICON_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_SILICON)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "silicon_from_silicon_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_SILICON_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_SILICON)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_SILICON)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_SILICON.get(), 9)
                .requires(ModBlocks.RAW_SILICON_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_SILICON)).save(consumer);

        // TIN
        ShapedRecipeBuilder.shaped(ModBlocks.TIN_BLOCK.get(), 1)
                .define('T', ModTags.Items.INGOT_TIN)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TIN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ingot_from_tin_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_TIN_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_TIN)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_TIN.get(), 9)
                .requires(ModBlocks.RAW_TIN_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_TIN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TIN_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_TIN)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TIN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ingot_from_tin_nugget"));

        // TUNGSTEN
        ShapedRecipeBuilder.shaped(ModBlocks.TUNGSTEN_BLOCK.get(), 1)
                .define('T', ModTags.Items.INGOT_TUNGSTEN)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.TUNGSTEN_INGOT.get(), 9)
                .requires(ModBlocks.TUNGSTEN_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ingot_from_tungsten_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_TUNGSTEN_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_TUNGSTEN)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_TUNGSTEN.get(), 9)
                .requires(ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_TUNGSTEN)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ingot_from_tungsten_nugget"));

        // URANIUM
        ShapedRecipeBuilder.shaped(ModBlocks.URANIUM_BLOCK.get(), 1)
                .define('U', ModTags.Items.INGOT_URANIUM)
                .pattern("UUU")
                .pattern("UUU")
                .pattern("UUU")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.REFINED_URANIUM.get(), 9)
                .requires(ModBlocks.URANIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_URANIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "refined_uranium_from_uranium_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_URANIUM_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_URANIUM)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_URANIUM.get(), 9)
                .requires(ModBlocks.RAW_URANIUM_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_URANIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.REFINED_URANIUM.get(), 1)
                .define('#', ModTags.Items.NUGGET_URANIUM)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_URANIUM)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "refined_uranium_from_uranium_bit"));

        // ZINC
        ShapedRecipeBuilder.shaped(ModBlocks.ZINC_BLOCK.get(), 1)
                .define('Z', ModTags.Items.INGOT_ZINC)
                .pattern("ZZZ")
                .pattern("ZZZ")
                .pattern("ZZZ")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ZINC_INGOT.get(), 9)
                .requires(ModBlocks.ZINC_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ZINC)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ingot_from_zinc_block"));
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_ZINC_BLOCK.get(), 1)
                .define('R', ModTags.Items.RAW_ZINC)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_material", has(ModTags.Items.RAW_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_ZINC.get(), 9)
                .requires(ModBlocks.RAW_ZINC_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.RAW_ZINC)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ZINC_INGOT.get(), 1)
                .define('#', ModTags.Items.NUGGET_ZINC)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ZINC)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ingot_from_zinc_nugget"));

        // BRONZE
        ShapedRecipeBuilder.shaped(ModBlocks.BRONZE_BLOCK.get(), 1)
                .define('B', ModTags.Items.INGOT_BRONZE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_material", has(ModItems.BRONZE_INGOT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_BRONZE)).save(consumer);

        // STEEL
        ShapedRecipeBuilder.shaped(ModBlocks.STEEL_BLOCK.get(), 1)
                .define('S', ModTags.Items.INGOT_STEEL)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_material", has(ModItems.STEEL_INGOT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy("has_material", has(ModTags.Items.INGOT_STEEL)).save(consumer);

        // IRIDIUM TOOLS
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_SWORD.get(), 1)
                .define('X', ModTags.Items.INGOT_IRIDIUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_SHOVEL.get(), 1)
                .define('X', ModTags.Items.INGOT_IRIDIUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_PICKAXE.get(), 1)
                .define('X', ModTags.Items.INGOT_IRIDIUM)
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_AXE.get(), 1)
                .define('X', ModTags.Items.INGOT_IRIDIUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_HOE.get(), 1)
                .define('X', ModTags.Items.INGOT_IRIDIUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);

        // OSMIUM TOOLS
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_SWORD.get(), 1)
                .define('X', ModTags.Items.INGOT_OSMIUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_SHOVEL.get(), 1)
                .define('X', ModTags.Items.INGOT_OSMIUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_PICKAXE.get(), 1)
                .define('X', ModTags.Items.INGOT_OSMIUM)
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_AXE.get(), 1)
                .define('X', ModTags.Items.INGOT_OSMIUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_HOE.get(), 1)
                .define('X', ModTags.Items.INGOT_OSMIUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);

        // PLATINUM TOOLS
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_SWORD.get(), 1)
                .define('X', ModTags.Items.INGOT_PLATINUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_SHOVEL.get(), 1)
                .define('X', ModTags.Items.INGOT_PLATINUM)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_PICKAXE.get(), 1)
                .define('X', ModTags.Items.INGOT_PLATINUM)
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_AXE.get(), 1)
                .define('X', ModTags.Items.INGOT_PLATINUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_HOE.get(), 1)
                .define('X', ModTags.Items.INGOT_PLATINUM)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);

        // TUNGSTEN TOOLS
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_SWORD.get(), 1)
                .define('X', ModTags.Items.INGOT_TUNGSTEN)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_SHOVEL.get(), 1)
                .define('X', ModTags.Items.INGOT_TUNGSTEN)
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_PICKAXE.get(), 1)
                .define('X', ModTags.Items.INGOT_TUNGSTEN)
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_AXE.get(), 1)
                .define('X', ModTags.Items.INGOT_TUNGSTEN)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_HOE.get(), 1)
                .define('X', ModTags.Items.INGOT_TUNGSTEN)
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);

        // FUTURITE TOOLS
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_SWORD.get(), 1)
                .define('X', ModItems.FUTURITE.get())
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_SHOVEL.get(), 1)
                .define('X', ModItems.FUTURITE.get())
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_PICKAXE.get(), 1)
                .define('X', ModItems.FUTURITE.get())
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_AXE.get(), 1)
                .define('X', ModItems.FUTURITE.get())
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);

        // SERMIUM TOOLS
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_SWORD.get(), 1)
                .define('X', ModItems.SERMIUM.get())
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_SHOVEL.get(), 1)
                .define('X', ModItems.SERMIUM.get())
                .define('#', Items.STICK)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_PICKAXE.get(), 1)
                .define('X', ModItems.SERMIUM.get())
                .define('#', Items.STICK)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_AXE.get(), 1)
                .define('X', ModItems.SERMIUM.get())
                .define('#', Items.STICK)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        
        // IRIDIUM ARMOR
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_HELMET.get(), 1)
                .define('A', ModTags.Items.INGOT_IRIDIUM)
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_CHESTPLATE.get(), 1)
                .define('A', ModTags.Items.INGOT_IRIDIUM)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_LEGGINGS.get(), 1)
                .define('A', ModTags.Items.INGOT_IRIDIUM)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.IRIDIUM_BOOTS.get(), 1)
                .define('A', ModTags.Items.INGOT_IRIDIUM)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);

        // OSMIUM ARMOR
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_HELMET.get(), 1)
                .define('A', ModTags.Items.INGOT_OSMIUM)
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_CHESTPLATE.get(), 1)
                .define('A', ModTags.Items.INGOT_OSMIUM)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_LEGGINGS.get(), 1)
                .define('A', ModTags.Items.INGOT_OSMIUM)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.OSMIUM_BOOTS.get(), 1)
                .define('A', ModTags.Items.INGOT_OSMIUM)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);

        // PLATINUM ARMOR
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_HELMET.get(), 1)
                .define('A', ModTags.Items.INGOT_PLATINUM)
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_CHESTPLATE.get(), 1)
                .define('A', ModTags.Items.INGOT_PLATINUM)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_LEGGINGS.get(), 1)
                .define('A', ModTags.Items.INGOT_PLATINUM)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PLATINUM_BOOTS.get(), 1)
                .define('A', ModTags.Items.INGOT_PLATINUM)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);

        // TUNGSTEN ARMOR
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_HELMET.get(), 1)
                .define('A', ModTags.Items.INGOT_TUNGSTEN)
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_CHESTPLATE.get(), 1)
                .define('A', ModTags.Items.INGOT_TUNGSTEN)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_LEGGINGS.get(), 1)
                .define('A', ModTags.Items.INGOT_TUNGSTEN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TUNGSTEN_BOOTS.get(), 1)
                .define('A', ModTags.Items.INGOT_TUNGSTEN)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);

        // FUTURITE ARMOR
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_HELMET.get(), 1)
                .define('A', ModItems.FUTURITE.get())
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_CHESTPLATE.get(), 1)
                .define('A', ModItems.FUTURITE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_LEGGINGS.get(), 1)
                .define('A', ModItems.FUTURITE.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_BOOTS.get(), 1)
                .define('A', ModItems.FUTURITE.get())
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);

        // SERMIUM ARMOR
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_HELMET.get(), 1)
                .define('A', ModItems.SERMIUM.get())
                .pattern("AAA")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_CHESTPLATE.get(), 1)
                .define('A', ModItems.SERMIUM.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_LEGGINGS.get(), 1)
                .define('A', ModItems.SERMIUM.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_BOOTS.get(), 1)
                .define('A', ModItems.SERMIUM.get())
                .pattern("A A")
                .pattern("A A")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.NETHERITE_BOW.get(), 1)
                .define('B', Items.BOW)
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.STRING)
                .pattern(" NS")
                .pattern("NBS")
                .pattern(" NS")
                .unlockedBy("has_material", has(Items.BOW)).save(consumer);

        // NUGGETS
        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_ALUMINUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ALUMINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.IRIDIUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_IRIDIUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_IRIDIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.LEAD_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_LEAD)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_LEAD)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.MAGNESIUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_MAGNESIUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_MAGNESIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.OSMIUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_OSMIUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_OSMIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.PLATINUM_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_PLATINUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_PLATINUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.TIN_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_TIN)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TIN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.TUNGSTEN_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_TUNGSTEN)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_TUNGSTEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.URANIUM_BIT.get(), 9)
                .requires(ModTags.Items.INGOT_URANIUM)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_URANIUM)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ZINC_NUGGET.get(), 9)
                .requires(ModTags.Items.INGOT_ZINC)
                .unlockedBy("has_material", has(ModTags.Items.INGOT_ZINC)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.FUTURITE_BIT.get(), 9)
                .requires(ModItems.FUTURITE.get())
                .unlockedBy("has_material", has(ModItems.FUTURITE.get())).save(consumer);

        // FOOD
        ShapedRecipeBuilder.shaped(ModItems.DIAMOND_APPLE.get(), 1)
                .define('D', Items.DIAMOND)
                .define('G', Items.GOLDEN_APPLE)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .unlockedBy("has_material", has(Items.GOLDEN_APPLE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.FUTURITE_APPLE.get(), 1)
                .define('F', ModItems.FUTURITE_BIT.get())
                .define('D', ModItems.DIAMOND_APPLE.get())
                .pattern("FFF")
                .pattern("FDF")
                .pattern("FFF")
                .unlockedBy("has_material", has(ModItems.DIAMOND_APPLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_apple_from_diamond_apple"));
        ShapelessRecipeBuilder.shapeless(ModItems.FUTURITE_APPLE.get(), 1)
                .requires(ModItems.DESTABILIZED_FUTURITE_APPLE.get())
                .requires(ModItems.FUTURITE_BIT.get(), 3)
                .unlockedBy("has_material", has(ModItems.DIAMOND_APPLE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_apple_from_destabilized_futurite_apple"));

        // MISCELLANEOUS
        ShapedRecipeBuilder.shaped(ModItems.SERMIUM_CORE.get(), 2)
                .define('C', Items.COAL)
                .define('S', ModItems.SERMIUM.get())
                .pattern("C")
                .pattern("S")
                .pattern("C")
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.SERMIUM_OXIDE.get(), 2)
                .requires(Items.IRON_INGOT)
                .requires(ModItems.SERMIUM_CORE.get())
                .unlockedBy("has_material", has(ModItems.SERMIUM.get())).save(consumer);
    }
}
