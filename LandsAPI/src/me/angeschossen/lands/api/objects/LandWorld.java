package me.angeschossen.lands.api.objects;

import org.bukkit.World;

import java.util.Collection;
import java.util.HashMap;

public interface LandWorld {

    /**
     * Enable a setting.
     *
     * @param iD ID of setting
     */
    void enableSetting(String iD);

    /**
     * Disable a setting
     *
     * @param iD ID of setting
     */
    void disableSetting(String iD);

    /**
     * Get status of setting.
     *
     * @param iD ID of setting
     * @return Status of setting
     */
    boolean getSetting(String iD);

    /**
     * Get name of world.
     *
     * @return Name of world
     */
    String getName();

    /**
     * Get world object
     *
     * @return World
     */
    World getWorld();

    /**
     * Get an land
     *
     * @param landName Name of land
     * @return Land or null, if not cached
     */
    Land getLand(String landName);

    /**
     * Get cached lands
     *
     * @return Collection of cached lands
     */
    Collection<Land> getLoadedLands();

    /**
     * Load an land
     *
     * @param land Land to land
     */
    void loadLand(Land land);

    /**
     * Unload a land.
     *
     * @param landName Name of land
     */
    void unloadLand(String landName);

    /**
     * Get cached landChunk
     *
     * @param chunkX X identifier
     * @param chunkZ Z identifier
     * @return LandChunk or null, if not cached
     */
    LandChunk getLandChunk(int chunkX, int chunkZ);

    /**
     * Unload landChunk
     *
     * @param chunkX X identifier
     * @param chunkZ Z identifier
     */
    void unloadLandChunk(int chunkX, int chunkZ);

    /**
     * Load an landChunk
     *
     * @param landChunk LandChunk
     */
    void loadLandChunk(me.angeschossen.lands.api.objects.LandChunk landChunk);

    /**
     * Get all cached landChunks.
     *
     * @return Collection of cached landChunks
     */
    Collection<LandChunk> getLoadedLandChunks();

    /**
     * Get top lands with place.
     *
     * @return Top lands with place
     */
    HashMap<Integer, Land> getTopLands();
}
