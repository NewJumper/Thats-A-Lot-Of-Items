package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import com.newjumper.taloi.util.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class SmeltingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public SmeltingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // ALUMINUM
        blastingRecipe(consumer, ModBlocks.ALUMINUM_ORE.get(), ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_ORE.get(), "aluminum_ingot_from_blasting_aluminum_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.ALUMINUM_INGOT.get(), ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), "aluminum_ingot_from_blasting_deepslate_aluminum_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_ALUMINUM, ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_ORE.get(), "aluminum_ingot_from_blasting_raw_aluminum");
        smeltingRecipe(consumer, ModBlocks.ALUMINUM_ORE.get(), ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_ORE.get(), "aluminum_ingot_from_smelting_aluminum_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.ALUMINUM_INGOT.get(), ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), "aluminum_ingot_from_smelting_deepslate_aluminum_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_ALUMINUM, ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_ORE.get(), "aluminum_ingot_from_smelting_raw_aluminum");

        // IRIDIUM
        blastingRecipe(consumer, ModBlocks.IRIDIUM_ORE.get(), ModItems.IRIDIUM_INGOT.get(), ModBlocks.IRIDIUM_ORE.get(), "iridium_ingot_from_blasting_iridium_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), ModItems.IRIDIUM_INGOT.get(), ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), "iridium_ingot_from_blasting_deepslate_iridium_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_IRIDIUM, ModItems.IRIDIUM_INGOT.get(), ModBlocks.IRIDIUM_ORE.get(), "iridium_ingot_from_blasting_raw_iridium");
        smeltingRecipe(consumer, ModBlocks.IRIDIUM_ORE.get(), ModItems.IRIDIUM_INGOT.get(), ModBlocks.IRIDIUM_ORE.get(), "iridium_ingot_from_smelting_iridium_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), ModItems.IRIDIUM_INGOT.get(), ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), "iridium_ingot_from_smelting_deepslate_iridium_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_IRIDIUM, ModItems.IRIDIUM_INGOT.get(), ModBlocks.IRIDIUM_ORE.get(), "iridium_ingot_from_smelting_raw_iridium");

        // LEAD
        blastingRecipe(consumer, ModBlocks.LEAD_ORE.get(), ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_ORE.get(), "lead_ingot_from_blasting_lead_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.LEAD_INGOT.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get(), "lead_ingot_from_blasting_deepslate_lead_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_LEAD, ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_ORE.get(), "lead_ingot_from_blasting_raw_lead");
        smeltingRecipe(consumer, ModBlocks.LEAD_ORE.get(), ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_ORE.get(), "lead_ingot_from_smelting_lead_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.LEAD_INGOT.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get(), "lead_ingot_from_smelting_deepslate_lead_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_LEAD, ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_ORE.get(), "lead_ingot_from_smelting_raw_lead");

        // MAGNESIUM
        blastingRecipe(consumer, ModBlocks.MAGNESIUM_ORE.get(), ModItems.MAGNESIUM_INGOT.get(), ModBlocks.MAGNESIUM_ORE.get(), "magnesium_ingot_from_blasting_magnesium_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModItems.MAGNESIUM_INGOT.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), "magnesium_ingot_from_blasting_deepslate_magnesium_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_MAGNESIUM, ModItems.MAGNESIUM_INGOT.get(), ModBlocks.MAGNESIUM_ORE.get(), "magnesium_ingot_from_blasting_raw_magnesium");
        smeltingRecipe(consumer, ModBlocks.MAGNESIUM_ORE.get(), ModItems.MAGNESIUM_INGOT.get(), ModBlocks.MAGNESIUM_ORE.get(), "magnesium_ingot_from_smelting_magnesium_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModItems.MAGNESIUM_INGOT.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), "magnesium_ingot_from_smelting_deepslate_magnesium_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_MAGNESIUM, ModItems.MAGNESIUM_INGOT.get(), ModBlocks.MAGNESIUM_ORE.get(), "magnesium_ingot_from_smelting_raw_magnesium");

        // OSMIUM
        blastingRecipe(consumer, ModBlocks.OSMIUM_ORE.get(), ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_ORE.get(), "osmium_ingot_from_blasting_osmium_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModItems.OSMIUM_INGOT.get(), ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), "osmium_ingot_from_blasting_deepslate_osmium_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_OSMIUM, ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_ORE.get(), "osmium_ingot_from_blasting_raw_osmium");
        smeltingRecipe(consumer, ModBlocks.OSMIUM_ORE.get(), ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_ORE.get(), "osmium_ingot_from_smelting_osmium_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), ModItems.OSMIUM_INGOT.get(), ModBlocks.DEEPSLATE_OSMIUM_ORE.get(), "osmium_ingot_from_smelting_deepslate_osmium_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_OSMIUM, ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_ORE.get(), "osmium_ingot_from_smelting_raw_osmium");

        // PLATINUM
        blastingRecipe(consumer, ModBlocks.PLATINUM_ORE.get(), ModItems.PLATINUM_INGOT.get(), ModBlocks.PLATINUM_ORE.get(), "platinum_ingot_from_blasting_platinum_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.PLATINUM_INGOT.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), "platinum_ingot_from_blasting_deepslate_platinum_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_PLATINUM, ModItems.PLATINUM_INGOT.get(), ModBlocks.PLATINUM_ORE.get(), "platinum_ingot_from_blasting_raw_platinum");
        smeltingRecipe(consumer, ModBlocks.PLATINUM_ORE.get(), ModItems.PLATINUM_INGOT.get(), ModBlocks.PLATINUM_ORE.get(), "platinum_ingot_from_smelting_platinum_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.PLATINUM_INGOT.get(), ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), "platinum_ingot_from_smelting_deepslate_platinum_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_PLATINUM, ModItems.PLATINUM_INGOT.get(), ModBlocks.PLATINUM_ORE.get(), "platinum_ingot_from_smelting_raw_platinum");

        // SILICON
        blastingRecipe(consumer, ModBlocks.SILICON_ORE.get(), ModItems.SILICON.get(), ModBlocks.SILICON_ORE.get(), "silicon_from_blasting_silicon_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModItems.SILICON.get(), ModBlocks.DEEPSLATE_SILICON_ORE.get(), "silicon_from_blasting_deepslate_silicon_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_SILICON, ModItems.SILICON.get(), ModBlocks.SILICON_ORE.get(), "silicon_from_blasting_raw_silicon");
        smeltingRecipe(consumer, ModBlocks.SILICON_ORE.get(), ModItems.SILICON.get(), ModBlocks.SILICON_ORE.get(), "silicon_from_smelting_silicon_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_SILICON_ORE.get(), ModItems.SILICON.get(), ModBlocks.DEEPSLATE_SILICON_ORE.get(), "silicon_from_smelting_deepslate_silicon_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_SILICON, ModItems.SILICON.get(), ModBlocks.SILICON_ORE.get(), "silicon_from_smelting_raw_silicon");

        // TIN
        blastingRecipe(consumer, ModBlocks.TIN_ORE.get(), ModItems.TIN_INGOT.get(), ModBlocks.TIN_ORE.get(), "tin_ingot_from_blasting_tin_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.TIN_INGOT.get(), ModBlocks.DEEPSLATE_TIN_ORE.get(), "tin_ingot_from_blasting_deepslate_tin_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_TIN, ModItems.TIN_INGOT.get(), ModBlocks.TIN_ORE.get(), "tin_ingot_from_blasting_raw_tin");
        smeltingRecipe(consumer, ModBlocks.TIN_ORE.get(), ModItems.TIN_INGOT.get(), ModBlocks.TIN_ORE.get(), "tin_ingot_from_smelting_tin_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.TIN_INGOT.get(), ModBlocks.DEEPSLATE_TIN_ORE.get(), "tin_ingot_from_smelting_deepslate_tin_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_TIN, ModItems.TIN_INGOT.get(), ModBlocks.TIN_ORE.get(), "tin_ingot_from_smelting_raw_tin");

        // TUNGSTEN
        blastingRecipe(consumer, ModBlocks.TUNGSTEN_ORE.get(), ModItems.TUNGSTEN_INGOT.get(), ModBlocks.TUNGSTEN_ORE.get(), "tungsten_ingot_from_blasting_tungsten_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.TUNGSTEN_INGOT.get(), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), "tungsten_ingot_from_blasting_deepslate_tungsten_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_TUNGSTEN, ModItems.TUNGSTEN_INGOT.get(), ModBlocks.TUNGSTEN_ORE.get(), "tungsten_ingot_from_blasting_raw_tungsten");
        smeltingRecipe(consumer, ModBlocks.TUNGSTEN_ORE.get(), ModItems.TUNGSTEN_INGOT.get(), ModBlocks.TUNGSTEN_ORE.get(), "tungsten_ingot_from_smelting_tungsten_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.TUNGSTEN_INGOT.get(), ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), "tungsten_ingot_from_smelting_deepslate_tungsten_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_TUNGSTEN, ModItems.TUNGSTEN_INGOT.get(), ModBlocks.TUNGSTEN_ORE.get(), "tungsten_ingot_from_smelting_raw_tungsten");

        // URANIUM
        blastingRecipe(consumer, ModBlocks.URANIUM_ORE.get(), ModItems.REFINED_URANIUM.get(), ModBlocks.URANIUM_ORE.get(), "refined_uranium_from_blasting_uranium_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModItems.REFINED_URANIUM.get(), ModBlocks.DEEPSLATE_URANIUM_ORE.get(), "refined_uranium_from_blasting_deepslate_uranium_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_URANIUM, ModItems.REFINED_URANIUM.get(), ModBlocks.URANIUM_ORE.get(), "refined_uranium_from_blasting_raw_uranium");
        smeltingRecipe(consumer, ModBlocks.URANIUM_ORE.get(), ModItems.REFINED_URANIUM.get(), ModBlocks.URANIUM_ORE.get(), "refined_uranium_from_smelting_uranium_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_URANIUM_ORE.get(), ModItems.REFINED_URANIUM.get(), ModBlocks.DEEPSLATE_URANIUM_ORE.get(), "refined_uranium_from_smelting_deepslate_uranium_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_URANIUM, ModItems.REFINED_URANIUM.get(), ModBlocks.URANIUM_ORE.get(), "refined_uranium_from_smelting_raw_uranium");

        // ZINC
        blastingRecipe(consumer, ModBlocks.ZINC_ORE.get(), ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_ORE.get(), "zinc_ingot_from_blasting_zinc_ore");
        blastingRecipe(consumer, ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get(), "zinc_ingot_from_blasting_deepslate_zinc_ore");
        blastingRecipe(consumer, ModTags.Items.RAW_ZINC, ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_ORE.get(), "zinc_ingot_from_blasting_raw_zinc");
        smeltingRecipe(consumer, ModBlocks.ZINC_ORE.get(), ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_ORE.get(), "zinc_ingot_from_smelting_zinc_ore");
        smeltingRecipe(consumer, ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get(), "zinc_ingot_from_smelting_deepslate_zinc_ore");
        smeltingRecipe(consumer, ModTags.Items.RAW_ZINC, ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_ORE.get(), "zinc_ingot_from_smelting_raw_zinc");
    }

    private void blastingRecipe(Consumer<FinishedRecipe> consumer, Block block, Item pResult, Block hasBlock, String pPath) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(block), pResult, 1, 100)
                .unlockedBy("has_material", has(hasBlock)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, pPath));
    }
    private void blastingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> pTag, Item pResult, Block hasBlock, String pPath) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(pTag), pResult, 1, 100)
                .unlockedBy("has_material", has(hasBlock)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, pPath));
    }

    private void smeltingRecipe(Consumer<FinishedRecipe> consumer, Block block, Item pResult, Block hasBlock, String pPath) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(block), pResult, 1, 200)
                .unlockedBy("has_material", has(hasBlock)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, pPath));
    }
    private void smeltingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> pTag, Item pResult, Block hasBlock, String pPath) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(pTag), pResult, 1, 200)
                .unlockedBy("has_material", has(hasBlock)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, pPath));
    }
}
