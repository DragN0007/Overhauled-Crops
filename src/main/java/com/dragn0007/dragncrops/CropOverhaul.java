package com.dragn0007.dragncrops;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.items.COItemGroup;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CropOverhaul.MODID)
public class CropOverhaul {

    public static final String MODID = "dragncrops";

    public CropOverhaul() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        COItems.register(eventBus);
        COItemGroup.register(eventBus);
        COBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}