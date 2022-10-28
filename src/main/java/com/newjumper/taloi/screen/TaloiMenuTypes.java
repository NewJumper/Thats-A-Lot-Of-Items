package com.newjumper.taloi.screen;

import com.newjumper.taloi.ThatsALotOfItems;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TaloiMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<MenuType<ConstructorMenu>> CONSTRUCTOR_MENU = MENUS.register("constructor_menu", () -> IForgeMenuType.create(ConstructorMenu::new));
    public static final RegistryObject<MenuType<UnstableConstructorMenu>> UNSTABLE_CONSTRUCTOR_MENU = MENUS.register("unstable_constructor_menu", () -> IForgeMenuType.create(UnstableConstructorMenu::new));
    public static final RegistryObject<MenuType<HydraulicPressMenu>> HYDRAULIC_PRESS_MENU = MENUS.register("hydraulic_press_menu", () -> IForgeMenuType.create(HydraulicPressMenu::new));
    public static final RegistryObject<MenuType<UnstableHydraulicPressMenu>> UNSTABLE_HYDRAULIC_PRESS_MENU = MENUS.register("unstable_hydraulic_press_menu", () -> IForgeMenuType.create(UnstableHydraulicPressMenu::new));
    public static final RegistryObject<MenuType<ProcessorMenu>> PROCESSOR_MENU = MENUS.register("processor_menu", () -> IForgeMenuType.create(ProcessorMenu::new));
    public static final RegistryObject<MenuType<SeparatorMenu>> SEPARATOR_MENU = MENUS.register("separator_menu", () -> IForgeMenuType.create(SeparatorMenu::new));
}
