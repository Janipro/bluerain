package com.jani.guttamod.registry;

import com.jani.guttamod.Guttamod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "ruby"), RUBY);
    }
}
