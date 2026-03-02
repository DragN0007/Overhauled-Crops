package com.dragn0007.dragncrops.items.custom;

import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FriedRiceItem extends Item {
    public FriedRiceItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack stack = new ItemStack(Items.BOWL);
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

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.dragncrops.rice_in_pot.tooltip").withStyle(ChatFormatting.GOLD));
    }
}