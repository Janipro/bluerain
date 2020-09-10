package com.jani.bluerain.registry;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;


public class SteroidItem extends Item{
    public SteroidItem(Settings settings) {

        super(settings);
    }

    @Override
    public SoundEvent getEatSound() {
        return Mod.STEROID_EVENT;
    }

}