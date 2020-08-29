package com.jani.guttamod;
import com.jani.guttamod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Guttamod implements ModInitializer {

    public static final String MOD_ID = "tutorial";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
