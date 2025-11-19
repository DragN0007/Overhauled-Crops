package com.dragn0007.dragncrops.world;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
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

    public static final ResourceKey<BiomeModifier> PURPLE_CARROTS = registerKey("purple_carrots");
    public static final ResourceKey<BiomeModifier> YELLOW_CARROTS = registerKey("yellow_carrots");
    public static final ResourceKey<BiomeModifier> PURPLE_POTATOES = registerKey("purple_potatoes");
    public static final ResourceKey<BiomeModifier> RED_POTATOES = registerKey("red_potatoes");

    public static final ResourceKey<BiomeModifier> CORN = registerKey("corn");
    public static final ResourceKey<BiomeModifier> RYE = registerKey("rye");
    public static final ResourceKey<BiomeModifier> CRANBERRIES = registerKey("cranberries");
    public static final ResourceKey<BiomeModifier> STRAWBERRIES = registerKey("strawberries");
    public static final ResourceKey<BiomeModifier> PEANUTS = registerKey("peanuts");
    public static final ResourceKey<BiomeModifier> CUCUMBERS = registerKey("cucumbers");
    public static final ResourceKey<BiomeModifier> GARLIC = registerKey("garlic");
    public static final ResourceKey<BiomeModifier> RICE = registerKey("rice");
    public static final ResourceKey<BiomeModifier> SUGAR_BEETS = registerKey("sugar_beets");
    public static final ResourceKey<BiomeModifier> HONEYDEW = registerKey("honeydew");
    public static final ResourceKey<BiomeModifier> CANTALOUPE = registerKey("cantaloupe");
    public static final ResourceKey<BiomeModifier> CILANTRO = registerKey("cilantro");
    public static final ResourceKey<BiomeModifier> OREGANO = registerKey("oregano");
    public static final ResourceKey<BiomeModifier> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<BiomeModifier> RED_APPLE_TREE = registerKey("red_apple_tree");
    public static final ResourceKey<BiomeModifier> YELLOW_APPLE_TREE = registerKey("yellow_apple_tree");
    public static final ResourceKey<BiomeModifier> GREEN_APPLE_TREE = registerKey("green_apple_tree");
    public static final ResourceKey<BiomeModifier> CHERRY_TREE = registerKey("cherry_tree");
    public static final ResourceKey<BiomeModifier> COCONUT_TREE = registerKey("coconut_tree");
    public static final ResourceKey<BiomeModifier> LIME_TREE = registerKey("lime_tree");
    public static final ResourceKey<BiomeModifier> MANGO_TREE = registerKey("mango_tree");
    public static final ResourceKey<BiomeModifier> PLUM_TREE = registerKey("plum_tree");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(RED_APPLE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.RED_APPLE_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(YELLOW_APPLE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.YELLOW_APPLE_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GREEN_APPLE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.GREEN_APPLE_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CHERRY_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CHERRY_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MANGO_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.MANGO_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COCONUT_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.COCONUT_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LIME_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.LIME_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PLUM_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.PLUM_TREE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CANTALOUPE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CANTALOUPE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HONEYDEW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.HONEYDEW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CILANTRO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CILANTRO)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(OREGANO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.OREGANO)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ROSEMARY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.ROSEMARY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SUGAR_BEETS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.SUGAR_BEETS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(RICE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.RICE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GARLIC, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.GARLIC)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CUCUMBERS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CUCUMBERS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PEANUTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.PEANUTS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(STRAWBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.STRAWBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CRANBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CRANBERRIES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CORN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.CORN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(RYE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.RYE)),
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

//        context.register(WHITE_RASPBERRIES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_FOREST),
//                HolderSet.direct(placedFeatures.getOrThrow(COPlacedFeatures.WHITE_RASPBERRIES)),
//                GenerationStep.Decoration.VEGETAL_DECORATION));


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

    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(CropOverhaul.MODID, name));
    }
}