/**
 * 
 */
package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author VinitGore
 *
 */
public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		try {	// Comment this line to see the Compile-time error
			FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
		} catch (FileNotFoundException e) {	// Comment this line to see the Compile-time error
			e.printStackTrace(); // Handle the exception by printing the stack trace; Comment this line to see the Compile-time error
			System.out.println("Please provide valid Filename.");	// Comment this line to see the Compile-time error
		}
	}
}
