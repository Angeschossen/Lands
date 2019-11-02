package me.angeschossen.lands.api.objects.war;

import com.sun.istack.internal.NotNull;
import me.angeschossen.lands.api.enums.LandsAction;
import me.angeschossen.lands.api.enums.war.WarSetting;
import me.angeschossen.lands.api.objects.Land;
import org.bukkit.entity.Player;

import java.util.Set;

public interface War {

    /**
     * Can the player do a action?
     * @param player Player
     * @param landsAction Role setting
     * @param sendMessage Send no access message?
     * @return true, if player can do this action.
     */
    boolean canAction(Player player, LandsAction landsAction, boolean sendMessage);

    /**
     * Toggle role action setting.
     * @param landsAction Role setting
     * @return New state
     */
    boolean toggleRoleAction(LandsAction landsAction);

    /**
     * Toggle a setting.
     * Please note that this are not role settings. For this use toggleRoleAction instead
     * @param warSetting The setting
     * @return New state
     */
    boolean toggleSetting(WarSetting warSetting);

    /**
     * Get the id of the war-
     * @return ID
     */
    int getID();

    /**
     * Get the land, which send the war declaration to the defender land.
     * @return The initial attacker land.
     */
    @NotNull
    Land getInitialAttacker();

    /**
     * Get enabled role actions.
     *
     * @return Enabled role actions.
     */
    @NotNull
    Set<LandsAction> getRoleActions();

    /**
     * Is the land participating in the war?
     *
     * @param land Land
     * @return true, if the land is participating.
     */
    @NotNull
    boolean isParticipating(@NotNull Land land);

    /**
     * Is the war ending soon.
     *
     * @return true, if war ends in the next two minutes.
     */
    @NotNull
    boolean isEndingSoon();

    /**
     * Are the attackers winning?
     *
     * @return true, if the attackers are winning
     * This will return false, if attackers and defenders have 0 points.
     */
    @NotNull
    boolean attackersWin();

    /**
     * Get the stats of the attackers.
     *
     * @return Attackers stats
     */
    @NotNull
    WarStats getAttackerStats();

    /**
     * Get the stats of the defenders.
     *
     * @return Defenders stats
     */
    @NotNull
    WarStats getDefenderStats();
}
