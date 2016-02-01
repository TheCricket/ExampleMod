package com.example.example.client;

import com.example.example.ExampleMod;
import com.example.example.init.ModItems;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * All models will be registered in here for items
 */
public class ItemModelRegistry {

    public static void init() {
        registerItemModel(ModItems.exampleItem, "exampleItem");
    }

    /**
     * Registers an item model without metadata
     * @param item
     * @param name The name of the json
     */
    private static void registerItemModel(Item item, String name) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ExampleMod.MODID + ":" + name, "inventory"));
    }

    /**
     * Registers an item model with metadata
     * @param item
     * @param meta
     * @param name The name of the json
     */
    private static void registerItemModelWithMeta(Item item, int meta, String name) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ExampleMod.MODID + ":" + name, "inventory"));
    }
}
