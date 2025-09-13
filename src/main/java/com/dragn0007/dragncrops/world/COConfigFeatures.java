package com.dragn0007.dragncrops.world;


import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OBushBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class COConfigFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARROTS = registerKey("carrots");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POTATOES = registerKey("potatoes");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHEAT = registerKey("wheat");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEETROOTS = registerKey("beetroots");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKBERRIES = registerKey("blackberries");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUEBERRIES = registerKey("blueberries");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RASPBERRIES = registerKey("raspberries");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_RASPBERRIES = registerKey("white_raspberries");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CARROTS = registerKey("purple_carrots");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CARROTS = registerKey("yellow_carrots");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_POTATOES = registerKey("purple_potatoes");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_POTATOES = registerKey("red_potatoes");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CORN = registerKey("corn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RYE = registerKey("rye");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRANBERRIES = registerKey("cranberries");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRIES = registerKey("strawberries");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEANUTS = registerKey("peanuts");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, PEANUTS, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_PEANUTS.get().defaultBlockState())))));

        register(context, STRAWBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_STRAWBERRIES.get().defaultBlockState())))));

        register(context, CRANBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_CRANBERRIES.get().defaultBlockState())))));

        register(context, CORN, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_CORN.get().defaultBlockState())))));

        register(context, RYE, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_RYE.get().defaultBlockState())))));


        register(context, BLACKBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(12, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.BLACKBERRIES.get().defaultBlockState()
                                .setValue(OBushBlock.AGE, Integer.valueOf(4)))))));

        register(context, BLUEBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.BLUEBERRIES.get().defaultBlockState()
                                .setValue(OBushBlock.AGE, Integer.valueOf(4)))))));

        register(context, RASPBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(12, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.RASPBERRIES.get().defaultBlockState()
                                .setValue(OBushBlock.AGE, Integer.valueOf(4)))))));

        register(context, WHITE_RASPBERRIES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(12, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WHITE_RASPBERRIES.get().defaultBlockState()
                                .setValue(OBushBlock.AGE, Integer.valueOf(4)))))));


        register(context, PURPLE_CARROTS, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_PURPLE_CARROTS.get().defaultBlockState())))));

        register(context, YELLOW_CARROTS, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_YELLOW_CARROTS.get().defaultBlockState())))));

        register(context, PURPLE_POTATOES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_PURPLE_POTATOES.get().defaultBlockState())))));

        register(context, RED_POTATOES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(8, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_RED_POTATOES.get().defaultBlockState())))));


        register(context, CARROTS, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_CARROTS.get().defaultBlockState())))));

        register(context, POTATOES, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_POTATOES.get().defaultBlockState())))));

        register(context, WHEAT, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_WHEAT.get().defaultBlockState())))));

        register(context, BEETROOTS, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(COBlocks.WILD_BEETROOTS.get().defaultBlockState())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(CropOverhaul.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


