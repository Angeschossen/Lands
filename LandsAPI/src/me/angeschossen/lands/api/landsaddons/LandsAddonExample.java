package me.angeschossen.lands.api.landsaddons;

import org.bukkit.plugin.Plugin;

/*
This class is just a example. It's not part of the API.
 */

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
