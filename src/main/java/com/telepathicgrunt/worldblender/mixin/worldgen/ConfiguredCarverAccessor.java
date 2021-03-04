package com.telepathicgrunt.worldblender.mixin.worldgen;

import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.carver.ICarverConfig;
import net.minecraft.world.gen.carver.WorldCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ConfiguredCarver.class)
public interface ConfiguredCarverAccessor{

    @Accessor("carver")
    <WC extends ICarverConfig>
    WorldCarver<WC> wb_getcarver();
}