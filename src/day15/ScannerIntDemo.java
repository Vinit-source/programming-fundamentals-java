package day15;

import java.util.Scanner;

public class ScannerIntDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a your age: ");
		int age = scanner.nextInt();
		System.out.println("Your age is: " + age);
		scanner.close();
	}

}
