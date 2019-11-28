package me.angeschossen.lands.api.land;

import me.angeschossen.lands.api.land.enums.LandSetting;
import me.angeschossen.lands.api.role.enums.ManagementSetting;
import me.angeschossen.lands.api.role.enums.RoleSetting;
import me.angeschossen.lands.api.player.LandPlayer;
import me.angeschossen.lands.api.role.Role;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface LandArea {
    String getName();

    String getPlainName();

    boolean setName(@NotNull String name);

    Land getLand();

    boolean hasLandSetting(LandSetting landSetting);

    boolean toggleLandSetting(LandSetting landSetting);

    Role getRole(int iD);

    List<UUID> getRoleMembers(int roleId);

    Role getNextPriorityRole(Role role, boolean higher);

    @NotNull
    Role getRole(UUID playerUID);

    @Nullable
    Role getRole(String name);

    boolean isTrusted(UUID playerUID);

    boolean trustPlayer(LandPlayer landPlayer, boolean ignoreMaxMembers);

    void setRole(UUID playerUID, Role role);

    void untrustPlayer(LandPlayer landPlayer);

    Collection<UUID> getTrustedPlayers();

    boolean canSetting(UUID playerUUID, RoleSetting roleSetting);

    boolean canManagement(UUID playerUUID, ManagementSetting managementSetting);

    boolean canSetting(Player player, RoleSetting action, boolean sendMessage);

    boolean canManagement(Player player, ManagementSetting managementSetting, boolean sendMessage);

    void setTax(double rent);

    double addTax(double tax);

    double getTax();
}
