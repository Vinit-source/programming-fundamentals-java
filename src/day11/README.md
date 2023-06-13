# Data Validation

Data validation is the process of ensuring that user input or data comply to certain standards or values before it is processed. It is important for maintaining the security, accuracy and consistency of data in your application.

**Types of Validation** In Java, we often validate data like strings and numbers. Here are the most common types of validation:

1.  **Number Validation**: Ensure that the data is a number and optionally, within a certain range.
2.  **String Validation**: Verify that a string is not empty, has a certain length, or matches a certain pattern.
3. **Regular Expressions**:  You can validate that a string matches a certain pattern using regular expressions

## Number Validation

In Java, you can validate if a string contains a valid number using wrapper classes like `Integer` or `Double` and a `try-catch` block. Here's an example:

```java
public boolean isValidNumber(String str) {
    try {
        int num = Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
``` 

In this example, `Integer.parseInt(str)` tries to convert the string into an integer. If the string can't be converted (it's not a valid number), it throws a `NumberFormatException`, which we catch and handle by returning false.

## String Validation

String validation often involves checking whether a string is empty, has a minimum or maximum length, or matches a certain pattern (using regular expressions).

**Empty Strings** You can check if a string is empty or null using the `isEmpty()` method and a null-check:

```java
public boolean isValidString(String str) {
    if (str != null && !str.isEmpty()) {
        return true;
    } else {
        return false;
    }
}
``` 

**String Length** You can ensure a string is of a certain length using the `length()` method:

```java
public boolean isStringLengthValid(String str, int minLength, int maxLength) {
    int len = str.length();
    if (len >= minLength && len <= maxLength) {
        return true;
    } else {
        return false;
    }
}
``` 

## **Regular Expressions** 
You can validate that a string matches a certain pattern using regular expressions:

```java 
public boolean isStringPatternValid(String str, String regex) {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(str);
    return matcher.matches();
}
```

In this example, `Pattern.compile(regex)` creates a `Pattern` object from the regular expression, and `pattern.matcher(str)` creates a `Matcher` object that can match the string against the pattern. `matcher.matches()` then checks whether the entire string matches the pattern.