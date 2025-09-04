package com.dragn0007.dragncrops.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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
        this.add(COBlocks.BLACKBERRY_JAM.get(), this::createJamDrops);
    }

    protected LootTable.Builder createJamDrops(Block block) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block, LootItem.lootTableItem(block).apply(List.of(2, 3, 4, 5),
                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(JamJarBlock.JAM_JARS, integer)))))));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return COBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
