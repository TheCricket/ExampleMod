package com.example.example.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Making an item is super simple just extend Item :)
 */
public class ExampleItem extends Item {
    public ExampleItem() {
        super();
        //This is the item.unlocalizedName.name You are just replacing the middle with your own
        setUnlocalizedName("exampleItem");
        //You never want to add your things to vanilla tabs usually
        //We will be adding it
        setCreativeTab(CreativeTabs.tabMaterials);
    }
}
