package com.newjumper.taloi.event.loot;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class TheCavesAddition extends LootModifier {
    private final Item addition;

    public TheCavesAddition(LootItemCondition[] pConditionsIn, Item pAddition) {
        super(pConditionsIn);
        this.addition = pAddition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> pGeneratedLoot, LootContext pContext) {
        if(pContext.getRandom().nextFloat() < 0.04)
            pGeneratedLoot.add(new ItemStack(addition, 1));
        return pGeneratedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<TheCavesAddition> {
        @Override
        public TheCavesAddition read(ResourceLocation location, JsonObject object, LootItemCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new TheCavesAddition(conditionsIn, addition);
        }

        @Override
        public JsonObject write(TheCavesAddition instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());

            return json;
        }
    }
}
