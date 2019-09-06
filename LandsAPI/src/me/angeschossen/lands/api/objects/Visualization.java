package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;

public interface Visualization {

    /**
     * Show the visualization for the player.
     */
    void show();

    /**
     * Re-calculate the visualization.
     */
    void calculate();

    /**
     * Check if visualization has more time until it stops.
     *
     * @return Will return false if the visualization is about to stop.
     */
    @NotNull
    boolean hasNext();

    /**
     * Stop the visualization.
     */
    void stop();
}
