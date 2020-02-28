
# Basic Example For Get vs Load Difference
This Project covers the simple basic example for Differentiating Get vs Load methods in Hibernate.

## Explanation:
Hibernate Session provide different methods to fetch data from the database. In that two of them are get and load functions.

If we call the get() methods, It returns  the object by fetching it from the database or from the hibernate cache
Whereas load() just returns the reference of an proxy object & it loads the data from the database or cache only when we access other properties other of the object.

Whenever the data is not there in the database & if we call get() & load() methods , get() method return null object if the data is not present but load method throws Object Not Found Exception.

As a part of performance load method is prefered to use since it will load the proxy object and it will reduce the database hit count since it will hit to database only whenever we load the data other than getId() & if it is not in database.
But get method will always load the actual or real object from the cache or database hence number of database hit count will be more. & performance will be slight slower than load method.

When To Use Get and Load:
Whenever we dont know wheather the object is present or not then its good option to go with get method since it will return null if no object found in the cache or database
but in case of load we should be known the data, then only we should go for load method.

## Running Application locally

This application not requires any server setup, You can just run it as main class.


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/issues


## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* STS - Spring Tool Suite
* Server - Apache Tomcat
* Postman

### Steps:

1) Download or Clone this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods
```
2) To Import the Praject Using STS
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring MVC Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Classes | [HibernateGetVsLoad](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/src/main/java/com/star/sud/test/HibernateGetVsLoad.java)  [HibernateGetVsLoadSecond](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/src/main/java/com/star/sud/test/HibernateGetVsLoadSecond.java) |
|Properties Files | [hibernate.cfg.xml](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/src/main/resources/hibernate.cfg.xml) |


## Steps to test the application:

1) Execute the scripts [click here](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/src/main/resources/scripts.sql)
2) Once the application is installed properly, Go to the class file HibernateGetVsLoad & Run as Java Application
3) Verify the result with the User reference or guide of step1 & step 2.  
   
## User reference or guide.

1. Result For First class Execution [click here](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/docs/picture1.png)

2. Result for Second class Execution[click here](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/blob/master/docs/picture2.png)
 
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Hibernate-Get-vs-Load-Methods/issues) is the preferred channel for bug reports, features requests and submitting pull requests.
