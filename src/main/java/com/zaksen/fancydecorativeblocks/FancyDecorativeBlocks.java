package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.screen.FancyMenuTypes;
import com.zaksen.fancydecorativeblocks.screen.WoodCrateScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod("fancydecorativeblocks")
public class FancyDecorativeBlocks
{
    public static final String MOD_ID = "fancydecorativeblocks";

    public static final CreativeModeTab BLOCK_GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.STONECUTTER);
        }
    };

    public FancyDecorativeBlocks()
    {
        FancyBlockEntities.register();
        FancyBlocks.register();
        FancyItems.register();
        FancyMenuTypes.register();


    }

    void clientSetup(final FMLClientSetupEvent Event)
    {
        MenuScreens.register(FancyMenuTypes.WOOD_CRATE_MENU.get(), WoodCrateScreen::new);
    }
}
