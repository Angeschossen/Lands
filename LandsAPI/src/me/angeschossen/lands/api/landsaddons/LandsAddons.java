package me.angeschossen.lands.api.landsaddons;

import me.angeschossen.lands.api.objects.Land;
import me.angeschossen.lands.api.objects.LandChunk;
import me.angeschossen.lands.api.objects.LandPlayer;
import me.angeschossen.lands.api.objects.LandWorld;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;


public interface LandsAddons {


    /**
     * Get cached landPlayer
     *
     * @param playerUUID UUID of player
     * @return LandPlayer or null, if not cached
     * @since 2.5.7
     */
    LandPlayer getLandPlayer(UUID playerUUID);

    /**
     * Is claimed land?
     * @param location Location
     * @return Is claimed
     */
    boolean isClaimed(Location location);

    /**
     * Is claimed land?
     * @param worldName Name of world
     * @param x Chunk x
     * @param z Chunk z
     * @return Is claimed
     */
    CompletableFuture<Boolean> isClaimed(String worldName, int x, int z);

    /**
     * Get cached landChunk
     *
     * @param location Location
     * @return LandChunk or null, if not cached
     * @since 2.5.7
     */
    LandChunk getLandChunk(Location location);

    /**
     * Get land.
     *
     * @param worldName Name of world, where land is located
     * @param landName  Name or displayname of land
     * @return Land or null, if not exists.
     * @since 2.5.7
     */
    Land getLand(String worldName, String landName);

    /**
     * Get landWorld.
     *
     * @param worldName Name of world.
     * @return LandWorld or null, if it's not an landWorld.
     */
    LandWorld getLandWorld(String worldName);

    /**
     * Get's plugin wich hooks Lands.
     *
     * @return Plugin
     */
    Plugin getPlugin();

    /**
     * Disables the APIHook
     */
    void disable(String hookKey);

    /**
     * Initialize hook
     *
     * @return Hook key, wich you should store
     * somewhere
     */
    String initialize();

    /**
     * Check if hook is enabled.
     *
     * @return Status
     */
    boolean isEnabled();

    /**
     * Checks if you can access the hook
     * with your key.
     *
     * @param hookKey Key of hook
     * @return Access status
     */
    boolean getAccess(String hookKey);

    /**
     * If public is true, other developers can access
     * your LandsAPIHook.
     *
     * @return
     */
    boolean isPublic();
}
