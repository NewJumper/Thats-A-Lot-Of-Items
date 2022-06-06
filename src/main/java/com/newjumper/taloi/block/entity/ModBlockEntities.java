package com.newjumper.taloi.block.entity;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import com.newjumper.taloi.block.entity.machine.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ThatsALotOfItems.MOD_ID);

    public static final RegistryObject<BlockEntityType<AlphaConstructorBlockEntity>> ALPHA_CONSTRUCTOR = BLOCK_ENTITIES.register("alpha_constructor", () -> BlockEntityType.Builder.of(AlphaConstructorBlockEntity::new, ModBlocks.ALPHA_CONSTRUCTOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<BetaConstructorBlockEntity>> BETA_CONSTRUCTOR = BLOCK_ENTITIES.register("beta_constructor", () -> BlockEntityType.Builder.of(BetaConstructorBlockEntity::new, ModBlocks.BETA_CONSTRUCTOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<UnstableConstructorBlockEntity>> UNSTABLE_CONSTRUCTOR = BLOCK_ENTITIES.register("unstable_constructor", () -> BlockEntityType.Builder.of(UnstableConstructorBlockEntity::new, ModBlocks.UNSTABLE_CONSTRUCTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<AlphaHydraulicPressBlockEntity>> ALPHA_HYDRAULIC_PRESS = BLOCK_ENTITIES.register("alpha_hydraulic_press", () -> BlockEntityType.Builder.of(AlphaHydraulicPressBlockEntity::new, ModBlocks.ALPHA_HYDRAULIC_PRESS.get()).build(null));
    public static final RegistryObject<BlockEntityType<BetaHydraulicPressBlockEntity>> BETA_HYDRAULIC_PRESS = BLOCK_ENTITIES.register("beta_hydraulic_press", () -> BlockEntityType.Builder.of(BetaHydraulicPressBlockEntity::new, ModBlocks.BETA_HYDRAULIC_PRESS.get()).build(null));
    public static final RegistryObject<BlockEntityType<UnstableHydraulicPressBlockEntity>> UNSTABLE_HYDRAULIC_PRESS = BLOCK_ENTITIES.register("unstable_hydraulic_press", () -> BlockEntityType.Builder.of(UnstableHydraulicPressBlockEntity::new, ModBlocks.UNSTABLE_HYDRAULIC_PRESS.get()).build(null));

    public static final RegistryObject<BlockEntityType<AlphaProcessorBlockEntity>> ALPHA_PROCESSOR = BLOCK_ENTITIES.register("alpha_processor", () -> BlockEntityType.Builder.of(AlphaProcessorBlockEntity::new, ModBlocks.ALPHA_PROCESSOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<BetaProcessorBlockEntity>> BETA_PROCESSOR = BLOCK_ENTITIES.register("beta_processor", () -> BlockEntityType.Builder.of(BetaProcessorBlockEntity::new, ModBlocks.BETA_PROCESSOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<UnstableProcessorBlockEntity>> UNSTABLE_PROCESSOR = BLOCK_ENTITIES.register("unstable_processor", () -> BlockEntityType.Builder.of(UnstableProcessorBlockEntity::new, ModBlocks.UNSTABLE_PROCESSOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<AlphaSeparatorBlockEntity>> ALPHA_SEPARATOR = BLOCK_ENTITIES.register("alpha_separator", () -> BlockEntityType.Builder.of(AlphaSeparatorBlockEntity::new, ModBlocks.ALPHA_SEPARATOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<BetaSeparatorBlockEntity>> BETA_SEPARATOR = BLOCK_ENTITIES.register("beta_separator", () -> BlockEntityType.Builder.of(BetaSeparatorBlockEntity::new, ModBlocks.BETA_SEPARATOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<UnstableSeparatorBlockEntity>> UNSTABLE_SEPARATOR = BLOCK_ENTITIES.register("unstable_separator", () -> BlockEntityType.Builder.of(UnstableSeparatorBlockEntity::new, ModBlocks.UNSTABLE_SEPARATOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
