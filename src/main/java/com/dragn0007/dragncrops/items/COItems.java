package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class COItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CropOverhaul.MODID);

//    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam",
//            () -> new ItemNameBlockItem(COBlocks.BLACKBERRY_JAM.get(), (new Item.Properties())));

    public static final RegistryObject<Item> CROP_OVERHAUL = ITEMS.register("crop_overhaul",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}