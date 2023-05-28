### Day 3: Data types

Java is a statically-typed language, which means that all variables must first be declared before they can be used. This involves stating the variable's type and name, as you've seen already:


```java
int myNumber = 5;
String myString = "Hello";
```

In the above example,
*  `int` and `String` are Java ***data types***,
*  `myNumber` and `myString` are ***variable names***, and 
*  `5` and `"Hello"` are the values assigned to the ***variables***.

Here are some commonly used data types in Java:

**Primitive Data Types:**

1.  `byte`: This data type is used to save space in large arrays, mainly in place of integers, since a `byte` is four times smaller than an `int`. Example: `byte a = 10;`
    
2.  `short`: This type is used to save memory in large arrays, in situations where the memory savings actually matters. Example: `short s = 20;`
    
3.  `int`: This is generally used as the default data type for integral values unless there is a concern about memory. Example: `int i = 30;`
    
4.  `long`: This type is used when a wider range than `int` is needed. Example: `long l = 400000L;`
    
5.  `float`: This is used to save memory in large arrays of floating-point numbers. Example: `float f = 20.5f;`
    
6.  `double`: This is generally used as the default data type for decimal values. Example: `double d = 20.5;`
    
7.  `boolean`: This is used for flags that track true/false conditions. Example: `boolean b = true;`
    
8.  `char`: This is used to store characters. Example: `char letter = 'A';`
    

**Non-primitive Data Types (Reference/Object Data Types):**

These are used to access objects. They are also used to access methods that can perform certain operations on objects. The `String` data type is one of the most commonly used non-primitive data types. Example: `String s = "Hello, Java!";`

**Type Conversion:**

Sometimes it's necessary to convert data from one type to another. This can be done in two ways:

1.  **Implicit conversion:** If the two types are compatible, and the target type is larger than the source type, Java will perform an automatic type conversion. For example, you can assign an `int` value to a `long` variable without casting it because `long` is larger than `int`.


```java
int i = 100;
long l = i;  // No explicit casting required here
``` 

2.  **Explicit conversion:** If the two types are not compatible, or the target type is smaller than the source type, you'll need to perform an explicit conversion.


```java
double d = 100.04;
long l = (long)d; // Explicit casting is required here
```
In this type of conversion, information loss takes place.

This brief overview introduces you to data types in Java and how you can manipulate them. 