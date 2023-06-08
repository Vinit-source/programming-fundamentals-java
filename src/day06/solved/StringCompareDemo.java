package day06.solved;

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

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = s3;

		System.out.println("s1.equals(s2):" + s1.equals(s2));
		System.out.println("s1 == s2 :" + s1 == s2);

		System.out.println("s3.equals(s2):" + s3.equals(s2));
		System.out.println("s3 == s2 :" + s3 == s2);

		System.out.println("s4.equals(s3):" + s4.equals(s3));
		System.out.println("s4 == s3 :" + s4 == s3);

		System.out.println("(s1 == s1) :" + s1 == s1);

		s1 = s1.concat(" World!");
		System.out.println("s1.equals(s2):" + s1.equals(s2));
		System.out.println("s1 == s2 :" + s1 == s2);

	}

}
