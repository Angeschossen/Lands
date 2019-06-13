package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.LandChunk;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LandChunkDeleteEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private LandChunk landChunk;

    public LandChunkDeleteEvent(LandChunk landChunk) {
        this.landChunk = landChunk;
    }

    public LandChunk getLandChunk() {
        return landChunk;
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
