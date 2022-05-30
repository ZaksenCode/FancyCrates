package com.zaksen.fancycrates;

import com.zaksen.fancycrates.blocks.BaseBlock;
import com.zaksen.fancycrates.blocks.BaseBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FancyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FancyCrates.MOD_ID);

    public static final RegistryObject<WoodCrateUpgrade> WOOD_CRATE_UPGRADE;
    static {
        registerBlockItemFor(FancyBlocks.CRATE_FRAME);
        registerEntityBlockItemFor(FancyBlocks.WOOD_CRATE);
        registerEntityBlockItemFor(FancyBlocks.IRON_CRATE);
        registerEntityBlockItemFor(FancyBlocks.COPPER_CRATE);
        registerEntityBlockItemFor(FancyBlocks.GOLD_CRATE);
        registerEntityBlockItemFor(FancyBlocks.DIAMOND_CRATE);
        registerEntityBlockItemFor(FancyBlocks.NETHERITE_CRATE);
        WOOD_CRATE_UPGRADE = ITEMS.register("wood_crate_upgrade", WoodCrateUpgrade::new);
    }

    private FancyItems() {
    }

    private static <T extends BaseBlock> RegistryObject<BlockItem> registerBlockItemFor(RegistryObject<T> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BaseBlockItem(block.get(), new Item.Properties().tab(FancyCrates.BLOCK_GROUP)));
    }

    private static <T extends BaseEntityBlock> RegistryObject<BlockItem> registerEntityBlockItemFor(RegistryObject<T> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BaseBlockItem(block.get(), new Item.Properties().tab(FancyCrates.BLOCK_GROUP)));
    }

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
