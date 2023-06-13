package day13;

import java.util.Scanner;

public class ScannerIntDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your age: ");
		int name = scanner.nextInt();
		System.out.println("Your age is: " + name);
		scanner.close();
	}

}
