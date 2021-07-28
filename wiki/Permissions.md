## Numbered Permissions
IMPORTANT: **Replace `<number>` with an actual number.** Example: `lands.lands.<number>` -> lands.lands.5

`lands.lands.<number>`\
Description: In how many lands can the player be a member?\
NOTE: This does not include owned lands. If you want to set\
how many lands the player can own, just set the permission below (lands.ownlands.<number>).

`lands.ownlands.<number>`\
Description: How many lands can the player own?

`lands.chunks.<number>`\
Description: How many chunks should the player be\
able to claim? This is per land.

`lands.chunks.support.<number>`\
Description: How many chunks can the player contribute
to lands he's member of? 

`lands.members.<number>`\
Description: Set max members per land.

`lands.areas.<number>`\
Description: Set max "sub areas" per land.

`lands.roles.<number>`\
Description: Set max roles per land.

`lands.free.chunks.<number>`\
Description: The player can claim `<number>` free chunks (/claim) for each land they own.

`lands.free.lands.<number>`\
Description: Set free lands amount (/Lands create).

`lands.selection.<number>`\
Description: Max chunks amount for /Lands selection


## Command Permissions
Commands wiki page: https://github.com/Angeschossen/Lands/wiki/Commands


## Playtime Max Rewards
**Only needed if playtime rewards are enabled in the config.**
```
      lands.chunks.max.<number>:
        description: The player wont be able to get any chunks rewarded if his current lands.chunks.<number> permission is equal or higher.
      lands.ownlands.max.<number>:
        description: The player wont be able to get any land creations rewarded if his current lands.ownlands.<number> permission is equal or higher.
      lands.lands.max.<number>:
        description: The player wont be able to get any land joins rewarded if his current lands.lands.<number> permission is equal or higher.
      lands.members.max.<number>:
        description: The player wont be able to get any member limit rewarded if his current lands.members.<number> permission is equal or higher.
      lands.chunks.support.max.<number>:
        description: The player wont be able to get any support chunks rewarded if his current lands.chunks.support.<number> permission is equal or higher.
```


## Bypass Permissions
```
      lands.bypass.*:
        description: Bypass all protections and other restrictions
        children:
          lands.bypass.block_break:
            description: Bypass block break protection
          lands.bypass.block_place:
            description: Bypass block place protection
          lands.bypass.block_ignite:
            description: Bypass block ignite protection
          lands.bypass.interact_general:
            description: Bypass interaction protection
          lands.bypass.interact_mechanism:
            description: Bypass interaction protection
          lands.bypass.interact_door:
            description: Bypass interaction protection
          lands.bypass.interact_container:
            description: Bypass interaction protection
          lands.bypass.interact_villager:
            description: Bypass villager protection
          lands.bypass.attack_animal:
            description: Bypass animal attack protection
          lands.bypass.attack_player:
            description: Bypass player attack protection
          lands.bypass.member.untrust:
            description: Untrust players or remove invites in other lands
          lands.bypass.fly:
            description: Bypass fly flag
          lands.bypass.worldedit:
            description: Bypass WorldEdit restrictions in other players lands
          lands.bypass.land_enter:
            description: Bypass land enter flag
            
          lands.bypass.edit.*:
            description: Select lands you're not member of
            children:
              lands.bypass.edit.settings:
                description: Edit settings of other lands
                
          lands.bypass.selection:
            description: Bypass error message of other plugin cancelling selection
          lands.bypass.teleport-delay:
            description: Bypass teleportation delays / warmups

          lands.bypass.wilderness.*:
            description: Bypass all wilderness protections (for worlds in disallow-wilderness_list)
            children:
              lands.bypass.wilderness.block_break:
                description: Bypass block break protection for disallow-wilderness_list in config
              lands.bypass.wilderness.block_place:
                description: Bypass block place protection for disallow-wilderness_list in config
              lands.bypass.wilderness.block_ignite:
                description: Bypass block ignite protection for disallow-wilderness_list in config
              lands.bypass.wilderness.interact_general:
                description: Bypass interaction protection for disallow-wilderness_list in config
              lands.bypass.wilderness.interact_mechanism:
                description: Bypass interaction protection for disallow-wilderness_list in config
              lands.bypass.wilderness.interact_door:
                description: Bypass interaction protection for disallow-wilderness_list in config
              lands.bypass.wilderness.interact_container:
                description: Bypass interaction protection for disallow-wilderness_list in config
              lands.bypass.wilderness.attack_animal:
                description: Bypass animal attack protection for disallow-wilderness_list in config
              lands.bypass.wilderness.attack_player:
                description: Bypass player attack protection for disallow-wilderness_list in config
              lands.bypass.wilderness.worldedit:
                description: Bypass WorldEdit restrictions in wilderness.
              lands.bypass.wilderness.teleport:
                description: Teleport to wilderness (unclaimed chunks) through /lands teleport.
              lands.bypass.wilderness.fly:
                description: Fly in wilderness
                
          lands.bypass.cooldown.*:
            description: Bypass cooldowns
            children:
              lands.bypass.cooldown.wild:
                description: Bypass /lands wild cooldown
              lands.bypass.cooldown.rename:
                description: Bypass /lands rename cooldown
              lands.bypass.cooldown.teleport:
                description: Bypass chunk teleport cooldown
              lands.bypass.cooldown.spawn:
                description: Bypass /lands spawn cooldown
              lands.bypass.cooldown.unstuck:
                description: Bypass /lands unstuck cooldown

          lands.bypass.spawn.private:
            description: Teleport to private land spawns

          lands.bypass.option.*:
            description: Bypass special config options.
            children:
              lands.bypass.option.force-near:
                description: Bypass force-near option from config.
              lands.bypass.option.chunk-distance:
                description: Bypass chunk-distance option from config.
         
          lands.bypass.cmd.untrusted.*:
            description: Bypass blacklisted commands for untrusted players from config.yml. Use lands.bypass.cmd.untrusted.COMMAND to specify a command.
          lands.bypass.cmd.general.*:
            description: Bypass blacklisted commands for untrusted and trusted players from config.yml. Use lands.bypass.cmd.general.COMMAND to specify a command.
          lands.bypass.priority:
            description: Edit roles even if they have the same or a higher priority than your own role.
          lands.bypass.expiration:
            description: This permission only works when you use Luckperms as your permission plugin. Players with this permission will bypass the configured land expiration from your config.
```


## Toggle Natural Flags
**These permissions are needed to toggle land flags for a land.**
```
      lands.setting.*:
        description: Allow players to toggle natural flags.
        children:
          lands.setting.entity_griefing:
            description: Allow to toggle entity griefing
          lands.setting.piston_griefing:
            description: Allow to toggle piston griefing
          lands.setting.monster_spawn:
            description: Allow to toggle monster spawn
          lands.setting.animal_spawn:
            description: Allow to toggle animal spawn
          lands.setting.waterflow_allow:
            description: Allow to toggle waterflow
          lands.setting.tnt_griefing:
            description: Allow to toggle tnt griefing
          lands.setting.fire_spread:
            description: Allow to toggle fire spread
          lands.setting.leaf_decay:
            description: Allow to toggle leaf decay
          lands.setting.plant_growth:
            description: Allow to toggle plant growth
          lands.setting.snow_melt:
            description: Allow to toggle snow melt
```


## Toggle Role Flags
**These permissions are needed to toggle role flags for land.**
```
      lands.role.*:
        description: Allow players to toggle all role flags.
        children:
          lands.role.setting.*:
            description: Access to all role settings (toggle)
            children:
              lands.role.setting.block_break:
                description: Allow players to toggle the 'block_break' flag.
              lands.role.setting.block_place:
                description: Allow players to toggle the 'block_place' flag.
              lands.role.setting.attack_player:
                description: Allow players to toggle the 'attack_player' flag.
              lands.role.setting.attack_animal:
                description: Allow players to toggle the 'attack_animal' flag.
              lands.role.setting.block_ignite:
                description: Allow players to toggle the 'block_ignite' flag.
              lands.role.setting.interact_general:
                description: Allow players to toggle the 'interact_general' flag.
              lands.role.setting.interact_door:
                description: Allow players to toggle the 'interact_door' flag.
              lands.role.setting.interact_container:
                description: Allow players to toggle the 'interact_container' flag.
              lands.role.setting.interact_mechanism:
                description: Allow players to toggle the 'interact_mechanism' flag.
              lands.role.setting.interact_villager:
                description: Allow players to toggle the 'interact_villager' flag.
              lands.role.setting.fly:
                description: Allow players to toggle the 'fly' flag.
              lands.role.setting.land_enter:
                description: Allow players to toggle the 'land_enter' flag.
              lands.role.setting.player_trust:
                description: Allow players to toggle the 'player_trust' flag.
              lands.role.setting.player_untrust:
                description: Allow players to toggle the 'player_untrust' flag.
              lands.role.setting.player_setrole:
                description: Allow players to toggle the 'player_setrole' flag.
              lands.role.setting.land_claim:
                description: Allow players to toggle the 'land_claim' flag.
              lands.role.setting.land_claim_border:
                description: Allow players to toggle the 'land_claim_border' flag.
              lands.role.setting.spawn_set:
                description: Allow players to toggle the 'spawn_set' flag.
              lands.role.setting.spawn_teleport:
                description: Allow players to toggle the 'spawn_teleport' flag.
              lands.role.setting.balance_withdraw:
                description: Allow players to toggle the 'balance_withdraw' flag.
              lands.role.setting.area_assign:
                description: Allow players to toggle the 'area_assign' flag.
              lands.role.setting.setting_edit_land:
                description: Allow players to toggle the 'setting_edit_land' flag.
              lands.role.setting.setting_edit_role:
                description: Allow players to toggle the 'setting_edit_role' flag.
              lands.role.setting.setting_edit_taxes:
                description: Allow players to toggle the 'setting_edit_taxes' flag.
              lands.role.setting.vehicle_use:
                description: Allow players to toggle the 'vehicle_use' flag.
              lands.role.setting.attack_monster:
                description: Allow players to toggle the 'attack_monster' flag.
              lands.role.setting.ender_pearl:
                description: Allow players to toggle the 'ender_pearl' flag.
              lands.role.setting.interact_trapdoor:
                description: Allow players to toggle the 'interact_trapdoor' flag.
              lands.role.setting.item_pickup:
                description: Allow players to toggle the 'item_pickup' flag.
              lands.role.setting.land_rename:
                description: Allow players to toggle the 'land_rename' flag.
              lands.role.setting.player_ban:
                description: Allow players to toggle the 'player_ban' flag.
              lands.role.setting.setting_edit_various:
                description: Allow players to toggle the 'setting_edit_various' flag.
              lands.role.setting.trample_farmland:
                description: Allow players to toggle the 'trample_farmland' flag.
              lands.role.setting.war_manage:
                description: Allow players to toggle the 'war_manage' flag.
```


## Administrator Command Permissions
**These permissions should only be given to administrators or staff.**
```
      lands.admin.*:
        description: Access to all admin actions. Commands require execution of /Lands edit <land> (to select the land).
        children:
          lands.admin.land_edit:
            description: Allow to edit other lands /Lands edit
          lands.admin.land_delete:
            description: Allow to delete other lands or unclaim chunks from other lands.
          lands.admin.land_setowner:
            description: Allow the usage of /Lands setowner for lands the player doesn't own
          lands.admin.setting_edit_land:
            description: Edit land settings of other lands (like mob spawning etc.)
          lands.admin.setting_edit_role:
            description: Edit role settings of other lands.
          lands.admin.setting_edit_taxes:
            description: Edit taxes settings of other lands.
          lands.admin.command.*:
            description: Access to all admin commands
            children:
              lands.admin.command.reload:
                description: Access to /Lands reload
              lands.admin.command.wilderness:
                description: Open wilderness menu /Lands admin wilderness
              lands.admin.command.land.*:
                description: Access to admin land commands
                children:
                  lands.admin.command.land.delete:
                    description: Delete land
                  lands.admin.command.land.edit:
                    description: Open GUI for land
                  lands.admin.command.land.trust:
                    description: Trust players to land
                  lands.admin.command.land.untrust:
                    description: Untrust players from land
                  lands.admin.command.land.rename:
                    description: Rename land
                  lands.admin.command.land.settings.reset:
                    description: Reset settings of land
                  lands.admin.command.land.setowner:
                    description: Set new owner for land
              lands.admin.command.give.claimblock:
                description: Give claimblocks to player
              lands.admin.command.import:
                description: Import data from other plugins
              lands.admin.command.convert:
                description: Convert database
```


## Moderator Utilities
```
      lands.mod.*:
        description: Access to all moderator actions.
        children:
          lands.mod.command.*:
            description: Access to all moderator commands.
            children:
              lands.mod.command.chatspy:
                description: /Lands chatspy
```


## Wars Permissions
Command permissions can be found [here](https://github.com/Angeschossen/Lands/wiki/Commands#wars).
```
  wars.*:
    description: Access to all wars actions.
```


## Nations Permissions
Command permissions can be found [here](https://github.com/Angeschossen/Lands/wiki/Commands#nations).
````
  nations.*:
    description: Access to all Nations actions
    children:
      nations.admin.*:
        description: Access to all Nations admin actions
        children:
          nations.admin.nation_edit:
            description: Edit other players nations of their lands from /lands edit
````