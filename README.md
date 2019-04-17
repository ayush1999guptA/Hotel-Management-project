# Hotel Management System

This is a JAVA application which is a hotel management system.

## How to Use
- Use Windows
- Open src/Students/Credentials.java
- Edit the sqlPassword to match the password of sql in your system
- Run dist/Result

## Implementation

### About the Framework:

Swing is a GUI widget toolkit for Java. It is part of Oracle’s Java Foundation Classes (JFC) – an API for providing a graphical user interface (GUI) for Java programs. Swing API is set of extensible GUI Components to ease developer’s life to create JAVA based Front End/ GUI Applications. It is built upon top of AWT API and acts as replacement of AWT API as it has almost every control corresponding to AWT controls.

### Database Used:

This project uses MySQL as its database. MySQL is an open source relational database management system (RDBMS). MySQL is free and open-source software under the terms of the GNU General Public License, and is also available under a variety of proprietary licenses. MySQL runs on virtually all platforms, including Linux, UNIX and Windows. Although it can be used in a wide range of applications, MySQL is most often associated with web applications and online publishing.

### Connecting with the Database:

`try{`  
`Class.forName("com.mysql.jdbc.Driver");`              
`Connection con;`  
`con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root",Credentials.sqlPassword);`  
`Statement stmt;`  
`stmt = con.createStatement();`  
`stmt.executeUpdate("USE hotelsystem");`  
`stmt.executeUpdate("insert into staff(name,contact,aadhar,username,password,work)`  
`values('"+name+"','"+contact+"','"+aadhar+"','"+usr+"','"+pass+"','"+work+"');");`  
`JOptionPane.showMessageDialog(frame, "Staff Added");`  
`new MainScreen().setVisible(true);`  
`this.setVisible(false);`  
`        }`  
`catch(  Exception e){`  
`System.out.println(“Exception: “+e);`  
`}`  

Here, JDBC is used to connect the program with the database. The JDBC standard defines an application program interface (API) that Java programs can use to connect to database servers. The word JDBC stands for Java Database Connectivity.
  
Each database product that supports JDBC provides a JDBC driver that must be dynamically loaded in order to access the database from Java. This is done by invoking Class.forName with one argument specifying a concrete class implementing the java.sql.Driver interface. This interface provides for the translation of product-independent JDBC calls into the product-specific calls needed by the specific database management system being used. The driver is available in a .jar file at vendor Web sites and should be placed within the classpath so that the Java compiler can access it.  
  
The Java program must import java.sql.*, which contains the interface definitions for the functionality provided by JDBC. The first step in accessing a database from a Java program is to open a connection to the database. This step is required to select which database to use, here mysql. Only after opening a connection can a Java program execute SQL statements. A connection is opened using the getConnection method of the DriverManager class (within java.sql). This method takes three parameters.  
  
- The first parameter to the getConnection call is a string that specifies the URL, or machine name, where the server runs (here, mysql://localhost:3306/mysql), along with possibly some other information such as the protocol to be used to communicate with the database, the port number the database system uses for communication, and the specific database on the server to be used.  
- The second parameter to getConnection is a database user identifier, which is a string.  
- The third parameter is a password, which is also a string and is stored in Credentials.java file.  
  
Once a database connection is open, the program can use it to send SQL statements to the database system for execution. This is done via an instance of the class Statement. To execute a statement, we invoke either the executeQuery method or the executeUpdate method, depending on whether the SQL statement is a query (and, thus, returns a result set) or non-query statement such as update, insert, delete, create table, etc. 



