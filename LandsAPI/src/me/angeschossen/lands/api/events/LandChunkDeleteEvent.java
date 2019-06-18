package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.Land;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LandChunkDeleteEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private final int x, z;
    private final String world;
    private final Land land;

    public LandChunkDeleteEvent(String world, Land land, int x, int z) {
        this.world = world; this.x = x; this.z = z;
        this.land = land;
    }

    public Land getLand(){
        return land;
    }
    public int getX(){
        return x;
    }

    public int getZ(){
        return z;
    }

    public String getWorldName(){
        return world;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}

