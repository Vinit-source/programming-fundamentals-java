package day09;

// Problem : Write a Java program to check if an element exists in an array.
public class ArrayContains {
    public static void main(String[] args) {
        int[] array = { 3, 6, 1, 8, 4 };
        int searchElement = 8;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    }
}
