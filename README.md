# Semester-Opgave-1-Data

Readme
 
Project name
HyperText (version 1.0.0)
 
Table of contents (optional)
Outgoing transactions
Receive payments
 
 
Introduction (required)
HyperText is a program developed to handle transactions by connecting the user’s registration and bank account number as a HyperText-user and furthermore be able to conveniently handle bank transactions.
 
To see full project visit GitHub:
-   	https://github.com/Narenboi/Semester-Opgave-1-Data
 
	Use case:
	
 
 
Requirements (required)
Java (https://www.java.com/en/)
SQLite (https://www.sqlite.org/download.html)
JDK (https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.zip)
 
Required modules
JDBC-Driver (https://www.oracle.com/database/technologies/appdev/jdbc.html) 
 
Installation (required, unless a separate INSTALL.md is provided)
In order to successfully execute the program, make sure Java, SQLite, JDK and JDBC-driver have been installed. 
Java: Our project code requires the Java environment to successfully run, to make sure Java is installed open command prompt on Windows or Terminal on Mac and type: java - -version
 
SQLite: Download the SQLite database management from the link, make sure to create a database with SQLite-management and insert the path to the database;
(Both compatible with Windows and Mac)
File > DbSql.java > Line 12 > jdbc:sqlite:
Windows: jdbc:sqlite:/C://Users/luhav/OneDrive/Skrivebord/Projekt 1 data/Program/Semester-Opgave-1-Data/databaseProjekt1Rigtige.db";
Mac: jdbc:sqlite:/Users/simonthorsen/IdeaProjects/StudieAministration2022/Datebase1.db";
 
JDK: After installation, JDK provides a run-time environment for our Java project code to be executed. No further actions necessary.
 
JDBC: To apply the JDBC-driver to the project;
File  > Project Structures > Libraries > Add Class > Enable JDBC-driver
 
 
Configuration (required)
The module has no modifiable settings.
 
Troubleshooting & FAQ (optional)


