package com.zaksen.fancydecorativeblocks.screen;

import com.zaksen.fancydecorativeblocks.FancyBlocks;
import com.zaksen.fancydecorativeblocks.blocks.DiamondCrateEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class DiamondCrateMenu extends AbstractContainerMenu {
    private final DiamondCrateEntity blockEntity;
    private final Level level;

    protected DiamondCrateMenu(int ContrainerId, Inventory Inv, FriendlyByteBuf extraData) {
        this(ContrainerId, Inv, Inv.player.level.getBlockEntity(extraData.readBlockPos()));
    }

    public DiamondCrateMenu(int ContrainerId, Inventory Inv, BlockEntity entity) {
        super(FancyMenuTypes.DIAMOND_CRATE_MENU.get(), ContrainerId);
        checkContainerSize(Inv,41);
        blockEntity = ((DiamondCrateEntity) entity);
        this.level = Inv.player.level;

        addPlayerInventory(Inv);
        addPlayerHotbar(Inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(iItemHandler -> {
            //row 1
            this.addSlot(new SlotItemHandler(iItemHandler, 0, -10, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 1, 8, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 2, 26, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 3, 44, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 4, 62, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 5, 80, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 6, 98, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 7, 116, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 8, 134, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 9, 152, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 10, 170, 0));
            //row 2
            this.addSlot(new SlotItemHandler(iItemHandler, 11, -10, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 12, 8, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 13, 26, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 14, 44, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 15, 62, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 16, 80, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 17, 98, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 18, 116, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 19, 134, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 20, 152, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 21, 170, 18));
            //row 3
            this.addSlot(new SlotItemHandler(iItemHandler, 22, -10, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 23, 8, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 24, 26, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 25, 44, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 26, 62, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 27, 80, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 28, 98, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 29, 116, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 30, 134, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 31, 152, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 32, 170, 36));
            //row 4
            this.addSlot(new SlotItemHandler(iItemHandler, 33, -10, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 34, 8, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 35, 26, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 36, 44, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 37, 62, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 38, 80, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 39, 98, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 40, 116, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 41, 134, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 42, 152, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 43, 170, 54));
            //row 5
            this.addSlot(new SlotItemHandler(iItemHandler, 44, -10, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 45, 8, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 46, 26, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 47, 44, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 48, 62, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 49, 80, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 50, 98, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 51, 116, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 52, 134, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 53, 152, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 54, 170, 72));
        });
    }

    @Override
    public boolean stillValid(Player P) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), P, FancyBlocks.DIAMOND_CRATE.get());
    }

    private void addPlayerInventory(Inventory playerInv)
    {
        for(int i = 0; i < 3; ++i)
        {
            for(int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(playerInv, l + i * 9 + 9, 8 + l * 18, 102 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory)
    {
        for(int i = 0; i < 9; ++i)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 160));
        }
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 55;

    @Override
    public ItemStack quickMoveStack(Player p, int index)
    {
        Slot sourceSlot = slots.get(index);
        if(sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT)
        {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        }
        else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT)
        {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;
            }
        }
        else
        {
            System.out.println("Invalid Slot Index: " + index);
            return ItemStack.EMPTY;
        }

        if(sourceStack.getCount() == 0)
        {
            sourceSlot.set(ItemStack.EMPTY);
        }
        else
        {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(p, sourceStack);
        return copyOfSourceStack;
    }
}
