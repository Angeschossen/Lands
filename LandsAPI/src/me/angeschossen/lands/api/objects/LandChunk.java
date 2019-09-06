package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;
import me.angeschossen.lands.api.enums.LandRole;
import me.angeschossen.lands.api.enums.LandsAction;
import me.angeschossen.lands.api.enums.LandsSetting;

import java.util.Collection;
import java.util.UUID;

public interface LandChunk {

    /**
     * Get tex value
     *
     * @return Tax value
     */
    @NotNull
    double getTax();

    /**
     * Get status of setting
     *
     * @param landsSetting LandsSetting
     * @return true if setting enabled
     */
    @NotNull
    boolean getSetting(LandsSetting landsSetting);

    /**
     * Get UUID of owner of chunk
     *
     * @return UUID
     */
    @NotNull
    UUID getOwnerUID();

    /**
     * Get land of LandChunk
     *
     * @return Land the landChunk is in
     */
    @NotNull
    Land getLand();

    /**
     * Get X identifier
     *
     * @return X
     */
    @NotNull
    int getX();

    /**
     * Get Z identifier
     *
     * @return Z
     */
    @NotNull
    int getZ();

    /**
     * Get all members of a role
     *
     * @param landRole The role wich are the members from
     * @return Collection of members wich have this role
     */
    @NotNull
    Collection<UUID> getRoleMembers(@NotNull LandRole landRole);

    /**
     * Get landRole of player
     *
     * @param playerUUID UUID of player
     * @return LandRole
     */
    @NotNull
    LandRole getLandRole(@NotNull UUID playerUUID);

    /**
     * Set tex value of LandChunk
     *
     * @param rent Tax value
     */
    void setTax(@NotNull double rent);

    /**
     * Synchronize with land.
     *
     * @return Will return false if it fails. This can happen if the chunk does not belong to the land anymore.
     */
    @NotNull
    boolean update();

    /**
     * Check if landChunk is loaded
     *
     * @return Is claim loaded?
     */
    @NotNull
    boolean isLoaded();

    /**
     * Enable a setting
     *
     * @param landsSetting LandsSetting
     */
    void enableSetting(@NotNull LandsSetting landsSetting);

    /**
     * Disable a setting
     *
     * @param landsSetting LandsSetting
     */
    void disableSetting(@NotNull LandsSetting landsSetting);

    /**
     * Toggle a setting
     *
     * @param landsSetting LandsSetting
     * @return Result
     */
    @NotNull
    boolean toggleSetting(@NotNull LandsSetting landsSetting);

    /**
     * Check if setting enabled
     *
     * @param landsAction LandsAction
     * @param landRole    LandRole
     * @return Boolean
     */
    @NotNull
    boolean getAction(@NotNull LandRole landRole, @NotNull LandsAction landsAction);

    /**
     * Enable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void enableAction(@NotNull LandRole landRole, @NotNull LandsAction landsAction);

    /**
     * Disable an landsAction
     *
     * @param landsAction LandsAction
     * @param landRole    Role
     */
    void disableAction(@NotNull LandRole landRole, @NotNull LandsAction landsAction);

    /**
     * Toggle acces for an action for an speficied role
     *
     * @param landRole    Role
     * @param landsAction Action
     * @return true if enabled, false if disabled
     */
    @NotNull
    boolean toggleAction(@NotNull LandRole landRole, @NotNull LandsAction landsAction);

    /**
     * Set an landChunk role
     *
     * @param landPlayer Player wich you want to set
     * @return Will return false, if fails because of max members permission (lands.members.NUMBER).
     */
    @NotNull
    boolean trustPlayer(@NotNull LandPlayer landPlayer);

    /**
     * Set role of trusted player
     *
     * @param playerUUID UUID of player
     * @param landRole   Role
     */
    void setRole(@NotNull UUID playerUUID, @NotNull LandRole landRole);

    /**
     * Untrust an player
     *
     * @param playerUUID UUID of player
     */
    void untrustPlayer(@NotNull UUID playerUUID);

    /**
     * Check if player trusted
     *
     * @param playerUUID UUID of player
     * @return true, if trusted
     */
    @NotNull
    boolean isTrusted(@NotNull UUID playerUUID);

    /**
     * Check if player can do an action
     *
     * @param playerUUID UUID of player
     * @param action     Action
     * @return true, if he can do so
     */
    boolean canAction(@NotNull UUID playerUUID, @NotNull LandsAction action);

    /**
     * Get all trusted players
     *
     * @return Trusted players. Including the owner.
     */
    @NotNull
    Collection<UUID> getTrustedPlayers();

    /**
     * Add tax. Use negative number to
     * remove tax.
     *
     * @param value Tax value
     * @return Result
     */
    double addTax(@NotNull double value);
}
