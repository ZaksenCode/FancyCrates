package com.zaksen.fancydecorativeblocks.screen;

import com.zaksen.fancydecorativeblocks.FancyBlocks;
import com.zaksen.fancydecorativeblocks.blocks.NetheriteCrateEntity;
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

public class NetheriteCrateMenu extends AbstractContainerMenu {
    private final NetheriteCrateEntity blockEntity;
    private final Level level;

    protected NetheriteCrateMenu(int ContrainerId, Inventory Inv, FriendlyByteBuf extraData) {
        this(ContrainerId, Inv, Inv.player.level.getBlockEntity(extraData.readBlockPos()));
    }

    public NetheriteCrateMenu(int ContrainerId, Inventory Inv, BlockEntity entity) {
        super(FancyMenuTypes.NETHERITE_CRATE_MENU.get(), ContrainerId);
        checkContainerSize(Inv,41);
        blockEntity = ((NetheriteCrateEntity) entity);
        this.level = Inv.player.level;

        addPlayerInventory(Inv);
        addPlayerHotbar(Inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(iItemHandler -> {
            //row 1
            this.addSlot(new SlotItemHandler(iItemHandler, 0, -28, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 1, -10, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 2, 8, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 3, 26, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 4, 44, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 5, 62, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 6, 80, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 7, 98, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 8, 116, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 9, 134, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 10, 152, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 11, 170, -18));
            this.addSlot(new SlotItemHandler(iItemHandler, 12, 188, -18));
            //row 2
            this.addSlot(new SlotItemHandler(iItemHandler, 13, -28, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 14, -10, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 15, 8, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 16, 26, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 17, 44, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 18, 62, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 19, 80, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 20, 98, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 21, 116, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 22, 134, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 23, 152, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 24, 170, 0));
            this.addSlot(new SlotItemHandler(iItemHandler, 25, 188, 0));
            //row 3
            this.addSlot(new SlotItemHandler(iItemHandler, 26, -28, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 27, -10, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 28, 8, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 29, 26, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 30, 44, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 31, 62, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 32, 80, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 33, 98, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 34, 116, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 35, 134, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 36, 152, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 37, 170, 18));
            this.addSlot(new SlotItemHandler(iItemHandler, 38, 188, 18));
            //row 4
            this.addSlot(new SlotItemHandler(iItemHandler, 39, -28, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 40, -10, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 41, 8, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 42, 26, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 43, 44, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 44, 62, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 45, 80, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 46, 98, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 47, 116, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 48, 134, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 49, 152, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 50, 170, 36));
            this.addSlot(new SlotItemHandler(iItemHandler, 51, 188, 36));
            //row 5
            this.addSlot(new SlotItemHandler(iItemHandler, 52, -28, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 53, -10, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 54, 8, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 55, 26, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 56, 44, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 57, 62, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 58, 80, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 59, 98, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 60, 116, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 61, 134, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 62, 152, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 63, 170, 54));
            this.addSlot(new SlotItemHandler(iItemHandler, 64, 188, 54));
            //row 6
            this.addSlot(new SlotItemHandler(iItemHandler, 65, -28, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 66, -10, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 67, 8, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 68, 26, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 69, 44, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 70, 62, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 71, 80, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 72, 98, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 73, 116, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 74, 134, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 75, 152, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 76, 170, 72));
            this.addSlot(new SlotItemHandler(iItemHandler, 77, 188, 72));
            //row 7
            this.addSlot(new SlotItemHandler(iItemHandler, 78, -28, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 79, -10, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 80, 8, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 81, 26, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 82, 44, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 83, 62, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 84, 80, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 85, 98, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 86, 116, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 87, 134, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 88, 152, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 89, 170, 90));
            this.addSlot(new SlotItemHandler(iItemHandler, 90, 188, 90));
        });
    }

    @Override
    public boolean stillValid(Player P) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), P, FancyBlocks.NETHERITE_CRATE.get());
    }

    private void addPlayerInventory(Inventory playerInv)
    {
        for(int i = 0; i < 3; ++i)
        {
            for(int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(playerInv, l + i * 9 + 9, 8 + l * 18, 120 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory)
    {
        for(int i = 0; i < 9; ++i)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 178));
        }
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 91;

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
