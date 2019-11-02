package me.angeschossen.lands.api.objects.war;

import me.angeschossen.lands.api.objects.Land;

public interface Nation {
    Land getLeader();

    boolean isInWar();

    boolean isInWarWith(Land land);

    boolean hasLand(Land land);
}
