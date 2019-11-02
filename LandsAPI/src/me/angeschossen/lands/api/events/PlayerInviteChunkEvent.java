package me.angeschossen.lands.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class PlayerInviteChunkEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private UUID targetUUID;
    private final int x, z;

    public PlayerInviteChunkEvent(int x, int z, UUID targetUUID) {
        this.x = x;
        this.z = z;
        this.targetUUID = targetUUID;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public UUID getTargetUUID() {
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
