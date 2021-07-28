package com.robinb.mynewmod;

import com.robinb.mynewmod.register.FuelRegister;
import com.robinb.mynewmod.register.ModBlocks;
import com.robinb.mynewmod.register.ModItems;
import com.robinb.mynewmod.register.ToolRegister;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class MyNewMod implements ModInitializer{

    public static final String MOD_ID = "mynewmod";

    public static final ItemGroup MAIN_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "main_group"), () -> new ItemStack(ModItems.FABRIC_ITEM));

    private static ConfiguredFeature<?, ?> ORE_FABRIC_BLOCK = Feature.ORE
    .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.FABRIC_BLOCK.getDefaultState(), 10))
    .range(new RangeDecoratorConfig(
        UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(255))))
    .spreadHorizontally()
    .repeat(50);

    private static ConfiguredFeature<?, ?> ORE_FABRIC_NETHER = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_NETHER, ModBlocks.FABRIC_BLOCK.getDefaultState(), 10))
        .range(new RangeDecoratorConfig(
            UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(255))))
        .spreadHorizontally()
        .repeat(70);
    
        private static ConfiguredFeature<?, ?> ORE_FABRIC_END = Feature.ORE
        .configure(new OreFeatureConfig(
            new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.FABRIC_BLOCK.getDefaultState(), 10))
        .range(new RangeDecoratorConfig(
            UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(255))))
        .spreadHorizontally()
        .repeat(80);


    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        FuelRegister.register();
        ToolRegister.register();
        RegistryKey<ConfiguredFeature<?, ?>> oreFabricOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(MOD_ID, "ore_fabric_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreFabricOverworld.getValue(),
         ORE_FABRIC_BLOCK);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreFabricOverworld);


        RegistryKey<ConfiguredFeature<?, ?>> oreFabricNether = RegistryKey.of(Registry
        .CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_fabric_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreFabricNether.getValue(),
         ORE_FABRIC_NETHER);
         BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreFabricNether);

         RegistryKey<ConfiguredFeature<?, ?>> oreFabricEnd = RegistryKey.of(Registry
         .CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "ore_fabric_end"));
         Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreFabricEnd.getValue(),
          ORE_FABRIC_END);
          BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreFabricEnd);
 
        
    }
    
}
