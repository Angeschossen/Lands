## Numbered Permissions
**Replace NUMBER with a number.**

`lands.lands.NUMBER`\
Description: In how many lands can the player be a member?\
**NOTE:** This does not include owned lands. If you want to set\
how many lands the player can own, just set the permission below (lands.ownlands.NUMBER).

`lands.ownlands.NUMBER`\
Description: How many lands can the player own?

`lands.chunks.NUMBER`\
Description: How many chunks should the player be\
able to claim? This is per land.

`lands.chunks.support.NUMBER`\
Description: How many chunks can the player contribute
to lands he's member of? 

`lands.members.NUMBER`\
Description: Set max members per land.

`lands.areas.NUMBER`\
Description: Set max "sub areas" per land.

`lands.roles.NUMBER`\
Description: Set max roles per land.

`lands.free.chunks.NUMBER`\
Description: Set free chunks amount.

`lands.free.lands.NUMBER`\
Description: Set free lands amount (/Lands create).

`lands.selection.NUMBER`\
Description: Max chunks amount for /Lands selection


## Command Permissions
Commands wiki page: https://github.com/Angeschossen/Lands/wiki/Commands

## Playtime Max Rewards
ONLY NEEDED, IF OPTION PLAYTIME REWARDS IS ENABLED.
```
      lands.chunks.max.NUMBER:
        description: The player wont be able to get any chunks rewarded if his current lands.chunks.NUMBER permission is equal or higher.
        default: op
      lands.ownlands.max.NUMBER:
        description: The player wont be able to get any land creations rewarded if his current lands.ownlands.NUMBER permission is equal or higher.
        default: op
      lands.lands.max.NUMBER:
        description: The player wont be able to get any land joins rewarded if his current lands.lands.NUMBER permission is equal or higher.
        default: op
      lands.members.max.NUMBER:
        description: The player wont be able to get any member limit rewarded if his current lands.members.NUMBER permission is equal or higher.
        default: op
      lands.chunks.support.max.NUMBER:
        description: The player wont be able to get any support chunks rewarded if his current lands.chunks.support.NUMBER permission is equal or higher.
        default: op
```

## Bypass Permissions
```
      lands.bypass.*:
        description: Bypass all protections and other restrictions
        children:
          lands.bypass.block_break:
            description: Bypass block break protection
            default: op
          lands.bypass.block_place:
            description: Bypass block place protection
            default: op
          lands.bypass.block_ignite:
            description: Bypass block ignite protection
            default: op
          lands.bypass.interact_general:
            description: Bypass interaction protection
            default: op
          lands.bypass.interact_mechanism:
            description: Bypass interaction protection
            default: op
          lands.bypass.interact_door:
            description: Bypass interaction protection
            default: op
          lands.bypass.interact_container:
            description: Bypass interaction protection
            default: op
          lands.bypass.interact_villager:
            description: Bypass villager protection
            default: op
          lands.bypass.attack_animal:
            description: Bypass animal attack protection
            default: op
          lands.bypass.attack_player:
            description: Bypass player attack protection
            default: op
          lands.bypass.member.untrust:
            description: Untrust players or remove invites in other lands
            default: op
          lands.bypass.fly:
            description: Bypass fly flag
            default: op
          lands.bypass.worldedit:
            description: Bypass WorldEdit restrictions in other players lands
            default: op
          lands.bypass.land_enter:
            description: Bypass land enter flag
            default: op
          lands.bypass.edit.*:
            description: Select lands you're not member of
            default: op
            children:
              lands.bypass.edit.settings:
                description: Edit settings of other lands
                default: op
          lands.bypass.selection:
            description: Bypass error message of other plugin cancelling selection
            default: op
          lands.bypass.teleport-delay:
            description: Bypass teleportation delays / warmups
            default: op
          lands.bypass.wilderness.*:
            description: Bypass all wilderness protections (for worlds in disallow-wilderness_list)
            default: op
            children:
              lands.bypass.wilderness.block_break:
                description: Bypass block break protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.block_place:
                description: Bypass block place protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.block_ignite:
                description: Bypass block ignite protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.interact_general:
                description: Bypass interaction protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.interact_mechanism:
                description: Bypass interaction protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.interact_door:
                description: Bypass interaction protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.interact_container:
                description: Bypass interaction protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.attack_animal:
                description: Bypass animal attack protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.attack_player:
                description: Bypass player attack protection for disallow-wilderness_list in config
                default: op
              lands.bypass.wilderness.worldedit:
                description: Bypass WorldEdit restrictions in wilderness.
                default: op
              lands.bypass.wilderness.teleport:
                description: Teleport to wilderness (unclaimed chunks) through /Lands teleport.
                default: op
              lands.bypass.wilderness.fly:
                description: Fly in wilderness
                default: op

          lands.bypass.cooldown.*:
            description: Bypass cooldowns
            default: op
            children:
              lands.bypass.cooldown.wild:
                description: Bypass /Lands wild cooldown
                default: op
              lands.bypass.cooldown.rename:
                description: Bypass /Lands rename cooldown
                default: op
              lands.bypass.cooldown.teleport:
                description: Bypass chunk teleport cooldown
                default: op
              lands.bypass.cooldown.spawn:
                description: Bypass /Lands spawn cooldown
                default: op
              lands.bypass.cooldown.unstuck:
                description: Bypass /Lands unstuck cooldown
                default: op

          lands.bypass.spawn.private:
            description: Teleport to private land spawns
            default: op
          lands.bypass.option.*:
            description: Bypass special config options.
            default: op
            children:
              lands.bypass.option.force-near:
                description: Bypass force-near option from config.
                default: op
              lands.bypass.option.chunk-distance:
                description: Bypass chunk-distance option from config.
                default: op

          lands.bypass.cmd.untrusted.*:
            description: Bypass blacklisted commands for untrusted players from config.yml. Use lands.bypass.cmd.untrusted.COMMAND to 
                         specify a command.
          lands.bypass.cmd.general.*:
            description: Bypass blacklisted commands for untrusted and trusted players from config.yml. Use lands.bypass.cmd.general.COMMAND to 
                         specify a command.


```
## Land Flags Permissions
**These permissions are needed to toggle land flags for land.**
```
      lands.setting.*:
        description: Access to land settings
        default: op
        children:
          lands.setting.entity_griefing:
            description: Allow to toggle entity griefing
            default: op
          lands.setting.piston_griefing:
            description: Allow to toggle piston griefing
            default: op
          lands.setting.monster_spawn:
            description: Allow to toggle monster spawn
            default: op
          lands.setting.animal_spawn:
            description: Allow to toggle animal spawn
            default: op
          lands.setting.waterflow_allow:
            description: Allow to toggle waterflow
            default: op
          lands.setting.tnt_griefing:
            description: Allow to toggle tnt griefing
            default: op
          lands.setting.fire_spread:
            description: Allow to toggle fire spread
            default: op
          lands.setting.leaf_decay:
            description: Allow to toggle leaf decay
            default: op
```

## Role Flags Permissions
**These permissions are needed to toggle role flags for land.**
```
      lands.role.*:
        description: Access to all role settings
        default: op
        children:
          lands.role.setting.*:
            description: Access to all role settings (toggle)
            default: op
            children:
              lands.role.setting.block_break:
                description: Allow to toggle block break
                default: op
              lands.role.setting.block_place:
                description: Allow to toggle block place
                default: op
              lands.role.setting.attack_player:
                description: Allow to toggle attack player
                default: op
              lands.role.setting.attack_animal:
                description: Allow to toggle attack animal
                default: op
              lands.role.setting.block_ignite:
                description: Allow to toggle block ignite
                default: op
              lands.role.setting.interact_general:
                description: Allow to toggle general interaction
                default: op
              lands.role.setting.interact_door:
                description: Allow to toggle open doors
                default: op
              lands.role.setting.interact_container:
                description: Allow to toggle open container
                default: op
              lands.role.setting.interact_mechanism:
                description: Allow to toggle interact mechanism (redstone)
                default: op
              lands.role.setting.interact_villager:
                description: Toggle Flag - Allow a role to interact with villager.
                default: op
              lands.role.setting.fly:
                description: Toggle Flag - Allow a role to fly inside the land / area.
                default: op
              lands.role.setting.land_enter:
                description: Toggle Flag - Allow a role to enter the land / area.
              lands.role.setting.player_trust:
                description: Allow to toggle trust player
                default: op
              lands.role.setting.player_untrust:
                description: Allow to toggle player untrust
                default: op
              lands.role.setting.player_setrole:
                description: Allow to toggle player setrole
                default: op
              lands.role.setting.land_claim:
                description: Allow to toggle claim chunks for the land
                default: op
              lands.role.setting.land_claim_border:
                description: Allow to toggle claim chunks at the border of the land
                default: op
              lands.role.setting.spawn_set:
                description: Allow to toggle spawn set
                default: op
              lands.role.setting.spawn_teleport:
                description: Allow to toggle spawn teleport
                default: op
              lands.role.setting.balance_withdraw:
                description: Toggle Flag - Allow a role to withdraw money from the land bank
                default: op
              lands.role.setting.area_assign:
                description: Toggle Flag - Allow a role to assign a selection to a area.
                default: op
              lands.role.setting.setting_edit_land:
                description: Toggle Flag - Allow a role to edit land settings.
                default: op
              lands.role.setting.setting_edit_role:
                description: Toggle Flag - Allow a role to edit role settings of roles with a lower priority.
                default: op
              lands.role.setting.setting_edit_taxes:
                description: Toggle Flag - Allow a role to edit taxes.
                default: op
              lands.role.setting.vehicle_use:
                description: Toggle Flag - Allow role to use vehicles.
                default: op
```

## Administrator Command Permissions
**These permissions should only be given to administrators or staff.**
```
      lands.admin.*:
        description: Access to all admin actions. Commands require execution of /Lands edit <land> (to select the land).
        default: op
        children:
          lands.admin.land_edit:
            description: Allow to edit other lands /Lands edit
            default: op
          lands.admin.land_delete:
            description: Allow to delete other lands or unclaim chunks from other lands.
            default: op
          lands.admin.land_setowner:
            description: Allow the usage of /Lands setowner for lands the player doesn't own
            default: op
          lands.admin.setting_edit_land:
            description: Edit land settings of other lands (like mob spawning etc.)
            default: op
          lands.admin.setting_edit_role:
            description: Edit role settings of other lands.
            default: op
          lands.admin.setting_edit_taxes:
            description: Edit taxes settings of other lands.
            default: op

          lands.admin.command.*:
            description: Access to all admin commands
            default: op
            children:
              lands.admin.command.reload:
                description: Access to /Lands reload
                default: op
              lands.admin.command.wilderness:
                description: Open wilderness menu /Lands admin wilderness
                default: op
              lands.admin.command.land.*:
                description: Access to admin land commands
                default: op
                children:
                  lands.admin.command.land.delete:
                    description: Delete land
                    default: op
                  lands.admin.command.land.edit:
                    description: Open GUI for land
                    default: op
                  lands.admin.command.land.trust:
                    description: Trust players to land
                    default: op
                  lands.admin.command.land.untrust:
                    description: Untrust players from land
                    default: op
                  lands.admin.command.land.rename:
                    description: Rename land
                    default: op
                  lands.admin.command.land.settings.reset:
                    description: Reset settings of land
                    default: op
                  lands.admin.command.land.setowner:
                    description: Set new owner for land
                    default: op
              lands.admin.command.give.claimblock:
                description: Give claimblocks to player
                default: op
              lands.admin.command.import:
                description: Import data from other plugins
                default: op
              lands.admin.command.convert:
                description: Convert database
                default: op
              lands.admin.command.safezone:
                description: Edit safezones
                default: op
```

## Moderator Utilities
```
      lands.mod.*:
        description: Access to all moderator actions.
        default: op
        children:
          lands.mod.command.*:
            description: Access to all moderator commands.
            default: op
            children:
              lands.mod.command.chatspy:
                description: /Lands chatspy
                default: op
```

## Wars Permissions
```
      wars.*:
        description: Access to all wars actions.
        default: op
          children:
            wars.command.*:
              description: Access to all /wars commands.
              default: op
              children:
                wars.command.declare:
                  description: Access to /Wars declare
                  default: op
                wars.command.deny:
                  description: Access to /Wars deny
                  default: op
                wars.command.info:
                  description: Access to /Wars info
                  default: op
                wars.command.menu:
                  description: Access to /Wars menu
                  default: op
```