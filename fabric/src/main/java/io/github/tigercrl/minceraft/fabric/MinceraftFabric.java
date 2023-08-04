package io.github.tigercrl.minceraft.fabric;

import io.github.tigercrl.minceraft.Minceraft;
import net.fabricmc.api.ModInitializer;

public class MinceraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Minceraft.init();
    }
}