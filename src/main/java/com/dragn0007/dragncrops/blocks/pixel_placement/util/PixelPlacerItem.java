package com.dragn0007.dragncrops.blocks.pixel_placement.util;

import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

public class PixelPlacerItem extends BlockItem {

    public PixelPlacerItem(PixelPlacer pixelPlacer, Properties properties) {
        super(pixelPlacer, properties);
    }

    @Override
    public PixelPlacer getBlock() {
        return (PixelPlacer) super.getBlock();
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        BlockPlaceContext blockPlaceContext = new BlockPlaceContext(useOnContext);
        Level level = blockPlaceContext.getLevel();

        if(!(level.getBlockEntity(blockPlaceContext.getClickedPos()) instanceof PixelPlacerEntity)) {
            if(!placeBlock(blockPlaceContext, COBlocks.PIXEL_PLACER_CONTAINER.get().defaultBlockState())) {
                return InteractionResult.FAIL;
            }
        }

        BlockPos blockPos = blockPlaceContext.getClickedPos();
        BlockEntity blockEntity = level.getBlockEntity(blockPos);
        Vec3 location = useOnContext.getClickLocation();

        Vec3i normal = useOnContext.getClickedFace().getNormal();
        double x = (location.x - Math.floor(location.x)) + (double) (((normal.getX() & 0x80000000) >>> 31) * 15) / 16;
        double y = (location.y - Math.floor(location.y)) + (double) (((normal.getY() & 0x80000000) >>> 31) * 15) / 16;
        double z = (location.z - Math.floor(location.z)) + (double) (((normal.getZ() & 0x80000000) >>> 31) * 15) / 16;

        Vec3 pos = new Vec3(x, y, z);

        if(!level.isClientSide) {
            ((PixelPlacerEntity) blockEntity).addPixelPlacer(pos, useOnContext.getHorizontalDirection(), this.getBlock());
        }

        Player player = useOnContext.getPlayer();
        BlockState blockState = level.getBlockState(blockPos);
        if(player != null) {
            SoundType soundtype = blockState.getSoundType(level, blockPos, player);
            level.playSound(player, blockPos, this.getPlaceSound(blockState, level, blockPos, player), SoundSource.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
        }

        level.gameEvent(player, GameEvent.BLOCK_PLACE, blockPos);
        if (player == null || !player.getAbilities().instabuild) {
            useOnContext.getItemInHand().shrink(1);
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
