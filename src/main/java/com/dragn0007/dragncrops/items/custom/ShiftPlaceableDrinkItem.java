package com.dragn0007.dragncrops.items.custom;

import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ShiftPlaceableDrinkItem extends ShiftPlaceableItem {

    public ShiftPlaceableDrinkItem(Block p_41579_, Properties p_41580_) {
        super(p_41579_, p_41580_);
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 32;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(itemStack, level, tooltip, flag);
        if (itemStack.getItem().isEdible()) {
            FoodProperties foodProperties = itemStack.getItem().getFoodProperties();

            if (foodProperties != null) {
                for (Pair<MobEffectInstance, Float> pair : foodProperties.getEffects()) {
                    MobEffectInstance effectInstance = pair.getFirst();

                    if (effectInstance != null) {
                        String effectName = effectInstance.getDescriptionId();
                        int amplifier = effectInstance.getAmplifier();
                        int duration = effectInstance.getDuration();

                        Component text = Component.translatable(effectName)
                                .append(Component.translatable("potion.potency." + amplifier))
                                .append(String.format(" (%ds)", duration / 20))
                                .withStyle(ChatFormatting.GOLD);

                        tooltip.add(text);
                    }
                }
            }
        }
    }
}
