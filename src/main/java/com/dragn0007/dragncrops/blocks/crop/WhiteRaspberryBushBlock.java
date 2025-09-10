package com.dragn0007.dragncrops.blocks.crop;

import com.dragn0007.dragncrops.blocks.crop.base.OBushBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class WhiteRaspberryBushBlock extends OBushBlock implements BonemealableBlock {

   public WhiteRaspberryBushBlock(Properties p_57249_) {
      super(p_57249_);
      this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
   }

   public ItemStack getCloneItemStack(BlockGetter getter, BlockPos pos, BlockState state) {
      return new ItemStack(COItems.WHITE_RASPBERRY.get());
   }

   public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
      int i = state.getValue(AGE);
      boolean flag = i == 4;
      if (!flag && player.getItemInHand(hand).is(Items.BONE_MEAL)) {
         return InteractionResult.PASS;
      } else if (i > 1) {
         int j = 1 + level.random.nextInt(2);

         popResource(level, pos, new ItemStack(COItems.WHITE_RASPBERRY.get(), j + (flag ? 1 : 0)));

         level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
         BlockState blockstate = state.setValue(AGE, Integer.valueOf(1));
         level.setBlock(pos, blockstate, 2);
         level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockstate));
         return InteractionResult.sidedSuccess(level.isClientSide);
      } else {
         return super.use(state, level, pos, player, hand, result);
      }
   }
}