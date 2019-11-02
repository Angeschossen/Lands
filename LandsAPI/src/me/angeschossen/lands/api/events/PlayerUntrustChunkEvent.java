package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.LandChunk;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class PlayerUntrustChunkEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private UUID targetUUID;
    private LandChunk landChunk;

    public PlayerUntrustChunkEvent(LandChunk landChunk, UUID targetUUID) {
        this.landChunk = landChunk;
        this.targetUUID = targetUUID;
    }

    public LandChunk getLandChunk() {
        return landChunk;
    }

    public UUID getTargetUUID(){
        return targetUUID;
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
