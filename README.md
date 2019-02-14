Calculator CLI readme
================

Project requirements
--------------------
[Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
 
[Maven](https://maven.apache.org/download.cgi)  - java build tool 

Check if Java installed correctly
---------

Run:
`c:\Temp\RealPageTestTask>java -version`
c:\Temp\RealPageTestTask>java -version

Example of output:
`java version "1.8.0_171"
Java(TM) SE Runtime Environment (build 1.8.0_171-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.171-b11, mixed mode)`


Check if Maven installed correctly:
-----------

Run:
`c:\Temp\RealPageTestTask>mvn --version`

Example of output:
`Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T10:58:13+03:00)
Maven home: C:\WorkSoftware\apache-maven-3.5.2\bin\..
Java version: 1.8.0_151, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_151\jre
Default locale: ru_RU, platform encoding: Cp1251
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"`


How to build
--------------------
`cd c:\Temp\RealPageTestTask`

`mvn clean install`

How to run application:
--------------------
`c:\Temp\RealPageTestTask>java -jar target/test-1.0-SNAPSHOT.jar`

  Valid commands: +, -, *, /, q, h