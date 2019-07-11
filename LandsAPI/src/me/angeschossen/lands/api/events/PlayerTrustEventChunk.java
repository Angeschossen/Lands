package me.angeschossen.lands.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class PlayerTrustEventChunk extends Event implements Cancellable {

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private final UUID targetUID;
    private final int x, z;

    public PlayerTrustEventChunk(int x, int z, UUID targetUUID) {
        this.x = x;
        this.z = z;
        this.targetUID = targetUUID;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
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
