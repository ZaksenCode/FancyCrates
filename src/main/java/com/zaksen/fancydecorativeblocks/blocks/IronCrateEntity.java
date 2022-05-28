package com.zaksen.fancydecorativeblocks.blocks;

import com.zaksen.fancydecorativeblocks.FancyBlockEntities;
import com.zaksen.fancydecorativeblocks.screen.IronCrateMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class IronCrateEntity extends BaseStorageEntityBlock{
    public IronCrateEntity(BlockPos BPos, BlockState BState) {
        super(FancyBlockEntities.IRON_CRATE.get(), BPos, BState, 18, "Iron Crate");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int ContainerId, Inventory Inv, Player P) {
        return new IronCrateMenu(ContainerId, Inv, this);
    }
}
