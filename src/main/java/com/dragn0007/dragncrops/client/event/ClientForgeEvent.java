package com.dragn0007.dragncrops.client.event;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacerEntityRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
    public class ClientForgeEvent {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        List<Component> tooltip = event.getToolTip();

        if (event.getItemStack().getItem() == Items.WHEAT) {
            tooltip.add(Component.translatable("tooltip.dragncrops.grain.tooltip").withStyle(ChatFormatting.GOLD));
        }

        if (event.getItemStack().getItem() == Items.BREAD) {
            tooltip.add(Component.translatable("tooltip.dragncrops.placeable.tooltip").withStyle(ChatFormatting.GRAY));
        }

        if (event.getItemStack().getItem() == Items.APPLE) {
            tooltip.add(Component.translatable("tooltip.dragncrops.placeable.tooltip").withStyle(ChatFormatting.GRAY));
        }
    }

}