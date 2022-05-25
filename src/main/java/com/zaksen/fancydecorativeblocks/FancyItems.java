package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.blocks.BaseBlock;
import com.zaksen.fancydecorativeblocks.blocks.BaseBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FancyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FancyDecorativeBlocks.MOD_ID);

    static {
        registerBlockItemFor(FancyBlocks.ELECTRO_LAMP);
        registerEntityBlockItemFor(FancyBlocks.WOOD_CRATE);
    }

    private FancyItems() {
    }

    private static <T extends BaseBlock> RegistryObject<BlockItem> registerBlockItemFor(RegistryObject<T> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BaseBlockItem(block.get(), new Item.Properties().tab(FancyDecorativeBlocks.BLOCK_GROUP)));
    }

    private static <T extends BaseEntityBlock> RegistryObject<BlockItem> registerEntityBlockItemFor(RegistryObject<T> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BaseBlockItem(block.get(), new Item.Properties().tab(FancyDecorativeBlocks.BLOCK_GROUP)));
    }

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
