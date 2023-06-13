### Day 7: Conditional Statements

Conditional statements in Java are used to perform different actions based on different conditions.

**If Statement:**

The `if` statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to `true`.

Example:

```java
int  marks  =  85;
if ( marks >=  75 ) {
	System.out.println("You got an A grade");
}
```

**If-Else Statement:**

The `if-else` statement provides a secondary path of execution when an "if" clause evaluates to `false`.

Example:

```java
int mark  =  65;
if (mark >=  75) {
	System.out.println("You got an A grade");
} else {
	System.out.println("You didn't get an A grade");
}
```

**Else-If Statement:**


The `else-if` statement is used to  create a chain of conditions where each condition is checked one by one, starting from the top. If the first condition is false, the next condition is checked, and so on. If a condition is found to be true, the corresponding block of code is executed, and the rest of the else-if chain is skipped

Example: Assign grades based on marks.

```java
public class Main {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
``` 

**Switch Statement:**

The `switch` statement is a multi-way branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression.

Example: Get day based on integer.

```java
public class Main {
    public  static  void  main(String[] args) {
		int  day  =  4;
		switch (day) {
			case  1:
				System.out.println("Today is Monday");
				break;
			case  2:
				System.out.println("Today is Tuesday");
				break;
			case  3:
				System.out.println("Today is Wednesday");
				break;
			case  4:
				System.out.println("Today is Thursday");
				break;
			case  5:
				System.out.println("Today is Friday");
				break;
			case  6:
				System.out.println("Today is Saturday");
				break;
			case  7:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}
}
``` 

In the `switch` statement, each value is called a case, and the variable being switched on is checked for each case.

**Difference**: 
`if-else-if-else`: The if-else-if-else ladder is used to make decisions based on multiple conditions in a sequential manner. **It executes a series of if statements one after another until a condition evaluates to true.** Once a true condition is found, the corresponding code block associated with that condition is executed, and the rest of the ladder is bypassed.
`switch`: The switch statement is another decision-making construct that allows you to select one of many code blocks to be executed based on the value of a given expression. It provides a more concise and structured way to handle multiple conditions compared to the if-else-if-else ladder. **The expression in the switch statement is evaluated once, and the control jumps to the matching case label.** The execution continues until a break statement is encountered or the end of the switch block is reached. This construct is often used when you have a limited number of discrete values to compare against.