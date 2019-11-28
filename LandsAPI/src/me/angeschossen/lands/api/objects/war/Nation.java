package me.angeschossen.lands.api.objects.war;

import me.angeschossen.lands.api.objects.land.Land;

public interface Nation {
    Land getLeader();

    boolean isInWar();

    boolean isInWarWith(Land land);

    boolean hasLand(Land land);
}
