package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.WorldData;
import net.minecraftforge.common.world.ForgeWorldPreset;

public class ElectroLamp extends BaseBlock {
    public ElectroLamp() {
        super(Properties.of(Material.GLASS).sound(SoundType.GLASS).destroyTime(1.5f).explosionResistance(6.0f));
    }
}
