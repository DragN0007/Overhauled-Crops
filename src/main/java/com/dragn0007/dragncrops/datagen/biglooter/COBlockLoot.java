package com.dragn0007.dragncrops.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
import com.dragn0007.dragncrops.blocks.crop.base.OBushBlock;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import com.dragn0007.dragncrops.blocks.custom.AppleBlock;
import com.dragn0007.dragncrops.blocks.custom.CanBlock;
import com.dragn0007.dragncrops.blocks.custom.CandyBlock;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;

public class COBlockLoot extends BlockLootSubProvider {
    public COBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

        this.add(COBlocks.RED_APPLE.get(), createAppleDrops(COBlocks.RED_APPLE.get(), Items.APPLE));
        this.add(COBlocks.YELLOW_APPLE.get(), createAppleDrops(COBlocks.YELLOW_APPLE.get(), COItems.YELLOW_APPLE.get()));
        this.add(COBlocks.GREEN_APPLE.get(), createAppleDrops(COBlocks.GREEN_APPLE.get(), COItems.GREEN_APPLE.get()));

        this.dropOther(COBlocks.RED_APPLE_SAPLING.get(), COItems.RED_APPLE_SEEDS.get());
        this.dropOther(COBlocks.YELLOW_APPLE_SAPLING.get(), COItems.YELLOW_APPLE_SEEDS.get());
        this.dropOther(COBlocks.GREEN_APPLE_SAPLING.get(), COItems.GREEN_APPLE_SEEDS.get());
        this.dropOther(COBlocks.LIME_SAPLING.get(), COItems.LIME_SEEDS.get());
        this.dropOther(COBlocks.COCONUT_SAPLING.get(), COItems.COCONUT.get());
        this.dropOther(COBlocks.MANGO_SAPLING.get(), COItems.MANGO_PIT.get());
        this.dropOther(COBlocks.CHERRY_SAPLING.get(), COItems.CHERRY_PIT.get());

        this.dropOther(COBlocks.BREAD.get(), Items.BREAD);
        this.dropOther(COBlocks.BLUEBERRY_BREAD.get(), COItems.BLUEBERRY_BREAD.get());
        this.dropOther(COBlocks.CRANBERRY_BREAD.get(), COItems.CRANBERRY_BREAD.get());
        this.dropOther(COBlocks.NUT_BREAD.get(), COItems.NUT_BREAD.get());
        this.dropOther(COBlocks.RYE_BREAD.get(), COItems.RYE_BREAD.get());
        this.dropOther(COBlocks.WHITE_BREAD.get(), COItems.WHITE_BREAD.get());

        this.dropOther(COBlocks.FERMENTED_PICKLES.get(), COItems.FERMENTED_PICKLES.get());
        this.dropOther(COBlocks.UNFERMENTED_PICKLES.get(), COItems.UNFERMENTED_PICKLES.get());
        this.dropOther(COBlocks.STOCK.get(), COItems.STOCK.get());
        this.dropOther(COBlocks.VEGETABLE_SOUP.get(), COItems.VEGETABLE_SOUP.get());
        this.dropOther(COBlocks.MEAT_AND_VEGETABLE_STEW.get(), COItems.MEAT_AND_VEGETABLE_STEW.get());

        this.dropOther(COBlocks.BEEF_SAUSAGE.get(), COItems.BEEF_SAUSAGE.get());
        this.dropOther(COBlocks.DRIED_BEEF_SAUSAGE.get(), COItems.DRIED_BEEF_SAUSAGE.get());

        LootItemCondition.Builder builder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WHEAT_GRAIN.get());
        this.add(COBlocks.WHEAT_GRAIN.get(), this.createMultiDrops(COBlocks.WHEAT_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder));

        LootItemCondition.Builder builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RYE_GRAIN.get());
        this.add(COBlocks.RYE_GRAIN.get(), this.createMultiDrops(COBlocks.RYE_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder1));

        LootItemCondition.Builder builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RICE_GRAIN.get());
        this.add(COBlocks.RICE_GRAIN.get(), this.createMultiDrops(COBlocks.RICE_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder2));

        LootItemCondition.Builder builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CORN_GRAIN.get());
        this.add(COBlocks.CORN_GRAIN.get(), this.createMultiDrops(COBlocks.CORN_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder3));

        this.add(COBlocks.APPLE_JAM.get(), createJamDrops(COBlocks.APPLE_JAM.get(), COItems.APPLE_JAM.get()));
        this.add(COBlocks.BLACKBERRY_JAM.get(), createJamDrops(COBlocks.BLACKBERRY_JAM.get(), COItems.BLACKBERRY_JAM.get()));
        this.add(COBlocks.BLUEBERRY_JAM.get(), createJamDrops(COBlocks.BLUEBERRY_JAM.get(), COItems.BLUEBERRY_JAM.get()));
        this.add(COBlocks.CANTALOUPE_JAM.get(), createJamDrops(COBlocks.CANTALOUPE_JAM.get(), COItems.CANTALOUPE_JAM.get()));
        this.add(COBlocks.CHERRY_JAM.get(), createJamDrops(COBlocks.CHERRY_JAM.get(), COItems.CHERRY_JAM.get()));
        this.add(COBlocks.CRANBERRY_JAM.get(), createJamDrops(COBlocks.CRANBERRY_JAM.get(), COItems.CRANBERRY_JAM.get()));
        this.add(COBlocks.MANGO_JAM.get(), createJamDrops(COBlocks.MANGO_JAM.get(), COItems.MANGO_JAM.get()));
        this.add(COBlocks.MELON_JAM.get(), createJamDrops(COBlocks.MELON_JAM.get(), COItems.MELON_JAM.get()));
        this.add(COBlocks.RASPBERRY_JAM.get(), createJamDrops(COBlocks.RASPBERRY_JAM.get(), COItems.RASPBERRY_JAM.get()));
        this.add(COBlocks.STRAWBERRY_JAM.get(), createJamDrops(COBlocks.STRAWBERRY_JAM.get(), COItems.STRAWBERRY_JAM.get()));
        this.add(COBlocks.WATERMELON_JAM.get(), createJamDrops(COBlocks.WATERMELON_JAM.get(), COItems.WATERMELON_JAM.get()));

        this.dropOther(COBlocks.APPLE_TART.get(), COItems.APPLE_TART.get());
        this.dropOther(COBlocks.BLACKBERRY_TART.get(), COItems.BLACKBERRY_TART.get());
        this.dropOther(COBlocks.BLUEBERRY_TART.get(), COItems.BLUEBERRY_TART.get());
        this.dropOther(COBlocks.CANTALOUPE_TART.get(), COItems.CANTALOUPE_TART.get());
        this.dropOther(COBlocks.CHERRY_TART.get(), COItems.CHERRY_TART.get());
        this.dropOther(COBlocks.CRANBERRY_TART.get(), COItems.CRANBERRY_TART.get());
        this.dropOther(COBlocks.MANGO_TART.get(), COItems.MANGO_TART.get());
        this.dropOther(COBlocks.MELON_TART.get(), COItems.MELON_TART.get());
        this.dropOther(COBlocks.RASPBERRY_TART.get(), COItems.RASPBERRY_TART.get());
        this.dropOther(COBlocks.STRAWBERRY_TART.get(), COItems.STRAWBERRY_TART.get());
        this.dropOther(COBlocks.WATERMELON_TART.get(), COItems.WATERMELON_TART.get());

        this.add(COBlocks.APPLE_CANDY.get(), createCandyDrops(COBlocks.APPLE_CANDY.get(), COItems.APPLE_CANDY.get()));
        this.add(COBlocks.BLACKBERRY_CANDY.get(), createCandyDrops(COBlocks.BLACKBERRY_CANDY.get(), COItems.BLACKBERRY_CANDY.get()));
        this.add(COBlocks.BLUEBERRY_CANDY.get(), createCandyDrops(COBlocks.BLUEBERRY_CANDY.get(), COItems.BLUEBERRY_CANDY.get()));
        this.add(COBlocks.CANTALOUPE_CANDY.get(), createCandyDrops(COBlocks.CANTALOUPE_CANDY.get(), COItems.CANTALOUPE_CANDY.get()));
        this.add(COBlocks.CHERRY_CANDY.get(), createCandyDrops(COBlocks.CHERRY_CANDY.get(), COItems.CHERRY_CANDY.get()));
        this.add(COBlocks.CRANBERRY_CANDY.get(), createCandyDrops(COBlocks.CRANBERRY_CANDY.get(), COItems.CRANBERRY_CANDY.get()));
        this.add(COBlocks.MANGO_CANDY.get(), createCandyDrops(COBlocks.MANGO_CANDY.get(), COItems.MANGO_CANDY.get()));
        this.add(COBlocks.MELON_CANDY.get(), createCandyDrops(COBlocks.MELON_CANDY.get(), COItems.MELON_CANDY.get()));
        this.add(COBlocks.RASPBERRY_CANDY.get(), createCandyDrops(COBlocks.RASPBERRY_CANDY.get(), COItems.RASPBERRY_CANDY.get()));
        this.add(COBlocks.STRAWBERRY_CANDY.get(), createCandyDrops(COBlocks.STRAWBERRY_CANDY.get(), COItems.STRAWBERRY_CANDY.get()));
        this.add(COBlocks.WATERMELON_CANDY.get(), createCandyDrops(COBlocks.WATERMELON_CANDY.get(), COItems.WATERMELON_CANDY.get()));

        this.add(COBlocks.CANNED_CARROTS.get(), createCanDrops(COBlocks.CANNED_CARROTS.get(), COItems.CANNED_CARROTS.get()));
        this.add(COBlocks.CANNED_POTATOES.get(), createCanDrops(COBlocks.CANNED_POTATOES.get(), COItems.CANNED_POTATOES.get()));
        this.add(COBlocks.CANNED_BEETS.get(), createCanDrops(COBlocks.CANNED_BEETS.get(), COItems.CANNED_BEETS.get()));
        this.add(COBlocks.CANNED_VEGETABLES.get(), createCanDrops(COBlocks.CANNED_VEGETABLES.get(), COItems.CANNED_VEGETABLES.get()));
        this.add(COBlocks.CANNED_FRUIT.get(), createCanDrops(COBlocks.CANNED_FRUIT.get(), COItems.CANNED_FRUIT.get()));
        this.add(COBlocks.CANNED_BEEF.get(), createCanDrops(COBlocks.CANNED_BEEF.get(), COItems.CANNED_BEEF.get()));


        LootItemCondition.Builder wildVanillaBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CARROTS.get());
        this.add(COBlocks.WILD_CARROTS.get(), this.createMultiDrops(COBlocks.WILD_CARROTS.get(), Items.CARROT, Items.CARROT,
                wildVanillaBuilder));

        LootItemCondition.Builder wildVanillaBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_POTATOES.get());
        this.add(COBlocks.WILD_POTATOES.get(), this.createMultiDrops(COBlocks.WILD_POTATOES.get(), Items.POTATO, Items.POTATO,
                wildVanillaBuilder1));

        LootItemCondition.Builder wildVanillaBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_WHEAT.get());
        this.add(COBlocks.WILD_WHEAT.get(), this.createMultiDrops(COBlocks.WILD_WHEAT.get(), Items.WHEAT, Items.WHEAT,
                wildVanillaBuilder2));

        LootItemCondition.Builder wildVanillaBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_BEETROOTS.get());
        this.add(COBlocks.WILD_BEETROOTS.get(), this.createMultiDrops(COBlocks.WILD_BEETROOTS.get(), Items.BEETROOT, Items.BEETROOT,
                wildVanillaBuilder3));


        LootItemCondition.Builder bushBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.BLACKBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OBushBlock.AGE, 4));
        this.add(COBlocks.BLACKBERRIES.get(),
                this.applyExplosionDecay(COBlocks.BLACKBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.BLACKBERRY.get())))
                                .withPool(LootPool.lootPool().when(bushBuilder).add(LootItem.lootTableItem(COItems.BLACKBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));

        LootItemCondition.Builder bushBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.BLUEBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OBushBlock.AGE, 4));
        this.add(COBlocks.BLUEBERRIES.get(),
                this.applyExplosionDecay(COBlocks.BLUEBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.BLUEBERRY.get())))
                                .withPool(LootPool.lootPool().when(bushBuilder1).add(LootItem.lootTableItem(COItems.BLUEBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));

        LootItemCondition.Builder bushBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RASPBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OBushBlock.AGE, 4));
        this.add(COBlocks.RASPBERRIES.get(),
                this.applyExplosionDecay(COBlocks.RASPBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.RASPBERRY.get())))
                                .withPool(LootPool.lootPool().when(bushBuilder2).add(LootItem.lootTableItem(COItems.RASPBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));

        LootItemCondition.Builder bushBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WHITE_RASPBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OBushBlock.AGE, 4));
        this.add(COBlocks.WHITE_RASPBERRIES.get(),
                this.applyExplosionDecay(COBlocks.WHITE_RASPBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.WHITE_RASPBERRY.get())))
                                .withPool(LootPool.lootPool().when(bushBuilder3).add(LootItem.lootTableItem(COItems.WHITE_RASPBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));


        LootItemCondition.Builder cropBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.PURPLE_CARROTS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.PURPLE_CARROTS.get(),
                this.applyExplosionDecay(COBlocks.PURPLE_CARROTS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.PURPLE_CARROT.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder).add(LootItem.lootTableItem(COItems.PURPLE_CARROT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
        LootItemCondition.Builder wildBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_PURPLE_CARROTS.get());
        this.add(COBlocks.WILD_PURPLE_CARROTS.get(), this.createMultiDrops(COBlocks.WILD_PURPLE_CARROTS.get(), COItems.PURPLE_CARROT.get(), COItems.PURPLE_CARROT.get(),
                wildBuilder));

        LootItemCondition.Builder cropBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.YELLOW_CARROTS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.YELLOW_CARROTS.get(),
                this.applyExplosionDecay(COBlocks.YELLOW_CARROTS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.YELLOW_CARROT.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder1).add(LootItem.lootTableItem(COItems.YELLOW_CARROT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
        LootItemCondition.Builder wildBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_YELLOW_CARROTS.get());
        this.add(COBlocks.WILD_YELLOW_CARROTS.get(), this.createMultiDrops(COBlocks.WILD_YELLOW_CARROTS.get(), COItems.YELLOW_CARROT.get(), COItems.YELLOW_CARROT.get(),
                wildBuilder1));

        LootItemCondition.Builder cropBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.PURPLE_POTATOES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.PURPLE_POTATOES.get(),
                this.applyExplosionDecay(COBlocks.PURPLE_POTATOES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.PURPLE_POTATO.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder2).add(LootItem.lootTableItem(COItems.PURPLE_POTATO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))
                                .withPool(LootPool.lootPool().when(cropBuilder2).add(LootItem.lootTableItem(Items.POISONOUS_POTATO)
                                        .when(LootItemRandomChanceCondition.randomChance(0.02F))))));
        LootItemCondition.Builder wildBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_PURPLE_POTATOES.get());
        this.add(COBlocks.WILD_PURPLE_POTATOES.get(), this.createMultiDrops(COBlocks.WILD_PURPLE_POTATOES.get(), COItems.PURPLE_POTATO.get(), COItems.PURPLE_POTATO.get(),
                wildBuilder2));

        LootItemCondition.Builder cropBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RED_POTATOES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.RED_POTATOES.get(),
                this.applyExplosionDecay(COBlocks.RED_POTATOES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.RED_POTATO.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder3).add(LootItem.lootTableItem(COItems.RED_POTATO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))
                                .withPool(LootPool.lootPool().when(cropBuilder3).add(LootItem.lootTableItem(Items.POISONOUS_POTATO)
                                        .when(LootItemRandomChanceCondition.randomChance(0.02F))))));
        LootItemCondition.Builder wildBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RED_POTATOES.get());
        this.add(COBlocks.WILD_RED_POTATOES.get(), this.createMultiDrops(COBlocks.WILD_RED_POTATOES.get(), COItems.RED_POTATO.get(), COItems.RED_POTATO.get(),
                wildBuilder3));

        LootItemCondition.Builder cropBuilder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CORN.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.CORN.get(),
                this.applyExplosionDecay(COBlocks.CORN.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CORN.get())))
                                .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3)))
                                    .withPool(LootPool.lootPool().when(cropBuilder4).add(LootItem.lootTableItem(COItems.CORN_SEEDS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));
        LootItemCondition.Builder wildBuilder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CORN.get());
        this.add(COBlocks.WILD_CORN.get(), this.createMultiDrops(COBlocks.WILD_CORN.get(), COItems.CORN.get(), COItems.CORN_SEEDS.get(),
                wildBuilder4));

        LootItemCondition.Builder cropBuilder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RYE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.RYE.get(),
                this.applyExplosionDecay(COBlocks.RYE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.RYE.get())))
                                    .withPool(LootPool.lootPool().when(cropBuilder5).add(LootItem.lootTableItem(COItems.RYE_SEEDS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5715286F, 3))))));
        LootItemCondition.Builder wildBuilder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RYE.get());
        this.add(COBlocks.WILD_RYE.get(), this.createMultiDrops(COBlocks.WILD_RYE.get(), COItems.RYE.get(), COItems.RYE_SEEDS.get(),
                wildBuilder5));

        LootItemCondition.Builder cropBuilder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CRANBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.CRANBERRIES.get(),
                this.applyExplosionDecay(COBlocks.CRANBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CRANBERRY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder6).add(LootItem.lootTableItem(COItems.CRANBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5715286F, 3))))));
        LootItemCondition.Builder wildBuilder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CRANBERRIES.get());
        this.add(COBlocks.WILD_CRANBERRIES.get(), this.createMultiDrops(COBlocks.WILD_CRANBERRIES.get(), COItems.CRANBERRY.get(), COItems.CRANBERRY.get(),
                wildBuilder6));

        LootItemCondition.Builder cropBuilder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.STRAWBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.STRAWBERRIES.get(),
                this.applyExplosionDecay(COBlocks.STRAWBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.STRAWBERRY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder7).add(LootItem.lootTableItem(COItems.STRAWBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5715287F, 3))))));
        LootItemCondition.Builder wildBuilder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_STRAWBERRIES.get());
        this.add(COBlocks.WILD_STRAWBERRIES.get(), this.createMultiDrops(COBlocks.WILD_STRAWBERRIES.get(), COItems.STRAWBERRY.get(), COItems.STRAWBERRY.get(),
                wildBuilder7));

        LootItemCondition.Builder cropBuilder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.PEANUTS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.PEANUTS.get(),
                this.applyExplosionDecay(COBlocks.PEANUTS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.PEANUT.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder8).add(LootItem.lootTableItem(COItems.PEANUT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3))))));
        LootItemCondition.Builder wildBuilder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_PEANUTS.get());
        this.add(COBlocks.WILD_PEANUTS.get(), this.createMultiDrops(COBlocks.WILD_PEANUTS.get(), COItems.PEANUT.get(), COItems.PEANUT.get(),
                wildBuilder8));

        LootItemCondition.Builder cropBuilder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CUCUMBERS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.CUCUMBERS.get(),
                this.applyExplosionDecay(COBlocks.CUCUMBERS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CUCUMBER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder9).add(LootItem.lootTableItem(COItems.CUCUMBER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3))))));
        LootItemCondition.Builder wildBuilder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CUCUMBERS.get());
        this.add(COBlocks.WILD_CUCUMBERS.get(), this.createMultiDrops(COBlocks.WILD_CUCUMBERS.get(), COItems.CUCUMBER.get(), COItems.CUCUMBER.get(),
                wildBuilder9));

        LootItemCondition.Builder cropBuilder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.GARLIC.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.GARLIC.get(),
                this.applyExplosionDecay(COBlocks.GARLIC.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.GARLIC.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder10).add(LootItem.lootTableItem(COItems.GARLIC.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3))))));
        LootItemCondition.Builder wildBuilder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_GARLIC.get());
        this.add(COBlocks.WILD_GARLIC.get(), this.createMultiDrops(COBlocks.WILD_GARLIC.get(), COItems.GARLIC.get(), COItems.GARLIC.get(),
                wildBuilder10));

        LootItemCondition.Builder cropBuilder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RICE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.RICE.get(),
                this.applyExplosionDecay(COBlocks.RICE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.RICE.get())))
                                .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3)))
                                    .withPool(LootPool.lootPool().when(cropBuilder11).add(LootItem.lootTableItem(COItems.RICE_SEEDS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3)))));
        LootItemCondition.Builder wildBuilder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RICE.get());
        this.add(COBlocks.WILD_RICE.get(), this.createMultiDrops(COBlocks.WILD_RICE.get(), COItems.RICE.get(), COItems.RICE_SEEDS.get(),
                wildBuilder11));

        LootItemCondition.Builder cropBuilder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.SUGAR_BEETS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.SUGAR_BEETS.get(),
                this.applyExplosionDecay(COBlocks.SUGAR_BEETS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.SUGAR_BEET.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder12).add(LootItem.lootTableItem(COItems.SUGAR_BEET.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3))))));
        LootItemCondition.Builder wildBuilder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_SUGAR_BEETS.get());
        this.add(COBlocks.WILD_SUGAR_BEETS.get(), this.createMultiDrops(COBlocks.WILD_SUGAR_BEETS.get(), COItems.SUGAR_BEET.get(), COItems.SUGAR_BEET.get(),
                wildBuilder12));

        LootItemCondition.Builder cropBuilder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CANTALOUPE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.CANTALOUPE.get(),
                this.applyExplosionDecay(COBlocks.CANTALOUPE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CANTALOUPE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder13).add(LootItem.lootTableItem(COItems.CANTALOUPE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));
        LootItemCondition.Builder wildBuilder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CANTALOUPE.get());
        this.add(COBlocks.WILD_CANTALOUPE.get(), this.createMultiDrops(COBlocks.WILD_CANTALOUPE.get(), COItems.CANTALOUPE.get(), COItems.CANTALOUPE_SEEDS.get(),
                wildBuilder13));

        LootItemCondition.Builder cropBuilder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.HONEYDEW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.HONEYDEW.get(),
                this.applyExplosionDecay(COBlocks.HONEYDEW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.HONEYDEW.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder14).add(LootItem.lootTableItem(COItems.HONEYDEW.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));
        LootItemCondition.Builder wildBuilder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_HONEYDEW.get());
        this.add(COBlocks.WILD_HONEYDEW.get(), this.createMultiDrops(COBlocks.WILD_HONEYDEW.get(), COItems.HONEYDEW.get(), COItems.HONEYDEW_SEEDS.get(),
                wildBuilder14));

        LootItemCondition.Builder cropBuilder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.ROSEMARY.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.ROSEMARY.get(),
                this.applyExplosionDecay(COBlocks.ROSEMARY.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.ROSEMARY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder15).add(LootItem.lootTableItem(COItems.ROSEMARY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));
        LootItemCondition.Builder wildBuilder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_ROSEMARY.get());
        this.add(COBlocks.WILD_ROSEMARY.get(), this.createMultiDrops(COBlocks.WILD_ROSEMARY.get(), COItems.ROSEMARY.get(), COItems.ROSEMARY.get(),
                wildBuilder15));

        LootItemCondition.Builder cropBuilder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CILANTRO.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.CILANTRO.get(),
                this.applyExplosionDecay(COBlocks.CILANTRO.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CILANTRO.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder16).add(LootItem.lootTableItem(COItems.CILANTRO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));
        LootItemCondition.Builder wildBuilder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CILANTRO.get());
        this.add(COBlocks.WILD_CILANTRO.get(), this.createMultiDrops(COBlocks.WILD_CILANTRO.get(), COItems.CILANTRO.get(), COItems.CILANTRO.get(),
                wildBuilder16));

        LootItemCondition.Builder cropBuilder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.OREGANO.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.OREGANO.get(),
                this.applyExplosionDecay(COBlocks.OREGANO.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.OREGANO.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder17).add(LootItem.lootTableItem(COItems.OREGANO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));
        LootItemCondition.Builder wildBuilder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_OREGANO.get());
        this.add(COBlocks.WILD_OREGANO.get(), this.createMultiDrops(COBlocks.WILD_OREGANO.get(), COItems.OREGANO.get(), COItems.OREGANO.get(),
                wildBuilder17));



        LootItemCondition.Builder leafBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RED_APPLE_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.RED_APPLE_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.RED_APPLE_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(Items.APPLE)))
                                .withPool(LootPool.lootPool().when(leafBuilder).add(LootItem.lootTableItem(Items.APPLE)
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.YELLOW_APPLE_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.YELLOW_APPLE_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.YELLOW_APPLE_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.YELLOW_APPLE.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder1).add(LootItem.lootTableItem(COItems.YELLOW_APPLE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.GREEN_APPLE_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.GREEN_APPLE_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.GREEN_APPLE_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.GREEN_APPLE.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder2).add(LootItem.lootTableItem(COItems.GREEN_APPLE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.LIME_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.LIME_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.LIME_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.LIME.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder3).add(LootItem.lootTableItem(COItems.LIME.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.COCONUT_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.COCONUT_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.COCONUT_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.COCONUT.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder4).add(LootItem.lootTableItem(COItems.COCONUT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.MANGO_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.MANGO_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.MANGO_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.MANGO.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder5).add(LootItem.lootTableItem(COItems.MANGO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        LootItemCondition.Builder leafBuilder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CHERRY_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(COBlocks.CHERRY_LEAVES.get(),
                this.applyExplosionDecay(COBlocks.CHERRY_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.CHERRIES.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder6).add(LootItem.lootTableItem(COItems.CHERRIES.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

    }

    protected LootTable.Builder createJamDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(JamJarBlock.JAM_JARS, integer))))
                )));
    }

    protected LootTable.Builder createAppleDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(AppleBlock.APPLES, integer))))
                )));
    }

    protected LootTable.Builder createCandyDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(CandyBlock.CANDIES, integer))))
                )));
    }

    protected LootTable.Builder createCanDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(CanBlock.CANS, integer))))
                )));
    }

    protected LootTable.Builder createMultiDrops(Block block, Item item, Item item1, LootItemCondition.Builder builder) {
        return this.applyExplosionDecay(block, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(builder).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 1)).otherwise(LootItem.lootTableItem(item1)))).withPool(LootPool.lootPool().when(builder).add(LootItem.lootTableItem(item1).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return COBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
