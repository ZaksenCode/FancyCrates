package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.screen.FancyMenuTypes;
import com.zaksen.fancydecorativeblocks.screen.WoodCrateScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
@Mod.EventBusSubscriber(modid = FancyDecorativeBlocks.MOD_ID)
public class ClientSetup {
    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent Event)
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MenuScreens.register(FancyMenuTypes.WOOD_CRATE_MENU.get(), WoodCrateScreen::new);
            }
        };
        Event.enqueueWork(runnable);
    }
}
