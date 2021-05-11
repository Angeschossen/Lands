**You need to enable time-reward option in config to use this feature.**


### How does it work?
Players can get a reward, for example ONE chunk, every x seconds.

***

### Configuration
    time-reward:
      enabled_17: false
      # Time settings
      # After how many seconds
      # should the players
      # get rewarded with plus 1
      # chunk, land, own land
      # or member.
      # NOTE: Timeunit is seconds
      time:
        # /Lands claim
        chunks: 3060
        # Lands the player can be part of.
        lands: 43200
        # Max land members (How many players can the land have?)
        members: 21600
        # Lands the player can create.
        # /Lands create
        lands-own: 86400


***

### Maximum Restrictions
**Set the maximum amount of chunks etc. a player can get through playtime rewards.**

https://github.com/Angeschossen/Lands/wiki/Permissions#playtime-reward-permissions