package com.zaksen.fancycrates.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.BaseEntityBlock;

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
