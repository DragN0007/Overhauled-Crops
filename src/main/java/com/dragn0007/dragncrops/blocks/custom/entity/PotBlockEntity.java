package com.dragn0007.dragncrops.blocks.custom.entity;

import com.dragn0007.dragncrops.blocks.COBlockEntities;
import com.dragn0007.dragncrops.common.gui.PotMenu;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class PotBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
   public NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);
   int brewTime;
   public static final int INGREDIENT_SLOT_LEFT = 0;
   public static final int INGREDIENT_SLOT_RIGHT = 1;
   public static final int OUTPUT_SLOT = 2;
   public static final int LIQUID_SLOT = 3;
   public ItemStack brewingCurrently = null;

   protected final ContainerData dataAccess = new ContainerData() {
      public int get(int slot) {
          if (slot == INGREDIENT_SLOT_LEFT || slot == INGREDIENT_SLOT_RIGHT) {
              return PotBlockEntity.this.brewTime;
          }
          return 0;
      }

      public void set(int i, int value) {
         if (i == INGREDIENT_SLOT_LEFT || i == INGREDIENT_SLOT_RIGHT) {
           PotBlockEntity.this.brewTime = value;
         }
      }

      public int getCount() {
         return 2;
      }
   };

   public PotBlockEntity(BlockPos pos, BlockState state) {
      super(COBlockEntities.POT.get(), pos, state);
   }

   protected Component getDefaultName() {
      return Component.translatable("blockentities.dragncrops.pot");
   }

   public int getContainerSize() {
      return this.items.size();
   }

   public boolean isEmpty() {
      for(ItemStack itemstack : this.items) {
         if (!itemstack.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   public static void serverTick(Level level, BlockPos pos, BlockState state, PotBlockEntity entity) {
      if (!entity.hasBoilinSource(level, pos)) {
         if (entity.brewTime < 400 && entity.brewTime > 0) {
            ++entity.brewTime;
         }
         return;
      }

      ItemStack leftSlotItem = entity.getItem(INGREDIENT_SLOT_LEFT);
      ItemStack rightSlotItem = entity.getItem(INGREDIENT_SLOT_RIGHT);
      ItemStack liquidSlotItem = entity.getItem(LIQUID_SLOT);
      ItemStack outputSlotItem = entity.getItem(OUTPUT_SLOT);
      ItemStack potentialOutput = null;

      if (entity.brewingCurrently != null && entity.brewTime > 0) {
         --entity.brewTime;
         if (entity.brewTime == 0) {
            if (outputSlotItem.isEmpty()) {
               entity.setItem(OUTPUT_SLOT, entity.brewingCurrently);
            } else {
               outputSlotItem.grow(1);
            }
            entity.brewingCurrently = null;
            setChanged(level, pos, state);
         }
      } else if (entity.brewTime <= 0) {
         if (!leftSlotItem.isEmpty() && !rightSlotItem.isEmpty() && !liquidSlotItem.isEmpty()) {
            if (leftSlotItem.is(COTags.Items.VEGETABLES) && rightSlotItem.is(COTags.Items.VEGETABLES)) {
               if (liquidSlotItem.is(COTags.Items.MILK)) {
                  potentialOutput = COItems.VEGETABLE_CREAM_SOUP.get().getDefaultInstance();
               } else if (liquidSlotItem.is(COItems.STOCK.get())) {
                  potentialOutput = COItems.VEGETABLE_SOUP.get().getDefaultInstance();
               }
            } else if ((leftSlotItem.is(COTags.Items.VEGETABLES) && rightSlotItem.is(COTags.Items.RAW_MEATS)) ||
                    (leftSlotItem.is(COTags.Items.RAW_MEATS) && rightSlotItem.is(COTags.Items.VEGETABLES))) {
               if (liquidSlotItem.is(COTags.Items.MILK)) {
                  potentialOutput = COItems.MEAT_AND_VEGETABLE_CREAM_SOUP.get().getDefaultInstance();
               } else if (liquidSlotItem.is(COItems.STOCK.get())) {
                  potentialOutput = COItems.MEAT_AND_VEGETABLE_STEW.get().getDefaultInstance();
               }
            } else if (leftSlotItem.is(COTags.Items.MUSHROOMS) && rightSlotItem.is(COTags.Items.MUSHROOMS)) {
               if (liquidSlotItem.is(COTags.Items.MILK)) {
                  potentialOutput = COItems.MUSHROOM_CREAM_SOUP.get().getDefaultInstance();
               } else if (liquidSlotItem.is(COItems.STOCK.get())) {
                  potentialOutput = COItems.MUSHROOM_SOUP.get().getDefaultInstance();
               }
            } else if (leftSlotItem.is(COTags.Items.MILK) && rightSlotItem.is(COTags.Items.MILK)) {
               if (liquidSlotItem.is(COItems.STOCK.get())) {
                  potentialOutput = COItems.CREAM_SOUP.get().getDefaultInstance();
               }
            }
         }

         if ((potentialOutput == null) || (!outputSlotItem.isEmpty() && !potentialOutput.is(outputSlotItem.getItem())) || (outputSlotItem.getCount() == outputSlotItem.getMaxStackSize())) {
            return;
         }

         entity.brewingCurrently = potentialOutput;

         if (liquidSlotItem.is(COItems.STOCK.get()) || liquidSlotItem.is(COTags.Items.MILK)) {
            ItemStack remainder = liquidSlotItem.getCraftingRemainingItem();
            leftSlotItem.shrink(1);
            rightSlotItem.shrink(1);
            liquidSlotItem.shrink(1);
            entity.setItem(LIQUID_SLOT, remainder);
         }
         entity.brewTime = 400;
         setChanged(level, pos, state);
      }
   }

   public boolean hasBoilinSource(Level level, BlockPos pos) {
      BlockState directBelow = level.getBlockState(pos.below());
      BlockState below = level.getBlockState(pos.below().below());
      return (directBelow.is(COTags.Blocks.HEATING_BLOCKS)) || (below.is(COTags.Blocks.HEATING_BLOCKS)) ||
               (directBelow.getBlock() instanceof AbstractFurnaceBlock && directBelow.getValue(BlockStateProperties.LIT));
   }

   public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
      @Override
      protected void onContentsChanged(int slot) {
         setChanged();
         if(!level.isClientSide()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 2);
         }
      }

      @Override
      public boolean isItemValid(int slot, @NotNull ItemStack stack) {
         return switch (slot) {
            case INGREDIENT_SLOT_LEFT, INGREDIENT_SLOT_RIGHT -> stack.is(COTags.Items.VEGETABLES) || stack.is(COTags.Items.RAW_MEATS) || stack.is(COTags.Items.MUSHROOMS);
            case OUTPUT_SLOT -> false;
            case LIQUID_SLOT -> stack.is(COItems.STOCK.get()) || stack.is(COTags.Items.MILK);
            default -> super.isItemValid(slot, stack);
         };
      }
   };

   @Nullable
   @Override
   public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
      return new PotMenu(pContainerId, pPlayerInventory, this, dataAccess);
   }

   public void load(CompoundTag tag) {
      super.load(tag);
      this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
      ContainerHelper.loadAllItems(tag, this.items);
      this.brewTime = tag.getShort("BrewTime");
      if (tag.contains("BrewingCurrently")) {
         CompoundTag compoundTag = (CompoundTag) tag.get("BrewingCurrently");
         this.brewingCurrently = ItemStack.of(compoundTag);
      }
   }

   protected void saveAdditional(CompoundTag tag) {
      super.saveAdditional(tag);
      tag.putShort("BrewTime", (short) this.brewTime);
      if (brewingCurrently != null) {
         CompoundTag compoundTag = new CompoundTag();
         this.brewingCurrently.save(compoundTag);
         tag.put("BrewingCurrently", compoundTag);
      }
      ContainerHelper.saveAllItems(tag, this.items);
   }

   public ItemStack getItem(int i) {
      return i >= 0 && i < this.items.size() ? this.items.get(i) : ItemStack.EMPTY;
   }

   public ItemStack removeItem(int i, int dunno) {
      return ContainerHelper.removeItem(this.items, i, dunno);
   }

   public ItemStack removeItemNoUpdate(int i) {
      return ContainerHelper.takeItem(this.items, i);
   }

   public void setItem(int p_58993_, ItemStack p_58994_) {
      if (p_58993_ >= 0 && p_58993_ < this.items.size()) {
         this.items.set(p_58993_, p_58994_);
      }

   }

   public boolean stillValid(Player player) {
      return Container.stillValidBlockEntity(this, player);
   }

   public void clearContent() {
      this.items.clear();
   }

   protected AbstractContainerMenu createMenu(int p_58990_, Inventory p_58991_) {
      return new PotMenu(p_58990_, p_58991_, this, this.dataAccess);
   }

   net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
           net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);

   @Override
   public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable Direction facing) {
      if (capability == net.minecraftforge.common.capabilities.ForgeCapabilities.ITEM_HANDLER && facing != null && !this.remove) {
          return switch (facing) {
              case UP -> handlers[0].cast();
              case DOWN -> handlers[1].cast();
              default -> handlers[2].cast();
          };
      }
      return super.getCapability(capability, facing);
   }

   @Override
   public void invalidateCaps() {
      super.invalidateCaps();
      for (int x = 0; x < handlers.length; x++)
        handlers[x].invalidate();
   }

   @Override
   public void reviveCaps() {
      super.reviveCaps();
      this.handlers = net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
   }

   @Override
   public int[] getSlotsForFace(Direction p_19238_) {
      return new int[0];
   }

   @Override
   public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @org.jetbrains.annotations.Nullable Direction p_19237_) {
      return false;
   }

   @Override
   public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
      return false;
   }
}