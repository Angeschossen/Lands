package me.angeschossen.lands.api.objects;

import org.bukkit.Particle;

public interface Visualization {

    /**
     * Removes visualization and forces
     * visualization task to stop it
     */
    void remove();


    /**
     * Set the particle wich should be showed
     *
     * @param particle Particle
     */
    void setParticle(Particle particle);

    /**
     * Show the visualization
     */
    void show();

    /**
     * Check if visualization is still valid
     *
     * @return true if duration is still valid
     */
    boolean isValid();
}
