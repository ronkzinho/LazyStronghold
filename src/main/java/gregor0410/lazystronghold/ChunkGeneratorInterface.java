package gregor0410.lazystronghold;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.source.BiomeSource;

import java.util.List;

public interface ChunkGeneratorInterface {
    StrongholdGen getCustomStrongholdGen();
    List<ChunkPos> getStrongholds();
    BiomeSource getCustomPopulationSource();
}
