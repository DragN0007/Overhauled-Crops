package com.dragn0007.dragncrops.blocks.pixel_placement.util;

import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.client.extensions.common.IClientBlockExtensions;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class PixelPlacerContainer extends Block implements EntityBlock {

    public PixelPlacerContainer() {
        super(Properties.of().noLootTable());
    }

    @Override
    public void initializeClient(Consumer<IClientBlockExtensions> consumer) {
        consumer.accept(new IClientBlockExtensions() {
            @Override
            public boolean addHitEffects(BlockState state, Level level, HitResult target, ParticleEngine manager) {
                return true;
            }
        });

        super.initializeClient(consumer);
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        if(context instanceof EntityCollisionContext) {
            Entity entity = ((EntityCollisionContext) context).getEntity();
            BlockEntity blockEntity = blockGetter.getBlockEntity(pos);

            if(entity != null && blockEntity instanceof PixelPlacerEntity) {
                PixelPlacerData data = ((PixelPlacerEntity) blockEntity).getClosestPixelPlacer(entity);
                if(data != null) {
                    return data.pixelPlacer.getVoxelShape(data.dir).move(data.pos.x, data.pos.y, data.pos.z);
                }
            }
        }
        return Shapes.empty();
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        PixelPlacerEntity pixelPlacerEntity = (PixelPlacerEntity) level.getBlockEntity(pos);
        PixelPlacerData data = pixelPlacerEntity.getClosestPixelPlacer(player);
        if(data != null) {
            BlockPos offset = pos.offset((int) data.pos.x, (int) data.pos.y, (int) data.pos.z);
            level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);

            if (level.isClientSide) {
                this.spawnDestroyParticles(level, player, offset, data.pixelPlacer.defaultBlockState());
            } else {
                pixelPlacerEntity.removePixelPlacer(data);
                if (!player.getAbilities().instabuild) {
                    level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(data.pixelPlacer.asItem())));
                }

                if(pixelPlacerEntity.pixelPlacerData.size() == 0) {
                    level.removeBlockEntity(pos);
                    level.removeBlock(pos, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PixelPlacerEntity(pos, state);
    }
}
