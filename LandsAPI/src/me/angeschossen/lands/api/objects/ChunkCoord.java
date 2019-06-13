package me.angeschossen.lands.api.objects;

public class ChunkCoord {

    public final int x;
    public final int z;

    public ChunkCoord(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int getBlockX() {
        return x << 4;
    }

    public int getBlockZ() {
        return z << 4;
    }
}
