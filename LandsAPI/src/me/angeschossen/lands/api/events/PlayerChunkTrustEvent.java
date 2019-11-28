package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.land.ChunkCoordinate;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class PlayerChunkTrustEvent extends Event implements Cancellable {

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private final UUID targetUID;
    private final ChunkCoordinate chunkCoordinate;

    public PlayerChunkTrustEvent(UUID targetUUID, ChunkCoordinate chunkCoordinate) {
        this.chunkCoordinate = chunkCoordinate;
        this.targetUID = targetUUID;
    }

    public ChunkCoordinate getCoordinate(){
        return chunkCoordinate;
    }

    public UUID getTargetUID() {
        return targetUID;
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
