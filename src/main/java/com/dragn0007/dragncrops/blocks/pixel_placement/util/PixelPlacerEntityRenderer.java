package com.dragn0007.dragncrops.blocks.pixel_placement.util;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class PixelPlacerEntityRenderer implements BlockEntityRenderer<PixelPlacerEntity> {

    private final BlockRenderDispatcher blockRenderDispatcher;

    public PixelPlacerEntityRenderer(BlockEntityRendererProvider.Context context) {
        blockRenderDispatcher = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(PixelPlacerEntity decorContainer, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        decorContainer.pixelPlacerData.forEach(data -> {
            poseStack.pushPose();

            poseStack.translate(data.pos.x, data.pos.y, data.pos.z);
            poseStack.mulPose(Axis.YP.rotationDegrees(data.dir.toYRot()));
            blockRenderDispatcher.renderSingleBlock(data.pixelPlacer.defaultBlockState(), poseStack, buffer, combinedLight, combinedOverlay);

            poseStack.popPose();
        });
    }
}
