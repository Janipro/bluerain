package com.jani.bluerain;
import com.jani.bluerain.registry.Mod;
import net.fabricmc.api.ModInitializer;

public class BlueRain implements ModInitializer {

    public static final String MOD_ID = "bluerain";

    @Override
    public void onInitialize() {
        Mod.registerItems();
    }
}
