package com.newjumper.taloi.data.models;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ThatsALotOfItems.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // EVERGREEN
        axisBlock(ModBlocks.EVERGREEN_LOG.get(), modLoc("block/evergreen_log"), modLoc("block/evergreen_log_top"));
        simpleBlock(ModBlocks.EVERGREEN_WOOD.get(), models().cubeAll("evergreen_wood", modLoc("block/evergreen_log")));
        simpleBlock(ModBlocks.EVERGREEN_PLANKS.get());
        slabBlock(ModBlocks.EVERGREEN_SLAB.get(), modLoc("block/evergreen_planks"), modLoc("block/evergreen_planks"));
        stairsBlock(ModBlocks.EVERGREEN_STAIRS.get(), modLoc("block/evergreen_planks"));
        axisBlock(ModBlocks.STRIPPED_EVERGREEN_LOG.get(), modLoc("block/stripped_evergreen_log"), modLoc("block/stripped_evergreen_log_top"));
        simpleBlock(ModBlocks.STRIPPED_EVERGREEN_WOOD.get(), models().cubeAll("stripped_evergreen_wood", modLoc("block/stripped_evergreen_log")));
        fenceBlock(ModBlocks.EVERGREEN_FENCE.get(), modLoc("block/evergreen_planks"));
        fenceGateBlock(ModBlocks.EVERGREEN_FENCE_GATE.get(), modLoc("block/evergreen_planks"));
        simpleBlock(ModBlocks.EVERGREEN_LEAVES.get());
        simpleBlock(ModBlocks.EVERGREEN_SAPLING.get(), models().cross("evergreen_sapling", modLoc("block/evergreen_sapling")));
        buttonBlock(ModBlocks.EVERGREEN_BUTTON.get(), modLoc("block/evergreen_planks"));
        pressurePlateBlock(ModBlocks.EVERGREEN_PRESSURE_PLATE.get(), modLoc("block/evergreen_planks"));

        // WILLOW
        axisBlock(ModBlocks.WILLOW_LOG.get(), modLoc("block/willow_log"), modLoc("block/willow_log_top"));
        simpleBlock(ModBlocks.WILLOW_WOOD.get(), models().cubeAll("willow_wood", modLoc("block/willow_log")));
        simpleBlock(ModBlocks.WILLOW_PLANKS.get());
        slabBlock(ModBlocks.WILLOW_SLAB.get(), modLoc("block/willow_planks"), modLoc("block/willow_planks"));
        stairsBlock(ModBlocks.WILLOW_STAIRS.get(), modLoc("block/willow_planks"));
        axisBlock(ModBlocks.STRIPPED_WILLOW_LOG.get(), modLoc("block/stripped_willow_log"), modLoc("block/stripped_willow_log_top"));
        simpleBlock(ModBlocks.STRIPPED_WILLOW_WOOD.get(), models().cubeAll("stripped_willow_wood", modLoc("block/stripped_willow_log")));
        fenceBlock(ModBlocks.WILLOW_FENCE.get(), modLoc("block/willow_planks"));
        fenceGateBlock(ModBlocks.WILLOW_FENCE_GATE.get(), modLoc("block/willow_planks"));
        simpleBlock(ModBlocks.WILLOW_LEAVES.get());
        simpleBlock(ModBlocks.WILLOW_SAPLING.get(), models().cross("willow_sapling", modLoc("block/willow_sapling")));
        buttonBlock(ModBlocks.WILLOW_BUTTON.get(), modLoc("block/willow_planks"));
        pressurePlateBlock(ModBlocks.WILLOW_PRESSURE_PLATE.get(), modLoc("block/willow_planks"));

        // NATURAL
        simpleBlock(ModBlocks.LIMESTONE.get());
        slabBlock(ModBlocks.LIMESTONE_SLAB.get(), modLoc("block/limestone"), modLoc("block/limestone"));
        stairsBlock(ModBlocks.LIMESTONE_STAIRS.get(), modLoc("block/limestone"));
        wallBlock(ModBlocks.LIMESTONE_WALL.get(), modLoc("block/limestone"));

        simpleBlock(ModBlocks.MARBLE.get());
        slabBlock(ModBlocks.MARBLE_SLAB.get(), modLoc("block/marble"), modLoc("block/marble"));
        stairsBlock(ModBlocks.MARBLE_STAIRS.get(), modLoc("block/marble"));
        wallBlock(ModBlocks.MARBLE_WALL.get(), modLoc("block/marble"));

        // ALUMINUM
        simpleBlock(ModBlocks.ALUMINUM_BLOCK.get());
        simpleBlock(ModBlocks.ALUMINUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlock(ModBlocks.RAW_ALUMINUM_BLOCK.get());

        // IRIDIUM
        simpleBlock(ModBlocks.IRIDIUM_BLOCK.get());
        simpleBlock(ModBlocks.IRIDIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_IRIDIUM_BLOCK.get());

        // LEAD
        simpleBlock(ModBlocks.LEAD_BLOCK.get());
        simpleBlock(ModBlocks.LEAD_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_LEAD_ORE.get());
        simpleBlock(ModBlocks.RAW_LEAD_BLOCK.get());

        // MAGNESIUM
        simpleBlock(ModBlocks.MAGNESIUM_BLOCK.get());
        simpleBlock(ModBlocks.MAGNESIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_MAGNESIUM_BLOCK.get());

        // OSMIUM
        simpleBlock(ModBlocks.OSMIUM_BLOCK.get());
        simpleBlock(ModBlocks.OSMIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_OSMIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_OSMIUM_BLOCK.get());

        // PLATINUM
        simpleBlock(ModBlocks.PLATINUM_BLOCK.get());
        simpleBlock(ModBlocks.PLATINUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
        simpleBlock(ModBlocks.RAW_PLATINUM_BLOCK.get());

        // SILICON
        simpleBlock(ModBlocks.SILICON_BLOCK.get());
        simpleBlock(ModBlocks.SILICON_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SILICON_ORE.get());
        simpleBlock(ModBlocks.RAW_SILICON_BLOCK.get());

        // TIN
        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TIN_ORE.get());
        simpleBlock(ModBlocks.RAW_TIN_BLOCK.get());

        // TUNGSTEN
        simpleBlock(ModBlocks.TUNGSTEN_BLOCK.get());
        simpleBlock(ModBlocks.TUNGSTEN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
        simpleBlock(ModBlocks.RAW_TUNGSTEN_BLOCK.get());

        // URANIUM
        simpleBlock(ModBlocks.URANIUM_BLOCK.get());
        simpleBlock(ModBlocks.URANIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        simpleBlock(ModBlocks.RAW_URANIUM_BLOCK.get());

        // ZINC
        simpleBlock(ModBlocks.ZINC_BLOCK.get());
        simpleBlock(ModBlocks.ZINC_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ZINC_ORE.get());
        simpleBlock(ModBlocks.RAW_ZINC_BLOCK.get());

        // ALLOYS
        simpleBlock(ModBlocks.BRONZE_BLOCK.get());
        simpleBlock(ModBlocks.STEEL_BLOCK.get());

        // MACHINERY
        simpleBlock(ModBlocks.ALPHA_CONSTRUCTOR.get());
        simpleBlock(ModBlocks.BETA_CONSTRUCTOR.get());
        simpleBlock(ModBlocks.UNSTABLE_CONSTRUCTOR.get());

        // CONCRETE
        slabBlock(ModBlocks.WHITE_CONCRETE_SLAB.get(), mcLoc("block/white_concrete"), mcLoc("block/white_concrete"));
        stairsBlock(ModBlocks.WHITE_CONCRETE_STAIRS.get(), mcLoc("block/white_concrete"));

        slabBlock(ModBlocks.ORANGE_CONCRETE_SLAB.get(), mcLoc("block/orange_concrete"), mcLoc("block/orange_concrete"));
        stairsBlock(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), mcLoc("block/orange_concrete"));

        slabBlock(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), mcLoc("block/magenta_concrete"), mcLoc("block/magenta_concrete"));
        stairsBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), mcLoc("block/magenta_concrete"));

        slabBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), mcLoc("block/light_blue_concrete"), mcLoc("block/light_blue_concrete"));
        stairsBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), mcLoc("block/light_blue_concrete"));

        slabBlock(ModBlocks.YELLOW_CONCRETE_SLAB.get(), mcLoc("block/yellow_concrete"), mcLoc("block/yellow_concrete"));
        stairsBlock(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), mcLoc("block/yellow_concrete"));

        slabBlock(ModBlocks.LIME_CONCRETE_SLAB.get(), mcLoc("block/lime_concrete"), mcLoc("block/lime_concrete"));
        stairsBlock(ModBlocks.LIME_CONCRETE_STAIRS.get(), mcLoc("block/lime_concrete"));

        slabBlock(ModBlocks.PINK_CONCRETE_SLAB.get(), mcLoc("block/pink_concrete"), mcLoc("block/pink_concrete"));
        stairsBlock(ModBlocks.PINK_CONCRETE_STAIRS.get(), mcLoc("block/pink_concrete"));

        slabBlock(ModBlocks.GRAY_CONCRETE_SLAB.get(), mcLoc("block/gray_concrete"), mcLoc("block/gray_concrete"));
        stairsBlock(ModBlocks.GRAY_CONCRETE_STAIRS.get(), mcLoc("block/gray_concrete"));

        slabBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), mcLoc("block/light_gray_concrete"), mcLoc("block/light_gray_concrete"));
        stairsBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), mcLoc("block/light_gray_concrete"));

        slabBlock(ModBlocks.CYAN_CONCRETE_SLAB.get(), mcLoc("block/cyan_concrete"), mcLoc("block/cyan_concrete"));
        stairsBlock(ModBlocks.CYAN_CONCRETE_STAIRS.get(), mcLoc("block/cyan_concrete"));

        slabBlock(ModBlocks.PURPLE_CONCRETE_SLAB.get(), mcLoc("block/purple_concrete"), mcLoc("block/purple_concrete"));
        stairsBlock(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), mcLoc("block/purple_concrete"));

        slabBlock(ModBlocks.BLUE_CONCRETE_SLAB.get(), mcLoc("block/blue_concrete"), mcLoc("block/blue_concrete"));
        stairsBlock(ModBlocks.BLUE_CONCRETE_STAIRS.get(), mcLoc("block/blue_concrete"));

        slabBlock(ModBlocks.BROWN_CONCRETE_SLAB.get(), mcLoc("block/brown_concrete"), mcLoc("block/brown_concrete"));
        stairsBlock(ModBlocks.BROWN_CONCRETE_STAIRS.get(), mcLoc("block/brown_concrete"));

        slabBlock(ModBlocks.GREEN_CONCRETE_SLAB.get(), mcLoc("block/green_concrete"), mcLoc("block/green_concrete"));
        stairsBlock(ModBlocks.GREEN_CONCRETE_STAIRS.get(), mcLoc("block/green_concrete"));

        slabBlock(ModBlocks.RED_CONCRETE_SLAB.get(), mcLoc("block/red_concrete"), mcLoc("block/red_concrete"));
        stairsBlock(ModBlocks.RED_CONCRETE_STAIRS.get(), mcLoc("block/red_concrete"));

        slabBlock(ModBlocks.BLACK_CONCRETE_SLAB.get(), mcLoc("block/black_concrete"), mcLoc("block/black_concrete"));
        stairsBlock(ModBlocks.BLACK_CONCRETE_STAIRS.get(), mcLoc("block/black_concrete"));

        // MISCELLANEOUS
        simpleBlock(ModBlocks.BOUNCY_BLOCK.get());
        simpleBlock(ModBlocks.FEATHERY_BLOCK.get());
        simpleBlock(ModBlocks.GRAVITY_BLOCK.get());
        simpleBlock(ModBlocks.SPEEDY_BLOCK.get());
    }

    @Override
    public void fenceBlock(FenceBlock block, ResourceLocation texture) {
        super.fenceBlock(block, texture);
        models().fenceInventory(block.getRegistryName().toString() + "_inventory", texture);
    }

    @Override
    public void buttonBlock(ButtonBlock block, ResourceLocation texture) {
        super.buttonBlock(block, texture);
        models().buttonInventory(block.getRegistryName().toString() + "_inventory", texture);
    }

    @Override
    public void wallBlock(WallBlock block, ResourceLocation texture) {
        super.wallBlock(block, texture);
        models().wallInventory(block.getRegistryName().toString() + "_inventory", texture);
    }
}
