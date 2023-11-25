package com.Ryama.ShibaMod.registry;

import com.Ryama.ShibaMod.block.BlockGamingTatamiBeri;
import com.Ryama.ShibaMod.block.BlockTatami;
import com.Ryama.ShibaMod.main.ShibaMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ShibaModBlocks {
    public static class Blocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                ShibaMod.MOD_ID);
        public static final RegistryObject<Block> TATAMI = BLOCKS.register("tatami", BlockTatami::new);
        public static final RegistryObject<Block> GAMING_TATAMI_BERI = BLOCKS.register("gaming_tatami_beri",
                BlockGamingTatamiBeri::new);
    }

    public static class BlockItems {
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                ShibaMod.MOD_ID);
        public static final RegistryObject<Item> TATAMI = BLOCK_ITEMS.register("tatami",
                () -> new BlockItem(Blocks.TATAMI.get(), new Item.Properties()));
        public static final RegistryObject<Item> GAMING_TATAMI_BERI = BLOCK_ITEMS.register("gaming_tatami_beri",
                () -> new BlockItem(Blocks.GAMING_TATAMI_BERI.get(), new Item.Properties()));
    }
}
