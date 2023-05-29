package day09;

// Problem : Write a Java program to find the maximum element in an array.
public class ArrayMax {

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 7 };
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }

}
