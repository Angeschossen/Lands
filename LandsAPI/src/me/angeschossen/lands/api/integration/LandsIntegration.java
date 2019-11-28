package me.angeschossen.lands.api.integration;


import me.angeschossen.lands.api.land.Land;
import me.angeschossen.lands.api.land.LandChunk;
import me.angeschossen.lands.api.land.LandWorld;
import me.angeschossen.lands.api.player.LandPlayer;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;


public class LandsIntegration implements LandsIntegrator {

    public LandsIntegration(Plugin plugin, boolean isPublic) {

    }

    @Override
    public LandPlayer getLandPlayer(UUID playerUUID) {
        return null;
    }

    @Override
    public LandWorld getLandWorld(String worldName) {
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
    public Land getLand(String worldName, String name) {
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
