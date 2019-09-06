package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;
import me.angeschossen.lands.api.enums.LandRole;

import java.util.UUID;

public interface TrustedPlayer {

    /**
     * Get max chunk claims
     *
     * @return Max chunk claims
     */
    @NotNull
    int getMaxClaims();

    /**
     * Get trusted chunks amount.
     * @return Trusted chunks amount.
     */
    @NotNull
    int getTrustedChunks();

    /**
     * Is the player trusted in the whole land?
     *
     * @return Is trusted in whole land
     */
    @NotNull
    boolean isTrustedWholeLand();

    /**
     * Get player UID
     */
    @NotNull
    UUID getUID();

    /**
     * Get landRole
     *
     * @return Role
     */
    @NotNull
    LandRole getRole();
}
