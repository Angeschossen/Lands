package me.angeschossen.lands.api.objects;

import me.angeschossen.lands.api.enums.LandRole;
import me.angeschossen.lands.api.enums.LandsAction;
import me.angeschossen.lands.api.enums.LandsSetting;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public interface LandChunk {

    /**
     * Get tex value
     *
     * @return Tax value
     */
    double getTax();

    /**
     * Get status of setting
     *
     * @param landsSetting LandsSetting
     * @return true if setting enabled
     */
    boolean getSetting(LandsSetting landsSetting);

    /**
     * Get UUID of owner of chunk
     *
     * @return UUID
     */
    UUID getOwnerUID();

    /**
     * Get land of LandChunk
     *
     * @return Land the landChunk is in
     */
    Land getLand();

    /**
     * Get X identifier
     *
     * @return X
     */
    int getX();

    /**
     * Get Z identifier
     *
     * @return Z
     */
    int getZ();

    /**
     * Get landRoles data
     * with UUID and landRole
     *
     * @return Roles
     */
    ConcurrentHashMap<UUID, LandRole> getLandChunkRoles();

    /**
     * Get all members of an role
     *
     * @param landRole The role wich are the members from
     * @return Collection of members wich have this role
     */
    Collection<UUID> getRoleMembers(LandRole landRole);

    /**
     * Get landRole of player
     *
     * @param playerUUID UUID of player
     * @return LandRole
     */
    LandRole getLandRole(UUID playerUUID);

    /**
     * Set tex value of LandChunk
     *
     * @param rent Tax value
     */
    void setTax(double rent);

    /**
     * Check if landChunk is loaded
     * @return
     */
    boolean isLoaded();

    /**
     * Enable an setting
     *
     * @param landsSetting LandsSetting
     */
    void enableSetting(LandsSetting landsSetting);

    /**
     * Enable an setting
     *
     * @param settingID ID of setting
     */
    void enableSetting(String settingID);

    /**
     * Disable an etting
     *
     * @param landsSetting LandsSetting
     */
    void disableSetting(LandsSetting landsSetting);

    /**
     * Toggle an setting
     *
     * @param landsSetting LandsSetting
     * @return Result
     */
    boolean toggleSetting(LandsSetting landsSetting);

    /**
     * Check if setting is enabled
     *
     * @param landsAction LandsAction
     * @param landRole    LandRole
     * @return Boolean
     */
    boolean getAction(LandRole landRole, LandsAction landsAction);

    /**
     * Enable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void enableAction(LandRole landRole, LandsAction landsAction);

    /**
     * Disable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void disableAction(LandRole landRole, LandsAction landsAction);

    /**
     * Toggle acces for an action for an speficied role
     *
     * @param landRole    Role
     * @param landsAction Action
     * @return true if enabled, false if disabled
     */
    boolean toggleAction(LandRole landRole, LandsAction landsAction);

    /**
     * Set an landChunk role
     *
     * @param landPlayer Player wich you want to set
     * @return
     */
    boolean trustPlayer(LandPlayer landPlayer);

    /**
     * Set role of trusted player
     * @param playerUUID UUID of player
     * @param landRole Role
     */
    void setRole(UUID playerUUID, LandRole landRole);

    /**
     * Untrust an player
     *
     * @param playerUUID UUID of player
     */
    void untrustPlayer(UUID playerUUID);

    /**
     * Check if player is trusted
     *
     * @param playerUUID UUID of player
     * @return true, if trusted
     */
    boolean isTrusted(UUID playerUUID);

    /**
     * Check if player can do an action
     *
     * @param playerUUID UUID of player
     * @param action     Action
     * @return true, if he can do so
     */
    boolean canAction(UUID playerUUID, LandsAction action);

    /**
     * Save landChunk to harddrive
     */
    void save();

    /**
     * Get all trusted players
     * @return
     */
    Collection<UUID> getTrustedPlayers();

    /**
     * Add tax
     * @param value Tax value
     * @return Result
     */
    int addTax(double value);
}
