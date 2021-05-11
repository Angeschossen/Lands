You can configure these flags inside your config.yml file. Options: default_list, display_list

* **ENTITY_GRIEFING**\
Allow entities to grief blocks?

* **TNT_GRIEFING**\
Allow tnt to destroy blocks?

* **PISTON_GRIEFING**\
Allow pistons from a wilderness to push into the area?\
This should be set to false, since it protects against griefing from other players.

* **MONSTER_SPAWN**\
Should monsters spawn? This does not include spawners by default.\
To include spawners, you need to enable the include-spawners option.

* **ANIMAL_SPAWN**\
Should animals spawn? This does not include spawners.

* **WATERFLOW_ALLOW**\
Allow waterflow?
This should be set to false, since it protects against griefing from other players.

* **FIRE_SPREAD**\
Should fire spread? Fire can not spread from wilderness into lands, even without this flag being set.

* **LEAF_DECAY**\
Should leaves decay?

* **PLANT_GROWTH**\
Should plants (including trees) grow?

* **SNOW_MELT**\
Should snow and ice be able to melt?

    
## Default Land Flags configuration
Here you need to add new land flags.
```
  # Natural flags configuration. Role flags can be configured in the roles.yml file.
  # List of available landFlags: https://github.com/Angeschossen/Lands/wiki/Land-Flags
  land-flags:
    # Configure DEFAULT natural flags which will apply at land creation.
    default_list:
      - monster_spawn
      - animal_spawn
      - leaf_decay
      - plant_growth
      - snow_melt

    # Natural flags which should be visible in the flags menu.
    display_list:
      - entity_griefing
      - tnt_griefing
      - piston_griefing
      - monster_spawn
      - animal_spawn
      - waterflow_allow
      - fire_spread
      - leaf_decay
      - plant_growth
      - snow_melt
```