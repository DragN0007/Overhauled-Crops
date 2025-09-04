package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.datagen.biglooter.COLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CropOverhaul.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), COLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new CORecipeMaker(packOutput));
        generator.addProvider(event.includeClient(), new COBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new COItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new COWorldGenerator(packOutput, lookupProvider));
    }
}
