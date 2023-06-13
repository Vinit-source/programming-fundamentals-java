### Maven Examples

#### Step 1: Create Maven Project

* Choose File -> Maven Project
* ![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/994e2ee8-c135-43f5-a532-face073c0ca0) 

* Select - Create a Simple Project ( for Core Java Projects )
* ![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/925aacc9-3545-4568-9206-613b59b0e7dc)

* Enter groupId and artifactId
* ![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/2ad4a606-7427-4248-a459-d6964f2466f3)

* Generated Project Structure
* ![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/a65493be-1c34-45d8-928b-e4edd2129d0d)


* pom.xml
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>in.suryaumapathy</groupId>
	<artifactId>calculator-app</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</project>

```
* Note: Default Version: 0.0.1-SNAPSHOT

##### Step 2: Set the Java Compiler Version

* Add properties tag and specificy Java Compiler version for source and target
* pom.xml

```xml
<project ....>
  ...
	<properties>
		<maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>		
	</properties>
  
  ...
</project>
```

##### Step 3: Add Dependencies ( e.g: MySQL JDBC jar )
* If we want to add jars to classpath, add jar in the dependencies section.

* *Maven Remote Repository:*
 * https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.33

```xml
	<dependencies>
    
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.33</version>
		</dependency>
    
    ....
	</dependencies>
```

##### Step 4: Change Version
* Snapshot refers in development
* Version Number Format: Major.Minor.Patch 
```xml
<version>8.0.33</version>
```

##### Step 5: Maven Goals
* mvn clean => deletes target folder and deletes class files
* mvn compile => compiles source code
* mvn test => Run the JUnit test cases
* mvn package => Package the application in Jar
* mvn install => install the jar in Maven Local Repository

Note: We can combile maven goals
* mvn clean package


###### Step 6: Package Jar and skip Tests
* mvn clean package -DskipTests


