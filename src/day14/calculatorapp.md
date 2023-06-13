### Create a Simple Addition Program in Maven Project

##### Step 1: Source Folder ( src/main/java)

* In src/main/java, create an Addition class and write an implementation method
```java
package com.calculatorapp;

public class Addition {

	public static int add(int a, int b) {
		return a+b;
	}
}
````


##### Step 2: Test Folder ( src/test/java)

* In src/test/java, create a test class to test Addition class methods
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
##### Output

```
Result1 :: 10+20=30
Result2 :: 0+20=20
Result3 :: -1+20=19

```

### Screenshots
![image](https://github.com/suryaumapathy2812/programming-fundamentals-java/assets/32648210/020109b1-e941-49cb-b831-a9f520c45217)
