package day09;

public class ArrayDemo4 {

	public static void main(String[] args) {

		// Different ways to declare arrays

		// 1
		int[] marks = new int[3];

		// assign marks in the array
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;
		// marks[3] = 80; //ArrayIndexOutOfBoundsException

		// 2
		// int[] markss = new int[] { 50, 60, 70 };

		// 3
		// int[] marksss = { 50, 60, 70 };

		// Iterate array using for loop
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
			System.out.println("Mark is: " + m);
		}

	}

}
