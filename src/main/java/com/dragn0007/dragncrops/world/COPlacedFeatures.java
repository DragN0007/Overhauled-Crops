package com.dragn0007.dragncrops.world;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class COPlacedFeatures {
    public static final ResourceKey<PlacedFeature> CARROTS = registerKey("carrots");
    public static final ResourceKey<PlacedFeature> POTATOES = registerKey("potatoes");
    public static final ResourceKey<PlacedFeature> WHEAT = registerKey("wheat");
    public static final ResourceKey<PlacedFeature> BEETROOTS = registerKey("beetroots");

    public static final ResourceKey<PlacedFeature> BLACKBERRIES = registerKey("blackberries");
    public static final ResourceKey<PlacedFeature> BLUEBERRIES = registerKey("blueberries");
    public static final ResourceKey<PlacedFeature> RASPBERRIES = registerKey("raspberries");
    public static final ResourceKey<PlacedFeature> WHITE_RASPBERRIES = registerKey("white_raspberries");

    public static final ResourceKey<PlacedFeature> PURPLE_CARROTS = registerKey("purple_carrots");
    public static final ResourceKey<PlacedFeature> YELLOW_CARROTS = registerKey("yellow_carrots");
    public static final ResourceKey<PlacedFeature> PURPLE_POTATOES = registerKey("purple_potatoes");
    public static final ResourceKey<PlacedFeature> RED_POTATOES = registerKey("red_potatoes");

    public static final ResourceKey<PlacedFeature> CORN = registerKey("corn");
    public static final ResourceKey<PlacedFeature> RYE = registerKey("rye");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CORN, configuredFeatures.getOrThrow(COConfigFeatures.CORN),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RYE, configuredFeatures.getOrThrow(COConfigFeatures.RYE),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, BLACKBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.BLACKBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, BLUEBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.BLUEBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RASPBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.RASPBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, WHITE_RASPBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.WHITE_RASPBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, PURPLE_CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.PURPLE_CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, YELLOW_CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.YELLOW_CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, PURPLE_POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.PURPLE_POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RED_POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.RED_POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, WHEAT, configuredFeatures.getOrThrow(COConfigFeatures.WHEAT),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, BEETROOTS, configuredFeatures.getOrThrow(COConfigFeatures.BEETROOTS),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));
    }

    public static ResourceKey<PlacedFeature> registerKey (String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CropOverhaul.MODID, name));
    }
    public static void register
    (BootstapContext < PlacedFeature > context, ResourceKey < PlacedFeature > key, Holder < ConfiguredFeature < ?, ?>>
    configuration,
            List < PlacementModifier > modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
