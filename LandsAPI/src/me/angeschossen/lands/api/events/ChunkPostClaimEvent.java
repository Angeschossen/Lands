package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.objects.LandChunk;
import me.angeschossen.lands.api.objects.LandPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChunkPostClaimEvent extends Event {

    public static HandlerList handlerList = new HandlerList();

    private LandPlayer landPlayer;
    private LandChunk landChunk;

    public ChunkPostClaimEvent(LandPlayer landPlayer, LandChunk landChunk) {
        this.landPlayer = landPlayer;

        this.landChunk = landChunk;
    }

    public LandChunk getLandChunk() {
        return landChunk;
    }

    public LandPlayer getLandPlayer() {
        return landPlayer;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
