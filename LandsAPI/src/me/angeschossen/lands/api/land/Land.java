package me.angeschossen.lands.api.land;

import me.angeschossen.lands.api.land.enums.LandSetting;
import me.angeschossen.lands.api.player.Invite;
import me.angeschossen.lands.api.player.LandPlayer;
import me.angeschossen.lands.api.player.TrustedPlayer;
import me.angeschossen.lands.api.role.Role;
import me.angeschossen.lands.api.role.enums.ManagementSetting;
import me.angeschossen.lands.api.role.enums.RoleSetting;
import me.angeschossen.lands.api.war.Nation;
import me.angeschossen.lands.api.war.War;
import me.angeschossen.lands.api.war.WarDeclaration;
import me.angeschossen.lands.api.war.enums.WarTeam;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.UUID;

public interface Land {

    boolean hasArea(@NotNull String name);

    void setNation(Nation nation);

    Nation getNation();

    War getWar();

    void leaveWar();

    boolean isInWar();

    void joinWar(War war, WarTeam warTeam);

    WarTeam getWarTeam();

    void addWarShieldTime(long seconds);

    boolean hasUpcomingWar();

    boolean hasWarShield();

    @Nullable
    WarDeclaration getWarDeclaration();

    boolean hasWarDeclaration();

    /**
     * Get upkeep costs
     *
     * @return Upkeep costs
     */
    double getUpkeepCosts();

    /**
     * Get name of the land
     * This value never changes
     *
     * @return Name of land without color
     */
    @NotNull
    String getName();

    /**
     * Get id of land.
     *
     * @return ID
     */
    int getID();

    /**
     * Get land name with color.
     * @return Land name with color
     */
    @NotNull
    String getColoredName();

    /**
     * Get invite by receiver UUID
     *
     * @param receiverUUID UUID of receiver
     * @return Invite
     */
    @Nullable
    Invite getInvite(@NotNull UUID receiverUUID);

    /**
     * Get owner UUID of land
     *
     * @return UUID of owner
     */
    @NotNull
    UUID getOwnerUID();

    /**
     * Get spawn
     *
     * @return Spawn
     */
    @Nullable
    Location getSpawn();

    /**
     * Get name of world
     *
     * @return Name of world
     */
    @NotNull
    String getWorldName();

    /**
     * Get landWorld wich the land is in
     *
     * @return LandWorld
     */
    @NotNull
    LandWorld getLandWorld();

    /**
     * Get the size of an land
     *
     * @return Size of land
     */
    @NotNull
    int getSize();

    /**
     * Get tax value of land
     *
     * @return Tax value
     */
    @NotNull
    double getTax();

    /**
     * Set landRole for a player
     *
     * @param landPlayer LandPlayer wich you want to set
     * @return Will return false if fails because of max members permission.
     */
    boolean trustPlayer(LandPlayer landPlayer, boolean ignoreMaxMembers);

    /**
     * Get max members.
     *
     * @return Max members
     */
    @NotNull
    int getMaxMembers();

    /**
     * Get max chunk claims.
     *
     * @return Max chunk claims
     */
    @NotNull
    int getMaxChunks();

    /**
     * Get all trusted players
     *
     * @return Trusted players
     */
    @NotNull
    Collection<UUID> getTrustedPlayers();

    /**
     * Set role of trusted player.
     *
     * @param playerUUID UUID of player
     * @param role   Role
     */
    void setRole(@NotNull UUID playerUUID, @NotNull Role role);

    /**
     * Set the tax of the land
     *
     * @param tax Tax value
     */
    void setTax(double tax);

    /**
     * Check is land loaded
     *
     * @return Boolean
     */
    @NotNull
    boolean isLoaded();

    /**
     * Set title message.
     *
     * @param title Message
     */
    void setTitleMessage(@NotNull String title);

    /**
     * Get title mesasage.
     *
     * @return Title message.
     */
    @NotNull
    String getTitleMessage();

    /**
     * Set an new owner for land
     *
     * @param landPlayer LandPlayer for new owner
     */
    void setOwner(@NotNull LandPlayer landPlayer);

    /**
     * Untrust an player
     *
     * @param landPlayer LandPlayer wich should be untrusted
     */
    void untrustPlayer(@NotNull LandPlayer landPlayer);

    /**
     * Check if land has a chunk
     *
     * @param worldName Name of world
     * @param x         X of chunk
     * @param z         Z of chunk
     * @return true if has
     */
    boolean hasChunk(@NotNull String worldName, @NotNull int x, @NotNull int z);

    /**
     * Set name of land
     *
     * @param name New name
     */
    void setName(@NotNull String name);

    boolean hasLandSetting(LandSetting landSetting);

    /**
     * Check if player is trusted in whole land.
     *
     * @param playerUUID UUID of player
     * @return true if is
     */
    @NotNull
    boolean isTrusted(@NotNull UUID playerUUID);

    /**
     * Get a collection of all online land members
     *
     * @return Collection of online players
     */
    @NotNull
    Collection<Player> getOnlinePlayers();

    Role getRole(UUID playerUID);

    /**
     * Check if player can action
     *
     * @param playerUUID UUID of player
     * @param action     Action
     * @return Result
     */
    boolean canSetting(@NotNull UUID playerUUID, @NotNull RoleSetting action);

    boolean canManagement(UUID playerUUID, ManagementSetting managementSetting);

    /**
     * Check if player can action with checking bypass permission
     * This will send a message to the player if he can't access the action and has no required bypass permission.
     * @param player Player
     * @param action Action
     * @param sendMessage Send message?
     * @return Will return false if player has no access and has no bypass permission
     */
    boolean canSetting(@NotNull Player player, @NotNull RoleSetting action, @NotNull boolean sendMessage);

    boolean canManagement(Player player, ManagementSetting managementSetting, boolean sendMessage);

    /**
     * Get last claimed chunk.
     *
     * @return Coordinate
     */
    @Nullable
    ChunkCoordinate getLastClaimed();

    /**
     * Get trusted player.
     *
     * @param playerUUID UID of player.
     * @return Trusted player
     */
    @Nullable
    TrustedPlayer getTrustedPlayer(@NotNull UUID playerUUID);

    /**
     * Does land exist?
     *
     * @return boolean
     */
    boolean exists();

    /**
     * Add tax value. Use negative numbers
     * to remove tax.
     *
     * @param value Tax value
     * @return Result
     */
    double addTax(double value);


    /**
     * Set spawn location of land
     *
     * @param location Location of spawn
     */
    void setSpawn(@Nullable Location location);


    /**
     * Get land balance
     *
     * @return Balance
     */
    @NotNull
    double getBalance();

    /**
     * Set land bank balance
     *
     * @param balance Value
     */
    void setBalance(double balance);

    /**
     * Add money to land bank. Use negative numbers
     * to remove money.
     *
     * @param value Value
     * @return
     */
    double addBalance(double value);

    Role getRole(int iD);
}
