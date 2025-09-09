package com.dragn0007.dragncrops.items.custom;

import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlailItem extends DiggerItem {

    public FlailItem(Tier p_40521_, float p_40522_, float p_40523_, Item.Properties p_40524_) {
        super(p_40522_, p_40523_, p_40521_, COTags.Blocks.MINEABLE_WITH_FLAIL, p_40524_);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.dragncrops.flail.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
