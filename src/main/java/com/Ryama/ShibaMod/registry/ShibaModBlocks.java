package com.Ryama.ShibaMod.registry;

import com.Ryama.ShibaMod.block.BlockGamingTatami;
import com.Ryama.ShibaMod.block.BlockGamingTatamiBeri;
import com.Ryama.ShibaMod.block.BlockKissyo;
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
                public static final RegistryObject<Block> GAMING_TATAMI = BLOCKS.register("gaming_tatami",
                                BlockGamingTatami::new);
                public static final RegistryObject<Block> GAMING_TATAMI_BERI = BLOCKS.register("gaming_tatami_beri",
                                BlockGamingTatamiBeri::new);

                // kissyo
                public static final RegistryObject<Block> KISSYO01 = BLOCKS.register("kissyo01", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO02 = BLOCKS.register("kissyo02", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO03 = BLOCKS.register("kissyo03", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO04 = BLOCKS.register("kissyo04", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO05 = BLOCKS.register("kissyo05", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO06 = BLOCKS.register("kissyo06", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO07 = BLOCKS.register("kissyo07", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO08 = BLOCKS.register("kissyo08", BlockKissyo::new);
                public static final RegistryObject<Block> KISSYO09 = BLOCKS.register("kissyo09", BlockKissyo::new);
        }

        public static class BlockItems {
                public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                                ShibaMod.MOD_ID);
                public static final RegistryObject<Item> TATAMI = BLOCK_ITEMS.register("tatami",
                                () -> new BlockItem(Blocks.TATAMI.get(), new Item.Properties()));
                public static final RegistryObject<Item> GAMING_TATAMI = BLOCK_ITEMS.register("gaming_tatami",
                                () -> new BlockItem(Blocks.GAMING_TATAMI.get(), new Item.Properties()));
                public static final RegistryObject<Item> GAMING_TATAMI_BERI = BLOCK_ITEMS.register("gaming_tatami_beri",
                                () -> new BlockItem(Blocks.GAMING_TATAMI_BERI.get(), new Item.Properties()));

                // kissyo
                public static final RegistryObject<Item> KISSYO01 = BLOCK_ITEMS.register("kissyo01",
                                () -> new BlockItem(Blocks.KISSYO01.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO02 = BLOCK_ITEMS.register("kissyo02",
                                () -> new BlockItem(Blocks.KISSYO02.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO03 = BLOCK_ITEMS.register("kissyo03",
                                () -> new BlockItem(Blocks.KISSYO03.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO04 = BLOCK_ITEMS.register("kissyo04",
                                () -> new BlockItem(Blocks.KISSYO04.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO05 = BLOCK_ITEMS.register("kissyo05",
                                () -> new BlockItem(Blocks.KISSYO05.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO06 = BLOCK_ITEMS.register("kissyo06",
                                () -> new BlockItem(Blocks.KISSYO06.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO07 = BLOCK_ITEMS.register("kissyo07",
                                () -> new BlockItem(Blocks.KISSYO07.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO08 = BLOCK_ITEMS.register("kissyo08",
                                () -> new BlockItem(Blocks.KISSYO08.get(), new Item.Properties()));
                public static final RegistryObject<Item> KISSYO09 = BLOCK_ITEMS.register("kissyo09",
                                () -> new BlockItem(Blocks.KISSYO09.get(), new Item.Properties()));
        }
}
