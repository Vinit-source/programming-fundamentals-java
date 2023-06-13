# Exception Handling

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime and describes an error condition that has occurred.

**Hierarchy of Java Exceptions** All exception classes in Java are subtypes of the `java.lang.Exception` class. The exception class is sub-divided into two main categories:

1.  **Checked Exceptions**: Also known as compile-time exceptions, these are the exceptions that a method might throw and that must be declared in the method's `throws` clause or be caught within the method body. Example: `IOException`, `ClassNotFoundException`.
    
2.  **Unchecked Exceptions**: Also known as runtime exceptions, these are not checked at compile-time but at runtime. These include `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`.
    

**Exception Handling** Exception handling in Java is managed via five keywords: `try`, `catch`, `throw`, `throws`, and `finally`.

-   **Try-Catch**: The `try` block encloses the code that might throw an exception, and the `catch` block contains the code to handle the exception.

```java
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
}
``` 

-   **Finally**: The `finally` block is optional and can follow a `try` or `catch` block. The code within this block gets executed always, irrespective of whether an exception occurred within the `try` block or not.

```java
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
} finally {
    // code to be executed regardless of an exception
}
``` 

-   **Throw**: We use `throw` keyword to explicitly throw an exception.

```java
throw new ExceptionType("Exception message");
``` 

-   **Throws**: If a method is capable of causing an exception that it does not handle, it must specify this behavior so that callers of the method can guard themselves against that exception.

```java
void myMethod() throws ExceptionType {
    // method code
}
```


Exception handling is all about making your program robust and preventing unexpected runtime errors, allowing your applications to run smoothly under different, often unpredictable conditions.