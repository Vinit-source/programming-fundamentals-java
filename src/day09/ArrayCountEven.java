package day09;

// Problem : Write a Java program to count the number of even elements in an array.
public class ArrayCountEven {
    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 3, 10, 6 };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);
    }

}
