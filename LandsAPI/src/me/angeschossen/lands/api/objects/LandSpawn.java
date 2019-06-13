package me.angeschossen.lands.api.objects;

import org.bukkit.Location;

public interface LandSpawn {
    /**
     * Set spawn location
     *
     * @param location Location of land spawn
     */
    void setLocation(Location location);

    /**
     * Set public
     *
     * @param isPublic Set accessible for non land members?
     */
    void setPublic(boolean isPublic);

    /**
     * Is public?
     *
     * @return boolean
     */
    boolean isPublic();

    /**
     * Get land spawn location
     *
     * @return Location of land spawn
     */
    Location getLocation();

    /**
     * Get name of land
     *
     * @return Name of land
     */
    String getLandName();

    /**
     * Serializes data to string
     *
     * @return Data string
     */

    @Override
    String toString();
}
