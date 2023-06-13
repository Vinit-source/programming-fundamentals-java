package day12;

public class StringBufferDemo {

	public static void main(String[] args) {

		String firstName = "Surya";
		String lastName = "Umapathy";

		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);
	}

}
