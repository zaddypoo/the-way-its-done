package com.zaddy.twid.world;

import com.zaddy.twid.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class WorldGeneratorFlag implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        world.setBlock(chunkX*16, 30, chunkZ*16, ModBlocks.flag, 0, 2);
    }
}
