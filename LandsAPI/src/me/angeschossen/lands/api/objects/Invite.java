package me.angeschossen.lands.api.objects;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface Invite {

    /**
     * Get UUID of sender
     *
     * @return UUID of sender
     */
    UUID getSenderUUID();

    /**
     * Get UUID of receiver
     *
     * @return UUID of receiver
     */
    UUID getReceiverUID();

    /**
     * Get sent date
     *
     * @return Date
     */
    Date getDate();

    /**
     * Accept invite
     * @return in how many chunks failed
     * -1 means the whole land failed
     */
    CompletableFuture<Boolean> accept();

    /**
     * Deny invite
     */
    void deny();

    /**
     * Get land
     * @return Land
     */

    Land getLand();
}
