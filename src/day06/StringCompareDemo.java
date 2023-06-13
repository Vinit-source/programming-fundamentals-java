package day06;

public class StringCompareDemo {

	public static void main(String[] args) {

		// input
		String name1 = "    John     ";
		String name2 = "Doe";

		// output
		System.out.println("Comparing without .trim()");
		System.out.println("Comparing using comparsion operator (==): " + (name1 == name2));
		System.out.println("Comparing using .equals() method: " + name1.equals(name2));

		System.out.println("\nComparing with .trim()");
		System.out.println(name1.trim() == name2.trim());
		System.out.println(name1.trim().equals(name2.trim()));
	}

}
