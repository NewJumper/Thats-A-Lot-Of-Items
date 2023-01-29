package com.newjumper.taloi.datagen.data;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends AdvancementProvider {
    public ModAdvancementsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, existingFileHelper);
    }

    @Override
    protected void registerAdvancements(@NotNull Consumer<Advancement> consumer, @NotNull ExistingFileHelper fileHelper) {
        String loc = ThatsALotOfItems.MOD_ID + ":main/";

        Advancement root = Advancement.Builder.advancement().display(TaloiBlocks.SLATE.get(),
                        Component.translatable("advancements.taloi.root.title"),
                        Component.translatable("advancements.taloi.root.description"),
                        new ResourceLocation(ThatsALotOfItems.MOD_ID, "textures/gui/advancements/backgrounds/taloi.png"),
                        FrameType.TASK, false, false, false)
                .addCriterion("evergreen", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.EVERGREEN_LOG.get()))
                .addCriterion("limestone", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.LIMESTONE.get()))
                .addCriterion("marble", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.MARBLE.get()))
                .addCriterion("slate", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.SLATE.get()))
                .addCriterion("willow", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiBlocks.WILLOW_LOG.get()))
                .requirements(RequirementsStrategy.OR).save(consumer, loc + "root");

        Advancement.Builder.advancement().parent(root)
                .display(TaloiItems.TOPAZ.get(),
                        Component.translatable("advancements.taloi.shiny.title"),
                        Component.translatable("advancements.taloi.shiny.description"),
                        null, FrameType.TASK, true, true, false)
                .addCriterion("malachite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.MALACHITE.get()))
                .addCriterion("tanzanite", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.TANZANITE.get()))
                .addCriterion("topaz", InventoryChangeTrigger.TriggerInstance.hasItems(TaloiItems.TOPAZ.get()))
                .save(consumer, loc + "shiny");
    }
}
