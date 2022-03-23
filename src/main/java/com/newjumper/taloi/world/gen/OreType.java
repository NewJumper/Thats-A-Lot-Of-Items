package com.newjumper.taloi.world.gen;

import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    // THIS FILE IS NO LONGER IN USE
    ALUMINUM_ORE(Lazy.of(ModBlocks.ALUMINUM_ORE), 10, 0, 64, 12),
    ALUMINUM_ORE_2(Lazy.of(ModBlocks.ALUMINUM_ORE), 12, 64, 128, 4),
    IRIDIUM_ORE(Lazy.of(ModBlocks.IRIDIUM_ORE), 7, 18, 32, 6),
    LEAD_ORE(Lazy.of(ModBlocks.LEAD_ORE), 10, 30, 50, 12),
    MAGNESIUM_ORE(Lazy.of(ModBlocks.MAGNESIUM_ORE), 10, 50, 100, 10),
    OSMIUM_ORE(Lazy.of(ModBlocks.OSMIUM_ORE), 7, 0, 32, 6),
    PLATINUM_ORE(Lazy.of(ModBlocks.PLATINUM_ORE), 3, 0, 16, 3),
    SILICON_ORE(Lazy.of(ModBlocks.SILICON_ORE), 5, 0, 24, 7),
    TIN_ORE(Lazy.of(ModBlocks.TIN_ORE), 10, 24, 80, 10),
    TUNGSTEN_ORE(Lazy.of(ModBlocks.TUNGSTEN_ORE), 3, 0, 10, 2),
    URANIUM_ORE(Lazy.of(ModBlocks.URANIUM_ORE), 3, 0, 10, 2),
    ZINC_ORE(Lazy.of(ModBlocks.ZINC_ORE), 8, 0, 64, 8);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minYLevel;
    private final int maxYLevel;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minYLevel, int maxYLevel, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minYLevel = minYLevel;
        this.maxYLevel = maxYLevel;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }
    public int getMaxVeinSize() {
        return maxVeinSize;
    }
    public int getMinYLevel() {
        return minYLevel;
    }
    public int getMaxYLevel() {
        return maxYLevel;
    }
    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public static OreType get(Block block) {
        for(OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
