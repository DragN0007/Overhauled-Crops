package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.world.BiomeHitter;
import com.dragn0007.dragncrops.world.COConfigFeatures;
import com.dragn0007.dragncrops.world.COPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class COWorldGenerator extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, COConfigFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, COPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeHitter::bootstrap);

    public COWorldGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(CropOverhaul.MODID));
    }
}
