# Scanner

The `java.util.Scanner` class is a simple text scanner which can parse primitive types and strings. It can be used to read from input streams like `System.in` (keyboard input), file streams, and so on.

Here's how you can create a `Scanner` object that reads from the keyboard:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
``` 

**Reading Different Types of Input**

-   **Integer**: Use `nextInt()` method.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
``` 

-   **Double**: Use `nextDouble()` method.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double: ");
        try {
            double num = scanner.nextDouble();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a double.");
        }
    }
}
``` 

-   **String**: Use `nextLine()` method.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);
    }
}
``` 

In these examples, the `Scanner` object reads input from the keyboard. If the input is not of the expected type (e.g., the user enters a string when an integer is expected), the `nextInt()` and `nextDouble()` methods throw an `InputMismatchException`, which we catch and handle by printing an error message.

Remember to always close the `Scanner` object after use to prevent resource leaks, by calling `scanner.close()`
