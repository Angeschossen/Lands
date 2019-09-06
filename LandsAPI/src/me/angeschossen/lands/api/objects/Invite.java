package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;

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
    UUID getSenderUUID();

    /**
     * Get UUID of receiver
     *
     * @return UUID of receiver
     */
    @NotNull
    UUID getReceiverUID();

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
    CompletableFuture<Boolean> accept();

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
}
