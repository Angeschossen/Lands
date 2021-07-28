In the levels.yml file, which is located in the folder /plugins/Lands, you can edit and add land and nation levels.
Please note that each config section (level section) name and level name must be unique.
You must insert valid YAML format. To verify your format, you can paste the content of this file here: https://yaml-online-parser.appspot.com \
The order of the levels is ascending (lowest level -> highest).

### Disabling Levels
You can individually disable / enable land or nation levels. Please note that some {level} placeholders in your language file will then get replaced with "Disabled" ingame. So you might want to remove them with the editor of your choice.


## Configuring Land Levels
### Requirements
For each level you must configure requirements. If a land passes these requirements they will level up. If they later do no longer pass these, their level will get lowered again. The requirement `balance` represents the bank balance of the land (/lands balance).
```
      requirements:
        members: 5
        chunks: 10
        balance: 15000
```

### Benefits of a Level
Each level can have their own benefits. The `chunks` value will add or remove (= negative value) chunks to the land. That means that the land can claim more chunks at `/claim`. The `upkeep` value will higher or lower (= negative value) their upkeep costs by a given value.
```
      values:
        chunks: 4
        upkeep: 50
```

### Execute Commands at Level up and down
The `reached` commands list will be executed when a land reaches this particular level and the `down` command list will be executed when a land gets downgraded from this particular level to the previous one.

Available placeholders:
* {level}: Name of the level
* {land}: Name of the land
* {owner}: The player name of the land owner.
* {member}: The player name a land member.\
If the command contains the {members} placeholder, the command will be executed for each player that is trusted in the land.
````
      commands:
        reached:
          - 'say Land {land} just levelled up.'
        down: []
````


## Configuring Nation Levels
### Requirements
The `members` requirement represents the total unique player amount of all lands that are part of the nation. The `chunks` requirement is the sum of all claims of the lands that are part of the nation. Same goes for the `members` and `balance` requirements. 
````
      requirements:
        members: 12
        chunks: 100
        balance: 100000
````

### Benefits of a Level
Chunks: Each land in the nation will get x more or less (= negative value) chunks for claiming. 
Upkeep: The nation will need to pay x more or less (= negative value) money for their upkeep.
````
      values:
        chunks: 20
        upkeep: 20
````

### Execute Commands at Level up and down
The `reached` commands list will be executed when a nation reaches this particular level and the `down` command list will be executed when a nation gets downgraded from this particular level to the previous one.

Available placeholders:
* {level}: Name of the level
* {nation}: Name of the nation
* {owner}: The player name of nation owner.
* {land}: Name of a land that is part of the nation.\
If the command contains the {land} placeholder, the command will be executed for each land, which is part of the nation.
````
      commands:
        reached:
          - 'say Nation {nation} just levelled up.'
        down: []
````