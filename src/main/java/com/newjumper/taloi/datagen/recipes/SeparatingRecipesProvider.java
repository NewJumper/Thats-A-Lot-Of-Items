package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.datagen.recipes.custom.SeparatingRecipeBuilder;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class SeparatingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public SeparatingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // MINECRAFT
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.COAL_ORE), Blocks.STONE, Items.COAL, 2, 0f)
                .unlockedBy("has_material", has(Blocks.COAL_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "coal_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_COAL_ORE), Blocks.DEEPSLATE, Items.COAL, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_COAL_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_coal_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.COPPER_ORE), Blocks.STONE, Items.COPPER_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.COPPER_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "copper_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_COPPER_ORE), Blocks.DEEPSLATE, Items.COPPER_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_COPPER_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_copper_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DIAMOND_ORE), Blocks.STONE, Items.DIAMOND, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DIAMOND_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "diamond_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_DIAMOND_ORE), Blocks.DEEPSLATE, Items.DIAMOND, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_DIAMOND_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_diamond_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.EMERALD_ORE), Blocks.STONE, Items.EMERALD, 2, 0f)
                .unlockedBy("has_material", has(Blocks.EMERALD_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "emerald_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_EMERALD_ORE), Blocks.DEEPSLATE, Items.EMERALD, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_EMERALD_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_emerald_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.GOLD_ORE), Blocks.STONE, Items.GOLD_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.GOLD_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "gold_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_GOLD_ORE), Blocks.DEEPSLATE, Items.GOLD_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_GOLD_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_gold_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.IRON_ORE), Blocks.STONE, Items.IRON_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.IRON_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iron_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_IRON_ORE), Blocks.DEEPSLATE, Items.IRON_INGOT, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_IRON_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_iron_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.LAPIS_ORE), Blocks.STONE, Items.LAPIS_LAZULI, 2, 0f)
                .unlockedBy("has_material", has(Blocks.LAPIS_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lapis_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_LAPIS_ORE), Blocks.DEEPSLATE, Items.LAPIS_LAZULI, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_LAPIS_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_lapis_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(Blocks.REDSTONE_ORE), Blocks.STONE, Items.REDSTONE, 2, 0f)
                .unlockedBy("has_material", has(Blocks.REDSTONE_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "redstone_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_REDSTONE_ORE), Blocks.DEEPSLATE, Items.REDSTONE, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_REDSTONE_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_redstone_ore_separating"));

        // TALOI
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.ALUMINUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_ALUMINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.ALUMINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_ALUMINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_ALUMINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_aluminum_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.IRIDIUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_IRIDIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.IRIDIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_IRIDIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_IRIDIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_iridium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.LEAD_ORE.get()), Blocks.STONE, TaloiItems.RAW_LEAD.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.LEAD_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_LEAD_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_LEAD.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_LEAD_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_lead_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.MAGNESIUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_MAGNESIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.MAGNESIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_MAGNESIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_MAGNESIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_magnesium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.OSMIUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_OSMIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.OSMIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_OSMIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_OSMIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_osmium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.PLATINUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_PLATINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.PLATINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_PLATINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_PLATINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_platinum_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.SILICON_ORE.get()), Blocks.STONE, TaloiItems.RAW_SILICON.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.SILICON_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "silicon_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_SILICON_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_SILICON.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_SILICON_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_silicon_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.TIN_ORE.get()), Blocks.STONE, TaloiItems.RAW_TIN.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.TIN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_TIN_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_TIN.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_TIN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_tin_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.TUNGSTEN_ORE.get()), Blocks.STONE, TaloiItems.RAW_TUNGSTEN.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.TUNGSTEN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_TUNGSTEN.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_TUNGSTEN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_tungsten_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.URANIUM_ORE.get()), Blocks.STONE, TaloiItems.RAW_URANIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.URANIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "uranium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_URANIUM_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_URANIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_URANIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_uranium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.ZINC_ORE.get()), Blocks.STONE, TaloiItems.RAW_ZINC.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.ZINC_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(TaloiBlocks.DEEPSLATE_ZINC_ORE.get()), Blocks.DEEPSLATE, TaloiItems.RAW_ZINC.get(), 2, 0f)
                .unlockedBy("has_material", has(TaloiBlocks.DEEPSLATE_ZINC_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_zinc_ore_separating"));
    }

    @Override
    public String getName() {
        return "Separating Recipes";
    }
}
