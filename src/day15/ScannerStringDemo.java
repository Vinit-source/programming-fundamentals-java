package day15;

import java.util.Scanner;


public class ScannerStringDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is: " + name);
		scanner.close();
		
	}

}
