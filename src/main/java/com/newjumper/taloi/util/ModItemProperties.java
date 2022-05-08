package com.newjumper.taloi.util;

import com.newjumper.taloi.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static void addModItemProperties() {
        addBow(ModItems.NETHERITE_BOW.get());
    }

    private static void addBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (itemStack, level, entity, i) -> {
            if (entity == null) return 0.0F;
            else return entity.getUseItem() != itemStack ? 0.0F : (float)(itemStack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0F;
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (itemStack, level, entity, i) -> entity != null && entity.isUsingItem() && entity.getUseItem() == itemStack ? 1.0F : 0.0F);
    }
}
