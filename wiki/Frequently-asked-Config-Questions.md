**Q: Where can I toggle wilderness flags or convert regular lands into admin/server lands?**\
A: This will open a menu where you can toggle wilderness flags and convert regular lands into admin/server lands:\
`/Lands admin menu`

***

**Q: Some players/lands have unlimited claims. How can I prevent that?**\
A: The land owner has lands.chunks.* or op.

***

**Q: How can I restrict fly to players claims?**\
A: Just give them access to your /fly command and make sure to not give them fly bypass permissions.\
Also the fly flag needs to be enabled for their flag in their claim. To toggle fly in wilderness use `/Lands admin wilderness`.

***

**Q: How can I set visualisations to display permanently?**\
A: Set the visualisation duration to -1 and if you want to automatically enable it on server join, make sure to enable the join option too:
> ```
>   # /Lands view visualization
>   view:
>     # Should Lands display land borders automatically once the player joins?
>     # NOTE: You can set duration_9 (below) to -1 to make the visualization permanent.
>     join: false
>     # Duration of land view.
>     # Time unit is seconds. You can make this permanent by setting the value to -1
>     duration_9: 60
> ```


***

**Q: My players can't toggle settings. What is wrong?**\
A: You did not give them the required permissions. Lands will always display you permission hints, if the player is missing  a permission.


***

**Q: Where can I edit the messages and GUI menus?**\
A: In your /plugins/Lands/Language folder.

***

**Q: My players are allowed to pvp, even though pvp is disabled?**\
A: You have combat tagging enabled:
>   ```
>   # Specified combat settings which do not affect wars.
>   combat:
>     # Combat tagging
>     # If a player attacks a other player he will by tagged for x seconds so that, regardless of land settings,
>     # other players can attack him.
>     # 0s = disabled
>     tag-time: 15s
>     # Should players, which are members in a common land, be able to fight in wilderness?
>     # NOTE: This option requires server restart / reload.
>     ally-wilderness: true
>   ```

***

**Q: How can I enable/disable the selection/claim tool item?**\
A: Toggle this option in config.yml. You can configure the item material etc. in your gui language file:
>    ```
>    # Should Lands give every new player the selection tool defined in your gui language file?
>    # If you for example set GOLDEN_HOE as the material in your gui language file, all GOLDEN_HOE's will trigger a selection, not just the given one.
>    # That means that players can craft the tool too and use it to create selections. However, /Lands selection still works without any tool in hand.
>    # Automatically giving new players the selection tool, just informs them about claiming and with it they can manage selections from air, instead of 
>    # needing to touch the block directly.
>    selection-tool: true
>    ```

***

**Q: How can I deny / allow claiming in specific WorldGuard areas?**\
A: `/region flag [region] lands-claim deny/allow`\
By default this flag will be set to deny.

***

**Q: How can I set claim (permission) limits per world?**\
A: Toggle the `claim-limits-per-world` option in config.
Example: If you set the permission lands.chunks.5 for your players,\
they will be able to claim 5 chunks in each claim world instead of 5 chunks in general.\
This then can be combined with your permissions plugin per world permissions, which would allow you to set different claim limits per world.\
NOTE: This only applies for claim permissions: lands.chunks.NUMBER, lands.ownlands.NUMBER

***

**Q: How can I prevent swear words to be taken for land, role or area names?**\
A: Edit the 'swear-words' list in your language file.