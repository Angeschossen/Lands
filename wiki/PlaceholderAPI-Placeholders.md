## Placeholders with Featherboard
If you're using Featherboard, you'll need to use `{placeholderapi_PLACEHOLDER}`.

## Display placeholders for the players current location
You can even display the placeholders for you current location, by just appending `_here` to it.

## General
> **`%lands_next_tax%`**\
> Description: Next tax payment round

> **`%lands_next_upkeep%`**\
> Description: Next upkeep payment round

> **`%lands_affiliation%`**\
> Description: This is combines the lands_nation_name and lands_land_name`\
placeholder with lands_nation_name being prioritized.

> **`%lands_claimed%`**\
> Description: returns true (location is claimed) or false (not claimed)


## Land
> **`%lands_land_name%`**\
> Description: Name of land

> **`%lands_land_owner%`**\
> Description: Owner name

> **`%lands_land_role%`**\
> Description: Role in land

> **`%lands_land_members%`**\
> Description: Amount of members in land

> **`%lands_land_balance%`**\
> Description: Balance of the land

> **`%lands_land_chunks%`**\
> Description: Land size

> **`%lands_land_chunks_max%`**\
> Description: Max claim amount for land

> **`%lands_land_chunks_remaining%`**\
> Description: Remaining possible claims for land

> **`%lands_land_tax%`**\
> Description: Tax value of land

> **`%lands_land_upkeep%`**\
> Description: Upkeep costs of land

> **`%lands_land_balance%`**\
> Description: Land balance

> **`%lands_land_chunk_cost_next%`**\
> Description: Cost value of next claim

> **`%lands_land_level%`**\
> Description: Current level of the land

> **`%lands_land_level_next%`**\
> Description: Next level of the land

> **`%lands_land_shield%`**\
> Description: Get remaining shield time.


## Nation
### _any Option
Display placeholders for any nation the player is in. So not just their current /edit land or the land at their position.
Just append "_any" to the placeholder, to display the information for any nation the player is in.

> **`%lands_nation_name%`**\
> Description: Nation name

> **`%lands_nation_level%`**\
> Description: Current level of the nation

> **`%lands_nation_level_next%`**\
> Description: Next level of the nation

> **`%lands_nation_shield%`**\
> Description: Get remaining shield time.


## War
> **`%lands_war_enemy%`**\
> Description: The enemy in current war.

> **`%lands_war_time%`**\
> Description: Remaining time of the current state (preparation or fight).

> **`%lands_war_state%`**\
> Description: The current state of the war (preparation or fight).

## Relation Placeholders
Placeholders that involve more than one player.
> **`%rel_lands_war_relation%`**\
> Description: Displays either the ally or enemy string from your language file depending on the current war and the players relation in this war.

## Top Lands
%lands_top_balance_NUMBER_name%\
%lands_top_balance_NUMBER_owner%\
%lands_top_balance_NUMBER_balance%\
%lands_top_balance_NUMBER_size%\
%lands_top_balance_NUMBER_members%

%lands_top_chunks_NUMBER_name%\
%lands_top_chunks_NUMBER_owner%\
%lands_top_chunks_NUMBER_balance%\
%lands_top_chunks_NUMBER_size%\
%lands_top_chunks_NUMBER_members%

%lands_top_members_NUMBER_name%\
%lands_top_members_NUMBER_owner%\
%lands_top_members_NUMBER_balance%\
%lands_top_members_NUMBER_size%\
%lands_top_members_NUMBER_members%