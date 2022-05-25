package com.zaksen.fancydecorativeblocks.blocks;

import com.zaksen.fancydecorativeblocks.FancyBlockEntities;
import com.zaksen.fancydecorativeblocks.screen.WoodCrateMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class WoodCrateEntity extends BaseStorageEntityBlock{
    public WoodCrateEntity(BlockPos BPos, BlockState BState) {
        super(FancyBlockEntities.WOOD_CRATE.get(), BPos, BState, 9, "Wood Crate");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int ContainerId, Inventory Inv, Player P) {
        return new WoodCrateMenu(ContainerId, Inv, this);
    }
}
