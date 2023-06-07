package day05.solved;

public class Student {
    String name; // Field 1
    int age; // Field 2

    void sayHello() { // Method
        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // Creating a new Student object
        student1.name = "John";
        student1.age = 20;
        student1.sayHello(); // Outputs: Hello, my name is John, and I am 20 years old.
    }
}
