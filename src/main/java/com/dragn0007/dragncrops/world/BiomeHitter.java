package com.dragn0007.dragncrops.world;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.crop.BlackberryBushBlock;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeHitter {

    public static final ResourceKey<BiomeModifier> CARROTS = registerKey("carrots");
    public static final ResourceKey<BiomeModifier> POTATOES = registerKey("potatoes");
    public static final ResourceKey<BiomeModifier> WHEAT = registerKey("wheat");
    public static final ResourceKey<BiomeModifier> BEETROOTS = registerKey("beetroots");

    public static final ResourceKey<BiomeModifier> BLACKBERRIES = registerKey("blackberries");
    public static final ResourceKey<BiomeModifier> BLUEBERRIES = registerKey("blueberries");
    public static final ResourceKey<BiomeModifier> RASPBERRIES = registerKey("raspberries");
    public static final ResourceKey<BiomeModifier> WHITE_RASPBERRIES = registerKey("white_raspberries");

    public static final ResourceKey<BiomeModifier> PURPLE_CARROTS = registerKey("purple_carrots");
    public static final ResourceKey<BiomeModifier> YELLOW_CARROTS = registerKey("yellow_carrots");
    public static final ResourceKey<BiomeModifier> PURPLE_POTATOES = registerKey("purple_potatoes");
    public static final ResourceKey<BiomeModifier> RED_POTATOES = registerKey("red_potatoes");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(CARROTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CARROTS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(POTATOES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.POTATOES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WHEAT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.WHEAT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BEETROOTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.BEETROOTS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        context.register(BLACKBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.BLACKBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BLUEBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.BLUEBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(RASPBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.RASPBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WHITE_RASPBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.WHITE_RASPBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        context.register(PURPLE_CARROTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.PURPLE_CARROTS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(YELLOW_CARROTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.YELLOW_CARROTS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PURPLE_POTATOES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.PURPLE_POTATOES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(RED_POTATOES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.RED_POTATOES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(CropOverhaul.MODID, name));
    }
}