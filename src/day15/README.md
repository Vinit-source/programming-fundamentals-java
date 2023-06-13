### JUnit 5

#### Step 1: Add JUnit dependency in pom.xml

```xml

  <properties>
    <!-- Dependency versions -->
    <junit.jupiter.version>5.5.2</junit.jupiter.version>
    <maven-surefire-plugin.version>2.22.2</maven-surefire-plugin.version>    
    <java.version>17</java.version>    
  </properties>


	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>${junit.jupiter.version}</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	
	 <build>
    <plugins>
       <!-- plugin to run test cases from maven -->
      <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>${maven-surefire-plugin.version}</version>
      </plugin>
      <!-- Maven plugin to use perticular java version to compile code -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>17</source>
          <target>17</target>
        </configuration>
      </plugin>
    </plugins>
  </build>

```

##### Step 2: Business Logic Method

```java
package com.calculatorapp;

public class Addition {

	public static int add(int a, int b) {
		return a+b;
	}
}

```

##### Step 3.1: Testing - Without using JUnit 
```java
package com.calculatorapp;

public class AdditionTest {

	public static void main(String[] args) {

		int result1 = Addition.add(10, 20);
		System.out.println("Result1 :: 10+20=" + result1);
		
		int result2 = Addition.add(0, 20);
		System.out.println("Result2 :: 0+20=" + result2);
		
		int result3 = Addition.add(-1, 20);
		System.out.println("Result3 :: -1+20=" + result3);
		
	}

}

```

##### Step 3.2: Testing - Using JUnit5 test cases

```java
package com.calculatorapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionTestUsingJUnit {

	@Test
	public void testCase1() {

		int result1 = Addition.add(10, 20);
		// System.out.println("Result1 :: 10+20=" + result1);
		assertEquals(30, result1);
	}

	@Test
	void testCase2() {

		int result2 = Addition.add(0, 20);
//		System.out.println("Result2 :: 0+20=" + result2);
		assertEquals(20, result2);
	}

	@Test
	void testCase3() {
		int result3 = Addition.add(-1, 20);
		// System.out.println("Result3 :: -1+20=" + result3);
		assertEquals(19, result3);
	}

}

```

* ![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/bfbc4aa7-6c63-417c-921d-ec10c44b8be3)
