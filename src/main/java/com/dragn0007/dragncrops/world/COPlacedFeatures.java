package com.dragn0007.dragncrops.world;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.world.BiomeModifier;

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
    public static final ResourceKey<PlacedFeature> CRANBERRIES = registerKey("cranberries");
    public static final ResourceKey<PlacedFeature> STRAWBERRIES = registerKey("strawberries");
    public static final ResourceKey<PlacedFeature> PEANUTS = registerKey("peanuts");
    public static final ResourceKey<PlacedFeature> CUCUMBERS = registerKey("cucumbers");
    public static final ResourceKey<PlacedFeature> GARLIC = registerKey("garlic");
    public static final ResourceKey<PlacedFeature> RICE = registerKey("rice");
    public static final ResourceKey<PlacedFeature> SUGAR_BEETS = registerKey("sugar_beets");
    public static final ResourceKey<PlacedFeature> HONEYDEW = registerKey("honeydew");
    public static final ResourceKey<PlacedFeature> CANTALOUPE = registerKey("cantaloupe");
    public static final ResourceKey<PlacedFeature> CILANTRO = registerKey("cilantro");
    public static final ResourceKey<PlacedFeature> OREGANO = registerKey("oregano");
    public static final ResourceKey<PlacedFeature> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<PlacedFeature> RED_APPLE_TREE = registerKey("red_apple_tree");
    public static final ResourceKey<PlacedFeature> YELLOW_APPLE_TREE = registerKey("yellow_apple_tree");
    public static final ResourceKey<PlacedFeature> GREEN_APPLE_TREE = registerKey("green_apple_tree");
    public static final ResourceKey<PlacedFeature> CHERRY_TREE = registerKey("cherry_tree");
    public static final ResourceKey<PlacedFeature> COCONUT_TREE = registerKey("coconut_tree");
    public static final ResourceKey<PlacedFeature> LIME_TREE = registerKey("lime_tree");
    public static final ResourceKey<PlacedFeature> MANGO_TREE = registerKey("mango_tree");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RED_APPLE_TREE, configuredFeatures.getOrThrow(COConfigFeatures.RED_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.RED_APPLE_SAPLING.get()));

        register(context, YELLOW_APPLE_TREE, configuredFeatures.getOrThrow(COConfigFeatures.YELLOW_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.YELLOW_APPLE_SAPLING.get()));

        register(context, GREEN_APPLE_TREE, configuredFeatures.getOrThrow(COConfigFeatures.GREEN_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.GREEN_APPLE_SAPLING.get()));

        register(context, MANGO_TREE, configuredFeatures.getOrThrow(COConfigFeatures.MANGO_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.MANGO_SAPLING.get()));

        register(context, LIME_TREE, configuredFeatures.getOrThrow(COConfigFeatures.LIME_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.LIME_SAPLING.get()));

        register(context, COCONUT_TREE, configuredFeatures.getOrThrow(COConfigFeatures.COCONUT_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.COCONUT_SAPLING.get()));

        register(context, CHERRY_TREE, configuredFeatures.getOrThrow(COConfigFeatures.CHERRY_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        COBlocks.CHERRY_SAPLING.get()));

        register(context, HONEYDEW, configuredFeatures.getOrThrow(COConfigFeatures.HONEYDEW),
                List.of(RarityFilter.onAverageOnceEvery(72),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, CANTALOUPE, configuredFeatures.getOrThrow(COConfigFeatures.CANTALOUPE),
                List.of(RarityFilter.onAverageOnceEvery(72),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, SUGAR_BEETS, configuredFeatures.getOrThrow(COConfigFeatures.SUGAR_BEETS),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, CILANTRO, configuredFeatures.getOrThrow(COConfigFeatures.CILANTRO),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, OREGANO, configuredFeatures.getOrThrow(COConfigFeatures.OREGANO),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, ROSEMARY, configuredFeatures.getOrThrow(COConfigFeatures.ROSEMARY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RICE, configuredFeatures.getOrThrow(COConfigFeatures.RICE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, GARLIC, configuredFeatures.getOrThrow(COConfigFeatures.GARLIC),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, CUCUMBERS, configuredFeatures.getOrThrow(COConfigFeatures.CUCUMBERS),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, PEANUTS, configuredFeatures.getOrThrow(COConfigFeatures.PEANUTS),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, STRAWBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.STRAWBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, CRANBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.CRANBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, CORN, configuredFeatures.getOrThrow(COConfigFeatures.CORN),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RYE, configuredFeatures.getOrThrow(COConfigFeatures.RYE),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, BLACKBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.BLACKBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, BLUEBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.BLUEBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RASPBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.RASPBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, WHITE_RASPBERRIES, configuredFeatures.getOrThrow(COConfigFeatures.WHITE_RASPBERRIES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, PURPLE_CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.PURPLE_CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, YELLOW_CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.YELLOW_CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, PURPLE_POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.PURPLE_POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, RED_POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.RED_POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));


        register(context, CARROTS, configuredFeatures.getOrThrow(COConfigFeatures.CARROTS),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, POTATOES, configuredFeatures.getOrThrow(COConfigFeatures.POTATOES),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, WHEAT, configuredFeatures.getOrThrow(COConfigFeatures.WHEAT),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()));

        register(context, BEETROOTS, configuredFeatures.getOrThrow(COConfigFeatures.BEETROOTS),
                List.of(RarityFilter.onAverageOnceEvery(64),
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
