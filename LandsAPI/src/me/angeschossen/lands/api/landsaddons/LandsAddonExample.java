package me.angeschossen.lands.api.landsaddons;

import me.angeschossen.lands.api.objects.LandChunk;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

/*
This class is just a example. It's not part of the API.
 */

public class LandsAddonExample {

    private final LandsAddon landsAddon;

    private LandsAddonExample(Plugin yourPlugin) {

        /*
        Initialize LandsAddon
        Set isPulic to false, if you want
        to prevent that other developers can
        access your addon.
         */
        landsAddon = new LandsAddon(yourPlugin, false);
    }

    //Just a test
    private void test(Location location) {
        final LandChunk landChunk = landsAddon.getLandChunk(location);
        //Do some stuff.
    }
}
