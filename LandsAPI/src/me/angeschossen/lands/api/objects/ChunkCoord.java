package me.angeschossen.lands.api.objects;

public class ChunkCoord {

    public final int x;
    public final int z;
    private final int hashcode;

    public ChunkCoord(int x, int z) {
        this.x = x;
        this.z = z;

        hashcode = x * z;
    }

    public int getBlockX() {
        return x << 4;
    }

    public int getBlockZ() {
        return z << 4;
    }


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ChunkCoord)) return false;
        ChunkCoord c = (ChunkCoord) object;

        return c.x == x && c.z == z;
    }

    @Override
    public int hashCode() {
        return hashcode;
    }
}
