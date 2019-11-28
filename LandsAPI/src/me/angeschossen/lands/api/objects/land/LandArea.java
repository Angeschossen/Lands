package me.angeschossen.lands.api.objects.land;

import me.angeschossen.lands.api.enums.LandSetting;
import me.angeschossen.lands.api.enums.role.ManagementSetting;
import me.angeschossen.lands.api.enums.role.RoleSetting;
import me.angeschossen.lands.api.objects.player.Invite;
import me.angeschossen.lands.api.objects.player.LandPlayer;
import me.angeschossen.lands.api.objects.role.Role;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface LandArea {
    String getName();

    boolean setName(@NotNull String name);

    Land getLand();

    boolean hasLandSetting(LandSetting landSetting);

    boolean toggleLandSetting(LandSetting landSetting);

    Role getRole(int iD);

    List<UUID> getRoleMembers(int roleId);

    Role getNextPriorityRole(Role role, boolean higher);

    @NotNull
    Role getRole(UUID playerUID);

    boolean isTrusted(UUID playerUID);

    boolean trustPlayer(LandPlayer landPlayer, boolean ignoreMaxMembers);

    void setRole(UUID playerUID, Role role);

    void untrustPlayer(UUID playerUID);

    Collection<UUID> getTrustedPlayers();

    boolean canSetting(UUID playerUUID, RoleSetting roleSetting);

    boolean canManagement(UUID playerUUID, ManagementSetting managementSetting);

    boolean canSetting(Player player, RoleSetting action, boolean sendMessage);

    boolean canManagement(Player player, ManagementSetting managementSetting, boolean sendMessage);

    @NotNull
    Collection<Invite> getInvites();

    void setTax(double rent);

    double addTax(double tax);

    double getTax();
}
