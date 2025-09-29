package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class UnfermentedHoneyMead extends FermentedBase {

    public static final VoxelShape NORTH = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public UnfermentedHoneyMead() {
        super(NORTH, EAST, SOUTH, WEST,
                Properties.of().sound(SoundType.STONE).strength(0.2F).pushReaction(PushReaction.DESTROY).noOcclusion().randomTicks());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(this.getFermentTimeProperty(), 0));
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
            BlockState state1 = COBlocks.FERMENTED_HONEY_MEAD.get().defaultBlockState()
                    .setValue(BlockStateProperties.HORIZONTAL_FACING, facingDirection);
            level.setBlockAndUpdate(pos, state1);
        }

    }

}
