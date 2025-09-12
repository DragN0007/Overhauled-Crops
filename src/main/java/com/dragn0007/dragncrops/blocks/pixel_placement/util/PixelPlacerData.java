package com.dragn0007.dragncrops.blocks.pixel_placement.util;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

public class PixelPlacerData {

    public Vec3 pos;
    public Direction dir;
    public PixelPlacer pixelPlacer;

    public PixelPlacerData(Vec3 pos, Direction dir, PixelPlacer pixelPlacer) {
        this.pos = pos;
        this.dir = dir;
        this.pixelPlacer = pixelPlacer;
    }

    public static CompoundTag pack(PixelPlacerData pixelPlacerData) {
        CompoundTag tag = new CompoundTag();

        long x = Math.round(pixelPlacerData.pos.x * 16) & 0xF;
        long y = Math.round(pixelPlacerData.pos.y * 16) & 0xF;
        long z = Math.round(pixelPlacerData.pos.z * 16) & 0xF;

        long offset = x | (y << 4) | (z << 8);
        String dirName = pixelPlacerData.dir.getName();
        int id = Block.getId(pixelPlacerData.pixelPlacer.defaultBlockState());

        tag.putLong("Pos", offset);
        tag.putString("Dir", dirName);
        tag.putInt("PixelPlacer", id);

        return tag;
    }

    public static PixelPlacerData unpack(CompoundTag tag) {
        long offset = tag.getLong("Pos");
        String dirName = tag.getString("Dir");
        int id = tag.getInt("PixelPlacer");

        Vec3 pos = new Vec3((offset & 0xF) / 16d, ((offset >> 4) & 0xF) / 16d, ((offset >> 8) & 0xF) / 16d);
        Direction dir = Direction.byName(dirName);
        PixelPlacer pixelPlacer = (PixelPlacer) Block.stateById(id).getBlock();

        return new PixelPlacerData(pos, dir, pixelPlacer);
    }
}
