package com.dragn0007.dragncrops.event;


import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.custom.AppleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    //Right-Click Harvest Crops
    @SubscribeEvent
    public static void onBlockUse(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        Property<Integer> property = getCropProperty(state, "age");

        if (property != null && level instanceof ServerLevel serverLevel) {
            int maxAge = getMaxAge(state.getBlock());

            InteractionHand hand = event.getHand();
            Player player = event.getEntity();
            ItemStack itemStack = player.getItemInHand(hand);

            if (itemStack.isEmpty() && state.getValue(property) == maxAge) {
                level.setBlockAndUpdate(pos, state.setValue(property, 0));

                state.getBlock().getDrops(state, serverLevel, pos, null).forEach(stack -> {
                    serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                });
            }
        }
    }

    private static Property<Integer> getCropProperty(BlockState state, String propertyName) {
        Block block = state.getBlock();
        if (block instanceof CropBlock) {
            for (Property<?> prop : state.getProperties()) {
                if (prop instanceof IntegerProperty && prop.getName().equals(propertyName)) {
                    return (Property<Integer>) prop;
                }
            }
        }
        return null;
    }

    private static int getMaxAge(Block block) {
        if (block instanceof CropBlock cropBlock) {
            return cropBlock.getMaxAge();
        }
        return 7;
    }

    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        Player player = event.getEntity();
        ItemStack itemStack = event.getItemStack();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        if (itemStack.is(Items.BREAD)) {
            BlockPos blockPos = event.getPos().relative(Objects.requireNonNull(event.getFace()));
            if (level.isEmptyBlock(blockPos) && player.isShiftKeyDown()) {
                if (!level.isClientSide) {
                    Direction playerFacing = player.getDirection();
                    BlockState blockState = COBlocks.BREAD.get()
                            .defaultBlockState()
                            .setValue(HorizontalDirectionalBlock.FACING, playerFacing.getOpposite());
                    level.setBlock(blockPos, blockState, 3);
                    if (!player.isCreative()) {
                        itemStack.shrink(1);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }

        if (itemStack.is(Items.WHEAT)) {
            BlockPos blockPos = event.getPos().relative(Objects.requireNonNull(event.getFace()));
            if (level.isEmptyBlock(blockPos) && player.isShiftKeyDown()) {
                if (!level.isClientSide) {
                    Direction playerFacing = player.getDirection();
                    BlockState blockState = COBlocks.WHEAT_GRAIN.get()
                            .defaultBlockState()
                            .setValue(HorizontalDirectionalBlock.FACING, playerFacing.getOpposite());
                    level.setBlock(blockPos, blockState, 3);
                    if (!player.isCreative()) {
                        itemStack.shrink(1);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }

        if (itemStack.is(Items.APPLE)) {
            BlockPos blockPos = event.getPos().relative(Objects.requireNonNull(event.getFace()));
            if (level.isEmptyBlock(blockPos) && !(state.getBlock() instanceof AppleBlock) && player.isShiftKeyDown()) {
                if (!level.isClientSide) {
                    BlockState blockState = COBlocks.RED_APPLE.get().defaultBlockState().setValue(AppleBlock.APPLES, Integer.valueOf(1))
                            .setValue(AppleBlock.WATERLOGGED, Boolean.valueOf(false));
                    level.setBlock(blockPos, blockState, 3);
                    if (!player.isCreative()) {
                        itemStack.shrink(1);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }

            if (state.getBlock() instanceof AppleBlock) {
                Property<Integer> property = getAppleProperty(state, "apples");
                if (state.getValue(property) < 16) {
                    level.setBlockAndUpdate(pos, state.setValue(property, state.getValue(property) + 1));
                    RandomSource random = RandomSource.create();
                    level.playLocalSound(pos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 0.5F + 0.2F * random.nextFloat(), false);
                    if (!player.isCreative()) {
                        itemStack.shrink(1);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }
    }

    private static Property<Integer> getAppleProperty(BlockState state, String propertyName) {
        Block block = state.getBlock();
        if (block instanceof AppleBlock) {
            for (Property<?> prop : state.getProperties()) {
                if (prop instanceof IntegerProperty && prop.getName().equals(propertyName)) {
                    return (Property<Integer>) prop;
                }
            }
        }
        return null;
    }

}