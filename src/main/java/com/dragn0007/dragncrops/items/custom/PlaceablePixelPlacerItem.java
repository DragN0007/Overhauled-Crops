package com.dragn0007.dragncrops.items.custom;

import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacer;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacerItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PlaceablePixelPlacerItem extends PixelPlacerItem {

    public PlaceablePixelPlacerItem(PixelPlacer pixelPlacer, Properties properties) {
        super(pixelPlacer, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getPlayer() != null && context.getPlayer().isCrouching()) {
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
