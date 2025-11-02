package com.dragn0007.dragncrops.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShiftPlaceableItem extends ItemNameBlockItem {

    public ShiftPlaceableItem(Block p_41579_, Properties p_41580_) {
        super(p_41579_, p_41580_);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getPlayer() != null && (context.getPlayer().isCrouching() || context.getLevel().getBlockState(context.getClickedPos()).is(this.getBlock()))) {
            InteractionResult interactionresult = this.place(new BlockPlaceContext(context));
            if (!interactionresult.consumesAction() && this.isEdible()) {
                InteractionResult interactionresult1 = this.use(context.getLevel(), context.getPlayer(), context.getHand()).getResult();
                return interactionresult1 == InteractionResult.CONSUME ? InteractionResult.CONSUME_PARTIAL : interactionresult1;
            } else {
                return interactionresult;
            }
        }

        return InteractionResult.PASS;
    }


    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.dragncrops.placeable.tooltip").withStyle(ChatFormatting.GRAY));
    }
}
