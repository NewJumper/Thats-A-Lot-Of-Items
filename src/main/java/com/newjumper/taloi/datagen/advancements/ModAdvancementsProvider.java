package com.newjumper.taloi.datagen.advancements;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends AdvancementProvider {
    public ModAdvancementsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, existingFileHelper);
    }

    @Override
    protected void registerAdvancements(Consumer<Advancement> consumer, ExistingFileHelper fileHelper) {
        String loc = ThatsALotOfItems.MOD_ID + ":main/";

        Advancement root = Advancement.Builder.advancement().display(ModBlocks.LIMESTONE.get(),
                        new TranslatableComponent("advancements.taloi.root.title"),
                        new TranslatableComponent("advancements.taloi.root.description"),
                        new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/advancements/backgrounds/taloi.png"),
                        FrameType.TASK, false, false, false)
                .addCriterion("evergreen", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.EVERGREEN_LOG.get()))
                .addCriterion("limestone", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.LIMESTONE.get()))
                .addCriterion("marble", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MARBLE.get()))
                .addCriterion("slate", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SLATE.get()))
                .addCriterion("willow", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WILLOW_LOG.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "root");

        Advancement.Builder.advancement().parent(root)
                .display(ModItems.REFINED_URANIUM.get(),
                        new TranslatableComponent("advancements.taloi.radioactive.title"),
                        new TranslatableComponent("advancements.taloi.radioactive.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("uranium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.REFINED_URANIUM.get()))
                .save(consumer, loc + "radioactive");

        Advancement.Builder.advancement().parent(root)
                .display(ModItems.TOPAZ.get(),
                        new TranslatableComponent("advancements.taloi.shiny.title"),
                        new TranslatableComponent("advancements.taloi.shiny.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("malachite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MALACHITE.get()))
                .addCriterion("tanzanite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TANZANITE.get()))
                .addCriterion("topaz", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TOPAZ.get()))
                .save(consumer, loc + "shiny");

        Advancement machinery = Advancement.Builder.advancement().parent(root)
                .display(ModItems.UNSTABLE_MACHINE_FRAME.get(),
                        new TranslatableComponent("advancements.taloi.machinery.title"),
                        new TranslatableComponent("advancements.taloi.machinery.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("alpha", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALPHA_MACHINE_FRAME.get()))
                .addCriterion("beta", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BETA_MACHINE_FRAME.get()))
                .addCriterion("unstable", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.UNSTABLE_MACHINE_FRAME.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "machinery");

        Advancement constructAlloy = Advancement.Builder.advancement().parent(machinery)
                .display(ModItems.STEEL_INGOT.get(),
                        new TranslatableComponent("advancements.taloi.construct_alloy.title"),
                        new TranslatableComponent("advancements.taloi.construct_alloy.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("bronze", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_INGOT.get()))
                .addCriterion("carbonite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CARBONITE.get()))
                .addCriterion("ferroniobium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FERRONIOBIUM_INGOT.get()))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FUTURITE.get()))
                .addCriterion("hardened_carbonite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.HARDENED_CARBONITE.get()))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM.get()))
                .addCriterion("steel", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.STEEL_INGOT.get()))
                .addCriterion("alloy_x", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALLOY_X.get()))
                .addCriterion("alloy_z", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALLOY_Z.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "construct_alloy");

        Advancement.Builder.advancement().parent(machinery)
                .display(ModItems.SILICON_PLATE.get(),
                        new TranslatableComponent("advancements.taloi.press_material.title"),
                        new TranslatableComponent("advancements.taloi.press_material.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("alloy", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALLOY_PLATE.get()))
                .addCriterion("bronze", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BRONZE_PLATE.get()))
                .addCriterion("carbon", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CARBON_PLATE.get()))
                .addCriterion("copper", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.COPPER_PLATE.get()))
                .addCriterion("diamond", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DIAMOND_PLATE.get()))
                .addCriterion("forge", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FORGE_PLATE.get()))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FUTURITE_PLATE.get()))
                .addCriterion("gold", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.GOLD_DISK.get()))
                .addCriterion("induction", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.INDUCTION_PLATE.get()))
                .addCriterion("magnesium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGNESIUM_PLATE.get()))
                .addCriterion("reinforced_copper", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.REINFORCED_COPPER_PLATE.get()))
                .addCriterion("semiconductor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SEMICONDUCTOR_PLATE.get()))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_PLATE.get()))
                .addCriterion("silicon", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SILICON_PLATE.get()))
                .addCriterion("steel", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.STEEL_PLATE.get()))
                .addCriterion("tungsten", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TUNGSTEN_PLATE.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "press_material");

        Advancement.Builder.advancement().parent(machinery)
                .display(ModItems.COAL_INFUSED_IRON_INGOT.get(),
                        new TranslatableComponent("advancements.taloi.infuse_ingot.title"),
                        new TranslatableComponent("advancements.taloi.infuse_ingot.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("coal_iron", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.COAL_INFUSED_IRON_INGOT.get()))
                .addCriterion("coal_lead", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.COAL_INFUSED_LEAD_INGOT.get()))
                .addCriterion("diamond_steel", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DIAMOND_INFUSED_STEEL_INGOT.get()))
                .addCriterion("diamond_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DIAMOND_INFUSED_TIN_INGOT.get()))
                .addCriterion("diamond_uranium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DIAMOND_INFUSED_URANIUM.get()))
                .addCriterion("emerald_osmium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.EMERALD_INFUSED_OSMIUM_INGOT.get()))
                .addCriterion("emerald_tungsten", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.EMERALD_INFUSED_TUNGSTEN_INGOT.get()))
                .addCriterion("emerald_zinc", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.EMERALD_INFUSED_ZINC_INGOT.get()))
                .addCriterion("futurite_netherite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()))
                .addCriterion("sermium_netherite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "infuse_ingot");

        Advancement obtainSermium = Advancement.Builder.advancement().parent(constructAlloy)
                .display(ModItems.SERMIUM.get(),
                        new TranslatableComponent("advancements.taloi.obtain_sermium.title"),
                        new TranslatableComponent("advancements.taloi.obtain_sermium.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM.get()))
                .save(consumer, loc + "obtain_sermium");

        Advancement.Builder.advancement().parent(obtainSermium)
                .display(ModItems.SERMIUM_CHESTPLATE.get(),
                        new TranslatableComponent("advancements.taloi.sermium_armor.title"),
                        new TranslatableComponent("advancements.taloi.sermium_armor.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(50))
                .addCriterion("helmet", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_HELMET.get()))
                .addCriterion("chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_CHESTPLATE.get()))
                .addCriterion("leggings", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_LEGGINGS.get()))
                .addCriterion("boots", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SERMIUM_BOOTS.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "sermium_armor");

        Advancement obtainFuturite = Advancement.Builder.advancement().parent(obtainSermium)
                .display(ModItems.FUTURITE.get(),
                        new TranslatableComponent("advancements.taloi.obtain_futurite.title"),
                        new TranslatableComponent("advancements.taloi.obtain_futurite.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FUTURITE.get()))
                .save(consumer, loc + "obtain_futurite");

        Advancement.Builder.advancement().parent(obtainFuturite)
                .display(ModItems.FUTURITE_CHESTPLATE.get(),
                        new TranslatableComponent("advancements.taloi.futurite_armor.title"),
                        new TranslatableComponent("advancements.taloi.futurite_armor.description"),
                        null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100))
                .addCriterion("armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FUTURITE_HELMET.get(), ModItems.FUTURITE_CHESTPLATE.get(), ModItems.FUTURITE_LEGGINGS.get(), ModItems.FUTURITE_BOOTS.get()))
                .save(consumer, loc + "futurite_armor");

        Advancement.Builder.advancement().parent(obtainFuturite)
                .display(ModItems.FUTURITE_APPLE.get(),
                        new TranslatableComponent("advancements.taloi.eat_futurite_apple.title"),
                        new TranslatableComponent("advancements.taloi.eat_futurite_apple.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("destabilized_apple", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DESTABILIZED_FUTURITE_APPLE.get()))
                .save(consumer, loc + "eat_futurite_apple");
    }
}
