### Available Database Types
* JSON: We recommend using JSON, if you don't need to connect the data to external systems. Only experienced administrators should use MySQL. 

* MySQL: Requires **at least MySQL server version 5.8+**. Older versions won't work, use JSON instead! We recommend using MySQL, if you need to connect your database to a external system or you use a backup system that requires it. If you want to use MySQL: Make sure your that your MySQL server is setup correctly (up to date MySQL server version, connection limits, utf8mb4_0900_as_cs as table encoding etc.)
NOTE: It is not supported to use this as an "cross server solution". Only one Lands server should be connected to the tables.

### Export your Database to MySQL, JSON
1. It is highly recommended to **clear the target database** you want to convert to! **Otherwise you might encounter issues.**
2. Also, if you want to convert to MySQL, make sure the credentials and database name is setup correctly in your Lands config.
3. Make sure to take a backup of your current database.
After you have followed these steps, execute this command: /Lands admin convert [json, mysql]
