package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class UndriedGenericSausage extends DriedBase {

    public static final VoxelShape NORTH = Stream.of(
            Block.box(3, 0, 14, 13, 14, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 0, 3, 2, 14, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(3, 0, 0, 13, 14, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(14, 0, 3, 16, 14, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public UndriedGenericSausage() {
        super(NORTH, EAST, SOUTH, WEST,
                Properties.of().sound(SoundType.FUNGUS).strength(0.2F).pushReaction(PushReaction.DESTROY).noOcclusion().noCollission().randomTicks());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(this.getFermentTimeProperty(), 0));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction face = context.getClickedFace();
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        BlockState state = level.getBlockState(clickedPos);

        if (face == Direction.UP || face == Direction.DOWN) {
            return null;
        }

        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction facing = state.getValue(FACING);
        BlockPos attachedPos = pos.relative(facing.getOpposite());
        BlockState attachedState = level.getBlockState(attachedPos);
        return attachedState.isFaceSturdy(level, attachedPos, facing);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {

        if (!level.isAreaLoaded(pos, 1)) return;

        int i = this.getFermentTime(state);

        if (i <= this.getMaxFermentTime()) {
            BlockState blockState = level.getBlockState(pos);
            Direction facingDirection = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            BlockState newState = this.getStateForFermentTime(i + 1).setValue(BlockStateProperties.HORIZONTAL_FACING, facingDirection);
            level.setBlockAndUpdate(pos, newState);

        }

        if (i >= this.getMaxFermentTime()) {
            BlockState blockState = level.getBlockState(pos);
            Direction facingDirection = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            BlockState state1 = COBlocks.DRIED_GENERIC_SAUSAGE.get().defaultBlockState()
                    .setValue(BlockStateProperties.HORIZONTAL_FACING, facingDirection);
            level.setBlockAndUpdate(pos, state1);
        }

    }

}
