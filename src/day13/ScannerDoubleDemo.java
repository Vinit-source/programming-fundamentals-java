package day13;

import java.util.Scanner;

public class ScannerDoubleDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your age: ");
		Double name = scanner.nextDouble();
		System.out.println("Your age is: " + name);
		scanner.close();
	}

}
