package com.dragn0007.dragncrops.blocks.custom;

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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class CanBlock extends Block implements SimpleWaterloggedBlock {

   public static final int MAX_CANS = 16;
   public static final IntegerProperty CANS = IntegerProperty.create("cans", 1, MAX_CANS);
   public static final IntegerProperty CANS1 = CANS;
   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
   protected static final VoxelShape ONE_AABB = Block.box(6, 0, 6, 10, 6, 10);
   protected static final VoxelShape TWO_AABB = Block.box(3, 0, 3, 13, 6, 13);
   protected static final VoxelShape FIVE_AABB = Block.box(3, 0, 3, 13, 12, 13);
   protected static final VoxelShape SIX_AABB = Block.box(0, 0, 0, 16, 13, 16);

   public CanBlock() {
      super(Properties.of().sound(SoundType.METAL).strength(0.2F).pushReaction(PushReaction.DESTROY).noOcclusion());
      this.registerDefaultState(this.stateDefinition.any().setValue(CANS1, Integer.valueOf(1)).setValue(WATERLOGGED, Boolean.valueOf(true))) ;
   }

   @Nullable
   public BlockState getStateForPlacement(BlockPlaceContext context) {
      BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos());
      if (blockstate.is(this)) {
         return blockstate.setValue(CANS1, Integer.valueOf(Math.min(MAX_CANS, blockstate.getValue(CANS1) + 1)));
      } else {
         FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
         boolean flag = fluidstate.getType() == Fluids.WATER;
         return super.getStateForPlacement(context).setValue(WATERLOGGED, Boolean.valueOf(flag));
      }
   }

   protected boolean mayPlaceOn(BlockState p_56127_, BlockGetter p_56128_, BlockPos p_56129_) {
      return !p_56127_.getCollisionShape(p_56128_, p_56129_).getFaceShape(Direction.UP).isEmpty() || p_56127_.isFaceSturdy(p_56128_, p_56129_, Direction.UP);
   }

   public boolean canSurvive(BlockState p_56109_, LevelReader p_56110_, BlockPos p_56111_) {
      BlockPos blockpos = p_56111_.below();
      return this.mayPlaceOn(p_56110_.getBlockState(blockpos), p_56110_, blockpos);
   }

   public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor accessor, BlockPos pos, BlockPos pos1) {
      if (!state.canSurvive(accessor, pos)) {
         return Blocks.AIR.defaultBlockState();
      } else {
         if (state.getValue(WATERLOGGED)) {
            accessor.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(accessor));
         }

         return super.updateShape(state, direction, state1, accessor, pos, pos1);
      }
   }

   public boolean canBeReplaced(BlockState state, BlockPlaceContext placeContext) {
      return !placeContext.isSecondaryUseActive() && placeContext.getItemInHand().is(this.asItem()) && state.getValue(CANS1) < MAX_CANS || super.canBeReplaced(state, placeContext);
   }

   public VoxelShape getShape(BlockState p_56122_, BlockGetter p_56123_, BlockPos p_56124_, CollisionContext p_56125_) {
      switch (p_56122_.getValue(CANS1)) {
         case 1:
         default:
            return ONE_AABB;
         case 2, 3, 4:
            return TWO_AABB;
         case 5:
            return FIVE_AABB;
         case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16:
            return SIX_AABB;
      }
   }

   public FluidState getFluidState(BlockState p_56131_) {
      return p_56131_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_56131_);
   }

   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56120_) {
      p_56120_.add(CANS1, WATERLOGGED);
   }

   public boolean isPathfindable(BlockState p_56104_, BlockGetter p_56105_, BlockPos p_56106_, PathComputationType p_56107_) {
      return false;
   }
}