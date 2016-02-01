package com.example.example.init;

import com.example.example.items.ExampleItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class stores the instances of all your mods items
 */
public class ModItems {

    public static ExampleItem exampleItem = new ExampleItem();

    /**
     * Setup all the items to be registered
     */
    public static void init() {
        registerItem(exampleItem);
    }

    private static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
}
