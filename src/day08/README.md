### Day 8: Looping Statements

Looping statements in Java are used to repeatedly execute a block of statements while a particular condition is true. The loop can be repeated a fixed number of times or it can be executed indefinitely until the program is stopped.

**For Loop:**

The `for` loop is used when we know the number of times we want to execute a block of code.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }
    }
}
``` 

In this example, the code inside the loop will be executed 5 times, and the value of `i` from 0 to 4 will be printed.

**While Loop:**

The `while` loop is used when we want to execute a block of code repeatedly as long as a particular condition is true.

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("The value of i is: " + i);
            i++;
        }
    }
}
``` 

In this example, the code inside the loop will be executed as long as `i` is less than 5, and the value of `i` from 0 to 4 will be printed.

**Do-While Loop:**

The `do-while` loop is similar to the `while` loop, but the condition is tested after executing the statements within the loop. Therefore, the loop will always be executed at least once.

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (i < 5);
    }
}
``` 

In this example, the code inside the loop will be executed as long as `i` is less than 5, and the value of `i` from 0 to 4 will be printed.

These loop structures offer a lot of flexibility to execute code blocks multiple times. Remember to control your loop carefully to prevent infinite loops.