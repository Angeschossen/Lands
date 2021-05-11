Lands features a war system which allows other lands to fight against each other. This page only explains the basic options you should start with configuring. There are even more options in the wars.yml file. They're all self explaining (with comments) in the wars.yml file located in your Lands folder.
The full file can be viewed here: https://github.com/Angeschossen/Lands/blob/master/src/main/resources/wars.yml


## Before War: War Declarations
To declare war against a other land execute `/Wars declare <land>`.
Then the defender receives a war declaration with more information, like when the war time starts and the tribute which the attacker set.
The tribute is payed by the defender to the attacker, in case the defender surrenders. War declarations can be disabled by setting the preparation time to 0 below.

**1. Minimum amount of Players**\
Set the minimum amount of trusted players a land needs to have to be allowed to engaged in a war.
>  min-players:\
>    Set minimum amount of trusted players for the declaring attacker.\
>    attacker: 0\
>    Set minimum amount of trusted players for the defender to receive a war declaration.\
>    defender: 0

**2. War Preparation Time**\
How much time do you want to give the defender lands for war preparation, before it will start?
>  NOTE: Timeunit is seconds\
>  Default is one day\
>  preparation-time: 1d

**3. Mutual War Declarations**\
Should war declarations need a mutual acceptation?\
If enabled, the defender land needs to confirm the declaration before the war can start. They need to do this by executing `/Wars declare <attacker>`\
They can deny a war declaration by executing `/Wars deny`
>  mutual:\
>    enabled_2: false\
>    Should the declaration be deleted if the enemy did not accept it during the configured period?\
>    You can disable this by setting the value to 0.\
>    timeout: 5d


## During War

**1. Max War Time**\
Set the max time a war can hold on. When this time is over the team with the most kills will win. If both teams have the same amount of kills, it will end in a draw and no team will be rewarded.
> duration: 36h

**2. (Role) Flags during War**\
Allow players doing the following things in the enemy land (only during war).\
Available actions: https://github.com/Angeschossen/Lands/wiki/Roles-and-their-Flags#action-flags \
NOTE: Adding BLOCK_PLACE or BLOCK_BREAK to this list will allow invaders to break, place ALL blocks. If you want to specify blocks, please use the lists below.
> Option: role-settings_list

Allow the placement of specific blocks if the land part of a war.\
NOTE: This is only needed if BLOCK_PLACE is not in the role-settings_list above.\
Values: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html 
> Option: block-place_list

Allow breaking of specific blocks if the land part of a war.\
NOTE: This is only needed if BLOCK_BREAK is NOT in the role-settings_list above.\
Values: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html
> Option: block-break_list
