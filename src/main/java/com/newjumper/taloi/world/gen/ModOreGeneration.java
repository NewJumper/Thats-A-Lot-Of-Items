package com.newjumper.taloi.world.gen;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        spawnOreInAllBiomes(OreType.ALUMINUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.IRIDIUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.MOUNTAINS, OreType.ALUMINUM_ORE_2, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.MOUNTAIN_EDGE, OreType.ALUMINUM_ORE_2, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.LEAD_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.MAGNESIUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.OSMIUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.PLATINUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.STONE_SHORE, OreType.SILICON_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.MOUNTAINS, OreType.SILICON_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.MOUNTAIN_EDGE, OreType.SILICON_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.TIN_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.BADLANDS, OreType.URANIUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInSpecificBiome(Biomes.BADLANDS_PLATEAU, OreType.URANIUM_ORE, event, LevelStem.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.ZINC_ORE, event, LevelStem.OVERWORLD.toString());
    }

    private static OreConfiguration getOverworldFeatureConfig(OreType ore) {
        return new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
    }

    private static OreConfiguration getNetherFeatureConfig(OreType ore) {
        return new OreConfiguration(OreConfiguration.Predicates.NETHERRACK, ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
    }

    private static OreConfiguration getEndFeatureConfig(OreType ore) {
        return new OreConfiguration(new BlockMatchTest(Blocks.END_STONE), ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
    }

    private static ConfiguredFeature<?, ?> makeOreFeature(OreType ore, String dimensionToSpawnIn) {
        OreConfiguration oreFeatureConfig = null;

        if(dimensionToSpawnIn.equals(LevelStem.OVERWORLD.toString())) {
            oreFeatureConfig = getOverworldFeatureConfig(ore);
        } else if(dimensionToSpawnIn.equals(LevelStem.NETHER.toString())) {
            oreFeatureConfig = getNetherFeatureConfig(ore);
        } else if(dimensionToSpawnIn.equals(LevelStem.END.toString())) {
            oreFeatureConfig = getEndFeatureConfig(ore);
        }

        RangeDecoratorConfiguration rangeDecoratorConfiguration = new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(ore.getMinYLevel()), VerticalAnchor.absolute(ore.getMaxYLevel())));

        return registerOreFeature(ore, oreFeatureConfig, rangeDecoratorConfiguration);
    }

    private static void spawnOreInOverworldInGivenBiomes(OreType ore, final BiomeLoadingEvent event, Biome... biomesToSpawnIn) {
        OreConfiguration oreFeatureConfig = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
        RangeDecoratorConfiguration rangeDecoratorConfiguration = new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(ore.getMinYLevel()), VerticalAnchor.absolute(ore.getMaxYLevel())));
        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, rangeDecoratorConfiguration);

        if (Arrays.stream(biomesToSpawnIn).anyMatch(b -> b.getRegistryName().equals(event.getName()))) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }

    private static void spawnOreInOverworldInAllBiomes(OreType ore, final BiomeLoadingEvent event) {
        OreConfiguration oreFeatureConfig = new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

        RangeDecoratorConfiguration rangeDecoratorConfiguration = new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(ore.getMinYLevel()), VerticalAnchor.absolute(ore.getMaxYLevel())));

        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, rangeDecoratorConfiguration);

        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, oreFeature);
    }

    private static void spawnOreInSpecificModBiome(Biome biomeToSpawnIn, OreType currentOreType, final BiomeLoadingEvent event, String dimension) {
        if(event.getName().toString().contains(biomeToSpawnIn.getRegistryName().toString())) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
        }
    }

    private static void spawnOreInSpecificBiome(ResourceKey<Biome> biomeToSpawnIn, OreType currentOreType, final BiomeLoadingEvent event, String dimension) {
        if(event.getName().toString().contains(biomeToSpawnIn.location().toString())) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
        }
    }

    private static void spawnOreInAllBiomes(OreType currentOreType, final BiomeLoadingEvent event, String dimension) {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreConfiguration oreFeatureConfig, RangeDecoratorConfiguration configuredDecorator) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(), Feature.ORE.configured(oreFeatureConfig).range(configuredDecorator).squared().count(ore.getVeinsPerChunk()));
    }
}
