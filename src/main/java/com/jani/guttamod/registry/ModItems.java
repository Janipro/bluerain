package com.jani.guttamod.registry;

import com.jani.guttamod.Guttamod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item HARAMBE = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final KpItem KP_ITEM = new KpItem(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.EPIC));
    public static final Identifier KP = new Identifier("tutorial:my_sound");
    public static SoundEvent KP_EVENT = new SoundEvent(KP);


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "harambe"), HARAMBE);
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "kp_item"), KP_ITEM);
        Registry.register(Registry.SOUND_EVENT, KP , KP_EVENT);
    }
}
