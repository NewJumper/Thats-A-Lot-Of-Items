package com.newjumper.taloi.screen;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<MenuType<ConstructorMenu>> CONSTRUCTOR_MENU = registerMenuType("constructor_menu", ConstructorMenu::new);
    public static final RegistryObject<MenuType<UnstableConstructorMenu>> UNSTABLE_CONSTRUCTOR_MENU = registerMenuType("unstable_constructor_menu", UnstableConstructorMenu::new);
    public static final RegistryObject<MenuType<HydraulicPressMenu>> HYDRAULIC_PRESS_MENU = registerMenuType("hydraulic_press_menu", HydraulicPressMenu::new);
    public static final RegistryObject<MenuType<UnstableHydraulicPressMenu>> UNSTABLE_HYDRAULIC_PRESS_MENU = registerMenuType("unstable_hydraulic_press_menu", UnstableHydraulicPressMenu::new);
    public static final RegistryObject<MenuType<ProcessorMenu>> PROCESSOR_MENU = registerMenuType("processor_menu", ProcessorMenu::new);
    public static final RegistryObject<MenuType<SeparatorMenu>> SEPARATOR_MENU = registerMenuType("separator_menu", SeparatorMenu::new);

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> pFactory) {
        return MENUS.register(name, () -> IForgeMenuType.create(pFactory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
