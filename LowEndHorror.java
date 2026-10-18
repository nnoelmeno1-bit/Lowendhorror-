package com.lowendhorror;

import com.lowendhorror.registry.ModEntityTypes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LowEndHorror.MOD_ID)
public class LowEndHorror {
    public static final String MOD_ID = "lowendhorror";

    public LowEndHorror() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityTypes.ENTITY_TYPES.register(bus);
    }
}
