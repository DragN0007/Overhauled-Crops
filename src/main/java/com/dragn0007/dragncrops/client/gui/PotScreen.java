package com.dragn0007.dragncrops.client.gui;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.common.gui.PotMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PotScreen extends AbstractContainerScreen<PotMenu> {
   private static final ResourceLocation LOCATION = new ResourceLocation(CropOverhaul.MODID,"textures/gui/pot.png");
   private static final int[] BUBBLELENGTHS = new int[]{29, 24, 20, 16, 11, 6, 0};

   public PotScreen(PotMenu menu, Inventory inventory, Component component) {
      super(menu, inventory, component);
   }

   protected void init() {
      super.init();
      this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
   }

   public void render(GuiGraphics graphics, int x, int y, float partialTick) {
      this.renderBackground(graphics);
      super.render(graphics, x, y, partialTick);
      this.renderTooltip(graphics, x, y);
   }

   protected void renderBg(GuiGraphics graphics, float partialTick, int mouseY, int mouseX) {
      int i = (this.width - this.imageWidth) / 2;
      int j = (this.height - this.imageHeight) / 2;
      graphics.blit(LOCATION, i, j, 0, 0, this.imageWidth, this.imageHeight);

      int i1 = this.menu.getBrewingTicks();
      if (i1 > 0) {
         int j1 = (int)(28.0F * (1.0F - (float)i1 / 400.0F));
         if (j1 > 0) {
            graphics.blit(LOCATION, i + 97, j + 45, 176, 0, 9, j1);
         }

         j1 = BUBBLELENGTHS[i1 / 2 % 7];
         if (j1 > 0) {
            graphics.blit(LOCATION, i + 63, j + 43 + 29 - j1, 185, 29 - j1, 12, j1);
         }
      }

   }
}