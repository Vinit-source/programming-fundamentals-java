package day03;

public class DataConversionDemo {

	public static void main(String[] args) {

		int three = Integer.parseInt("3");
		System.out.println("three = " + three);

		float percentage = Float.parseFloat("98.3");
		System.out.println("percentage= " + percentage);

		double pi = Double.parseDouble("3.14");
		System.out.println("pi = " + pi);

		long number = Long.parseLong("9876543210");
		System.out.println("number = " + number);

		int i = 100;
		long l = i; // No explicit casting required here
		System.out.println("l = " + l);

		double d = 100.04;
		l = (long) d; // Explicit casting is required here
		System.out.println("l = " + l);
	}

}
