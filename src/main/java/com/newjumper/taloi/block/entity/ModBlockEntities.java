package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.block.machine.AlphaConstructorBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<BlockEntityType<AlphaConstructorBlockEntity>> ALPHA_CONSTRUCTOR = BLOCK_ENTITIES.register("alpha_constructor", () -> BlockEntityType.Builder.of(AlphaConstructorBlockEntity::new, ModBlocks.ALPHA_CONSTRUCTOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<BetaConstructorBlockEntity>> BETA_CONSTRUCTOR = BLOCK_ENTITIES.register("beta_constructor", () -> BlockEntityType.Builder.of(BetaConstructorBlockEntity::new, ModBlocks.BETA_CONSTRUCTOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}