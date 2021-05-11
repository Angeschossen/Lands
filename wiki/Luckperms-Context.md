If you have Luckperms installed you can give players permission in specific Lands areas.
Download: https://www.spigotmc.org/resources/28140

Available Context:
* land=LANDNAME
* land_area=AREANAME
* land_trusted_in=LANDNAME

These two can be used to determine if the player is trusted at the current location:
* land_area_trusted=yes
* land_area_trusted=no
  

### Examples:

Giving a permission only in a specific land:\
`/lp user Luck permission set test.permission land=testland`\
Lands names are not case sensitive.

Giving a permission only in wilderness:\
`/lp user Luck permission set test.permission land=wilderness`\
NOTE: You can also remove permission if they're in wilderness by setting negated (-) permissions.

Giving a permission only in claims where the player is trusted:\
`/lp user Luck permission set test.permission land_area_trusted=yes`