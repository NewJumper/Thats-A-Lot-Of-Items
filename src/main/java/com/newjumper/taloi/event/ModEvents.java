package com.newjumper.taloi.event;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.item.ModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ThatsALotOfItems.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(WandererTradesEvent tradesEvent) {
        List<VillagerTrades.ItemListing> wanderingTrades = tradesEvent.getRareTrades();
        ItemStack amethyst = new ItemStack(Items.AMETHYST_SHARD, 4);
        ItemStack malachite = new ItemStack(ModItems.MALACHITE.get(), 6);
        ItemStack tanzanite = new ItemStack(ModItems.TANZANITE.get(), 6);
        ItemStack topaz = new ItemStack(ModItems.TOPAZ.get(), 6);

        wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), amethyst, 8, 0, 0)));
        wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), malachite, 16, 0, 0)));
        wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), tanzanite, 16, 0, 0)));
        wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), topaz, 16, 0, 0)));
    }
}
