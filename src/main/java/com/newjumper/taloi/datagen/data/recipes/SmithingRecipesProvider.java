package com.newjumper.taloi.datagen.data.recipes;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.TaloiItems;
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
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.BOW), Ingredient.of(Items.NETHERITE_INGOT), TaloiItems.NETHERITE_BOW.get())
                .unlocks("has_material", has(Items.NETHERITE_INGOT)).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "netherite_bow_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_HELMET.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_CHESTPLATE.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_LEGGINGS.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_BOOTS.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_boots_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_HELMET.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_HELMET.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_CHESTPLATE.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_CHESTPLATE.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_LEGGINGS.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_LEGGINGS.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_BOOTS.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_BOOTS.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_boots_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SWORD), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_SWORD.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_sword_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SHOVEL), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_SHOVEL.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_shovel_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_PICKAXE), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_PICKAXE.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_pickaxe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_AXE), Ingredient.of(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()), TaloiItems.SERMIUM_AXE.get())
                .unlocks("has_material", has(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "sermium_axe_smithing"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_SWORD.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_SWORD.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_sword_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_SHOVEL.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_SHOVEL.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_shovel_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_PICKAXE.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_PICKAXE.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_pickaxe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(TaloiItems.SERMIUM_AXE.get()), Ingredient.of(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()), TaloiItems.FUTURITE_AXE.get())
                .unlocks("has_material", has(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get())).save(consumer, new ResourceLocation(ThatsALotOfItems.MOD_ID, "futurite_axe_smithing"));
    }

    @Override
    public String getName() {
        return "Smithing Recipes";
    }
}
