package day09;

public class ArrayDemo {

	public static void main(String[] args) {

		// Array with a length of 3
		int[] marks = new int[3];

		// assign marks in the array
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;

    
		// find how many items in the array
        System.out.println("Array size is: " + marks.length);
		
	
		// Iterate array using for loop
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
			System.out.println("Mark is: " + m);
		}

	}

}
