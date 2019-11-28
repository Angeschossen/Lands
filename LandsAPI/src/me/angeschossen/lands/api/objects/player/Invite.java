package me.angeschossen.lands.api.objects.player;

import me.angeschossen.lands.api.objects.land.Land;
import me.angeschossen.lands.api.objects.land.LandArea;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface Invite {

    /**
     * Get UUID of sender
     *
     * @return UUID of sender
     */
    @NotNull
    UUID getSender();

    /**
     * Get UUID of receiver
     *
     * @return UUID of receiver
     */
    @NotNull
    UUID getReceiver();

    /**
     * Get sent date
     *
     * @return Date
     */
    @NotNull
    Date getDate();

    /**
     * Accept invite
     *
     * @return Will return false if invite fails because of max members permission (lands.members.NUMBER).
     */
    @NotNull
    CompletableFuture<Boolean> accept(Player player);

    /**
     * Deny invite
     */
    void deny();

    /**
     * Get land
     *
     * @return Land
     */
    @NotNull
    Land getLand();

    LandArea getArea();
}
