package com.dragn0007.dragncrops.common.gui;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class COMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CropOverhaul.MODID);

    public static final RegistryObject<MenuType<TeapotMenu>> TEAPOT_MENU = registerMenuType("teapot_menu", TeapotMenu::new);
    public static final RegistryObject<MenuType<PotMenu>> POT_MENU = registerMenuType("pot_menu", PotMenu::new);
    public static final RegistryObject<MenuType<WineBarrelMenu>> WINE_BARREL_MENU = registerMenuType("wine_barrel_menu", WineBarrelMenu::new);
    public static final RegistryObject<MenuType<DistillerMenu>> DISTILLER_MENU = registerMenuType("distiller_menu", DistillerMenu::new);

    public static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENU_TYPES.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }
}
