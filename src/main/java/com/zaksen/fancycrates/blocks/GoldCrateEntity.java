package com.zaksen.fancycrates.blocks;

import com.zaksen.fancycrates.FancyBlockEntities;
import com.zaksen.fancycrates.screen.GoldCrateMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class GoldCrateEntity extends BaseStorageEntityBlock{
    public GoldCrateEntity(BlockPos BPos, BlockState BState) {
        super(FancyBlockEntities.GOLD_CRATE.get(), BPos, BState, 45, "Gold Crate");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int ContainerId, Inventory Inv, Player P) {
        return new GoldCrateMenu(ContainerId, Inv, this);
    }
}
