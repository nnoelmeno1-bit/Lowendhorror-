package com.lowendhorror.registry;

import com.lowendhorror.LowEndHorror;
import com.lowendhorror.entity.WatcherEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, LowEndHorror.MOD_ID);

    public static final RegistryObject<EntityType<WatcherEntity>> WATCHER =
            ENTITY_TYPES.register("watcher", () ->
                    EntityType.Builder.<WatcherEntity>of(WatcherEntity::new, EntityClassification.MONSTER)
                            .sized(0.7F, 2.7F)
                            .clientTrackingRange(8)
                            .build(LowEndHorror.MOD_ID + ":watcher"));

    private ModEntityTypes() {}
}
