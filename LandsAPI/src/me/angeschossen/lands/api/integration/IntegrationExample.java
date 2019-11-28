package me.angeschossen.lands.api.integration;

import me.angeschossen.lands.api.land.LandChunk;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

/*
This class is just a example. It's not part of the API.
 */

public class IntegrationExample {

    private final LandsIntegration landsAddon;

    private IntegrationExample(Plugin yourPlugin) {

        /*
        Initialize LandsAddon
        Set isPulic to false, if you want
        to prevent that other developers can
        access your addon.
         */
        landsAddon = new LandsIntegration(yourPlugin, false);
    }

    //Just a test
    private void test(Location location) {
        final LandChunk landChunk = landsAddon.getLandChunk(location);
        //Do some stuff.
    }
}
