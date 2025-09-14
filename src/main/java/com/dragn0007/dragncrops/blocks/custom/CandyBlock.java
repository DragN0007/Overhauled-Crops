package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.DecorRotator;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class CandyBlock extends DecorRotator implements SimpleWaterloggedBlock {

   public static final int MAX_CANDIES = 16;
   public static final IntegerProperty CANDIES = IntegerProperty.create("candies", 1, MAX_CANDIES);
   public static final IntegerProperty CANDIES1 = CANDIES;

   public CandyBlock() {
      super(NORTH, EAST, SOUTH, WEST, Properties.of().sound(SoundType.STONE).strength(0.2F).pushReaction(PushReaction.DESTROY).noOcclusion());
      this.registerDefaultState(this.stateDefinition.any().setValue(CANDIES1, Integer.valueOf(1))) ;
   }

   public static final VoxelShape NORTH = Stream.of(
           Block.box(5, 0, 6, 11, 10, 10)
   ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

   public static final VoxelShape EAST = Stream.of(
           Block.box(6, 0, 5, 10, 10, 11)
   ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

   public static final VoxelShape SOUTH = Stream.of(
           Block.box(5, 0, 6, 11, 10, 10)
   ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

   public static final VoxelShape WEST = Stream.of(
           Block.box(6, 0, 5, 10, 10, 11)
   ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

   @Nullable
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos());
      this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
      if (blockstate.is(this)) {
         return blockstate.setValue(CANDIES1, Integer.valueOf(Math.min(MAX_CANDIES, blockstate.getValue(CANDIES1) + 1)));
      }
      return super.getStateForPlacement(context);
   }

   protected boolean mayPlaceOn(BlockState p_56127_, BlockGetter p_56128_, BlockPos p_56129_) {
      return !p_56127_.getCollisionShape(p_56128_, p_56129_).getFaceShape(Direction.UP).isEmpty() || p_56127_.isFaceSturdy(p_56128_, p_56129_, Direction.UP);
   }

   public boolean canSurvive(BlockState p_56109_, LevelReader p_56110_, BlockPos p_56111_) {
      BlockPos blockpos = p_56111_.below();
      return this.mayPlaceOn(p_56110_.getBlockState(blockpos), p_56110_, blockpos);
   }

   public boolean canBeReplaced(BlockState state, BlockPlaceContext placeContext) {
      return !placeContext.isSecondaryUseActive() && placeContext.getItemInHand().is(this.asItem()) && state.getValue(CANDIES1) < MAX_CANDIES || super.canBeReplaced(state, placeContext);
   }

   public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor accessor, BlockPos pos, BlockPos pos1) {
      if (!state.canSurvive(accessor, pos)) {
         return Blocks.AIR.defaultBlockState();
      }
      return super.updateShape(state, direction, state1, accessor, pos, pos1);
   }

   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(CANDIES1).add(FACING);
   }

   public boolean isPathfindable(BlockState p_56104_, BlockGetter p_56105_, BlockPos p_56106_, PathComputationType p_56107_) {
      return false;
   }
}