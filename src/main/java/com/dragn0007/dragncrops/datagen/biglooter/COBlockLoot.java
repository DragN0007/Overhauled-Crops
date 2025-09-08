package com.dragn0007.dragncrops.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
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
        this.dropOther(COBlocks.RED_APPLE.get(), Items.APPLE);
        this.dropOther(COBlocks.YELLOW_APPLE.get(), COItems.YELLOW_APPLE.get());
        this.dropOther(COBlocks.GREEN_APPLE.get(), COItems.GREEN_APPLE.get());

        this.dropOther(COBlocks.BREAD.get(), Items.BREAD);
        this.dropOther(COBlocks.BLUEBERRY_BREAD.get(),  COItems.BLUEBERRY_BREAD.get());
        this.dropOther(COBlocks.CRANBERRY_BREAD.get(),  COItems.CRANBERRY_BREAD.get());
        this.dropOther(COBlocks.NUT_BREAD.get(),  COItems.NUT_BREAD.get());
        this.dropOther(COBlocks.RYE_BREAD.get(),  COItems.RYE_BREAD.get());
        this.dropOther(COBlocks.WHITE_BREAD.get(),  COItems.WHITE_BREAD.get());

        LootItemCondition.Builder builder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.WHEAT_GRAIN.get());
        this.add(COBlocks.WHEAT_GRAIN.get(), this.createCropDrops(COBlocks.WHEAT_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder));

        LootItemCondition.Builder builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RYE_GRAIN.get());
        this.add(COBlocks.RYE_GRAIN.get(), this.createCropDrops(COBlocks.RYE_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder1));

        LootItemCondition.Builder builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.RICE_GRAIN.get());
        this.add(COBlocks.RICE_GRAIN.get(), this.createCropDrops(COBlocks.RICE_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder2));

        LootItemCondition.Builder builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(COBlocks.CORN_GRAIN.get());
        this.add(COBlocks.CORN_GRAIN.get(), this.createCropDrops(COBlocks.CORN_GRAIN.get(), COItems.GRAIN.get(), COItems.GRAIN.get(), builder3));

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
    }

    protected LootTable.Builder createJamDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(JamJarBlock.JAM_JARS, integer))))
                )));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return COBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
