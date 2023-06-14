/**
 * 
 */
package day10.notes;

import java.util.Scanner;

/**
 * @author VinitGore
 *
 */
public class Day10Theory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b ");
		int b = scan.nextInt();
		try {
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

			e.printStackTrace();

			System.out.println("Enter the non 0 value");
//			System.out.println("Enter");

			b = scan.nextInt();
			System.out.println(a / b);
		}
		System.out.println("End");
		// TODO Auto-generated method stub
		scan.close();

	}

}
