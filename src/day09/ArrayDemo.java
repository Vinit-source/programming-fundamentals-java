package day09;

public class ArrayDemo {
	public static void main(String[] args) {
		// Array with a length of 4
		int[] marks = new int[5];
		
		// Iterate array using for loop
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
			System.out.println("Marks " + i + " is : " + m);
		}
		// assign marks in the array
		marks[0] = 50;
//		marks[1] = 60;
		marks[2] = 70;
//		marks[3] = 55;
// 		marks[4] = 80;	// ArrayIndexOutOfBounds Exception
		// find how many items in the array
		System.out.println("Array size is: " + marks.length);
		// Iterate array using for loop
		// TODO: Add conditionals so that it prints [50, 0, 70, 0]
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
//			System.out.println("Mark is: " + m);
			System.out.print(m + ",");
		}
//System.out.println(Arrays.toString(marks));
	}
}



