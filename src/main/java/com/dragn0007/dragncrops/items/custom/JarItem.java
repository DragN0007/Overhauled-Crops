package com.dragn0007.dragncrops.items.custom;

import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class JarItem extends PlaceableItem {
    public JarItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack stack = new ItemStack(COItems.GLASS_JAR.get());
        super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide) {
            if (itemStack.isEmpty()) {
                return stack;
            } else {
                entity.spawnAtLocation(stack);
            }
        }
        return itemStack;
    }

}
