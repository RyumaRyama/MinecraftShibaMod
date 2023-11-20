package com.Ryama.ShibaMod.registry.tab;

import com.Ryama.ShibaMod.main.ShibaMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            ShibaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SHIBA_MAIN_TAB = TABS.register("shiba_main_tab",
            () -> {
                return CreativeModeTab.builder()
                        .icon(() -> new ItemStack(Blocks.STONE))
                        .title(Component.translatable("itemGroup.shiba_main_tab"))
                        .displayItems((param, output) -> {
                            for (Item item : MainTab.items) {
                                output.accept(item);
                            }
                        })
                        .build();
            });
}
