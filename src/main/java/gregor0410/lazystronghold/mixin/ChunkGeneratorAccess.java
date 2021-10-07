package gregor0410.lazystronghold.mixin;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(ChunkGenerator.class)
public interface ChunkGeneratorAccess {
    @Accessor
    long getWorldSeed();
    @Accessor
    List<ChunkPos> getStrongholds();
    @Accessor
    BiomeSource getPopulationSource();
}
