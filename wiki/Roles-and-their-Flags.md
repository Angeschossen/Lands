Lands has a feature packed role system which allows each land to adjust flags for each role and create new roles for your land.
You as a administrator can edit/add default roles. Wilderness flags can be edited in the `/lands admin wilderness` menu.


***
Whenever a new flag is added to Lands, all existing Lands will apply the flag, if specified by the flag author.              
But for future land creations you need to configure it correctly here. Lands will always send you a popup in console and on  
admin ingame accounts, if there is a new flag available.

**Reset flag(s) to their defined state from roles.yml:**
>/Lands admin land <land | *> resetFlag <flag | all>


## Hide / show flags from the flags menu
```
  # Which flags should be displayed in the role settings menu?
  # You can still set default values below and hide them by removing them from this list.
  display:
    - BLOCK_PLACE
    - BLOCK_BREAK
    - BLOCK_IGNITE
    - INTERACT_GENERAL
    - INTERACT_CONTAINER
    - INTERACT_DOOR
    - INTERACT_MECHANISM
    - INTERACT_VILLAGER
    - ATTACK_PLAYER
    - ATTACK_ANIMAL
    - ATTACK_MONSTER
    - FLY
    - SPAWN_TELEPORT
    - ENDER_PEARL
    - LAND_ENTER
    - VEHICLE_USE
    - ITEM_PICKUP
    - LAND_CLAIM
    - LAND_CLAIM_BORDER
    - SPAWN_SET
    - BALANCE_WITHDRAW
    - AREA_ASSIGN
    - WAR_MANAGE
    - PLAYER_TRUST
    - PLAYER_SETROLE
    - PLAYER_UNTRUST
    - PLAYER_BAN
    - SETTING_EDIT_LAND
    - SETTING_EDIT_ROLE
    - SETTING_EDIT_TAXES
    - SETTING_EDIT_VARIOUS
```

## Edit / add default Roles
> You can find the configuration options in your roles.yml located in /plugins/Lands.
> In this file you can edit existing default roles or add your own default roles. These roles will apply to new land creations.

Example Configuration of a custom default role:
>
    yourCustomDefaultRole:
      name: '&eCustomDefaultRole'
      # The icon supports texture values (example: https://minecraft-heads.com/) and normal material values.
      icon: 'eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFhZGZkZjA3MTE3NWFkYWQ2NDRmZTRiM2E5NzMxYWM2YThmYTQ3NTExNjJlODEzOGM4OTlmYmFhNWZmMGI5In19fQ=='
      # Default flag values. Please note that these only apply to new land creations. Players will be able to change them later in their land menu if the flag is listed under 'display' above.
      default:
        - BLOCK_PLACE
        - BLOCK_BREAK
        - INTERACT_GENERAL
        - INTERACT_DOOR
        - INTERACT_CONTAINER
        - INTERACT_MECHANISM
        - INTERACT_VILLAGER
        - BLOCK_IGNITE
        - ATTACK_PLAYER
        - ATTACK_ANIMAL
        - FLY
        - LAND_ENTER
        - SPAWN_TELEPORT
        - VEHICLE_USE
        - ITEM_PICKUP


## Action Flags
> Actions flags represent players actions.

* **BLOCK_PLACE**\
  Place blocks

* **BLOCK_BREAK**\
  Break blocks

* **INTERACT_GENERAL**\
  All types of interaction that are not covered by the other INTERACT_ flags.

* **INTERACT_CONTAINER**\
  Open containers, like chests

* **INTERACT_DOOR**\
  Open doors

* **INTERACT_TRAPDOOR**\
  Open trapdoors

* **INTERACT_MECHANISM**\
  Use redstone, levers, pressure plates etc.

* **INTERACT_VILLAGER**\
  Interact and trade with villagers

* **BLOCK_IGNITE**\
  Ignite blocks / set blocks on fire

* **ATTACK_PLAYER**\
  Attack players\
  If disabled: _The role won't be able to attack anyone._
  If enabled: _The role will be able to attack other players that are also allowed to attack this role in the given claim._
  Note: _This flag may not always take effect, if combat-tag is enabled in the config._

* **ATTACK_ANIMAL**\
  Attack animals

* **FLY**\
  Allow the role to fly within a area. Fly will be disabled if the player is not allowed to fly at a given location. If they enter a area where they're allowed to fly, Lands will automatically re-enable their fly (if fly was active before).\
  This is compatible with every fly plugin.

* **LAND_ENTER**\
  Enter area

* **SPAWN_TELEPORT**\
  Teleport to the land spawn.

* **VEHICLE_USAGE**\
  Use or place vehicles in the area.

* **ITEM_PICKUP**\
  Pickup dropped items

* **ENDER_PEARL**\
  Use ender pearls

* **ATTACK_MONSTER**\
  Attack monsters\
  If disabled: Monsters also won't be able to damage the players of the role.

* **TRAMPLE_FARMLAND**\
  Allow players to trample farmland.

* **NO_DAMAGE**\
  Players won't get any damage from any damage cause.

## Management Flags
> Management flags will allow players to edit flags and options for the land.

* **PLAYER_TRUST**\
  Trust other players

* **PLAYER_SETROLE**\
  Set roles for trusted players (promote and demote).\
  They can only edit players which have a lower role (priority) than their own.

* **PLAYER_UNTRUST**\
  Untrust players\
  They can only untrust players which have a lower role (priority) than their own.

* **PLAYER_BAN**\
  Ban players\
  They can only ban players which have a lower role (priority) than their own.

* **SETTING_EDIT_LAND**\
  Edit natural land settings (like mob spawning etc.)\

* **SETTING_EDIT_ROLE**\
  Edit roles settings of roles which have a lower priority than their own role.

* **SETTING_EDIT_TAXES**\
  Edit taxes\
  Note: _It is recommended to give this permission only to trustworthy players in your land_

* **SETTING_EDIT_VARIOUS**\
  Allow setting a new name for the land or changing the title.

* **LAND_CLAIM**\
  Claim chunks for the land

* **AREA_ASSIGN**\
  Create sub areas and assign a selection to a sub area (/Lands selection assign <area>).

* **LAND_CLAIM_BORDER**\
  The players will be able to claim directly near your land, ignoring the chunk distance from config.

* **SPAWN_SET**\
  Allow the players of the role to change the spawn.

* **BALANCE_WITHDRAW**\
  Withdraw balance from the land bank (/Lands withdraw).

* **WAR_MANAGE**\
  Declare war with your land or surrender in the war of the land.