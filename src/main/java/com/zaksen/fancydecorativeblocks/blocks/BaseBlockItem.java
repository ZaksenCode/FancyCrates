package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;

public class BaseBlockItem extends BlockItem
{
    public BaseBlockItem(BaseBlock BlockToItem, Properties ItemProperties)
    {
        super(BlockToItem, ItemProperties);
    }

    public BaseBlockItem(BaseEntityBlock BlockToItem, Properties ItemProperties)
    {
        super(BlockToItem, ItemProperties);
    }
}
