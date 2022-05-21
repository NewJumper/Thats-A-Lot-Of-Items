package com.newjumper.taloi.datagen.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.datagen.recipes.custom.SeparatingRecipeBuilder;
import com.newjumper.taloi.item.ModItems;
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
        new SeparatingRecipeBuilder(Ingredient.of(Blocks.DEEPSLATE_REDSTONE_ORE), Blocks.STONE, Items.REDSTONE, 2, 0f)
                .unlockedBy("has_material", has(Blocks.DEEPSLATE_REDSTONE_ORE)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_redstone_ore_separating"));

        // TALOI
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.ALUMINUM_ORE.get()), Blocks.STONE, ModItems.RAW_ALUMINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.ALUMINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "aluminum_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_ALUMINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_aluminum_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.IRIDIUM_ORE.get()), Blocks.STONE, ModItems.RAW_IRIDIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.IRIDIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "iridium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_IRIDIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_iridium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.LEAD_ORE.get()), Blocks.STONE, ModItems.RAW_LEAD.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.LEAD_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "lead_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_LEAD_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_LEAD.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_LEAD_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_lead_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.MAGNESIUM_ORE.get()), Blocks.STONE, ModItems.RAW_MAGNESIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.MAGNESIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "magnesium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_MAGNESIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_magnesium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.OSMIUM_ORE.get()), Blocks.STONE, ModItems.RAW_OSMIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.OSMIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "osmium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_OSMIUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_OSMIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_OSMIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_osmium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.PLATINUM_ORE.get()), Blocks.STONE, ModItems.RAW_PLATINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.PLATINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "platinum_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_PLATINUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_PLATINUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_platinum_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.SILICON_ORE.get()), Blocks.STONE, ModItems.RAW_SILICON.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.SILICON_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "silicon_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_SILICON_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_SILICON.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_SILICON_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_silicon_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.TIN_ORE.get()), Blocks.STONE, ModItems.RAW_TIN.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.TIN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tin_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_TIN.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_TIN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_tin_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.TUNGSTEN_ORE.get()), Blocks.STONE, ModItems.RAW_TUNGSTEN.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.TUNGSTEN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "tungsten_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_TUNGSTEN.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_tungsten_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.URANIUM_ORE.get()), Blocks.STONE, ModItems.RAW_URANIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.URANIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "uranium_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_URANIUM_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_URANIUM.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_URANIUM_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_uranium_ore_separating"));

        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.ZINC_ORE.get()), Blocks.STONE, ModItems.RAW_ZINC.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.ZINC_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "zinc_ore_separating"));
        new SeparatingRecipeBuilder(Ingredient.of(ModBlocks.DEEPSLATE_ZINC_ORE.get()), Blocks.DEEPSLATE, ModItems.RAW_ZINC.get(), 2, 0f)
                .unlockedBy("has_material", has(ModBlocks.DEEPSLATE_ZINC_ORE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "deepslate_zinc_ore_separating"));
    }

    @Override
    public String getName() {
        return "Separating Recipes";
    }
}
