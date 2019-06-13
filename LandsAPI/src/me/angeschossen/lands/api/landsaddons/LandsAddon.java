package me.angeschossen.lands.api.landsaddons;


import me.angeschossen.lands.api.objects.Land;
import me.angeschossen.lands.api.objects.LandChunk;
import me.angeschossen.lands.api.objects.LandPlayer;
import me.angeschossen.lands.api.objects.LandWorld;
import org.bukkit.Chunk;
import org.bukkit.plugin.Plugin;

import java.util.concurrent.CompletableFuture;


public class LandsAddon implements LandsAddons {

    public LandsAddon(Plugin plugin, boolean isPublic) {

    }

    @Override
    public LandPlayer getLandPlayer(String UUID) {
        return null;
    }

    @Override
    public CompletableFuture<LandPlayer> getLandPlayerFromStorage(String UUID) {
        return null;
    }

    @Override
    public LandChunk getLandChunk(Chunk chunk) {
        return null;
    }

    @Override
    public CompletableFuture<LandChunk> getLandChunkFromStorage(String worldName, int chunkX, int chunkZ) {
        return null;
    }

    @Override
    public Land getLand(String worldName, String landName) {
        return null;
    }

    @Override
    public LandWorld getLandWorld(String worldName) {
        return null;
    }

    @Override
    public Plugin getPlugin() {
        return null;
    }

    @Override
    public void disable(String hookKey) {

    }

    @Override
    public String initialize() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean getAccess(String hookKey) {
        return false;
    }

    @Override
    public boolean isPublic() {
        return false;
    }
}
