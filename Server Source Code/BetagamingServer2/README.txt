Source code for BetaGaming server side.

Included Files:

src folder - Includes all servlets/other source files.
mysql-connector-java-X.X.XX-bin.jar - Drive to stablish connection to the mysql database

How to load the driver:

1. Create "lib" folder inside your project
2. Drop the driver into the folder
3. Click the driver icon. Add to build path.
4. In case you want to use the driver:
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
