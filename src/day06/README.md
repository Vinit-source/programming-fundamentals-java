### Day 6: String Utilities

Java provides a powerful and flexible `String` class, along with various methods to manipulate strings.

**Creating Strings:**

You can create a `String` in Java as shown below:


```java
String myString = "Hello, World!";
``` 

**String Concatenation:**

Strings can be concatenated using the `+` operator:


```java
String hello = "Hello, ";
String world = "World!";
String greeting = hello + world;  // "Hello, World!"
``` 

**String Methods:**

- **concat(`anotherString`):** Returns a concatenated string with the `anotherString`. Same output as previous code snippet. 

```java
String hello = "Hello, ";
String world = "World!";
String greeting = hello.concat(world);  // "Hello, World!"
```

Note that `concat` is a String method.
Here are some commonly used String methods:

-   **length():** Returns the length of the string.

```java
String str = "Hello";
int len = str.length();  // 5
``` 

-   **toUpperCase() and toLowerCase():** Converts all the characters in the string to upper case or lower case.


```java
String str = "Hello";
String upper = str.toUpperCase();  // "HELLO"
String lower = str.toLowerCase();  // "hello"
``` 

-   **trim():** Removes the leading and trailing white spaces in the string.


`String str = " Hello ";
String trimmed = str.trim();  // "Hello"` 

-   **substring():** Returns a part of the string.


```java
String str = "Hello";
String sub = str.substring(0, 2);  // "He"
``` 

-   **replace():** Replaces a part of the string.


```java
String str = "Hello";
String replaced = str.replace("He", "Ye");  // "Yello"
``` 

-   **equals():** Compares the content of two strings.


```java 
String str1 = "Hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2);  // true
``` 


-   **charAt():** Returns the character at the specified index.

```java
String str = "Hello";
char ch = str.charAt(1);  // 'e'
``` 

These utilities make it easy to manipulate and analyze strings in Java. With them, you can transform text data, extract information, and perform many other operations.