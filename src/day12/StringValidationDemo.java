package day12;

public class StringValidationDemo {

	public static void main(String[] args) {

		String input = "John";

		if (input == null) {
			System.out.println("The input String is Null");
		} else if (input.trim().isEmpty()) {
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}

	}

}
