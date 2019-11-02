package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;
import me.angeschossen.lands.api.enums.LandsAction;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public interface LandWorld {

    boolean canActionWithResponse(Player player, Location location, LandsAction landsAction);

    boolean canPvP(Player attacker, Player target, Location location);

    /**
     * Check if player can action. This also contains the setting disallow-wilderness.
     *
     * @param player      Player
     * @param location    Location
     * @param landsAction Action
     * @return Will return false if he can't do this.
     */
    boolean canAction(Player player, Location location, LandsAction landsAction);

    /**
     * Get name of world.
     *
     * @return Name of world
     */
    @NotNull
    String getName();

    /**
     * Get world
     *
     * @return World
     */
    @NotNull
    World getWorld();

    /**
     * Get land
     *
     * @param landName Name of land
     * @return Will return null if this land does not exist.
     */
    @Nullable
    Land getLand(@NotNull String landName);

    /**
     * Get land by iD
     *
     * @param iD ID of land.
     * @return Will return null if this land does not exist.
     */
    @Nullable
    Land getLand(@NotNull int iD);

    /**
     * Get loaded landChunk
     *
     * @param chunkX X identifier
     * @param chunkZ Z identifier
     * @return LandChunk or null, if not cached
     */
    @Nullable
    LandChunk getLandChunk(@NotNull int chunkX, @NotNull int chunkZ);

    /**
     * Is landChunk loaded?
     *
     * @param x X identifier
     * @param z Z identifier
     * @return Loaded
     */
    @NotNull
    boolean isChunkLoaded(@NotNull int x, @NotNull int z);
}
