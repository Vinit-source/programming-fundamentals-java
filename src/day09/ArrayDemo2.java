package day09;

public class ArrayDemo2 {

	public static void main(String[] args) {

		// Array with a length of 3
		String[] names = new String[3];

		// assign marks in the array
		names[0] = "Surya";
		names[1] = "Vijay";
		names[2] = "Ajith";

		// find how many items in the array
		System.out.println("Array size is: " + names.length);

		// Iterate array using for loop
		for (int i = 0; i < names.length; i++) {
			String m = names[i];
			System.out.println("Name is: " + m);
		}

	}

}