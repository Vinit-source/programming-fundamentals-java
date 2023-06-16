package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUncheckedExceptionDemo {
	static int divider(int a, int b) throws ArithmeticException {
		try {
			int c = a / b; // if b is zero
			return c;
		} catch (ArithmeticException ex) {
			throw ex;
		}
	}

	static void fileHandlerDemo(String fileName) throws FileNotFoundException {
		try {
			// This line may throw a FileNotFoundException
			FileReader fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			throw e; // Handle the exception by printing the stack trace
		}
	}

	public static void main(String[] args) {
		try {
			Integer.parseInt("20");// Throws and unchecked NumberFormatException
			divider(8, 0); // Should throw an ArithmeticException
			fileHandlerDemo("hello.nothing");

		}
		// NumberFormatException is not caught but yet the
		// compiler is not throwing any error
		catch (ArithmeticException ex) {
			System.out.println("Catching the error in main method: " + ex.getMessage());
			ex.printStackTrace();
		}

		// If the below catch is removed the compiler will throw
		// an error line 35 since FileNotFoundException is
		// a Checked Exception
		catch (FileNotFoundException ex) {
			System.out.println("Handling only FNFE");
		} finally {
			System.out.println("Exception Introduction is completed");
		}
	}

}