package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class COItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CropOverhaul.MODID);

    public static final RegistryObject<CreativeModeTab> CROP_OVERHAUL_GROUP = CREATIVE_MODE_TABS.register("overhauled_crops",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(COItems.CROP_OVERHAUL.get())).title(Component.translatable("itemGroup.overhauled_crops"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(COBlocks.BLACKBERRY_JAM.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
