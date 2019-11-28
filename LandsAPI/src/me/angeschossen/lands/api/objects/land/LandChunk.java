package me.angeschossen.lands.api.objects.land;

import me.angeschossen.lands.api.enums.LandSetting;
import me.angeschossen.lands.api.enums.role.RoleSetting;
import me.angeschossen.lands.api.objects.player.LandPlayer;
import me.angeschossen.lands.api.objects.role.Role;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.UUID;

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
    boolean hasLandSetting(LandSetting landsSetting);

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
    int getX();

    /**
     * Get Z identifier
     *
     * @return Z
     */
    int getZ();

    Collection<UUID> getRoleMembers(int roleId);

    Role getRole(UUID playerUUID);

    /**
     * Set tex value of LandChunk
     *
     * @param rent Tax value
     */
    void setTax(double rent);

    /**
     * Check if player can action.
     *
     * @param player      Player
     * @param action      Action
     * @param sendMessage Send no access message?
     * @return Will return false if place has no access.
     */
    boolean canAction(@NotNull Player player, @NotNull RoleSetting action, boolean sendMessage);

    /**
     * Check if landChunk is loaded
     *
     * @return Is claim loaded?
     */
    boolean isLoaded();

    /**
     * Trust a player
     *
     * @param landPlayer Player wich you want to set
     * @return Will return false, if fails because of max members permission (lands.members.NUMBER).
     */
    boolean trustPlayer(@NotNull LandPlayer landPlayer);

    /**
     * Get the land area
     *
     * @return Area
     */
    @NotNull
    LandArea getArea();

    /**
     * Set role of trusted player
     *
     * @param playerUID UUID of player
     * @param role      Role
     */
    void setRole(UUID playerUID, Role role);

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
    boolean isTrusted(@NotNull UUID playerUUID);

    /**
     * Check if player can do an action
     *
     * @param playerUUID UUID of player
     * @param action     Action
     * @return true, if he can do so
     */
    boolean canAction(@NotNull UUID playerUUID, @NotNull RoleSetting action);

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
    double addTax(double value);
}
