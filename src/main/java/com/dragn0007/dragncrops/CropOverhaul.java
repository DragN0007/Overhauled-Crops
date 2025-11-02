package com.dragn0007.dragncrops;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.items.COItemGroup;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CropOverhaul.MODID)
public class CropOverhaul {

    public static final String MODID = "dragncrops";

    public CropOverhaul() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        COItems.register(eventBus);
        COItemGroup.register(eventBus);
        COBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent event) {
        ComposterBlock.COMPOSTABLES.put(COItems.CANTALOUPE.get(), 0.75F);
        ComposterBlock.COMPOSTABLES.put(COItems.HONEYDEW.get(), 0.75F);
        ComposterBlock.COMPOSTABLES.put(COItems.COCONUT.get(), 0.75F);

        ComposterBlock.COMPOSTABLES.put(COItems.YELLOW_APPLE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.GREEN_APPLE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.YELLOW_CARROT.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.PURPLE_CARROT.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.RED_POTATO.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.PURPLE_POTATO.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.CORN.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.RICE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.RYE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.CANTALOUPE_SLICE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.HONEYDEW_SLICE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.CUCUMBER.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.GARLIC.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.SUGAR_BEET.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.CHERRIES.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.MANGO.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(COItems.LIME.get(), 0.65F);

        ComposterBlock.COMPOSTABLES.put(COItems.BLACKBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(COItems.BLUEBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(COItems.RASPBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(COItems.CRANBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(COItems.STRAWBERRY.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(COItems.PEANUT.get(), 0.5F);

        ComposterBlock.COMPOSTABLES.put(COItems.CILANTRO.get(), 0.4F);
        ComposterBlock.COMPOSTABLES.put(COItems.OREGANO.get(), 0.4F);
        ComposterBlock.COMPOSTABLES.put(COItems.ROSEMARY.get(), 0.4F);

        ComposterBlock.COMPOSTABLES.put(COItems.CORN_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(COItems.RICE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(COItems.RYE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(COItems.CANTALOUPE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(COItems.HONEYDEW_SEEDS.get(), 0.3F);
    }
}