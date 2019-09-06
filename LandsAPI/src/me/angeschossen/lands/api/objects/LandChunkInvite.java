package me.angeschossen.lands.api.objects;


import com.sun.istack.internal.NotNull;
import me.angeschossen.lands.datastore.objects.ChunkCoord;

import java.util.Set;

public interface LandChunkInvite extends Invite {

    /**
     * Check if invite contains chunk.
     *
     * @param worldName World
     * @param x         Chunk x
     * @param z         Chunk z
     * @return Will return false if it does not contain the chunk.
     */
    @NotNull
    boolean containsChunk(@NotNull String worldName, @NotNull int x, @NotNull int z);

    /**
     * Get target(s)
     *
     * @return Land or landChunk
     */
    @NotNull
    Set<ChunkCoord> getChunks();
}
