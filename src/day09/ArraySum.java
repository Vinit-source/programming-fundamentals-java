package day09;

// Problem : Write a Java program to find the sum of all elements in an array.
public class ArraySum {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum: " + sum);
    }

}
