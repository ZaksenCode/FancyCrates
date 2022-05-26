package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CobblestoneSmallTiles extends BaseBlock {
    public CobblestoneSmallTiles() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).destroyTime(2f).strength(2F).explosionResistance(6f).requiresCorrectToolForDrops());
    }
}
