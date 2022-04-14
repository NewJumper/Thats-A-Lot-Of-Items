package com.newjumper.taloi.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class SmithingRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public SmithingRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.BOW), Ingredient.of(Items.NETHERITE_INGOT), ModItems.NETHERITE_BOW.get())
                .unlocks("has_material", has(Items.NETHERITE_INGOT)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "netherite_bow_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_HELMET.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_CHESTPLATE.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_LEGGINGS.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_BOOTS.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_boots_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_HELMET.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_HELMET.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_CHESTPLATE.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_CHESTPLATE.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_LEGGINGS.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_LEGGINGS.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_BOOTS.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_BOOTS.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_boots_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SWORD), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_SWORD.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_sword_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SHOVEL), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_SHOVEL.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_shovel_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_PICKAXE), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_PICKAXE.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_pickaxe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_AXE), Ingredient.of(ModItems.SERMIUM_PLATE.get()), ModItems.SERMIUM_AXE.get())
                .unlocks("has_material", has(ModItems.SERMIUM_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_axe_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_SWORD.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_SWORD.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_sword_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_SHOVEL.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_SHOVEL.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_shovel_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_PICKAXE.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_PICKAXE.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_pickaxe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.SERMIUM_AXE.get()), Ingredient.of(ModItems.FUTURITE_PLATE.get()), ModItems.FUTURITE_AXE.get())
                .unlocks("has_material", has(ModItems.FUTURITE_PLATE.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_axe_smithing"));
    }
}
