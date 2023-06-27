/**
 * 
 */
package day16;

import java.util.Scanner;

/**
 * @author Vinit Gore
 *
 **/
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			calculator 
		Calculator calobj = new Calculator();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
				
		System.out.println("Enter b: ");
		int b = sc.nextInt();

		int add = calobj.add(a, b);
		System.out.println("Addition is " + add);

		int sub = calobj.sub(a, b);
		System.out.println("Subtraction is " + sub);

		int mul = calobj.mul(a, b);
		System.out.println("Multiplication is " + mul);

		int div = calobj.div(a, b);
		System.out.println("Division is " + div);
		
		sc.close();

	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
	
	public int mod(int a, int b) {
		return a % b;
	}

}