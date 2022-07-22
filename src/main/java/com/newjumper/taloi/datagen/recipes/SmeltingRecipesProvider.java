package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.util.TaloiTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
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
        blastingRecipe(consumer, TaloiBlocks.ALUMINUM_ORE.get(), TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_blasting_aluminum_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_blasting_deepslate_aluminum_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_ALUMINUM, TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_blasting_raw_aluminum");
        smeltingRecipe(consumer, TaloiBlocks.ALUMINUM_ORE.get(), TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_smelting_aluminum_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get(), TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_smelting_deepslate_aluminum_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_ALUMINUM, TaloiItems.ALUMINUM_INGOT.get(), 0.7f, "aluminum_ingot_from_smelting_raw_aluminum");

        blastingRecipe(consumer, TaloiBlocks.IRIDIUM_ORE.get(), TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_blasting_iridium_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_blasting_deepslate_iridium_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_IRIDIUM, TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_blasting_raw_iridium");
        smeltingRecipe(consumer, TaloiBlocks.IRIDIUM_ORE.get(), TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_smelting_iridium_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get(), TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_smelting_deepslate_iridium_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_IRIDIUM, TaloiItems.IRIDIUM_INGOT.get(), 1.7f, "iridium_ingot_from_smelting_raw_iridium");

        blastingRecipe(consumer, TaloiBlocks.LEAD_ORE.get(), TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_blasting_lead_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_blasting_deepslate_lead_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_LEAD, TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_blasting_raw_lead");
        smeltingRecipe(consumer, TaloiBlocks.LEAD_ORE.get(), TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_smelting_lead_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_LEAD_ORE.get(), TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_smelting_deepslate_lead_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_LEAD, TaloiItems.LEAD_INGOT.get(), 0.7f, "lead_ingot_from_smelting_raw_lead");

        blastingRecipe(consumer, TaloiBlocks.MAGNESIUM_ORE.get(), TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_blasting_magnesium_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_blasting_deepslate_magnesium_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_MAGNESIUM, TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_blasting_raw_magnesium");
        smeltingRecipe(consumer, TaloiBlocks.MAGNESIUM_ORE.get(), TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_smelting_magnesium_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_smelting_deepslate_magnesium_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_MAGNESIUM, TaloiItems.MAGNESIUM_INGOT.get(), 0.7f, "magnesium_ingot_from_smelting_raw_magnesium");

        blastingRecipe(consumer, TaloiBlocks.OSMIUM_ORE.get(), TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_blasting_osmium_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_blasting_deepslate_osmium_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_OSMIUM, TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_blasting_raw_osmium");
        smeltingRecipe(consumer, TaloiBlocks.OSMIUM_ORE.get(), TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_smelting_osmium_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get(), TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_smelting_deepslate_osmium_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_OSMIUM, TaloiItems.OSMIUM_INGOT.get(), 1.7f, "osmium_ingot_from_smelting_raw_osmium");

        blastingRecipe(consumer, TaloiBlocks.PLATINUM_ORE.get(), TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_blasting_platinum_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_blasting_deepslate_platinum_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_PLATINUM, TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_blasting_raw_platinum");
        smeltingRecipe(consumer, TaloiBlocks.PLATINUM_ORE.get(), TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_smelting_platinum_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get(), TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_smelting_deepslate_platinum_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_PLATINUM, TaloiItems.PLATINUM_INGOT.get(), 1.5f, "platinum_ingot_from_smelting_raw_platinum");

        blastingRecipe(consumer, TaloiBlocks.SILICON_ORE.get(), TaloiItems.SILICON.get(), 0.7f, "silicon_from_blasting_silicon_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), TaloiItems.SILICON.get(), 0.7f, "silicon_from_blasting_deepslate_silicon_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_SILICON, TaloiItems.SILICON.get(), 0.7f, "silicon_from_blasting_raw_silicon");
        smeltingRecipe(consumer, TaloiBlocks.SILICON_ORE.get(), TaloiItems.SILICON.get(), 0.7f, "silicon_from_smelting_silicon_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_SILICON_ORE.get(), TaloiItems.SILICON.get(), 0.7f, "silicon_from_smelting_deepslate_silicon_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_SILICON, TaloiItems.SILICON.get(), 0.7f, "silicon_from_smelting_raw_silicon");

        blastingRecipe(consumer, TaloiBlocks.TIN_ORE.get(), TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_blasting_tin_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_TIN_ORE.get(), TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_blasting_deepslate_tin_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_TIN, TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_blasting_raw_tin");
        smeltingRecipe(consumer, TaloiBlocks.TIN_ORE.get(), TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_smelting_tin_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_TIN_ORE.get(), TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_smelting_deepslate_tin_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_TIN, TaloiItems.TIN_INGOT.get(), 0.7f, "tin_ingot_from_smelting_raw_tin");

        blastingRecipe(consumer, TaloiBlocks.TUNGSTEN_ORE.get(), TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_blasting_tungsten_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_blasting_deepslate_tungsten_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_TUNGSTEN, TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_blasting_raw_tungsten");
        smeltingRecipe(consumer, TaloiBlocks.TUNGSTEN_ORE.get(), TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_smelting_tungsten_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_smelting_deepslate_tungsten_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_TUNGSTEN, TaloiItems.TUNGSTEN_INGOT.get(), 2f, "tungsten_ingot_from_smelting_raw_tungsten");

        blastingRecipe(consumer, TaloiBlocks.URANIUM_ORE.get(), TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_blasting_uranium_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_blasting_deepslate_uranium_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_URANIUM, TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_blasting_raw_uranium");
        smeltingRecipe(consumer, TaloiBlocks.URANIUM_ORE.get(), TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_smelting_uranium_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_URANIUM_ORE.get(), TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_smelting_deepslate_uranium_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_URANIUM, TaloiItems.REFINED_URANIUM.get(), 1f, "refined_uranium_from_smelting_raw_uranium");

        blastingRecipe(consumer, TaloiBlocks.ZINC_ORE.get(), TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_blasting_zinc_ore");
        blastingRecipe(consumer, TaloiBlocks.DEEPSLATE_ZINC_ORE.get(), TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_blasting_deepslate_zinc_ore");
        blastingRecipe(consumer, TaloiTags.Items.RAW_ZINC, TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_blasting_raw_zinc");
        smeltingRecipe(consumer, TaloiBlocks.ZINC_ORE.get(), TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_smelting_zinc_ore");
        smeltingRecipe(consumer, TaloiBlocks.DEEPSLATE_ZINC_ORE.get(), TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_smelting_deepslate_zinc_ore");
        smeltingRecipe(consumer, TaloiTags.Items.RAW_ZINC, TaloiItems.ZINC_INGOT.get(), 0.7f, "zinc_ingot_from_smelting_raw_zinc");
    }

    private void blastingRecipe(Consumer<FinishedRecipe> consumer, Block block, Item result, float experience, String path) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(block), result, experience, 100)
                .unlockedBy("has_material", has(block)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, path));
    }
    private void blastingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> pTag, Item result, float experience, String path) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(pTag), result, experience, 100)
                .unlockedBy("has_material", has(pTag)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, path));
    }

    private void smeltingRecipe(Consumer<FinishedRecipe> consumer, Block block, Item result, float experience, String path) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(block), result, experience, 200)
                .unlockedBy("has_material", has(block)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, path));
    }
    private void smeltingRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> pTag, Item result, float experience, String path) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(pTag), result, experience, 200)
                .unlockedBy("has_material", has(pTag)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, path));
    }

    @Override
    public String getName() {
        return "Smelting Recipes";
    }
}
