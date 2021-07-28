### Available Database Types
* JSON, SQLite: We recommend using JSON or SQLite, if you don't need to connect the data to external applications. Only experienced administrators should use MySQL. 

* MySQL: We recommend using MySQL, if you need to connect your database to a external system or you use a backup system that requires it. If you want to use MySQL, make sure that your MySQL server is setup correctly.
NOTE: It is not supported to use this as an "cross server solution". Only one Lands server should be connected to the database. If you want to connect multiple Lands servers to the same database, make sure to configure different table prefixes in the Lands config.

### Export your Database to MySQL, SQLite, JSON
1. It is highly recommended to **clear the target database** you want to convert to! **Otherwise you might encounter issues.**
2. Also, if you want to convert to MySQL, make sure the credentials and database name is setup correctly in your Lands config.
3. Make sure to take a backup of your current database.
After you have followed these steps, execute this command: /Lands admin convert [json, sql]
