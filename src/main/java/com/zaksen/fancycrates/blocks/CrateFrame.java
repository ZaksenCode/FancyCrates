package com.zaksen.fancycrates.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CrateFrame extends BaseBlock {
    public CrateFrame() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD).destroyTime(1f).explosionResistance(1f).requiresCorrectToolForDrops());
    }
}
