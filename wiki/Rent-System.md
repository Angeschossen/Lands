# Configuration
```
  # Rent/sell areas settings
  # Rent = The players can rent a area of their choice without needing to get trusted. They can decide how long they want to rent it.
  # Taxes = Trusted players pay a defined amount of tax per defined interval.
  rent:
    # Allow your players to set sub areas available for rent?
    rent: true
    # Allow your players to sell sub areas or their whole land?
    sell: true
```

# Rent Sign

### Rent sign setup:
![Rent sign setup](https://i.imgur.com/yNGx4zN.jpg)

### Explanation
* For this example: 
  * Costs $200 each 5 days.
  * Can't be rented more than 50 days in total.

* The sign accepts the following units: d = day(s) h = hour(s), m = minute(s) 
  * If none is specified, it will use d.

* You can only set sub areas for rent. The default area can only be set for sale (= selling the whole land; more information below)

### Result
![Rent sign result](https://i.imgur.com/mfaKwnc.jpg)

### Explanation
* The rent sign is setup and players can now access it.
  * To rent this area, just click on the sign.
  * To add more time to your rental, just click again on the sign.

* Cancel rental
  * Tenants can use /Lands rent cancel to cancel their rental while standing inside the area.
 
* Remove the rental
  * As the area owner you can either remove the sign or execute /Lands rent remove while standing inside the area.

# Sell Sign

### Sell sign setup
Sell signs can be placed in sub areas and in the default area (= selling the whole land)\
![Sell sign setup](https://i.imgur.com/YFgyVoa.jpg)

### Explanation
* For this example: 
  * Costs $5000 in total
  * The player will be the owner of the area.

### Result
![Sell sign result](https://i.imgur.com/lCAhgCa.jpg)

### Explanation
* The sell sign is setup and players can now access it.
  * To buy this area, just click on the sign.

* Cancel ownership
  * Tenants can use /Lands rent cancel to cancel their ownership while standing inside the area.
 
* Remove the sale
  * As the area owner you can either remove the sign or execute /Lands rent remove while standing inside the area.


### Browse Listings
Use `/Lands rentlist` to view all areas and lands that can be rented or bought. There you can also filter and sort these offers.