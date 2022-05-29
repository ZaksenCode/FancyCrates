package com.zaksen.fancycrates;

import com.zaksen.fancycrates.screen.FancyMenuTypes;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FancyCrates.MOD_ID)
public class FancyCrates
{
    public static final String MOD_ID = "fancycrates";

    public static final CreativeModeTab BLOCK_GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FancyBlocks.DIAMOND_CRATE.get());
        }
    };

    public FancyCrates()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FancyBlockEntities.register();
        FancyBlocks.register();
        FancyItems.register();
        FancyMenuTypes.register();

        eventBus.addListener(ClientSetup::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
