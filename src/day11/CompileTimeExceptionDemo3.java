package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionDemo3 {

	public static void main(String[] args) throws FileNotFoundException {
		CompileTimeExceptionDemo3 f = new CompileTimeExceptionDemo3();
		try {
			f.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists");
//			e.printStackTrace(); // Handle the exception by printing the stack trace
		}

	}

	public void readFile() throws FileNotFoundException {
		try {
			FileReader fileReader = new FileReader("example.txt"); // This line loads a file on computer to read in
																	// Java. This line may throw a FileNotFoundException
			System.out.println("Line 23");

		} catch (FileNotFoundException e) {
			System.out.println("line 26");
			throw new FileNotFoundException("Thrown exception");
			// e.printStackTrace(); // Handle the exception by printing the stack trace
		}
		System.out.println("END");

	}

}
