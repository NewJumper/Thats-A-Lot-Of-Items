package com.newjumper.taloi;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.painting.TaloiPaintings;
import com.newjumper.taloi.sound.TaloiSounds;
import com.newjumper.taloi.util.ModItemProperties;
import com.newjumper.taloi.world.ConfiguredFeatures;
import com.newjumper.taloi.world.PlacedFeatures;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.List;

@Mod(ThatsALotOfItems.MOD_ID)
public class ThatsALotOfItems {
    public static final String MOD_ID = "taloi";

    public ThatsALotOfItems() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TaloiSounds.SOUND_EVENTS.register(eventBus);
        TaloiBlocks.BLOCKS.register(eventBus);
        ConfiguredFeatures.CONFIGURED_FEATURES.register(eventBus);
        PlacedFeatures.PLACED_FEATURES.register(eventBus);
        TaloiItems.ITEMS.register(eventBus);
        TaloiPaintings.PAINTINGS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class TALOIClient {
        @SubscribeEvent
        public static void clientSetup(final FMLClientSetupEvent event) {
            ModItemProperties.addItemProperties();
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    public static class TALOIEvents {
        @SubscribeEvent
        public static void addGemTrades(final WandererTradesEvent pTradesEvent) {
            List<VillagerTrades.ItemListing> wanderingTrades = pTradesEvent.getRareTrades();
            ItemStack amethyst = new ItemStack(Items.AMETHYST_SHARD, 4);
            ItemStack malachite = new ItemStack(TaloiItems.MALACHITE.get(), 6);
            ItemStack tanzanite = new ItemStack(TaloiItems.TANZANITE.get(), 6);
            ItemStack topaz = new ItemStack(TaloiItems.TOPAZ.get(), 6);

            wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), amethyst, 8, 0, 0)));
            wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), malachite, 16, 0, 0)));
            wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), tanzanite, 16, 0, 0)));
            wanderingTrades.add(((pTrader, pRand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), topaz, 16, 0, 0)));
        }
    }
}
