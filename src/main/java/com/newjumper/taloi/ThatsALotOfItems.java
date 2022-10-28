package com.newjumper.taloi;

import com.newjumper.taloi.block.TaloiBlocks;
import com.newjumper.taloi.block.entity.TaloiBlockEntities;
import com.newjumper.taloi.item.TaloiItems;
import com.newjumper.taloi.painting.TaloiPaintings;
import com.newjumper.taloi.recipe.*;
import com.newjumper.taloi.screen.*;
import com.newjumper.taloi.sound.TaloiSounds;
import com.newjumper.taloi.util.ModItemProperties;
import com.newjumper.taloi.world.ConfiguredFeatures;
import com.newjumper.taloi.world.PlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

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
        TaloiBlockEntities.BLOCK_ENTITIES.register(eventBus);
        TaloiPaintings.PAINTINGS.register(eventBus);
        TaloiMenuTypes.MENUS.register(eventBus);
        TaloiRecipes.RECIPE_SERIALIZERS.register(eventBus);

        eventBus.addListener(this::registerRecipeTypes);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void registerRecipeTypes(final RegisterEvent event) {
        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
            helper.register(new ResourceLocation(MOD_ID, "constructing"), ConstructingRecipe.Type.INSTANCE);
            helper.register(new ResourceLocation(MOD_ID, "unstable_constructing"), UnstableConstructingRecipe.Type.INSTANCE);
            helper.register(new ResourceLocation(MOD_ID, "pressing"), PressingRecipe.Type.INSTANCE);
            helper.register(new ResourceLocation(MOD_ID, "unstable_pressing"), UnstablePressingRecipe.Type.INSTANCE);
            helper.register(new ResourceLocation(MOD_ID, "processing"), ProcessingRecipe.Type.INSTANCE);
            helper.register(new ResourceLocation(MOD_ID, "separating"), SeparatingRecipe.Type.INSTANCE);
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class TALOIClient {
        @SubscribeEvent
        public static void clientSetup(final FMLClientSetupEvent event) {
            MenuScreens.register(TaloiMenuTypes.CONSTRUCTOR_MENU.get(), ConstructorScreen::new);
            MenuScreens.register(TaloiMenuTypes.UNSTABLE_CONSTRUCTOR_MENU.get(), UnstableConstructorScreen::new);
            MenuScreens.register(TaloiMenuTypes.HYDRAULIC_PRESS_MENU.get(), HydraulicPressScreen::new);
            MenuScreens.register(TaloiMenuTypes.UNSTABLE_HYDRAULIC_PRESS_MENU.get(), UnstableHydraulicPressScreen::new);
            MenuScreens.register(TaloiMenuTypes.PROCESSOR_MENU.get(), ProcessorScreen::new);
            MenuScreens.register(TaloiMenuTypes.SEPARATOR_MENU.get(), SeparatorScreen::new);

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
