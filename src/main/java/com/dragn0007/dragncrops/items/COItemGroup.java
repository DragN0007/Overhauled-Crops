package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class COItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CropOverhaul.MODID);

    public static final RegistryObject<CreativeModeTab> CROP_OVERHAUL_GROUP = CREATIVE_MODE_TABS.register("overhauled_crops",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(COItems.CROP_OVERHAUL.get())).title(Component.translatable("itemGroup.overhauled_crops"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(Items.APPLE);
                        output.accept(COItems.YELLOW_APPLE.get());
                        output.accept(COItems.GREEN_APPLE.get());
                        output.accept(Items.CARROT);
                        output.accept(COItems.YELLOW_CARROT.get());
                        output.accept(COItems.PURPLE_CARROT.get());
                        output.accept(Items.POTATO);
                        output.accept(COItems.RED_POTATO.get());
                        output.accept(COItems.PURPLE_POTATO.get());

                        output.accept(Items.BREAD);
                        output.accept(COItems.BLUEBERRY_BREAD.get());
                        output.accept(COItems.CRANBERRY_BREAD.get());
                        output.accept(COItems.NUT_BREAD.get());
                        output.accept(COItems.RYE_BREAD.get());
                        output.accept(COItems.WHITE_BREAD.get());

                        output.accept(COItems.APPLE_JAM.get());
                        output.accept(COItems.BLACKBERRY_JAM.get());
                        output.accept(COItems.BLUEBERRY_JAM.get());
                        output.accept(COItems.CANTALOUPE_JAM.get());
                        output.accept(COItems.CHERRY_JAM.get());
                        output.accept(COItems.CRANBERRY_JAM.get());
                        output.accept(COItems.MANGO_JAM.get());
                        output.accept(COItems.MELON_JAM.get());
                        output.accept(COItems.RASPBERRY_JAM.get());
                        output.accept(COItems.STRAWBERRY_JAM.get());
                        output.accept(COItems.WATERMELON_JAM.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
