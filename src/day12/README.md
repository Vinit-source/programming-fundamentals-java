# Java Utilities

**1. Date and Time**

Java provides several classes to work with dates and times, such as `Date`, `LocalDate`, and `LocalDateTime` in the `java.time` package.

-   **Date**: This class represents a specific instant in time, with millisecond precision.

```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
``` 

-   **LocalDate**: This class represents a date (year, month, day) in the ISO calendar and can be used to store dates without time.

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
    }
}
``` 

-   **LocalDateTime**: This class represents both date and time (year, month, day, hour, minute, second) without a time zone.


```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.toString());
    }
}
``` 

**2. StringBuffer and StringBuilder**

`StringBuffer` and `StringBuilder` are used for creating mutable (modifiable) strings. The `StringBuilder` class is faster than `StringBuffer` because it's not thread-safe.

-   **StringBuffer**:

```java
public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer.toString());
    }
}
``` 

-   **StringBuilder**:

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println(builder.toString());
    }
}
```

In both examples, we create a mutable string with the text "Hello" and then append " World" to it. The advantage of `StringBuffer` and `StringBuilder` over `String` is that they can be modified without creating a new object, which is more efficient.