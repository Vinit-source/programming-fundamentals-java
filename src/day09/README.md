# Arrays

In Java, an array is a dynamic object that stores a fixed number of values of a single type. The elements in an array are automatically initialized to zero (for numeric types), false (for boolean), and null (for reference types).

**Declaring Arrays** In Java, you declare an array by specifying the type of its elements. For example:

```java
int[] numbers; // This is a declaration of an array of integers.
``` 

**Instantiating Arrays** After declaring an array, you must instantiate it using the `new` keyword before you can use it.

```java
numbers = new int[5]; // This allocates memory for 5 integers in the array.
``` 

You can also declare and instantiate an array at the same time:

```java
int[] numbers = new int[5];
``` 

**Initializing Arrays** You can initialize an array using a comma-separated list of elements enclosed in braces `{}`.


```java
int[] numbers = {1, 2, 3, 4, 5};  // This is an array of integers.
``` 

**Accessing Elements** Array elements are accessed using the array name followed by the index of the element in square brackets.


```java
numbers[0] = 7; // Sets the first element of the array to 7.
int x = numbers[0]; // Retrieves the first element of the array.
```

Remember that array indices in Java start at 0, so the index of the first element is 0, and the index of the last element is the array length minus one.

**Array Length** You can find the number of elements in an array (its length) using the `length` property:


```java
int length = numbers.length;
``` 

This can be especially useful when iterating over an array using a loop