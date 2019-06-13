package me.angeschossen.lands.api.objects;

import me.angeschossen.lands.api.enums.LandsAction;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface LandPlayer {
    /**
     * Get online player, if he's online
     *
     * @return Player
     */
    Player getPlayer();

    /**
     * Get invite of land
     *
     * @param landName Name of land
     * @return Invite
     */
    Invite getInvite(String landName);

    /**
     * Get UUID string of player
     *
     * @return UUID string
     */
    String getPlayerUUID();

    /**
     * Get land where the player is member in
     *
     * @param landName Name or displayname of land
     * @return Land or null, if not member
     */
    Land getLand(String landName);

    /**
     * Get collection of lands the player is in
     *
     * @return Collection of lands
     */
    Collection<Land> getLands();

    /**
     * Get collection of lands the player is in of world
     *
     * @param world Name of world
     * @return Collection of lands
     */
    Collection<Land> getLands(String world);


    /**
     * Get an land the player owns in an world
     *
     * @param worldName Name wof world
     * @return Land or null, if no match found
     */
    Land getOwningLand(String worldName);

    /**
     * Get an owning land
     *
     * @return Land or null, if player doesn't owns an land
     */
    Land getOwningLand();

    /**
     * Get collection of invites the player got
     *
     * @return Invites
     */
    Collection<Invite> getInvites();

    /**
     * Give players claimblocks points
     *
     * @param blocks
     */
    void addClaimBlocks(int blocks);

    /**
     * Remove an claimblock
     */
    void removeClaimBlock();

    /**
     * Get claimblock points the player has
     *
     * @return Claimblock points
     */
    int getClaimBlocks();

    /**
     * Add the player to an land
     *
     * @param land Land to add
     */
    void addLand(Land land);

    /**
     * Add an invite
     *
     * @param landName Name of land
     * @param invite   Invite to add
     */
    void addInvite(String landName, Invite invite);

    /**
     * Remove an land
     *
     * @param land Land to remove
     */
    void removeLand(Land land);

    /**
     * Get the land wich the player set
     * through /Lands edit or random one or null if
     * he has no lands
     *
     * @return Land or null, if no match found
     */
    Land getEditLand();

    /**
     * Get an land where the player can do an specific action
     *
     * @param landsAction Action
     * @return Land or null, if no match found
     */
    Land getAccessActionLand(LandsAction landsAction);

    /**
     * Get an land where the player can do an specific action in an specific world
     *
     * @param landsAction Action
     * @return Land or null, if no match found
     */
    Land getAccessActionLand(LandsAction landsAction, String worldName);

    /**
     * Remove an invite
     *
     * @param landName Name of land
     */
    void removeInvite(String landName);

    /**
     * Save landPlayer
     */
    void save();

    /**
     * Check if player has invite from land
     *
     * @param landName Name of land
     * @return
     */
    boolean hasInvite(String landName);

    /**
     * Check if player has owning land
     *
     * @return true, if has land
     */
    boolean hasOwningLand();

    /**
     * Get names of lands.
     *
     * @return Array
     */
    String[] getLandNames();

    /**
     * Check is player in land
     * @param landName Name of land
     * @return Boolean
     */
    boolean isInLand(String landName);
}
