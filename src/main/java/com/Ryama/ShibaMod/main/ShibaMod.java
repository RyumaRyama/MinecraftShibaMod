package com.Ryama.ShibaMod.main;

import com.Ryama.ShibaMod.registry.ShibaModBlocks;
import com.Ryama.ShibaMod.registry.tab.Tabs;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("shibamod")
public class ShibaMod {
    public static final String MOD_ID = "shibamod";

    public ShibaMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Tabs.TABS.register(bus);
        ShibaModBlocks.Blocks.BLOCKS.register(bus);
        ShibaModBlocks.BlockItems.BLOCK_ITEMS.register(bus);
    }
}
