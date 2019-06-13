package me.angeschossen.lands.api.landsaddons;

import me.angeschossen.lands.api.enums.LandRole;
import me.angeschossen.lands.api.enums.LandsAction;
import me.angeschossen.lands.api.objects.LandChunk;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class LandsAddonExample {

    private final LandsAddon landsAddon;
    private final String key;

    private LandsAddonExample(Plugin yourPlugin) {

        /*
        Initialize LandsAddon
        Set isPulic to false, if you want
        to prevent that other developers can
        access your addon.
         */
        landsAddon = new LandsAddon(yourPlugin, false);

        /*
        Initialize the addon.
        You need to key to disable your landsAddon, if you ever want to.
         */
        key = landsAddon.initialize();
    }


    /**
     * Check if an chunk is claimed.
     *
     * @param chunk Chunk
     * @return true, if claimed
     */
    public boolean isClaimed(Chunk chunk) {
        return landsAddon.getLandChunk(chunk) != null || landsAddon.getLandChunkFromStorage(chunk.getWorld().getName(), chunk.getX(), chunk.getZ()) != null;
    }

    /**
     * Check if two players can fight each other.
     *
     * @param chunk    Chunk they're in.
     * @param attacker The attacker
     * @param target   The target
     * @return true, if can pvp
     */
    public boolean canPvP(Chunk chunk, Player attacker, Player target) {

        /*
        In most cases the chunk should be loaded, if you
        want to check something like this.
        So we use the other method.
         */
        LandChunk landChunk = landsAddon.getLandChunk(chunk);
        if (landChunk == null) return true;

        return landChunk.canAction(attacker.getUniqueId().toString(), LandsAction.ATTACK_PLAYER) && landChunk.canAction(target.getUniqueId().toString(), LandsAction.ATTACK_PLAYER);

    }

    /**
     * Check if claim is safezone
     * With safezone we mean an claim where
     * visitors can't pvp.
     */
    public boolean isSafeZone(Chunk chunk) {
        LandChunk landChunk = landsAddon.getLandChunk(chunk);
        if (landChunk == null) return false;

        return !landChunk.getAction(LandRole.VISITOR, LandsAction.ATTACK_PLAYER);
    }

    /**
     * Disable your landsAddon.
     * For example, if plugin disables.
     */
    public void disableLandsAddon() {

        /*
        Disable landsAddon if you want.
        You need the received key.
         */
        landsAddon.disable(key);
    }
}
