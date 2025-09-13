package com.dragn0007.dragncrops.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OBushBlock;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import com.dragn0007.dragncrops.blocks.custom.AppleBlock;
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

        this.dropOther(COBlocks.BREAD.get(), Items.BREAD);
        this.dropOther(COBlocks.BLUEBERRY_BREAD.get(),  COItems.BLUEBERRY_BREAD.get());
        this.dropOther(COBlocks.CRANBERRY_BREAD.get(),  COItems.CRANBERRY_BREAD.get());
        this.dropOther(COBlocks.NUT_BREAD.get(),  COItems.NUT_BREAD.get());
        this.dropOther(COBlocks.RYE_BREAD.get(),  COItems.RYE_BREAD.get());
        this.dropOther(COBlocks.WHITE_BREAD.get(),  COItems.WHITE_BREAD.get());

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

        this.add(COBlocks.APPLE_CANDY.get(), createJamDrops(COBlocks.APPLE_CANDY.get(), COItems.APPLE_CANDY.get()));
        this.add(COBlocks.BLACKBERRY_CANDY.get(), createJamDrops(COBlocks.BLACKBERRY_CANDY.get(), COItems.BLACKBERRY_CANDY.get()));
        this.add(COBlocks.BLUEBERRY_CANDY.get(), createJamDrops(COBlocks.BLUEBERRY_CANDY.get(), COItems.BLUEBERRY_CANDY.get()));
        this.add(COBlocks.CANTALOUPE_CANDY.get(), createJamDrops(COBlocks.CANTALOUPE_CANDY.get(), COItems.CANTALOUPE_CANDY.get()));
        this.add(COBlocks.CHERRY_CANDY.get(), createJamDrops(COBlocks.CHERRY_CANDY.get(), COItems.CHERRY_CANDY.get()));
        this.add(COBlocks.CRANBERRY_CANDY.get(), createJamDrops(COBlocks.CRANBERRY_CANDY.get(), COItems.CRANBERRY_CANDY.get()));
        this.add(COBlocks.MANGO_CANDY.get(), createJamDrops(COBlocks.MANGO_CANDY.get(), COItems.MANGO_CANDY.get()));
        this.add(COBlocks.MELON_CANDY.get(), createJamDrops(COBlocks.MELON_CANDY.get(), COItems.MELON_CANDY.get()));
        this.add(COBlocks.RASPBERRY_CANDY.get(), createJamDrops(COBlocks.RASPBERRY_CANDY.get(), COItems.RASPBERRY_CANDY.get()));
        this.add(COBlocks.STRAWBERRY_CANDY.get(), createJamDrops(COBlocks.STRAWBERRY_CANDY.get(), COItems.STRAWBERRY_CANDY.get()));
        this.add(COBlocks.WATERMELON_CANDY.get(), createJamDrops(COBlocks.WATERMELON_CANDY.get(), COItems.WATERMELON_CANDY.get()));


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
                                .withPool(LootPool.lootPool().when(cropBuilder4).add(LootItem.lootTableItem(COItems.CORN.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
        LootItemCondition.Builder wildBuilder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_CORN.get());
        this.add(COBlocks.WILD_CORN.get(), this.createMultiDrops(COBlocks.WILD_CORN.get(), COItems.CORN.get(), COItems.CORN_SEEDS.get(),
                wildBuilder4));

        LootItemCondition.Builder cropBuilder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RYE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.RYE.get(),
                this.applyExplosionDecay(COBlocks.RYE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.RYE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder5).add(LootItem.lootTableItem(COItems.RYE.get())
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
        LootItemCondition.Builder wildBuilder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RYE.get());
        this.add(COBlocks.WILD_CRANBERRIES.get(), this.createMultiDrops(COBlocks.WILD_CRANBERRIES.get(), COItems.CRANBERRY.get(), COItems.CRANBERRY.get(),
                wildBuilder6));

        LootItemCondition.Builder cropBuilder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.STRAWBERRIES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 7));
        this.add(COBlocks.STRAWBERRIES.get(),
                this.applyExplosionDecay(COBlocks.STRAWBERRIES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.STRAWBERRY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder7).add(LootItem.lootTableItem(COItems.STRAWBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5715287F, 3))))));
        LootItemCondition.Builder wildBuilder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RYE.get());
        this.add(COBlocks.WILD_STRAWBERRIES.get(), this.createMultiDrops(COBlocks.WILD_STRAWBERRIES.get(), COItems.STRAWBERRY.get(), COItems.STRAWBERRY.get(),
                wildBuilder7));

        LootItemCondition.Builder cropBuilder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.PEANUTS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OCropBlock.AGE, 8));
        this.add(COBlocks.PEANUTS.get(),
                this.applyExplosionDecay(COBlocks.PEANUTS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(COItems.PEANUT.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder8).add(LootItem.lootTableItem(COItems.PEANUT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 3))))));
        LootItemCondition.Builder wildBuilder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WILD_RYE.get());
        this.add(COBlocks.WILD_PEANUTS.get(), this.createMultiDrops(COBlocks.WILD_PEANUTS.get(), COItems.PEANUT.get(), COItems.PEANUT.get(),
                wildBuilder8));

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

    protected LootTable.Builder createMultiDrops(Block block, Item item, Item item1, LootItemCondition.Builder builder) {
        return this.applyExplosionDecay(block, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(builder).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 1)).otherwise(LootItem.lootTableItem(item1)))).withPool(LootPool.lootPool().when(builder).add(LootItem.lootTableItem(item1).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return COBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
