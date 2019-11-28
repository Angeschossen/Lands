package me.angeschossen.lands.api.objects.war;

import me.angeschossen.lands.api.enums.role.RoleSetting;
import me.angeschossen.lands.api.enums.war.WarSetting;
import me.angeschossen.lands.api.enums.war.WarTeam;
import me.angeschossen.lands.api.objects.land.Land;
import org.bukkit.entity.Player;

import java.util.Set;

public interface War {

    boolean canAction(Player player, RoleSetting landsAction, boolean sendMessage);

    boolean toggleRoleAction(RoleSetting landsAction);

    boolean toggleSetting(WarSetting warSetting);

    int getID();

    void start();

    Land getInitialAttacker();

    Set<RoleSetting> getRoleActions();

    boolean isParticipating(Land land);

    boolean isEndingSoon();

    boolean attackersWin();

    WarTeam getWinner();

    WarStats getAttackerStats();

    WarStats getDefenderStats();
}
