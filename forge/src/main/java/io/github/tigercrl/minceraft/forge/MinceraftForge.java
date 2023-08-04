package io.github.tigercrl.minceraft.forge;

import io.github.tigercrl.minceraft.Minceraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Minceraft.MOD_ID)
public class MinceraftForge {
    public MinceraftForge() {
        Minceraft.init();
    }
}