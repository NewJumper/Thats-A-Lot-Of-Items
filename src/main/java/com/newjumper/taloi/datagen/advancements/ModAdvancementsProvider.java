package com.newjumper.taloi.datagen.advancements;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
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

        Advancement root = Advancement.Builder.advancement().display(TaloiBlocks.SLATE.get(),
                        new TranslatableComponent("advancements.taloi.root.title"),
                        new TranslatableComponent("advancements.taloi.root.description"),
                        new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/advancements/backgrounds/taloi.png"),
                        FrameType.TASK, false, false, false)
                .addCriterion("evergreen", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.EVERGREEN_LOG.get()))
                .addCriterion("limestone", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.LIMESTONE.get()))
                .addCriterion("marble", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.MARBLE.get()))
                .addCriterion("slate", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.SLATE.get()))
                .addCriterion("willow", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.WILLOW_LOG.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "root");

        Advancement.Builder.advancement().parent(root)
                .display(TaloiItems.REFINED_URANIUM.get(),
                        new TranslatableComponent("advancements.taloi.radioactive.title"),
                        new TranslatableComponent("advancements.taloi.radioactive.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("uranium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.REFINED_URANIUM.get()))
                .save(consumer, loc + "radioactive");

        Advancement.Builder.advancement().parent(root)
                .display(TaloiItems.TOPAZ.get(),
                        new TranslatableComponent("advancements.taloi.shiny.title"),
                        new TranslatableComponent("advancements.taloi.shiny.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("malachite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.MALACHITE.get()))
                .addCriterion("tanzanite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.TANZANITE.get()))
                .addCriterion("topaz", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.TOPAZ.get()))
                .save(consumer, loc + "shiny");

        Advancement machinery = Advancement.Builder.advancement().parent(root)
                .display(TaloiItems.UNSTABLE_MACHINE_FRAME.get(),
                        new TranslatableComponent("advancements.taloi.machinery.title"),
                        new TranslatableComponent("advancements.taloi.machinery.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("alpha", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.ALPHA_MACHINE_FRAME.get()))
                .addCriterion("beta", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.BETA_MACHINE_FRAME.get()))
                .addCriterion("unstable", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.UNSTABLE_MACHINE_FRAME.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "machinery");

        Advancement constructAlloy = Advancement.Builder.advancement().parent(machinery)
                .display(TaloiItems.STEEL_INGOT.get(),
                        new TranslatableComponent("advancements.taloi.construct_alloy.title"),
                        new TranslatableComponent("advancements.taloi.construct_alloy.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("bronze", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.BRONZE_INGOT.get()))
                .addCriterion("carbonite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.CARBONITE.get()))
                .addCriterion("ferroniobium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FERRONIOBIUM_INGOT.get()))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FUTURITE.get()))
                .addCriterion("hardened_carbonite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.HARDENED_CARBONITE.get()))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM.get()))
                .addCriterion("steel", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.STEEL_INGOT.get()))
                .addCriterion("alloy_x", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.ALLOY_X.get()))
                .addCriterion("alloy_z", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.ALLOY_Z.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "construct_alloy");

        Advancement.Builder.advancement().parent(machinery)
                .display(TaloiItems.SILICON_PLATE.get(),
                        new TranslatableComponent("advancements.taloi.press_material.title"),
                        new TranslatableComponent("advancements.taloi.press_material.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("alloy", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.ALLOY_PLATE.get()))
                .addCriterion("bronze", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.BRONZE_PLATE.get()))
                .addCriterion("carbon", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.CARBON_PLATE.get()))
                .addCriterion("copper", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.COPPER_PLATE.get()))
                .addCriterion("diamond", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.DIAMOND_PLATE.get()))
                .addCriterion("forge", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FORGE_PLATE.get()))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FUTURITE_PLATE.get()))
                .addCriterion("gold", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.GOLD_DISK.get()))
                .addCriterion("induction", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.INDUCTION_PLATE.get()))
                .addCriterion("magnesium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.MAGNESIUM_PLATE.get()))
                .addCriterion("reinforced_copper", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.REINFORCED_COPPER_PLATE.get()))
                .addCriterion("semiconductor", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SEMICONDUCTOR_PLATE.get()))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_PLATE.get()))
                .addCriterion("silicon", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SILICON_PLATE.get()))
                .addCriterion("steel", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.STEEL_PLATE.get()))
                .addCriterion("tungsten", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.TUNGSTEN_PLATE.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "press_material");

        Advancement.Builder.advancement().parent(machinery)
                .display(TaloiItems.COAL_INFUSED_IRON_INGOT.get(),
                        new TranslatableComponent("advancements.taloi.infuse_ingot.title"),
                        new TranslatableComponent("advancements.taloi.infuse_ingot.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("coal_iron", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.COAL_INFUSED_IRON_INGOT.get()))
                .addCriterion("coal_lead", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.COAL_INFUSED_LEAD_INGOT.get()))
                .addCriterion("diamond_steel", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.DIAMOND_INFUSED_STEEL_INGOT.get()))
                .addCriterion("diamond_tin", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.DIAMOND_INFUSED_TIN_INGOT.get()))
                .addCriterion("diamond_uranium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.DIAMOND_INFUSED_URANIUM.get()))
                .addCriterion("emerald_osmium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.EMERALD_INFUSED_OSMIUM_INGOT.get()))
                .addCriterion("emerald_tungsten", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.EMERALD_INFUSED_TUNGSTEN_INGOT.get()))
                .addCriterion("emerald_zinc", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.EMERALD_INFUSED_ZINC_INGOT.get()))
                .addCriterion("futurite_netherite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FUTURITE_INFUSED_NETHERITE_INGOT.get()))
                .addCriterion("sermium_netherite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_INFUSED_NETHERITE_INGOT.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "infuse_ingot");

        Advancement obtainSermium = Advancement.Builder.advancement().parent(constructAlloy)
                .display(TaloiItems.SERMIUM.get(),
                        new TranslatableComponent("advancements.taloi.obtain_sermium.title"),
                        new TranslatableComponent("advancements.taloi.obtain_sermium.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25))
                .addCriterion("sermium", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM.get()))
                .save(consumer, loc + "obtain_sermium");

        Advancement.Builder.advancement().parent(obtainSermium)
                .display(TaloiItems.SERMIUM_CHESTPLATE.get(),
                        new TranslatableComponent("advancements.taloi.sermium_armor.title"),
                        new TranslatableComponent("advancements.taloi.sermium_armor.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(50))
                .addCriterion("helmet", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_HELMET.get()))
                .addCriterion("chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_CHESTPLATE.get()))
                .addCriterion("leggings", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_LEGGINGS.get()))
                .addCriterion("boots", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.SERMIUM_BOOTS.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "sermium_armor");

        Advancement obtainFuturite = Advancement.Builder.advancement().parent(obtainSermium)
                .display(TaloiItems.FUTURITE.get(),
                        new TranslatableComponent("advancements.taloi.obtain_futurite.title"),
                        new TranslatableComponent("advancements.taloi.obtain_futurite.description"),
                        null, FrameType.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25))
                .addCriterion("futurite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FUTURITE.get()))
                .save(consumer, loc + "obtain_futurite");

        Advancement.Builder.advancement().parent(obtainFuturite)
                .display(TaloiItems.FUTURITE_CHESTPLATE.get(),
                        new TranslatableComponent("advancements.taloi.futurite_armor.title"),
                        new TranslatableComponent("advancements.taloi.futurite_armor.description"),
                        null, FrameType.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100))
                .addCriterion("armor", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.FUTURITE_HELMET.get(), TaloiItems.FUTURITE_CHESTPLATE.get(), TaloiItems.FUTURITE_LEGGINGS.get(), TaloiItems.FUTURITE_BOOTS.get()))
                .save(consumer, loc + "futurite_armor");

        Advancement.Builder.advancement().parent(obtainFuturite)
                .display(TaloiItems.FUTURITE_APPLE.get(),
                        new TranslatableComponent("advancements.taloi.eat_futurite_apple.title"),
                        new TranslatableComponent("advancements.taloi.eat_futurite_apple.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("destabilized_apple", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.DESTABILIZED_FUTURITE_APPLE.get()))
                .save(consumer, loc + "eat_futurite_apple");
    }
}
