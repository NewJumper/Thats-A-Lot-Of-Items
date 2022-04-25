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

    public static final RegistryObject<MenuType<ConstructorMenu>> CONSTRUCTOR_MENU = registerMenuType(ConstructorMenu::new, "constructor_menu");
    public static final RegistryObject<MenuType<UnstableConstructorMenu>> UNSTABLE_CONSTRUCTOR_MENU = registerMenuType(UnstableConstructorMenu::new, "unstable_constructor_menu");
    public static final RegistryObject<MenuType<HydraulicPressMenu>> HYDRAULIC_PRESS_MENU = registerMenuType(HydraulicPressMenu::new, "hydraulic_press_menu");
    public static final RegistryObject<MenuType<UnstableHydraulicPressMenu>> UNSTABLE_HYDRAULIC_PRESS_MENU = registerMenuType(UnstableHydraulicPressMenu::new, "unstable_hydraulic_press_menu");
    public static final RegistryObject<MenuType<ProcessorMenu>> PROCESSOR_MENU = registerMenuType(ProcessorMenu::new, "processor_menu");
    public static final RegistryObject<MenuType<SeparatorMenu>> SEPARATOR_MENU = registerMenuType(SeparatorMenu::new, "separator_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
