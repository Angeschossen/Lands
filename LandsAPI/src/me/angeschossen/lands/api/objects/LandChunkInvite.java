package me.angeschossen.lands.api.objects;



public interface LandChunkInvite extends Invite {

    /**
     * Get target
     *
     * @return Land or landChunk
     */
    ChunkCoord getChunkCoord();
}
