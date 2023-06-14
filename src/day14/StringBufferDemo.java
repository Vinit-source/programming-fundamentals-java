package day14;

public class StringBufferDemo {

	public static void main(String[] args) {

		String firstName = "John";
		String lastName = "Doe";

		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);
	}

}
