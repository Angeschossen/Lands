package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.ChunkCoordinate;
import me.angeschossen.lands.api.objects.LandPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerLeaveChunkEvent extends Event implements Cancellable {

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private LandPlayer landPlayer;
    private ChunkCoordinate chunkCoordinate;

    public PlayerLeaveChunkEvent(LandPlayer landPlayer, ChunkCoordinate chunkCoordinate) {
        this.landPlayer = landPlayer;this.chunkCoordinate = chunkCoordinate;
    }

    public ChunkCoordinate getChunkCoordinate(){
        return chunkCoordinate;
    }

    public LandPlayer getLandPlayer() {
        return landPlayer;
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
