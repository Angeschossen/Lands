package me.angeschossen.lands.api.landsaddons;



import me.angeschossen.lands.api.objects.Land;
import me.angeschossen.lands.api.objects.LandChunk;
import me.angeschossen.lands.api.objects.LandPlayer;
import me.angeschossen.lands.api.objects.LandWorld;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;


public class LandsAddon implements LandsAddons {


    public LandsAddon(Plugin plugin, boolean isPublic) {
    }

    @Override
    public LandPlayer getLandPlayer(UUID playerUUID) {
        return null;
    }

    @Override
    public boolean isClaimed(Location location) {
        return false;
    }

    @Override
    public CompletableFuture<Boolean> isClaimed(String worldName, int x, int z) {
        return null;
    }

    @Override
    public LandChunk getLandChunk(Location location) {
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
