package com.jani.guttamod.registry;

import com.jani.guttamod.Guttamod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Mod {

    public static final Identifier KP = new Identifier("tutorial:kp");
    public static final Identifier STEROID_SOUND = new Identifier("tutorial:steroid_sound");
    public static SoundEvent KP_EVENT = new SoundEvent(KP);
    public static SoundEvent STEROID_EVENT = new SoundEvent(STEROID_SOUND);
    public static final KpItem KP_MIXTAPE = new KpItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item HARAMBE = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final SteroidItem STEROID = new SteroidItem(new SteroidItem.Settings()
                                                    .group(ItemGroup.FOOD)
                                                    .rarity(Rarity.EPIC)
                                                    .food(new FoodComponent.Builder()
                                                            .hunger(2)
                                                            .alwaysEdible()
                                                            .saturationModifier(6f)
                                                            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*10),1)
                                                            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,20*10),1)
                                                            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,20*10),1)
                                                            .build()));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "harambe"), HARAMBE);
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "kp_mixtape"), KP_MIXTAPE);
        Registry.register(Registry.ITEM, new Identifier(Guttamod.MOD_ID, "steroid"), STEROID);
        Registry.register(Registry.SOUND_EVENT, Mod.KP, KP_EVENT);
        Registry.register(Registry.SOUND_EVENT, Mod.STEROID_SOUND, STEROID_EVENT);
    }
}
